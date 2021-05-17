package ecommercesimulator.business.abstracts;

import ecommercesimulator.entities.concretes.User;

public interface UserCheckService {
	
	boolean login(User user);
	 
}
