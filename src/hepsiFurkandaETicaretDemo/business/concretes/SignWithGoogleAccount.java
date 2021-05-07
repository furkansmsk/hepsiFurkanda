package hepsiFurkandaETicaretDemo.business.concretes;

import hepsiFurkandaETicaretDemo.business.abstracts.SigningWithExternalPlatformService;
import hepsiFurkandaETicaretDemo.dataAccess.abstracts.UserDao;

public class SignWithGoogleAccount implements SigningWithExternalPlatformService{
	
	public static void signWithGoogleAccount(UserDao userDao) {
		boolean verify;
		
		System.out.println("Gmail adresinizi ve �ifrenizi giriniz.");
		verify=true;
		
		
		if(verify==true) {
			System.out.println("Ba�ar�yla giri� yapt�n�z.");
		}else {
			System.out.println("Bilgileriniz do�rulanamad�, L�tfen tekrar deneyiniz.");
		}
		
		
	}

}
