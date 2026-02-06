//I did this assignment all by my self
import java.util.Scanner;

public class ExerciseLinearEquations {
    public static void main(String[] args) {
        System.out.println("\t\tIn order to find the equation of a line I need two points.");
//VALUES
        Scanner XValueOneScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with a the first point's X value?");

        String XValueOneString = XValueOneScanner.nextLine(); 
        Double XValueOneDouble =0.0;
        try {
            XValueOneDouble = Double.parseDouble(XValueOneString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        Scanner YValueOneScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with a the first point's Y value?");

        String YValueOneString = YValueOneScanner.nextLine(); 
        Double YValueOneDouble =0.0;
        try {
            YValueOneDouble = Double.parseDouble(YValueOneString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }

        Scanner XValueTwoScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with a the seconds point's X value?");

        String XValueTwoString = XValueTwoScanner.nextLine(); 
        Double XValueTwoDouble =0.0;
        try {
            XValueTwoDouble = Double.parseDouble(XValueTwoString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }
            
        Scanner YValueTwoScanner = new Scanner(System.in);
        System.out.println("\t\tCan you provide me with a the second point's Y value?");

        String YValueTwoString = YValueTwoScanner.nextLine(); 
        Double YValueTwoDouble =0.0;
        try {
            YValueTwoDouble = Double.parseDouble(YValueTwoString);
        } catch (NumberFormatException e) {
            System.out.println("Sorry, I dont understand");
            System.exit(1);
        }
            
        System.out.println("\t\tYour points are: \n\n\t\tPoint One: (" + XValueOneDouble + "," + YValueOneDouble + ") \n\t\tPoint Two: (" +  + XValueTwoDouble + "," + YValueTwoDouble + ")");
        XValueOneScanner.close();
        YValueOneScanner.close();
        XValueTwoScanner.close();
        YValueTwoScanner.close();
//SLOPE
        System.out.println("\t\tWith these points I can solve for the slope or 'm' value.\n\t\tThe equation is m=(y2-y1)/(x2-x1)");
        Double MSlopeValueDouble = 0.0;
        MSlopeValueDouble = ((YValueTwoDouble-YValueOneDouble)/(XValueTwoDouble-XValueOneDouble));
//GATHER CORRECT EQUATION
//Checking to see if tehg slope is one
        if (MSlopeValueDouble==1.0 ){
//If the slope is one
            System.out.println("\\t\\tThese points have a slope of 1");
            System.out.println("\t\tWith the slope I can solve for the Y-intercept or 'b' value.\n\t\tThe equation is b=(y1-m*x1)");
            Double BInterceptValue = 0.0;
            BInterceptValue = ((YValueOneDouble-XValueOneDouble));
            if (BInterceptValue==0.0) {
//If the slope is one, and the intercept is zero
                System.out.println("\t\tThese points have a Y-intercept of 0");
                System.out.println("\t\tThe equation of the Line is y=x");
            }else{
//If the slope is one, and the intercept not zero
                System.out.println("\t\tThese points have a Y-intercept of " + BInterceptValue);
                System.out.println("\t\tThe equation of the Line is y=x+" + BInterceptValue);
            } 
//If the slope is not one      
        } else {
            System.out.println("\t\tThese points have a slope of " + MSlopeValueDouble);
            System.out.println("\t\tWith the slope I can solve for the Y-intercept or 'b' value.\n\t\tThe equation is b=(y1-m*x1)");
            Double BInterceptValue = 0.0;
            BInterceptValue = ((YValueOneDouble-MSlopeValueDouble*XValueOneDouble));
            if (BInterceptValue==0.0) {
//If the slope is not one, and the intercept is zero
                System.out.println("\t\tThese points have a Y-intercept of 0");
                System.out.println("\t\tThe equation of the Line is y=" + MSlopeValueDouble + "*x");
                System.out.println("\t\tThe equation of the Line is y=" + MSlopeValueDouble + "*x");
            } else {
//If the slope is not one, and the intercept is not zero
                System.out.println("\t\tThese points have a Y-intercept of " + BInterceptValue);
                System.out.println("\t\tThe equation of the Line is y=" + MSlopeValueDouble + "*x+" + BInterceptValue);
            }
        }
    }
}
