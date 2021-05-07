package hepsiFurkandaETicaretDemo.business.concretes;

import hepsiFurkandaETicaretDemo.business.abstracts.SigningWithExternalPlatformService;
import hepsiFurkandaETicaretDemo.dataAccess.abstracts.UserDao;

public class SignWithGoogleAccount implements SigningWithExternalPlatformService{
	
	public static void signWithGoogleAccount(UserDao userDao) {
		boolean verify;
		
		System.out.println("Gmail adresinizi ve þifrenizi giriniz.");
		verify=true;
		
		
		if(verify==true) {
			System.out.println("Baþarýyla giriþ yaptýnýz.");
		}else {
			System.out.println("Bilgileriniz doðrulanamadý, Lütfen tekrar deneyiniz.");
		}
		
		
	}

}
