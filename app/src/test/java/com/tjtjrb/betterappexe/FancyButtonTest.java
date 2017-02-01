package com.tjtjrb.betterappexe;

import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowToast;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by ttaylor on 1/31/17.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class FancyButtonTest {
    @Test
    public void testCanClickFancyButtonAndSeeToast() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        assertThat("There should be no toast initially", ShadowToast.getTextOfLatestToast(), nullValue());

        Button fancyButton = (Button) activity.findViewById(R.id.fancy_button);

        fancyButton.performClick();
        assertThat(ShadowToast.getTextOfLatestToast(), equalTo("Good Job, Yo"));
    }
}
