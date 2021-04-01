
import org.springframework.stereotype.Service;

import com.vunnam.model.CreditCard;

@Service
public class ServiceCreditCheck {
	
	private CreditCard card2 = new CreditCard();
	/
	
	public CreditCard validate(String number) {
		//parse the individual string values to int 
		if(number.length() == 15) { 
			card2.setType("JCB");
			card2.setValid(true);
			
		}
		else if(number.length() <=19 && number.length()>=16) {
			//for Master and visa
			if(number.length()==16) {
				//for visa
				card2.setType("Visa");
				card2.setValid(true);
			}
			card2.setType("MasterCard");
			card2.setValid(true);
		}
		
		return card2;
	}
	public String check() {
		return "all working fine";//card2.toString();
	}
	
	
}
