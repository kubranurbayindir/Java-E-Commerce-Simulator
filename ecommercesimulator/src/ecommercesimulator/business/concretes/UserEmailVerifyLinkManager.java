package ecommercesimulator.business.concretes;

import java.util.Scanner;

import ecommercesimulator.business.abstracts.UserEmailVerifyLinkService;
import ecommercesimulator.entities.concretes.User;

public class UserEmailVerifyLinkManager implements UserEmailVerifyLinkService{

	private Scanner scanner1;

	@Override
	public boolean isLinkEmail(User user) {
		System.out.println("Ilgili" + " " + user.getEmail() + " mail adresinize doðrulama linki gönderilmistir.");
    	System.out.print("Email adresinizi onaylýyor musunuz?(E/H): ");
		scanner1 = new Scanner(System.in);
	    String result = scanner1.nextLine();
		
		if (result.equals("E")){
            System.out.println("Sayýn "+ user.getFirstName() +" E-mail adresiniz onaylandý.");
            return true;
        }
        if(result.equals("H")) {
            System.out.println("Sayýn "+ user.getFirstName() +"E-mail adresiniz onaylanamadý.");
            return true;
        }
        else{
            System.out.println("E veya H deðerini giriniz!");
        }
		return false;
}
	}


