import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int degree = scanner.nextInt();

        /*
         *  your code goes here
         */

        int hour = degree / 30;
        double Reminute = degree % 30;

        double AngMin = Reminute * 360;

        System.out.print(AngMin);

        // closing the scanner object
        scanner.close();
    }
}