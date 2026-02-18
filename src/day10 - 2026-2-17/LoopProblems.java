public class LoopProblems {
    public static void main(String[] args) {
// //Question One Part One
//         System.out.println("\t\tI will find two integer values of x between 1 and 10 that satisfy the equation: -9(x-3)^2)+4=0");
//         int QuestionOneXInt = 1;
//         int QuestionOneSolutionInt = 0;
//         while (QuestionOneXInt <= 10) {
//             QuestionOneSolutionInt = (-((QuestionOneXInt-3)*(QuestionOneXInt-3))+4);
//             if (QuestionOneSolutionInt==0) {
//                 System.out.println(QuestionOneXInt + " gives an answer of " + QuestionOneSolutionInt);
//             }
//             QuestionOneXInt++;
//         }
// //Question One Part Two
//         System.out.println("\t\tI will find two integer values of x that satisfy the equation: x^2=2^x");
//         int QuestionTwoXInt = 1;
//         int QuestionTwoSolutionInt = 0;

//         while (QuestionTwoXInt <=100000) {
//             QuestionTwoSolutionInt = ((QuestionTwoXInt*QuestionTwoXInt)-((int)Math.pow(2.0, QuestionTwoXInt)));
//             if (QuestionTwoSolutionInt==0) {
//                 System.out.println(QuestionTwoXInt + " will prove this question true");
//                 int QuestionTwoTwoSolved = 0;
//                 QuestionTwoTwoSolved++;
//                 if (QuestionTwoTwoSolved==2) {
//                     break;
//                 }
//             }
//             QuestionTwoXInt++;
//         }
// // //Question One Part Three
// //         System.out.println("\t\tI will find a negative decimal solution with an accuracy of 0.01 for x that will satisfy the equation: x^2=2^x");
// //         double QuestionThreeXDouble = (-100.0);
// //         double QuestionThreeSolutionDouble = 0.0;

// //         while (QuestionTwoXInt <=100000.0) {
// //             QuestionThreeSolutionDouble = ((QuestionThreeXDouble*QuestionThreeXDouble)-(Math.pow(2.0, QuestionThreeXDouble)));
// //             if (QuestionThreeSolutionDouble==0.0) {
// //                 System.out.println(QuestionThreeXDouble + " will prove this question true");
// //                 break;
// //             }
// //             QuestionThreeXDouble+0.01;
// //         }
// //Question Two Part One
//         System.out.println("\t\tHere are all prime numbers between 2 and 1000:");

//         for (int Number = 2; Number <= 1000; Number++) {
//             boolean PrimeCheckTrue = true;
//             for (int Divisor = 2; Divisor <= Math.sqrt(Number); Divisor++) {
//                 if (Number % Divisor == 0) {
//                     PrimeCheckTrue = false;
//                     break;
//                 }
//             }
//             if (PrimeCheckTrue) {
//                 System.out.print(Number + " ");
//             }
//         }
//         System.out.println("");
//Question Two Part Two
        System.out.println("\t\tHere are all prime numbers between 2 and 1000:");

        for (int NumberPartTwo = 5; NumberPartTwo <= 1000; NumberPartTwo++) {
            boolean PrimeCheckTrue = true;
            boolean FitsCheckTrue = false;
            for (int DivisorTwo = 2; DivisorTwo <= Math.sqrt(NumberPartTwo); DivisorTwo++) {
                if (NumberPartTwo % DivisorTwo == 0) {
                    PrimeCheckTrue = false;
                    break;
                }
                if ((DivisorTwo * DivisorTwo) % 24 == 1) {
                    FitsCheckTrue = true;
                }
            }
            if (FitsCheckTrue = true) {
                System.out.print(NumberPartTwo + " ");
            }
        }
    }
}
