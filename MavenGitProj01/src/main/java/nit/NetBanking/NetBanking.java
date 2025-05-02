package nit.NetBanking;

import java.util.Random;

public class NetBanking {
	public Random withdraw(double amount) {
		return new Random(40000);
	}
	
	public String getMessange(String str) {
		return "amount is detucted successful";
	}
	
	public String deposite(String s, int amount) {
		return "money created in account" +amount;
	}

}
