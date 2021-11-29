package application.model;

import java.util.HashMap;
import java.util.Map;

public class ProfileInfo { //model to fetch HashMap data and username data
	 public static Map<String, String> userData = new HashMap <String, String>();
	 public static String userName;
	 public static void setUserName(String username) {
		 userName = username;
	 }
	 public static String getUsername() {
		 return userName;
	 }
	 public static void setValue(Map<String, String> map) {
		 userData = map;
	 }
	 public static Map<String, String> getValue() {
		 return userData;
	 }
	 
	 
}
