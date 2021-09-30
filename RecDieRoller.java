import java.util.Random;

/**
 * The RecDieRoller class contains a constructor and the roll method.
 *
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-09-23
 */
public class RecDieRoller {

	int rollNumber = 1;
	/**
	 * The constructor to instantiate a new die roller.
	 */
	public RecDieRoller() {

	}

	/**
	 * The roll method generates a random integer from 1-6, prints the integer, then calls itself if the integer is not equal to 2.
	 */
	public int roll() {
		Random rand = new Random();
		int num = rand.nextInt(6-1+1) + 1;
		System.out.println(num);
		if (num != 2) {
			this.rollNumber++;
			int result = roll();
			this.rollNumber = 1;
			return result;
		}
		else {
			return this.rollNumber;
		}
	}
}
