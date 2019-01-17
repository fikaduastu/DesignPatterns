package com.phone;

public class OsManager {
		public static OS getOperatingSystem(String str) {
			if (str.equals("open")) {
				return new Android();
			}
			else if(str.equals("closed")) {
				return new Ios();
			}
			else {
				return new Windows();
			}
		}
}
