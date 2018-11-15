package com.example.receiver;

import static junit.framework.Assert.assertTrue;

import android.content.Intent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowApplication;

@RunWith(RobolectricTestRunner.class)
public class BootCompleteReceiverTest {

    @Test
    public void registerServiceOnDeviceBootComplete() {
        Intent intent = new Intent(Intent.ACTION_BOOT_COMPLETED);

        ShadowApplication application = ShadowApplication.getInstance();

        assertTrue("Reboot Listener not registered ",
                application.hasReceiverForIntent(intent));
    }
}
