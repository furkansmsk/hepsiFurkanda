package hepsiFurkandaETicaretDemo.dataAccess.concretes;

import java.util.List;

import hepsiFurkandaETicaretDemo.dataAccess.abstracts.UserDao;
import hepsiFurkandaETicaretDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile kayýt alýndý: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile kayýt silindi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile bilgiler güncellendi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
