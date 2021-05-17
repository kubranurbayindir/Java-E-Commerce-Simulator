package ecommercesimulator.core;

import ecommercesimulator.entities.concretes.User;
import ecommercesimulator.googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements GoogleService {

	@Override
	public void checkAccountMail(User user) {
		GoogleAccountManager accountManager = new GoogleAccountManager();
		accountManager.checkGoogleMail(user);
		
	}
	

}
