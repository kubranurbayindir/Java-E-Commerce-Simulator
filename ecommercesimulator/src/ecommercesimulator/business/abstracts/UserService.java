package ecommercesimulator.business.abstracts;

import ecommercesimulator.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);	
    void signIn(String email, String password);

}
