import java.util.Scanner;

public class Lesson03Question7 {
    public static void main(String[] args) {

        System.out.println("\t\tIn order to solve for velocity you need to divide an objects displacment by travel time.");

        Scanner DisplacmentScanner = new Scanner(System.in);
        System.out.println("\t\tWhat is the displacement of your object in meters? ");

        String DisplacmentString = DisplacmentScanner.nextLine(); 
        double DisplacmentDouble =0.0;

        try {
            DisplacmentDouble = Double.parseDouble(DisplacmentString);
        } catch (NumberFormatException e) {
            System.out.println("\t\tThat's not an appropriate displacement.");
            System.exit(1);
        }

        Scanner TimeScanner = new Scanner(System.in);
        System.out.println("\t\tWhat is the travel time of your object in seconds? ");

        String TimeString = TimeScanner.nextLine(); 
        Double TimeDouble =0.0;

        try {
            TimeDouble = Double.parseDouble(TimeString);
        } catch (NumberFormatException e) {
            System.out.println("\t\tThat's not an appropriate travel time.");
            System.exit(1);
        }

        System.out.println("\t\tThe velocity of your object is " + (DisplacmentDouble/TimeDouble) + " in meters per second.");

        DisplacmentScanner.close();
        TimeScanner.close();
    }  
}