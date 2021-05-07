package hepsiFurkandaETicaretDemo.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import hepsiFurkandaETicaretDemo.business.abstracts.CheckService;
import hepsiFurkandaETicaretDemo.dataAccess.abstracts.UserDao;
import hepsiFurkandaETicaretDemo.entities.concretes.User;

public class EMailCheck implements CheckService{
	
	public static boolean check(User user) {
		boolean mailUygunMu;
		
			
		
			Pattern pattern = Pattern.compile("[aüpsldpaskfðpasdkfðoaksf]+.com");
			Matcher matcher = pattern.matcher(user.geteMail());
		
			if(matcher.find()) {
			
			mailUygunMu = true;
		}else {
			
			mailUygunMu = false;
		}
			
		return mailUygunMu;
	}

}
