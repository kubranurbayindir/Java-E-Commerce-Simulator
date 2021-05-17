package ecommercesimulator;

import ecommercesimulator.business.abstracts.UserService;
import ecommercesimulator.business.concretes.UserCheckManager;
import ecommercesimulator.business.concretes.UserEmailVerifyLinkManager;
import ecommercesimulator.business.concretes.UserEmailVerifyManager;
import ecommercesimulator.business.concretes.UserManager;
import ecommercesimulator.core.GoogleAccountManagerAdapter;
import ecommercesimulator.dataAccess.concretes.HibernateUserDao;
import ecommercesimulator.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User userCeo = new User(1, "K�bra Nur", "Bay�nd�r", "kubra@gmail.com", "1234567");
		User userCfo = new User(2, "Ahmet", "Baydar", "ahmet@gmail.com", "23456755");
		User userClerk = new User(3, "Cengiz", "Solmaz", "cengiz@gmail.com", "345678");
		
		//KULLANICI EKLEME-S�LME-G�NCELLEME-VER�TABANI ETK�LE��M�. 
		//DI� S�STEM -GOOGLE SERVICE- ENTEGRASYONU.
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAccountManagerAdapter());
		userService.add(userCeo);
		System.out.println("------------------------");
		userService.delete(userCfo);
		System.out.println("------------------------");
		userService.update(userClerk);
		System.out.println("------------------------");
		
		//MA�L VE PASSWORD �LE G�R�� YAPMA
		userService.signIn("ahmet@gmail.com", "2356755");
		System.out.println("------------------------");
				
		//TEMEL KULLANICI B�LG�LER� DO�RULAMA.
		UserCheckManager userCheckManager = new UserCheckManager();
		userCheckManager.login(userCfo);
		System.out.println("------------------------");
		
		//KULLANICI EMA�L MA�L-L�NK �LE DO�RULAMA
		UserEmailVerifyManager mailVerify = new UserEmailVerifyManager();
		UserEmailVerifyLinkManager linkVerify = new UserEmailVerifyLinkManager();
		mailVerify.isValidEmail(userCeo);
		System.out.println("------------------------");
		linkVerify.isLinkEmail(userCeo);
		System.out.println("------------------------");
				


	}
	

}
