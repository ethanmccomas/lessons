public class LoopProblems {
    public static void main(String[] args) {
//Question One Part One
        System.out.println("\t\tI will find two integer values of x between 1 and 10 that satisfy the equation: -9(x-3)^2)+4=0");
        int QuestionOneXInt = 1;
        int QuestionOneSolutionInt = 0;
        while (QuestionOneXInt <= 10) {
            QuestionOneSolutionInt = (-((QuestionOneXInt-3)*(QuestionOneXInt-3))+4);
            if (QuestionOneSolutionInt==0) {
                System.out.println(QuestionOneXInt + " gives an answer of " + QuestionOneSolutionInt);
            }
            QuestionOneXInt++;
        }
//Question One Part Two
        System.out.println("\t\tI will find two integer values of x that satisfy the equation: x^2=2^x");
        int QuestionTwoXInt = 1;
        int QuestionTwoSolutionInt = 0;

        while (QuestionTwoXInt <=100000) {
            QuestionTwoSolutionInt = ((QuestionTwoXInt*QuestionTwoXInt)-((int)Math.pow(2.0, QuestionTwoXInt)));
            if (QuestionTwoSolutionInt==0) {
                System.out.println(QuestionTwoXInt + " will prove this question true");
                int QuestionTwoTwoSolved = 0;
                QuestionTwoTwoSolved++;
                if (QuestionTwoTwoSolved==2) {
                    break;
                }
            }
            QuestionTwoXInt++;
        }
//Question Two Part One
        System.out.println("\t\tHere are all prime numbers between 2 and 1000:");

        for (int Number = 2; Number <= 1000; Number++) {
            boolean PrimeCheckTrue = true;
            for (int Divisor = 2; Divisor <= Math.sqrt(Number); Divisor++) {
                if (Number % Divisor == 0) {
                    PrimeCheckTrue = false;
                    break;
                }
            }
            if (PrimeCheckTrue) {
                System.out.print(Number + " ");
            }
        }
        System.out.println("");

    }
}
