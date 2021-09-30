/**
 * The RecDieRollerDriverclass contains a main method which calls the roll method 1000 times,
 * then prints the mean number of rolls required to roll a 2.
 *
 * @author Joshua Collins
 * @version 1.0
 * @since 2021-09-30
 */ 
public class Application {

    /**
	 * The main method populates an array with the rollNumber for each roll, then calculates the mean rollNumber.
	 *
	 * @param args
	 */ 
    public static void main(String[] args) {
        RecDieRoller dieRoller = new RecDieRoller();
        int[] rollNumbers = new int[1001];
        for (int i=1; i<=1000; i++) {
            rollNumbers[i] = dieRoller.roll();
            System.out.println("rollNumber for this iteration:" + rollNumbers[i]);
            System.out.println("\nCurrent iteration: " + i);
        }

        int sum = 0;
        for (int i=0; i<rollNumbers.length; i++) {
            sum = sum + rollNumbers[i];
        }
        int avg = sum / 1000;
        System.out.println("\nAverage number of rolls: " + avg);
    }
}