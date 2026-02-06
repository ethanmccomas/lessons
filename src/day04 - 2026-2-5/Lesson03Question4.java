import java.util.Scanner;

public class Lesson03Question4 {
    public static void main(String[] args) {
    
        //PART 1
    Scanner FourDigitScanner = new Scanner(System.in);
    System.out.println("\t\tHello, Can you provide me with a four digit integer number? ");

    String FourDigitString = FourDigitScanner.nextLine(); 
    int FourDigitInt =0;
   
    try {
        FourDigitInt = Integer.parseInt(FourDigitString);
    } catch (NumberFormatException e) {
        System.out.println("Sorry, I dont understand");
        System.exit(1);
    }

    if (FourDigitInt <= 1000 )
    {
        System.out.println("Sorry, Your number is too small.");
        System.exit(1);   
    }
     if (FourDigitInt >= 10000 )
    {
        System.out.println("Sorry, Your number is too large.");
        System.exit(1);   
    }

    String NumberOne =  FourDigitString.substring(0,1);
    String NumberTwo =  FourDigitString.substring(1,2);
    String NumberThree =  FourDigitString.substring(2,3);
    String NumberFour =  FourDigitString.substring(3,4);

    int SumOfString = Integer.parseInt(NumberOne) + Integer.parseInt(NumberTwo) + Integer.parseInt(NumberThree) + Integer.parseInt(NumberFour);

    System.out.println("\t\tThank you for the integer number " + FourDigitInt + ".");
    System.out.println("\t\tThe sum of all the digits is " + SumOfString + ".");

    FourDigitScanner.close();
    }
}
