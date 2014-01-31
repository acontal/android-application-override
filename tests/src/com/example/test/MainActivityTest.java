package com.example.test;

import com.example.MainActivity;

import android.test.ActivityInstrumentationTestCase2;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	public void testPreconditions() {
		MainActivity mainActivity = getActivity();
		assertEquals("value for testing", mainActivity.getCustomValue());
	}
	
}
