/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author emcco4
 */
import java.util.Scanner;

public class Lesson02B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "joe Smith";
        int birthyear = 2004;
        double weight= 45.6;
        
        System.out.println("My name is, " + name);
        System.out.println("I was born in " + birthyear);
        System.out.println("I weigh " + weight +" kg");

        Scanner console = new Scanner(System.in);
        System.out.print("Your favourite animal is " );
       
        String animal = console.nextLine();
        System.out.println("I also like " + animal);


        Scanner math = new Scanner(System.in);
        System.out.print("What is 3 + 10? ");

        String answerstring = math.nextLine();
        int answerint =0;

        try {
            answerint = Integer.parseInt(answerstring);

        } catch (NumberFormatException e) {
            System.out.println("Error, Enter A Number Next Time");
            System.exit(1);
        }

        if (answerint==13) {
            System.out.println("You are correct");            
        }else{
            System.out.println("You are incorrect; It should be 13.");
        }
            
        console.close();
        math.close();

    }
    
}
