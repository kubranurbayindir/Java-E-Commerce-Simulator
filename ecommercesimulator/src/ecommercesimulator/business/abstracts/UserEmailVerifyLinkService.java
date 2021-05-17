package ecommercesimulator.business.abstracts;

import ecommercesimulator.entities.concretes.User;

public interface UserEmailVerifyLinkService {
	

	boolean isLinkEmail(User user);

}
