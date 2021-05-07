package hepsiFurkandaETicaretDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import hepsiFurkandaETicaretDemo.business.abstracts.UserService;
import hepsiFurkandaETicaretDemo.dataAccess.abstracts.UserDao;
import hepsiFurkandaETicaretDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;

	public UserManager(UserDao userDao, User user) {
		super();
		this.userDao = userDao;
	}
	
	private List<String> geteMails(){
		List<User> users = userDao.getAll();
		List<String> emails = new ArrayList<String>();
		for (User user : users) {
			emails.add(user.geteMail());
		}
		return emails;
	}
	
	private boolean checkMailIsUsedBefore(User user) {
		String mail;
		mail = user.geteMail();
		List<String> eMails = this.geteMails();
		for (String eMail : eMails) {
			if (eMail.equals(mail)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void add(User user) {
		if(user.getPassword().length()<6 || user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Maalesef girdilerinizden biri ya da birden fazlasý uygun formatlarda deðil. Bilgilerinizi kontrol edip tekrar deneyiniz.");
			return;
		}
		
		else {
			if(EMailLogger.log(user)==true&&checkMailIsUsedBefore(user)==true) {
				this.userDao.add(user);
			}
		}
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}
	
	

}
