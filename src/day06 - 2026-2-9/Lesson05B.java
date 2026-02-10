import java.util.Scanner;

public class Lesson05B {
//Level 4 is >= 80
//Level 3 is >= 70 and < 80
//Level 2 is >= 60 and < 70
//Level 1 is >= 50 and < 60
//Level 0 is < 50
    public static void main(String[] args) {
        System.out.println("\t\tWhat percent did you get on your last test?");
        
        Scanner GradeScanner = new Scanner(System.in);

        String GradeString = GradeScanner.nextLine(); 
        Double GradeDouble =0.0;
        try {
            GradeDouble = Double.parseDouble(GradeString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        if (GradeDouble<50) {
            System.out.println("You got a R");

        } else {
           if (GradeDouble >=50 && GradeDouble <60) {
                System.out.println("You got a level 1");

            } else {
                if (GradeDouble >=60 && GradeDouble <70) {
                    System.out.println("You got a level 2");
                } else {
                    if (GradeDouble >=70 && GradeDouble <80) {
                        System.out.println("You got a level 3");
                    } else {
                        if (GradeDouble >=80) {
                            System.out.println("You got a level 4");
                        } else {
                            if (GradeDouble==100) {
                                System.out.println("Congradulations you were perfect");                                
                            }
                        }
                    }
                }
            }
        }   
             
        GradeScanner.close();
    }
}
