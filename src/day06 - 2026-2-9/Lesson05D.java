import java.util.Scanner;

public class Lesson05D {
    public static void main(String[] args) {
        System.out.println("\t\tCan you win my game?\n\t\tIf you provide me with two integers that add, subtract, multiply or divide to be equal to the third integer you'll win. ");
        
        Scanner NumberOneScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with your first number?");

        String NumberOneString = NumberOneScanner.nextLine(); 
        Integer NumberOneInteger =0;
        try {
            NumberOneInteger = Integer.parseInt(NumberOneString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        Scanner NumberTwoScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with your second number?");

        String NumberTwoString = NumberTwoScanner.nextLine(); 
        Integer NumberTwoInteger =0;
        try {
            NumberTwoInteger = Integer.parseInt(NumberTwoString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        Scanner NumberThreeScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with your third number?");

        String NumberThreeString = NumberThreeScanner.nextLine(); 
        Integer NumberThreeInteger =0;
        try {
            NumberThreeInteger = Integer.parseInt(NumberThreeString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        if ((NumberOneInteger+NumberTwoInteger)==NumberThreeInteger) {
            System.out.println("Congratulations!! You win!!" + NumberOneInteger + "+" + NumberTwoInteger + "=" + NumberThreeInteger);
        } else {
            if ((NumberOneInteger-NumberTwoInteger)==NumberThreeInteger) {
                System.out.println("Congratulations!! You win!!" + NumberOneInteger + "-" + NumberTwoInteger + "=" + NumberThreeInteger);
            } else {
                if ((NumberOneInteger*NumberTwoInteger)==NumberThreeInteger) {
                    System.out.println("Congratulations!! You win!!" + NumberOneInteger + "*" + NumberTwoInteger + "=" + NumberThreeInteger);
                } else {
                    if ((NumberOneInteger/NumberTwoInteger)==NumberThreeInteger) {
                        System.out.println("Congratulations!! You win!!" + NumberOneInteger + "/" + NumberTwoInteger + "=" + NumberThreeInteger);
                    } else {
                        System.out.println("\t\tSorry but you lose");
                    }
                }
            }
        }

        NumberOneScanner.close();
        NumberTwoScanner.close();
        NumberThreeScanner.close();
    }
}
