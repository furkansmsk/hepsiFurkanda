package hepsiFurkandaETicaretDemo.dataAccess.concretes;

import java.util.List;

import hepsiFurkandaETicaretDemo.dataAccess.abstracts.UserDao;
import hepsiFurkandaETicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile kay�t al�nd�: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile kay�t silindi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile bilgiler g�ncellendi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
