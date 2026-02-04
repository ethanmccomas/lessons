import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
      
        Scanner NameScanner = new Scanner(System.in);
        System.out.println("\t\tHello, whats your name " );
        
        String responceName = NameScanner.nextLine();
        System.out.println("\t\tHello " + responceName + ", My name is Joe");
        

        Scanner mathScanner = new Scanner(System.in);
        System.out.println("\t\tCan you help me with this math problem? It's asking what is 5 + 3. ");

        String answerString = mathScanner.nextLine();
        int answerInt =0;

        try {
            answerInt = Integer.parseInt(answerString);

        } catch (NumberFormatException e) {
            System.out.println("\t\tThat's no help");
            System.exit(1);
        }

        if (answerInt==8) {
            System.out.println("\t\tOh yeah! Your correct.");            
        }else{
            System.out.println("\t\tI don't think thats the correct answer.");
        }


        Scanner doubleMathScanner = new Scanner(System.in);
        System.out.println("\t\tHere is another problem, what is 0.5 + 0.2. ");

        String doubleAnswerString = doubleMathScanner.nextLine();
        double doubleAnswer=0;

        try {
            doubleAnswer = Double.parseDouble(doubleAnswerString);

        } catch (NumberFormatException e) {
            System.out.println("\t\tThat's no help");
            System.exit(1);
        }

        if (doubleAnswer==0.7) {
            System.out.println("\t\tRight On! Your correct again.");            
        }else{
            System.out.println("\t\tIm not so sure about that answer.");
        }

        Scanner BoardGameScanner = new Scanner(System.in);
        System.out.println("\t\tWhats your favorite boardgame? " );
        
        String responceBoardGame = BoardGameScanner.nextLine();
        System.out.println("\t\tOh nice I also like " + responceBoardGame + ", but my favorite boardgame is SmallWorld.");  

        Scanner ColorScanner = new Scanner(System.in);
        System.out.println("\t\tOne last question, What is your favorite color? " );
        
        String responceColor = ColorScanner.nextLine();
        System.out.println("\t\t" + responceColor + " is a nice color; my favorite color is green.");

       NameScanner.close();
       mathScanner.close();
       doubleMathScanner.close();
       BoardGameScanner.close();
       ColorScanner.close();
    }
}
