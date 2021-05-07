package hepsiFurkandaETicaretDemo.business.concretes;
import hepsiFurkandaETicaretDemo.business.abstracts.LoggerService;
import hepsiFurkandaETicaretDemo.entities.concretes.User;

public class EMailLogger implements LoggerService{
	
	boolean verify;
	
	public static boolean log(User user) {
		
		boolean verify;
		
		if(EMailCheck.check(user)==true) {
		System.out.println("Bilgileriniz doðrulandý. Son olarak " + user.geteMail() + " mail adresinize gönderilen doðrulama baðlantýsýna týklayýp hesabýnýzý onaylamanýz gerekmektedir.");
		verify=true;
		}
		
		else{
			System.out.println("Geçerli bir mail adresi giriniz.");
		verify=false;
		}
		
		
		return verify;
	}

}
