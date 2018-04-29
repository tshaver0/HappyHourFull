package com.example.tyler.happyhour;

import android.support.annotation.NonNull;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by tyler on 4/29/2018.
 */
@RunWith(AndroidJUnit4.class)
public class dealToStringTest {
    dealToString mTest;
    FirebaseFirestore mDB;

    @Before
    public void setUp() {
        mTest = new dealToString();
        mDB = FirebaseFirestore.getInstance();
    }

    @Test
    public void testToDealString() {
        Log.d("DealTest", "Entered testToDealString");
        DocumentReference backyard1 = mDB.collection("deal").document("backyard1");
        Task<DocumentSnapshot> dealTask = backyard1.get();
        try {
            Tasks.await(dealTask);  //since this is only 1 test we dont want this to be an asych task
            Log.d("DealTest", "Got document");
            String result = mTest.dealToString(dealTask.getResult());
            String correct = "Monday: 4:00 PM to 8:00 PM - 2 for 1 drinks";
            assertEquals(result, correct);
        } catch (ExecutionException e) {
            fail("ExecutionException " + e.toString());
            e.printStackTrace();
        } catch (InterruptedException e) {
            fail("InterruptedException " + e.toString());
            e.printStackTrace();
        }
    }

    /*
    testing a bad doc ref, making sure they're arn't any errors.
     */
    @Test
    public void testBadDocumentRef() {
        DocumentReference backyard1 = mDB.collection("deal").document("doesnotexistinreallife111");
        Task<DocumentSnapshot> dealTask = backyard1.get();
        try {
            Tasks.await(dealTask);  //since this is only 1 test we dont want this to be an asych task
            String result = mTest.dealToString(dealTask.getResult());
            String correct = "";
            assertEquals(result, correct);
        } catch (ExecutionException e) {
            fail("ExecutionException " + e.toString());
            e.printStackTrace();
        } catch (InterruptedException e) {
            fail("InterruptedException " + e.toString());
            e.printStackTrace();
        }
    }

}
