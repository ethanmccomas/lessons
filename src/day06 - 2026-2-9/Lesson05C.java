import java.util.Scanner;
    public class Lesson05C {
    public static void main(String[] args) {
        System.out.println("\t\tPick a random 5 diget number?");
        
        Scanner LotteryNumberScanner = new Scanner(System.in);

        String LotteryString = LotteryNumberScanner.nextLine(); 
        Double LotteryDouble =0.0;
        try {
            LotteryDouble = Double.parseDouble(LotteryString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }
        if (LotteryDouble<=9999) {
            System.out.println("Your number is not 5 digets");
        } else { 
            if (LotteryDouble==34567) {
                System.out.println("Congradulations!! You have won $1,000,000");
            } else {
                if (LotteryDouble>=100000) {
                    System.out.println("Your number is not 5 digets");
                } else {
                    System.out.println("You lose, better luck next time");
                }
            }
        }
        LotteryNumberScanner.close();
    }
}
