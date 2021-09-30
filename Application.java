public class Application {
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