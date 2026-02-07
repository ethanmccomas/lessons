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
            System.out.println("\t\tThese points have a slope of 1");
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
            } else {
//If the slope is not one, and the intercept is not zero
                System.out.println("\t\tThese points have a Y-intercept of " + BInterceptValue);
                System.out.println("\t\tThe equation of the Line is y=" + MSlopeValueDouble + "*x+" + BInterceptValue);
            }
        }
//Challenge 1
        System.out.println("\t\tChallenge 1: The first ten points are:");
//Point 1
        Double Point1 = 0.0;
        Double BInterceptValue = 0.0;   
        BInterceptValue = ((YValueOneDouble-MSlopeValueDouble*XValueOneDouble));
        Point1 = (MSlopeValueDouble*1 + BInterceptValue);

        System.out.println("\tPoint 1: (1," + Point1 + ")");
//Point 2
        Double Point2 = 0.0;
        Point2 = (MSlopeValueDouble*2 + BInterceptValue);

        System.out.println("\tPoint 1: (2," + Point2 + ")");
//Point 3
        Double Point3 = 0.0;
        Point3 = (MSlopeValueDouble*3 + BInterceptValue);

        System.out.println("\tPoint 1: (3," + Point3 + ")");
//Point 4
        Double Point4 = 0.0;
        Point4 = (MSlopeValueDouble*4 + BInterceptValue);

        System.out.println("\tPoint 1: (4," + Point4 + ")");
//Point 5
        Double Point5 = 0.0;
        Point5 = (MSlopeValueDouble*5 + BInterceptValue);

        System.out.println("\tPoint 1: (5," + Point5 + ")");
//Point 6
        Double Point6 = 0.0;
        Point6 = (MSlopeValueDouble*6 + BInterceptValue);

        System.out.println("\tPoint 1: (6," + Point6 + ")");
//Point 7
        Double Point7 = 0.0;
        Point7 = (MSlopeValueDouble*7 + BInterceptValue);

        System.out.println("\tPoint 1: (7," + Point7 + ")");
//Point 8
        Double Point8 = 0.0;
        Point8 = (MSlopeValueDouble*8 + BInterceptValue);

        System.out.println("\tPoint 1: (8," + Point8 + ")");
//Point 9
        Double Point9 = 0.0;
        Point9 = (MSlopeValueDouble*9 + BInterceptValue);

        System.out.println("\tPoint 1: (9," + Point9 + ")");
//Point 9
        Double Point10 = 0.0;
        Point10 = (MSlopeValueDouble*10 + BInterceptValue);

        System.out.println("\tPoint 1: (10," + Point10 + ")");
    

//Challenge 2
        System.out.println("\t\tChallenge 2: When formated in a table of values the points apear as: ");
        System.out.println("X   |   Y");
        System.out.println("_________");
        System.out.println("1   |   " + Point1);
        System.out.println("2   |   " + Point2);
        System.out.println("3   |   " + Point3);
        System.out.println("4   |   " + Point4);
        System.out.println("5   |   " + Point5);
        System.out.println("6   |   " + Point6);
        System.out.println("7   |   " + Point7);
        System.out.println("8   |   " + Point8);
        System.out.println("9   |   " + Point9);
        System.out.println("10  |   " + Point10);

//Challenge 3
        Double TypeOfLineVertcial = 0.0;
        TypeOfLineVertcial = (XValueOneDouble-XValueTwoDouble);
        if (TypeOfLineVertcial==0.0) {
            System.out.println("\t\tChallenge 3: This line is vertcial");
        } else { 
            Double TypeOfLineHorizontal = 0.0;
            TypeOfLineHorizontal = (YValueOneDouble-YValueTwoDouble);
            if (TypeOfLineHorizontal==0.0) {
                System.out.println("\t\tChallenge 3: This line is horizontal");

            } else {
                System.out.println("\t\tChallenge 3: This line is angled");

            }

        }
