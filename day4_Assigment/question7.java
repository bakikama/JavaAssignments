package day4_Assigment;

public class question7 {

	public static void main(String[] args) {
		
		int price,sents,quarters,dimes,nickels;
		
		price = 15;
		
		sents = 100;
		
		quarters = (sents - price) / 25;
		
		dimes = ((sents - price) - (quarters * 25)) / 10;
		
		nickels = ((sents - price) - (quarters * 25) - (dimes * 10)) / 5;
		
		System.out.println("Price in cents = "+price);
		
		System.out.println("Your change is "+ quarters + " quarters, " + dimes + " dimes and " + nickels + " nickels");
		
	}

}
