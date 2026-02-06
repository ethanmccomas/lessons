public class Lesson03Question6 {
   public static void main(String[] args) {
        int length = 5;
        double width = 3.5;

        //Why do I have to cast an double to an int. It gives a wrong answer. 
        //Casting the int to a double would provide a more accurate number.

        System.out.println("\tA rectangles area is solved by multiplying length and width");
        System.out.println("\t\tThe rectangles length is 5");
        System.out.println("\t\tThe rectangles width is 3.5; " + (int)width + " when cast");
        System.out.println("\tThey produce an area of " + (length * (int)width));

        System.out.println("\n\tA rectangles perimeter is solved by adding length and width before multiplying by two");
        System.out.println("\t\tThe rectangles length is 5");
        System.out.println("\t\tThe rectangles width is 3.5; " + (int)width + " when cast");
        System.out.println("\tThey produce an perimeter of " + (2*(length + (int)width)));

    }
}
