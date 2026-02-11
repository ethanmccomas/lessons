import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("\t\tLet's play Rock Paper Scissors!");
        
        Scanner PlayerTypeScanner = new Scanner(System.in);
        String PlayerTypeString = PlayerTypeScanner.nextLine(); 

        int RandomNumber = (int)(Math.random()*3);
//0=Rock
//1=Paper
//2=Scissors

        if (PlayerTypeString.equalsIgnoreCase("Rock")) {
            if (RandomNumber==0) {
                System.out.println("You Tied");
            } else {
                if (RandomNumber==1) {
                    System.out.println("You Lost");
                } else {
                    if (RandomNumber==2) {
                        System.out.println("You Won!");
                    }
                }
            }
        }
                    
        if (PlayerTypeString.equalsIgnoreCase("Paper")) {
            if (RandomNumber==0) {
                System.out.println("You Won!");
            } else {
                if (RandomNumber==1) {
                    System.out.println("You Tied");
                } else {
                    if (RandomNumber==2) {
                        System.out.println("You Lost");
                    }
                }
            }
        }

        if (PlayerTypeString.equalsIgnoreCase("Scissors")) {
            if (RandomNumber==0) {
                System.out.println("You Lost");
            } else {
                if (RandomNumber==1) {
                    System.out.println("You Won!");
                } else {
                    if (RandomNumber==2) {
                        System.out.println("You Tied");
                    }
                }
            }
        }


        PlayerTypeScanner.close();
    }
}