//Challenge 4
        System.out.println("\t\tChallenge 4: Four parallel lines are:");
        if (MSlopeValueDouble==1.0 ){
//If the slope is one
            BInterceptValue = ((YValueOneDouble-XValueOneDouble));
            if (BInterceptValue==0.0) {
//If the slope is one, and the intercept is zero
                System.out.println("\ty=x+1\n\ty=x+2\n\ty=x+3\n\ty=x+4\n\ty=x+5");
            }else{
//If the slope is one, and the intercept not zero
                System.out.println("\ty=x+" + (BInterceptValue+1)+ "\n\ty=x+" + (BInterceptValue+2)+ "\n\ty=x+" + (BInterceptValue+3)+ "\n\ty=x+" + (BInterceptValue+4+ "\n\ty=x+" + (BInterceptValue+5)));
            } 
//If the slope is not one      
        } else {
            BInterceptValue = ((YValueOneDouble-MSlopeValueDouble*XValueOneDouble));
            if (BInterceptValue==0.0) {
//If the slope is not one, and the intercept is zero

                System.out.println("\ty=" + (MSlopeValueDouble) +"*x+1" + "\n\ty=" + (MSlopeValueDouble) + "*x+2" + "\n\ty=" + (MSlopeValueDouble) + "*x+3" + "\n\ty=" + (MSlopeValueDouble) + "*x+4" + "\n\ty=" + (MSlopeValueDouble) + "*x+5");

            } else {
//If the slope is not one, and the intercept is not zero
                System.out.println("\ty=" + MSlopeValueDouble + "*x+" + (BInterceptValue+1) + "\n\ty=" + MSlopeValueDouble + "*x+" + (BInterceptValue+2) + "\n\ty=" + MSlopeValueDouble + "*x+" + (BInterceptValue+3) + "\n\ty=" + MSlopeValueDouble + "*x+" + (BInterceptValue+4) + "\n\ty=" + MSlopeValueDouble + "*x+" + (BInterceptValue+5));
            }
        }

//Challenge 5
        System.out.println("\t\tChallenge 5: Four perpendicular lines are:");
        if (MSlopeValueDouble==1.0 ){
//If the slope is one
            BInterceptValue = ((YValueOneDouble-XValueOneDouble));
            if (BInterceptValue==0.0) {
//If the slope is one, and the intercept is zero
                System.out.println("\ty=-x+1\n\ty=-x+2\n\ty=-x+3\n\ty=-x+4\n\ty=-x+5");
            }else{
//If the slope is one, and the intercept not zero
                System.out.println("\ty=-x+" + (BInterceptValue+1)+ "\n\ty=-x+" + (BInterceptValue+2)+ "\n\ty=-x+" + (BInterceptValue+3)+ "\n\ty=-x+" + (BInterceptValue+4+ "\n\ty=-x+" + (BInterceptValue+5)));
            } 
//If the slope is not one      
        } else {
            BInterceptValue = ((YValueOneDouble-MSlopeValueDouble*XValueOneDouble));
            if (BInterceptValue==0.0) {
//If the slope is not one, and the intercept is zero

                System.out.println("\ty=" + (MSlopeValueDouble*-1) +"*x+1" + "\n\ty=" + ((MSlopeValueDouble*-1)) + "*x+2" + "\n\ty=" + ((MSlopeValueDouble*-1)) + "*x+3" + "\n\ty=" + ((MSlopeValueDouble*-1)) + "*x+4" + "\n\ty=" + ((MSlopeValueDouble*-1)) + "*x+5");

            } else {
//If the slope is not one, and the intercept is not zero
                System.out.println("\ty=" + (MSlopeValueDouble*-1) + "*x+" + (BInterceptValue+1) + "\n\ty=" + (MSlopeValueDouble*-1) + "*x+" + (BInterceptValue+2) + "\n\ty=" + (MSlopeValueDouble*-1) + "*x+" + (BInterceptValue+3) + "\n\ty=" + (MSlopeValueDouble*-1) + "*x+" + (BInterceptValue+4) + "\n\ty=" + (MSlopeValueDouble*-1) + "*x+" + (BInterceptValue+5));
            }
        }
//Challenge 6:
        Double MidpointX = 0.0;
        Double MidpointY = 0.0;
        MidpointX = ((XValueOneDouble+XValueTwoDouble)/2);
        MidpointY = ((YValueOneDouble+YValueTwoDouble)/2);

        System.out.println("\t\tChallenge 6: The midpoint between the points is (" + MidpointX + "," + MidpointY + ")");
//Challenge 7:
        Double DistanceUnsqrtXValues = 0.0;
        Double DistanceUnsqrtYValues = 0.0;
        Double DistanceSqrtXValues = 0.0;
        Double DistanceSqrtYValues = 0.0;
        Double TotalDistance = 0.0;
        DistanceUnsqrtXValues = ((XValueOneDouble-XValueTwoDouble));
        DistanceUnsqrtYValues = ((YValueOneDouble-YValueTwoDouble));
        DistanceSqrtXValues = (DistanceUnsqrtXValues*DistanceUnsqrtXValues);
        DistanceSqrtYValues = (DistanceUnsqrtYValues*DistanceUnsqrtYValues);
        TotalDistance = Math.sqrt(DistanceSqrtXValues+DistanceSqrtYValues);

        System.out.println("\t\tChallenge 7: The distance between the points is " + TotalDistance);
// Extra
        System.out.println("\nApart from searching up formulas I did this entire project by myself. - Ethan McComas");
    }
}
