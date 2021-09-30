/**
 * The RecDieRollerDriverclass contains a main method which instantiates a RecDieRoller and calls the roll method.
 *
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-09-23
 */ 
public class RecDieRollerDriver {

	/**
	 * The main method instantiates a new die roller and performs the roll.
	 *
	 * @param args
	 */ 
	public static void main(String[] args) {
		RecDieRoller dieRoller = new RecDieRoller();
		dieRoller.roll();
	}
}
