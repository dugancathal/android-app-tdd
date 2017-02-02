package com.tjtjrb.betterappexe;

import android.widget.Button
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.nullValue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowToast

/**
 * Created by ttaylor on 1/31/17.
 */

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
class FancyButtonTest {
    @Test
    fun testCanClickFancyButtonAndSeeToast() {
        val activity = Robolectric.setupActivity(MainActivity::class.java)
        assertThat("There should be no toast initially", ShadowToast.getTextOfLatestToast(), nullValue());

        val fancyButton = activity.findViewById(R.id.fancy_button);

        fancyButton.performClick();
        assertThat(ShadowToast.getTextOfLatestToast(), equalTo("Good Job, Yo"));
    }
}
