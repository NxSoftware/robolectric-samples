package com.example.service;

import static org.junit.Assert.assertNotSame;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

@RunWith(RobolectricTestRunner.class)
public class SampleIntentServiceTest {

    @Test
    public void addsDataToSharedPreference(){
        SharedPreferences preferences = RuntimeEnvironment.application
                .getSharedPreferences("example", Context.MODE_PRIVATE);
        Intent intent =  new Intent(RuntimeEnvironment.application,SampleIntentService.class);
        SampleIntentService registrationService =
                Robolectric.setupService(SampleIntentService.class);

        registrationService.onHandleIntent(intent);

        assertNotSame(preferences.getString("SAMPLE_DATA", ""), "");
    }
}
