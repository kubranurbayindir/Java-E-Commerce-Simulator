package ecommercesimulator.business.concretes;

import ecommercesimulator.business.abstracts.UserEmailVerifyService;
import ecommercesimulator.entities.concretes.User;

public class UserEmailVerifyManager implements UserEmailVerifyService {

	@Override
	public boolean isValidEmail(User user) {
		System.out.println("Ýlgili" + " " + user.getEmail() + " mail adresinize doðrulama maili gönderilmistir.");
		return false;
	}
	

	}


