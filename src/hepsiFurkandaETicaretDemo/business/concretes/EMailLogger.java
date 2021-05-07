package hepsiFurkandaETicaretDemo.business.concretes;
import hepsiFurkandaETicaretDemo.business.abstracts.LoggerService;
import hepsiFurkandaETicaretDemo.entities.concretes.User;

public class EMailLogger implements LoggerService{
	
	boolean verify;
	
	public static boolean log(User user) {
		
		boolean verify;
		
		if(EMailCheck.check(user)==true) {
		System.out.println("Bilgileriniz do�ruland�. Son olarak " + user.geteMail() + " mail adresinize g�nderilen do�rulama ba�lant�s�na t�klay�p hesab�n�z� onaylaman�z gerekmektedir.");
		verify=true;
		}
		
		else{
			System.out.println("Ge�erli bir mail adresi giriniz.");
		verify=false;
		}
		
		
		return verify;
	}

}
