/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author emcco4
 */
import java.util.Scanner; //import - always at top of file for keyboard input

public class KeyboardTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); //Make console
        System.out.print("Type your name: ");

        String name = console.nextLine(); //saves a line typed to the variable
        System.out.println("Welcome, " + name);
    }

}
