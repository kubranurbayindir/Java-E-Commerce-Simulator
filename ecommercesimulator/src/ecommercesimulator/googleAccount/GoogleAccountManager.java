package ecommercesimulator.googleAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ecommercesimulator.entities.concretes.User;

public class GoogleAccountManager {
	//GOOGLE HESABI �LE �YE OLMA - DI� S�STEM ENTEGRASYONU	
		public boolean checkGoogleMail(User user) {
			Pattern pattern = Pattern.compile("@gmail.com", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(user.getEmail());	    	    
		    if (matcher.find()) {
				System.out.println("Google ile �ye olundu.");
				return true;
			}
			else {
				System.out.println("Google ile �ye olunmad�.");
				return false;
			}
			
	}

}
