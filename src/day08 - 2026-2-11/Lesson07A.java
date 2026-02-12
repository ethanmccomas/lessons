
import java.util.Scanner;

public class Lesson07A {
    public static void main(String[] args) {
//Part 1
        System.out.println("\t\tHere is every even number from zero to one hundred:");
    

        int EvenNumbers = 0;
        while (EvenNumbers <= 100) {
            System.out.print(EvenNumbers + " ");
            EvenNumbers = EvenNumbers+2;
        }
//Part 2
        System.out.println("");
        System.out.println("\t\tHere is every number from zero to one hundred in groups of ten:");

        int EveryNumber = 1;
        while (EveryNumber <= 100) {
            System.out.print((EveryNumber) + " ");
            EveryNumber++;
            if (EveryNumber % 10 == 1) {
                System.out.println(""); 
            }
        }
//Part 3
        System.out.println("\t\tWhat is the current time using the 24-hour clock system, I will convert it to 12-hour clock");

        Scanner ClockTime24Scanner = new Scanner(System.in);
        int ClockTime24Interger =0;
        while(!ClockTime24Scanner.hasNextInt()){
            ClockTime24Scanner.nextLine();
            System.out.println("Enter an interger");
        }
        ClockTime24Interger = ClockTime24Scanner.nextInt();

        while (ClockTime24Interger > 24 || ClockTime24Interger < 0) {
            System.out.println("Enter a time between 0 and 24");
            ClockTime24Interger = ClockTime24Scanner.nextInt();
        }

        if (ClockTime24Interger <= 12) {
            System.out.println("The current time is " + ClockTime24Interger + " AM");
        } else {
            if (ClockTime24Interger >=13) {
                System.out.println("The current time is " + ClockTime24Interger + " PM");
            } else {
                System.out.println("How did you get here");
            }
        }
//Part 4
        System.out.println("\t\tI cen tell you every integer number before any number you pick");
        Scanner EveryNumberBeforeScanner = new Scanner(System.in);
        String EveryNumberBeforeString = EveryNumberBeforeScanner.nextLine(); 
        int EveryNumberBeforeint = 0;
        int EveryNumberBeforePickedint = 0;

        try {
            EveryNumberBeforePickedint = Integer.parseInt(EveryNumberBeforeString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        while (EveryNumberBeforeint < EveryNumberBeforePickedint) {
            System.out.print((EveryNumberBeforeint) + " ");
            EveryNumberBeforeint++;
        }

//Part 5
        System.out.println("\n\t\tIf you give me 10 doubles I can tell you their sum."); 
        Double TotalDouble = 0.0;

        for (int DoubleCountInt = 1; DoubleCountInt <= 10; DoubleCountInt++) {
            System.out.println("Please give me number " + DoubleCountInt);
            Scanner PickedDoubleScanner = new Scanner(System.in);
            String PickedDoubleString = PickedDoubleScanner.nextLine();
            Double PickedDouble = 0.0;
            try {
                PickedDouble = Double.parseDouble(PickedDoubleString);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, that was not a number");
                System.exit(1);
            }
            TotalDouble = (TotalDouble+PickedDouble);

        }
        System.out.println("The sum of your doubles is " + TotalDouble);
//Part 6
        System.out.println("\n\t\tWhat word do you want me to repeat?");
        Scanner RepeatedWordScanner = new Scanner(System.in);
        String RepeatedWordString = RepeatedWordScanner.nextLine();

        System.out.println("\t\tOk, how many times do you want me to repeat " + RepeatedWordString + "\n");
        Scanner TimesRepeatedScanner = new Scanner(System.in);
        String TimesRepeatedString = TimesRepeatedScanner.nextLine();
        int TimesRepeatedint = 0;

        try {
            TimesRepeatedint = Integer.parseInt(TimesRepeatedString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }
        int TimesSaidint = 1;
        while (TimesSaidint <= TimesRepeatedint) {
            System.out.println("" + TimesSaidint + ": " + RepeatedWordString);
            TimesSaidint++;
        }
//Part 7
        System.out.println("\n\t\tWhat is the base number do you want me multiply with?");
        Scanner BaseScanner = new Scanner(System.in);
        String BaseString = BaseScanner.nextLine();
        int Baseint = 0;
        try {
            Baseint = Integer.parseInt(BaseString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        System.out.println("\t\tOk, what is the power you want me to apply to " + BaseString);
        Scanner PowerScanner = new Scanner(System.in);
        String PowerString = PowerScanner.nextLine();
        int Powerint = 0;

        try {
            Powerint = Integer.parseInt(PowerString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }
        int TimesDoneint = 1;
        int Answer = Baseint;
        while (TimesDoneint < Powerint) {
            Answer = (Answer*Baseint);
            TimesDoneint++;
        }
        System.out.println ("\t\t" + Baseint + " to the power of " + Powerint + " equals " + Answer);
//Part 8
        System.out.println("\t\tPlease input as many numbers as you like, make sure to seperate them by a space.");
        Scanner AverageScanner = new Scanner(System.in);
        String AverageString = AverageScanner.nextLine();

        String[] NumberArray = AverageString.split(" ");
        int NumberSum = 0;
        int NumberArrayint =0;

        for (int SpaceInArray = 0; SpaceInArray < NumberArray.length; SpaceInArray++) {
            try {
                NumberArrayint = Integer.parseInt(NumberArray[SpaceInArray]);
            } catch (NumberFormatException e) {
                System.out.println("Sorry, I dont understand");
                System.exit(1);
            }

            NumberSum = (NumberSum+NumberArrayint);
        }
        System.out.println("\t\tThe sum of your numbers is " + NumberSum);

        double NumberAverageDouble = 0;

        NumberAverageDouble = (double) NumberSum/(double) NumberArray.length;


        System.out.println("\t\tThe average of your numbers is " + NumberAverageDouble);
    }
}
