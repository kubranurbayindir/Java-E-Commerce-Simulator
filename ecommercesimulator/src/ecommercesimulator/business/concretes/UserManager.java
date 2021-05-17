package ecommercesimulator.business.concretes;

import ecommercesimulator.business.abstracts.UserService;
import ecommercesimulator.core.GoogleService;
import ecommercesimulator.dataAccess.abstracts.UserDao;
import ecommercesimulator.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private GoogleService googleService;
	

	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
		
	}

	public GoogleService getGoogleService() {
		return googleService;
	}

	public void setGoogleService(GoogleService googleService) {
		this.googleService = googleService;
	}


	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public void add(User user) {
		System.out.println("Kullanıcı sisteme eklendi : " + user.getFirstName());
		this.googleService.checkAccountMail(user);
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı sistemden silindi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı sistemde güncellendi : " + user.getFirstName());
		
	}

	@Override
	public void signIn(String email, String password) {
		for(User user:userDao.getAll()) {
			if(email == user.getEmail() && password == user.getPassword()) {
				System.out.println("Login successful");
				return;
			}
			System.out.println("Wrong entry. Try again.");
		}
	}

}
