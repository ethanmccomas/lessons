import java.util.Scanner;

public class Lesson05A {
    public static void main(String[] args) {
        System.out.println("\t\tIf you give me two numbers I can tell you what number is bigger and if they are even or odd");
        
        Scanner NumberOneScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with your first number?");

        String NumberOneString = NumberOneScanner.nextLine(); 
        Double NumberOneDouble =0.0;
        try {
            NumberOneDouble = Double.parseDouble(NumberOneString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        Scanner NumberTwoScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with your second number?");

        String NumberTwoString = NumberTwoScanner.nextLine(); 
        Double NumberTwoDouble =0.0;
        try {
            NumberTwoDouble = Double.parseDouble(NumberTwoString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }
        double EqualOneAndTwo =0.0;
        EqualOneAndTwo = (NumberOneDouble-NumberTwoDouble);

        if (NumberOneDouble<NumberTwoDouble) {
            System.out.println("\t\tYour second number (" + NumberTwoDouble + ") is larger then your first number (" + NumberOneDouble + ")");
        } else {
            if (EqualOneAndTwo==0.0) {
                System.out.println("\t\tBoth your numbers are equal and are " + NumberOneDouble);   
            } else {
//NumberOneDouble>NumberTwoDouble
                System.out.println("\t\tYour first number (" + NumberOneDouble + ") is larger then your second number (" + NumberTwoDouble + ")");
            }

        }

        double NumberOneOddOrEven = 0.0;

        NumberOneOddOrEven = (NumberOneDouble%2);

        if (NumberOneOddOrEven==0.0) {
            System.out.println("\t\tYour first number (" + NumberOneDouble + ") is even");
        } else {
            System.out.println("\t\tYour first number (" + NumberOneDouble + ") is odd");
        }

        double NumberTwoOddOrEven = 0.0;

        NumberTwoOddOrEven = (NumberTwoDouble%2);

        if (NumberTwoOddOrEven==0.0) {
            System.out.println("\t\tYour first number (" + NumberTwoDouble + ") is even");
        } else {
            System.out.println("\t\tYour first number (" + NumberTwoDouble + ") is odd");
        }

        NumberOneScanner.close();
        NumberTwoScanner.close();
    }
}
