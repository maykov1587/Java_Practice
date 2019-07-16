import java.util.Random;

public class RandomClassRandom {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		int ourRandom = (generator.nextInt(6)) + 1;
		
		System.out.println(ourRandom);

	}

}
