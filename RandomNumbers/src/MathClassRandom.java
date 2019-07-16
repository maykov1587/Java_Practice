
public class MathClassRandom {

	public static void main(String[] args) {

		double ourRandom = Math.random();
		double ourRandom2 = Math.random();
		
		//System.out.println(ourRandom);

		double rollDie1 = (ourRandom * 6) + 1;
		double rollDie2 = (ourRandom2 * 6) + 1;
		
		int roll = (int) rollDie1;
		int roll2 = (int) rollDie2;
		
		System.out.println(roll);
		System.out.println(roll2);
	}

}
