package ecommercesimulator.dataAccess.abstracts;

import java.util.List;

import ecommercesimulator.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void delete(User user);
	void update(User user);
	User get(String email, String password);
	List<User> getAll();
	boolean emailExist(User user);

}
