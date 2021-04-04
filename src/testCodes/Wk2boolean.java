package testCodes;

public class Wk2boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boolean variables
		boolean isHotOutside = 100<85;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.00;
		double moneyInWallet = 5.50;
		int thirstLevel = 7;
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && isWeekday;
		boolean isAGoodDay = isHotOutside && isWeekday && hasMoneyInPocket;
		boolean willBuyMilk = isHotOutside == moneyInWallet>=costOfMilk;
		
	 
	    		
		System.out.println("is 100<85?" + isHotOutside);
		
		
		
	}

}
