package hepsiFurkandaETicaretDemo.business.concretes;
import hepsiFurkandaETicaretDemo.business.abstracts.LoggerService;
import hepsiFurkandaETicaretDemo.entities.concretes.User;

public class EMailLogger implements LoggerService{
	
	boolean verify;
	
	public static boolean log(User user) {
		
		boolean verify;
		
		if(EMailCheck.check(user)==true) {
		System.out.println("Bilgileriniz doğrulandı. Son olarak " + user.geteMail() + " mail adresinize gönderilen doğrulama bağlantısına tıklayıp hesabınızı onaylamanız gerekmektedir.");
		verify=true;
		}
		
		else{
			System.out.println("Geçerli bir mail adresi giriniz.");
		verify=false;
		}
		
		
		return verify;
	}

}
