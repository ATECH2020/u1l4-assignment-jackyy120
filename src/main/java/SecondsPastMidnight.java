import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int number = scanner.nextInt();

        //Your code goes here
        int hours;
        int minutes;

        hours = number / 3600;
        minutes = number / 60;

        //print out output
        System.out.print(hours +" "+ minutes);

        // closing the scanner object
        scanner.close();
    }
}