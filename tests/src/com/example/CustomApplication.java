package com.example;


import android.app.Application;

public class CustomApplication extends Application {

	public String getCustomValue() {
		return "value for testing";
	}

}
