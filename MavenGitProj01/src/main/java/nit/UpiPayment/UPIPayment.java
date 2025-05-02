package nit.UpiPayment;

import java.util.Random;

public class UPIPayment {
	

	public String upiDone(String s,double amount) {
		return "Transaction is done for"+amount+" "+new Random(50000);
	}
	
}
