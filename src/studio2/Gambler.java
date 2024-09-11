package studio2;

public class Gambler {

	public static void main(String[] args) {
		int count=0;
		int amount = 10;
		for(int i =0;i<1000000;i++) {
		var d = Math.random();
		if (amount>20)
		{
			System.out.println("After "+count+" turns " +", You win");
			System.exit(0);
		}
		else if (amount<0)
		{
			System.out.println("After "+count+" turns " +",You loose");
			System.exit(0);
		}
		else {
			if (d < 0.5) {
				amount++;
				count++;
			}
			else {
				amount--;
				count++;
			}
		}

	}}

}
