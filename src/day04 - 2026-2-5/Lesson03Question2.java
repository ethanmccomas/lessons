import java.util.Scanner;

public class Lesson03Question2 {       
    public static void main(String[] args) {

        Scanner TempetureInCelsiusScanner = new Scanner(System.in);
        System.out.println("\t\tWhat is the current temperture in Celsius?");

        String TempetureInCelsiusString = TempetureInCelsiusScanner.nextLine();
        double TempetureInCelsiusDouble=0;

        TempetureInCelsiusDouble = Double.parseDouble(TempetureInCelsiusString);
        double MultiplyTempeture=1.8;


        System.out.println("\t\tThe tempeture of " + (TempetureInCelsiusDouble) + " Celsius is " + ((TempetureInCelsiusDouble*MultiplyTempeture)+32) + " in Fahrenheit.");
                                                                                            //(2°C × 9/5) + 32 

        TempetureInCelsiusScanner.close();
    }

}
