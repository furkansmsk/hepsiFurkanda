package hepsiFurkandaETicaretDemo.dataAccess.concretes;

import java.util.List;

import hepsiFurkandaETicaretDemo.dataAccess.abstracts.UserDao;
import hepsiFurkandaETicaretDemo.entities.concretes.User;

public class AbcdefgUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Abcdefg ile kay�t al�nd�: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Abcdefg ile kay�t silindi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Abcdefg ile bilgiler g�ncellendi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}

}
