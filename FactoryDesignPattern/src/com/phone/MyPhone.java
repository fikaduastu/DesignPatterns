package com.phone;

public class MyPhone {
	public static void main(String args[]) {
		OS ab = OsManager.getOperatingSystem("open");
		ab.spec();
	}
}
