package ecommercesimulator.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ecommercesimulator.business.abstracts.UserCheckService;
import ecommercesimulator.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	
	@Override
	public boolean login(User user) {

		 String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	     Pattern pattern = Pattern.compile(regex);
	     Matcher matcher = pattern.matcher(user.getEmail());
	     
	     List<String> emailList= new ArrayList<String>();
	     
		if (user.getFirstName().length()<2) {
			System.out.println("Kullanýcý isminiz uygun deðildir, 2 karakterden küçük olamaz. Tekrar Deneyiniz!");
			return true;
		}
		if (user.getLastName().length()<2) {
			System.out.println("Kullanýcý soyadýnýz uygun deðildir, 2 karakterden küçük olamaz. Tekrar Deneyiniz!");
			return true;
		}
		if (user.getPassword().length()<6) {
			System.out.println("Parolanýz 6 karakterden küçük olamaz. Tekrar Deneyiniz!");
			return true;
		}
		if(emailList.contains(user.getEmail())  ) {
			
			System.out.println("Email adresi tekrarlanýyor, baþka eposta seçiniz.");
			return true;			
		}
		if(matcher.matches() != true) {
			   System.out.println("Geçersiz e-posta adresi, geçerli e-posta adresi giriniz.");
	            return true;
	        } else {
		            System.out.println("Sisteme kayýt oldunuz.");
		            return false;
	        }
	
	}

	
	

	
	
}
