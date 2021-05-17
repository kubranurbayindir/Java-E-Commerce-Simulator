package ecommercesimulator.business.concretes;

import java.util.Scanner;

import ecommercesimulator.business.abstracts.UserEmailVerifyLinkService;
import ecommercesimulator.entities.concretes.User;

public class UserEmailVerifyLinkManager implements UserEmailVerifyLinkService{

	private Scanner scanner1;

	@Override
	public boolean isLinkEmail(User user) {
		System.out.println("Ilgili" + " " + user.getEmail() + " mail adresinize do�rulama linki g�nderilmistir.");
    	System.out.print("Email adresinizi onayl�yor musunuz?(E/H): ");
		scanner1 = new Scanner(System.in);
	    String result = scanner1.nextLine();
		
		if (result.equals("E")){
            System.out.println("Say�n "+ user.getFirstName() +" E-mail adresiniz onayland�.");
            return true;
        }
        if(result.equals("H")) {
            System.out.println("Say�n "+ user.getFirstName() +"E-mail adresiniz onaylanamad�.");
            return true;
        }
        else{
            System.out.println("E veya H de�erini giriniz!");
        }
		return false;
}
	}


