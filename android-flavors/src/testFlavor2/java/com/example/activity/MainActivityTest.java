package com.example.activity;

import static org.assertj.core.api.Assertions.assertThat;

import android.app.Activity;
import android.widget.TextView;
import com.example.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

  @Test
  public void shouldUseCorrectApplicatioName() throws Exception {
    Activity activity = Robolectric.setupActivity(MainActivity.class);

    final TextView text = (TextView) activity.findViewById(R.id.text);
    assertThat(text.getText().toString()).isEqualTo("Robolectric Flavor 2");
  }
}
