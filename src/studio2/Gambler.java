package studio2;

public class Gambler {

	public static void main(String[] args) {
		for(int n =0;n<500;n++) {
			int amount = 10;
			int count=0;
			int winround = 0;
			int loseround =0 ;
		while (amount<=20 && amount>=0) {
			var d = Math.random();
			if (d < 0.5) {
				amount++;
				count++;
				winround ++;
			}
			else {
				amount--;
				count++;
				loseround++;
			}
		}
		
		if (amount>20)
		{
			System.out.println("After "+count+" turns, "+"you won "+winround+" rounds, "+"you lost "+loseround+" rounds, " +",You win.");
			
		}
		else if (amount<0)
		{
			System.out.println("After "+count+" turns, "+"you won "+winround+" rounds, "+"you lost "+loseround+" rounds, " +",You loose.");
			
		}
	

	}}

}
