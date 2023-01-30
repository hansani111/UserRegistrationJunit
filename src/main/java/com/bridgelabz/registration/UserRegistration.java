package com.bridgelabz.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    static boolean firstName(String firstName) {
	 String regex = "^[A-Z]{1}[a-z]{2,}$";
         Pattern pattern = Pattern.compile(regex);
	 Matcher matcher = pattern.matcher(firstName);
	 return matcher.matches();
	     
    }
	
    static boolean lastName(String lastName){
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
        
    }

    static boolean email(String mail) {
    	String regex = "^[a-zA-Z]+[\\w]*[- . + _]?[\\w]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";        
    	Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
        
    }

    static boolean mobileNumber(String mobNo) {
        String regex = "^[+]?(91)[\\s][0-9]{10}$"; 
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobNo);
        return matcher.matches();
        
    }

    static boolean password(String password) { 
        String regex = "^[a-z A-Z 0-9 _@./#&+-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
        
    }
}
