import java.util.Scanner;

public class Lesson03Question1 {

    public static void main(String[] args) {
    
        
        Scanner NumberOneScanner = new Scanner(System.in);
        System.out.println("\t\tHello, Can you provide me with a integer number? ");

        String ResponceNumberOneString = NumberOneScanner.nextLine(); 
        int ResponceNumberOneInt =0;

        try {
            ResponceNumberOneInt = Integer.parseInt(ResponceNumberOneString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        System.out.println("\t\tThank you for the integer number " + ResponceNumberOneInt + ".");

        //NUMBER 2

        Scanner NumberTwoScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with a second integer number? ");

        String ResponceNumberTwoString = NumberTwoScanner.nextLine(); 
        int ResponceNumberTwoInt =0;

        try {
            ResponceNumberTwoInt = Integer.parseInt(ResponceNumberTwoString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        System.out.println("\t\tThank you for the integer number " + ResponceNumberTwoInt + ".");


        System.out.println((ResponceNumberOneInt) + "+" + (ResponceNumberTwoInt) + "=" + (ResponceNumberOneInt+ResponceNumberTwoInt));
        System.out.println((ResponceNumberOneInt) + "-" + (ResponceNumberTwoInt) + "=" + (ResponceNumberOneInt-ResponceNumberTwoInt));
        System.out.println((ResponceNumberOneInt) + "*" + (ResponceNumberTwoInt) + "=" + (ResponceNumberOneInt*ResponceNumberTwoInt));
        System.out.println((ResponceNumberOneInt) + "/" + (ResponceNumberTwoInt) + "=" + (ResponceNumberOneInt/ResponceNumberTwoInt) + " with integer division");
        float NumberOneFloat = ResponceNumberOneInt;
        float NumberTwoFloat = ResponceNumberTwoInt;
        System.out.println((ResponceNumberOneInt) + "/" + (ResponceNumberTwoInt) + "=" + (NumberOneFloat/NumberTwoFloat) + " with float division");
        System.out.println((ResponceNumberOneInt) + "%" + (ResponceNumberTwoInt) + "=" + (ResponceNumberOneInt%ResponceNumberTwoInt));


        NumberTwoScanner.close();
        NumberOneScanner.close();
    
    
    }

}