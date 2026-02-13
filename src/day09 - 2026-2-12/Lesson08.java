import java.util.Scanner;

public class Lesson08 {
        public static void main(String[] args) {
//Part 1
        System.out.println("\t\tPart 1");
        int OneThroughTwenty = 0;
        for (int NumberSaid = 0; NumberSaid <= 20; NumberSaid++) {
            System.out.print(OneThroughTwenty + " ");
            OneThroughTwenty++;
        }   
        System.out.println("");
//Part 2
        System.out.println("\t\tPart 2");
        int MultiplesOfFive = 1;
        for (int TimeBaseMultiplyedNumber = 0; TimeBaseMultiplyedNumber < 40; TimeBaseMultiplyedNumber++) {
            System.out.print(MultiplesOfFive*5 + ", ");
            MultiplesOfFive++;
            if (MultiplesOfFive % 10 == 1) {
                System.out.println(""); 
            }
        }   
        System.out.println("");
//Part 3
        System.out.println("\t\tPart 3\n\t\tWhat is a positive integer you want to know the divisor for?");
        Scanner IntegerScanner = new Scanner(System.in);
        String IntegerString = IntegerScanner.nextLine();
        int PositiveInteger = Integer.parseInt(IntegerString);

        for (int NumberDividedBy = 1; NumberDividedBy <= PositiveInteger; NumberDividedBy++) {
            int Remainder = (PositiveInteger % NumberDividedBy);
            if (Remainder == 0) {
                System.err.print(NumberDividedBy + " ");
            }
        } 
        System.out.println("");
//Part 4
        System.out.println("\t\tPart 4\n\t\tWhat is a integer you want to know is a palindrome?");
        Scanner PalindromeScanner = new Scanner(System.in);
        String PalindromeString = PalindromeScanner.nextLine();

        PalindromeString.length();
        String PalindromeCheckString = "";

        for (int Placement = 0; Placement < PalindromeString.length(); Placement++) {
            PalindromeCheckString = PalindromeString.substring(Placement,Placement+1) + PalindromeCheckString;
        }
        if (PalindromeCheckString.equalsIgnoreCase(PalindromeString)) {
            System.out.println("\t\t" + PalindromeString + " is a palindrome");
        } else {
            System.out.println("\t\t" + PalindromeString + " is not a palindrome");
        }
        System.out.println("");
//Part 5
        System.out.println("\t\tPart 5\n\t\tI can tell you all the numbers between to numbers\n\t\tWhat is the first and smaller number you have in mind?");
        Scanner NumberOneScanner = new Scanner(System.in);
        String NumberOneString = NumberOneScanner.nextLine();
        int NumberOneInt =0;
         try {
            NumberOneInt = Integer.parseInt(NumberOneString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        System.out.println("\t\tWhat is the second and larger number?");
        Scanner NumberTwoScanner = new Scanner(System.in);
        String NumberTwoString = NumberTwoScanner.nextLine();
        int NumberTwoInt =0;
         try {
            NumberTwoInt = Integer.parseInt(NumberTwoString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        for (int NumbersDone = (NumberOneInt+1); NumbersDone < NumberTwoInt; NumbersDone++) {
            System.out.print(NumbersDone + " ");
        }
        System.out.println("");
//Part 6
        System.out.println("\t\tPart 6");
        String RowString = "";

        for (int Row = 1; Row < 10; Row++) {
            RowString = RowString + " " + (Row + "");
            System.out.println(RowString);
        }
    }
}
