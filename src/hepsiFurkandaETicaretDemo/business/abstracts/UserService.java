package hepsiFurkandaETicaretDemo.business.abstracts;

import java.util.List;

import hepsiFurkandaETicaretDemo.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	List<User> getAll();

}
