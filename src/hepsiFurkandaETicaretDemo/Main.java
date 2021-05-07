package hepsiFurkandaETicaretDemo;

import hepsiFurkandaETicaretDemo.business.abstracts.SigningWithExternalPlatformService;
import hepsiFurkandaETicaretDemo.business.concretes.SignWithGoogleAccount;
import hepsiFurkandaETicaretDemo.business.concretes.UserManager;
import hepsiFurkandaETicaretDemo.dataAccess.abstracts.UserDao;
import hepsiFurkandaETicaretDemo.dataAccess.concretes.AbcdefgUserDao;
import hepsiFurkandaETicaretDemo.dataAccess.concretes.HibernateUserDao;
import hepsiFurkandaETicaretDemo.entities.concretes.User;
import hepsiFurkandaETicaretDemo.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new AbcdefgUserDao();
		
		User user1 = new User("Furkan","Þimþek","furkansimsek@gmail.com","furkansimseek");
		UserManager userManager = new UserManager(userDao, user1);
		userManager.add(user1);
		System.out.println("--------------------------------");
		
		
		
		SignWithGoogleAccount.signWithGoogleAccount(userDao);
	}

}
