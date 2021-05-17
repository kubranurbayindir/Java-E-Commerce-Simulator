package ecommercesimulator.business.abstracts;

import ecommercesimulator.entities.concretes.User;

public interface UserEmailVerifyService {
	
	boolean isValidEmail(User user);

}
