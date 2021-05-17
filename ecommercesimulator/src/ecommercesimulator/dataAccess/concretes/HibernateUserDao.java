package ecommercesimulator.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ecommercesimulator.dataAccess.abstracts.UserDao;
import ecommercesimulator.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	public List<User> users= new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {

		System.out.println("Hibernate ile silindi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {

		System.out.println("Hibernate ile güncellendi : " + user.getFirstName());
	}


	@Override
	public List<User> getAll() {
		return this.users; 
	}

	@Override
	public User get(String email, String password) {
		return (User) this.users;
	}

	@Override
	public boolean emailExist(User user) {
		for (User person : users) 
			if (person.getEmail() == user.getEmail()) {
				return false;
			}				
		return true;
	}

}
