package com.example.tyler.happyhour;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.media.AudioAttributesCompat;
import android.util.Log;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by tyler on 4/26/2018.
 */


@RunWith(AndroidJUnit4.class)
public class timeToStringTest {

    dealToString mTest;

    @Before
    public void setUp() {
        mTest = new dealToString();
    }

    @Test
    public void testTime0(){
        Log.d("TimeTests", "Got from 0 " + mTest.timeToString(0));
        assertEquals("12:00 AM", mTest.timeToString(0));
    }

    @Test
    public void testTime0030(){
        Log.d("TimeTests", "Got from 30 " + mTest.timeToString(30));
        assertEquals("12:30 AM", mTest.timeToString(30));
    }

    @Test
    public void testTime0100(){
        Log.d("TimeTests", "Got from 100 " + mTest.timeToString(100));
        assertEquals("1:00 AM", mTest.timeToString(100));
    }

    @Test
    public void testTime0330(){
        Log.d("TimeTests", "Got from 330 " + mTest.timeToString(330));
        assertEquals("3:30 AM", mTest.timeToString(330));
    }

    @Test
    public void testTime0700(){
        Log.d("TimeTests", "Got from 700 " + mTest.timeToString(700));
        assertEquals("7:00 AM", mTest.timeToString(700));
    }

    @Test
    public void testTime1000(){
        Log.d("TimeTests", "Got from 1000 " + mTest.timeToString(1000));
        assertEquals("10:00 AM", mTest.timeToString(1000));
    }

    @Test
    public void testTime1200(){
        Log.d("TimeTests", "Got from 1200 " + mTest.timeToString(1200));
        assertEquals("12:00 PM", mTest.timeToString(1200));
    }

    @Test
    public void testTime1230(){
        Log.d("TimeTests", "Got from 1230 " + mTest.timeToString(1230));
        assertEquals("12:30 PM", mTest.timeToString(1230));
    }

    @Test
    public void testTime1300(){
        Log.d("TimeTests", "Got from 1300 " + mTest.timeToString(1300));
        assertEquals("1:00 PM", mTest.timeToString(1300));
    }

    @Test
    public void testTime1500(){
        Log.d("TimeTests", "Got from 1500 " + mTest.timeToString(1500));
        assertEquals("3:00 PM", mTest.timeToString(1500));
    }

    @Test
    public void testTime2300(){
        Log.d("TimeTests", "Got from 2300 " + mTest.timeToString(2300));
        assertEquals("11:00 PM", mTest.timeToString(2300));
    }

    @Test
    public void testTime2400(){
        Log.d("TimeTests", "Got from 2400 " + mTest.timeToString(2400));
        assertEquals("12:00 PM", mTest.timeToString(2400));
    }

    @Test
    public void testTime2600(){
        Log.d("TimeTests", "Got from 2600 " + mTest.timeToString(2600));
        assertEquals("2:00 AM", mTest.timeToString(2600));
    }

}
