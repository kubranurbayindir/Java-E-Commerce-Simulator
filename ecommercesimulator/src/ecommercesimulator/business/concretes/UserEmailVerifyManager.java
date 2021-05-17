package ecommercesimulator.business.concretes;

import ecommercesimulator.business.abstracts.UserEmailVerifyService;
import ecommercesimulator.entities.concretes.User;

public class UserEmailVerifyManager implements UserEmailVerifyService {

	@Override
	public boolean isValidEmail(User user) {
		System.out.println("İlgili" + " " + user.getEmail() + " mail adresinize doğrulama maili gönderilmistir.");
		return false;
	}
	

	}


