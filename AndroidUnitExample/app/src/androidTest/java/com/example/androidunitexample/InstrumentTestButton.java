package com.example.androidunitexample;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class InstrumentTestButton {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testButton() {
        MainActivity activity = mActivityRule.getActivity();
        Button button = activity.findViewById(R.id.my_button);
        Assert.assertNotNull(button);
        // add assertion code here
    }

    @Test
    public void testTextView() {
        MainActivity activity = mActivityRule.getActivity();
        TextView textView = activity.findViewById(R.id.my_textview);
        Assert.assertEquals("Hello, world!", textView.getText().toString());
    }
}
