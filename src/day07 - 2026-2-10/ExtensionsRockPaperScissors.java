import java.util.Scanner;

public class ExtensionsRockPaperScissors {
    public static void main(String[] args) {
        System.out.println("\t\tHello player, what is your name?");

        Scanner NameScanner = new Scanner(System.in);
        String NameString = NameScanner.nextLine();

        System.out.println("\t\tOk " + NameString + ", do you want to play best of three or single round?\n[Three] - [Single]");
        
        Scanner BestOfModeScanner = new Scanner(System.in);
        String BestOfModeString = BestOfModeScanner.nextLine(); 

        System.out.println("\t\tOk " + NameString + ", Let's play Rock Paper Scissors\n\t\tDo you want to play agaist AI or 2 player?\n[Ai] - [2 player]");
        
        Scanner GameModeScanner = new Scanner(System.in);
        String GameModeString = GameModeScanner.nextLine(); 

//0=Rock
//1=Paper
//2=Scissors
        if (GameModeString.equalsIgnoreCase("AI")) {
// Agant AI
            ai(BestOfModeString);
        } else {
//Aganst Player
            TwoPlayer(NameString, BestOfModeString);
        }

        SpockLizard();

        // GameModeScanner.close();
        // NameScanner.close();
    } 

    public static void ai(String BestOfModeString){
        //Aganst Ai

        int PlayerWins = 0;
        int BotWins = 0;

        while (PlayerWins <= 1 && BotWins<= 1) {
            if (BestOfModeString.equalsIgnoreCase("Three")) {
                System.out.println("You have won " + PlayerWins + " times, I have won " + BotWins + " times"); 
            }
            
            

//ASCII scissors was copyed from assinment document
            System.out.println("\t\tAlright, what are you playing?\n[Rock] - [Paper] - [Scissors]");
            Scanner PlayerVsAITypeScanner = new Scanner(System.in);
            String PlayerVsAITypeString = PlayerVsAITypeScanner.nextLine(); 

            int RandomNumberVsAI = (int)(Math.random()*3);

            if (PlayerVsAITypeString.equalsIgnoreCase("Rock")) {
                if (RandomNumberVsAI==0) {
                    System.out.println("We Tied, I played rock as well");
                    System.out.println();
                    System.out.println("_--\\"  + "\t_--\\");
                    System.out.println("\\  |"  + "\t\\  |");
                    System.out.println("|   \\" + "\t|   \\");
                    System.out.println("\\___|" + "\t\\___|");
                } else {
                    if (RandomNumberVsAI==1) {
                        System.out.println("You Lost, I played paper");
                        System.out.println();
                        System.out.println("______" + "\t_--\\");
                        System.out.println("|    |" + "\t\\  |");
                        System.out.println("|    |" + "\t|   \\");
                        System.out.println("|____|" + "\t\\___|");
                        BotWins++;
                    } else {
                        if (RandomNumberVsAI==2) {
                            System.out.println("You Won! I played scissors");
                            System.out.println();
                            System.out.println("O  O"  + "\t_--\\");
                            System.out.println(" \\/"  + "\t\\  |");
                            System.out.println(" /\\"  + "\t|   \\");
                            System.out.println("/  \\" + "\t\\___|");
                            PlayerWins++;
                        }
                    }
                }
            } else {
                if (PlayerVsAITypeString.equalsIgnoreCase("Paper")) {
                    if (RandomNumberVsAI==0) {
                        System.out.println("You Won! I played rock");
                        System.out.println();
                        System.out.println("_--\\"  + "\t______");
                        System.out.println("\\  |"  + "\t|    |");
                        System.out.println("|   \\" + "\t|    |");
                        System.out.println("\\___|" + "\t|____|");
                        PlayerWins++;
                    } else {
                        if (RandomNumberVsAI==1) {
                            System.out.println("We Tied, I played paper as well");
                            System.out.println();
                            System.out.println("______" + "\t______");
                            System.out.println("|    |" + "\t|    |");
                            System.out.println("|    |" + "\t|    |");
                            System.out.println("|____|" + "\t|____|");
                        } else {
                            if (RandomNumberVsAI==2) {
                                System.out.println("You Lost, I played scissors");
                                System.out.println();
                                System.out.println("O  O"  + "\t______");
                                System.out.println(" \\/"  + "\t|    |");
                                System.out.println(" /\\"  + "\t|    |");
                                System.out.println("/  \\" + "\t|____|");
                                BotWins++;
                            }
                        }
                    }
                } else {
                    if (PlayerVsAITypeString.equalsIgnoreCase("Scissors")) {
                        if (RandomNumberVsAI==0) {
                            System.out.println("You Lost, I played rock");
                            System.out.println();
                            System.out.println("_--\\"  + "\tO  O");
                            System.out.println("\\  |"  + "\t \\/");
                            System.out.println("|   \\" + "\t /\\");
                            System.out.println("\\___|" + "\t/  \\");
                            BotWins++;

                        } else {
                            if (RandomNumberVsAI==1) {
                                System.out.println("You Won! I played paper");
                                System.out.println();
                                System.out.println("______" + "\tO  O");
                                System.out.println("|    |" + "\t \\/");
                                System.out.println("|    |" + "\t /\\");
                                System.out.println("|____|" + "\t/  \\");
                                PlayerWins++;
                            } else {
                                if (RandomNumberVsAI==2) {
                                    System.out.println("We Tied, I played scissors as well");
                                    System.out.println();
                                    System.out.println("O  O"  + "\tO  O");
                                    System.out.println(" \\/"  + "\t \\/");
                                    System.out.println(" /\\"  + "\t /\\");
                                    System.out.println("/  \\" + "\t/  \\");
                                }
                            }
                        }
                    } else {
                        System.out.println("\t\tI do not understand your imput");
                    }
                }
            }
            if (BestOfModeString.equalsIgnoreCase("Single")) {
                break;
            }

        }

        if (BestOfModeString.equalsIgnoreCase("Three")) {
            System.out.println("\n\t\tYou have won " + PlayerWins + " times, I have won " + BotWins + " times"); 
        }
        // PlayerVsAITypeScanner.close();       
    }
    public static void TwoPlayer(String NameString, String BestOfModeString)
    {
        int PlayerWins = 0;
        int PlayerTwoWins = 0;

        System.out.println("Hello Player Two, what is your name?");

        Scanner PlayerTwoNameScanner = new Scanner(System.in);
        String PlayerTwoNameString = PlayerTwoNameScanner.nextLine();

        while (PlayerWins <= 1 && PlayerTwoWins<= 1) {
            if (BestOfModeString.equalsIgnoreCase("Three")) {
                System.out.println(NameString + " has won " + PlayerWins + " times, " + PlayerTwoNameString + " has won " + PlayerTwoWins + " times"); 
            }

            System.out.println("\t\tAlright, " + NameString + " what are you playing?\n[Rock] - [Paper] - [Scissors]");

            Scanner PlayerOneMoveScanner = new Scanner(System.in);
            String PlayerOneMoveString = PlayerOneMoveScanner.nextLine();

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");


            System.out.println("\t\tHello " + PlayerTwoNameString + " What would you like to play\n[Rock] - [Paper] - [Scissors]");
            
            Scanner PlayerTwoMoveScanner = new Scanner(System.in);
            String PlayerTwoMoveString = PlayerTwoMoveScanner.nextLine();

            if (PlayerOneMoveString.equalsIgnoreCase("Rock") && PlayerTwoMoveString.equalsIgnoreCase("Rock")) {
                System.out.println("You guys tied");
            } else {
                if (PlayerOneMoveString.equalsIgnoreCase("Rock") && PlayerTwoMoveString.equalsIgnoreCase("Scissors")) {
                    System.out.println(NameString + " Won");
                    PlayerWins++;
                } else {
                    if (PlayerOneMoveString.equalsIgnoreCase("Rock") && PlayerTwoMoveString.equalsIgnoreCase("Paper")) {
                        System.out.println(PlayerTwoNameString + " Won");
                        PlayerTwoWins++;
                    } else {
                        if (PlayerOneMoveString.equalsIgnoreCase("Scissors") && PlayerTwoMoveString.equalsIgnoreCase("Rock")) {
                            System.out.println(PlayerTwoNameString + " Won");
                            PlayerTwoWins++;
                        } else {
                            if (PlayerOneMoveString.equalsIgnoreCase("Scissors") && PlayerTwoMoveString.equalsIgnoreCase("Scissors")) {
                                System.out.println("You guys tied");
                            } else {
                                if (PlayerOneMoveString.equalsIgnoreCase("Scissors") && PlayerTwoMoveString.equalsIgnoreCase("Paper")) {
                                    System.out.println(NameString + " Won");
                                    PlayerWins++;
                                } else {
                                    if (PlayerOneMoveString.equalsIgnoreCase("Paper") && PlayerTwoMoveString.equalsIgnoreCase("Rock")) {
                                        System.out.println(NameString + " Won");
                                        PlayerWins++;
                                    } else {
                                        if (PlayerOneMoveString.equalsIgnoreCase("Paper") && PlayerTwoMoveString.equalsIgnoreCase("Scissors")) {
                                            System.out.println(PlayerTwoNameString + " Won");
                                            PlayerTwoWins++;
                                        } else {
                                            if (PlayerOneMoveString.equalsIgnoreCase("Paper") && PlayerTwoMoveString.equalsIgnoreCase("Paper")) {
                                                System.out.println("You guys tied");
                                            } else {
                                                System.out.println("Sorry, I did not understand one of your imputs");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (BestOfModeString.equalsIgnoreCase("Single")) {
                break;
            }
        }
        if (BestOfModeString.equalsIgnoreCase("Three")) {
            System.out.println(NameString + " has won " + PlayerWins + " times, " + PlayerTwoNameString + " has won " + PlayerTwoWins + " times"); 
        }
        
        // PlayerOneMoveScanner.close();
        // PlayerTwoMoveScanner.close();
        // PlayerTwoNameScanner.close();
    }
    public static void SpockLizard(){
        System.out.println("\n\t\tLet's play some Rock, Paper, Scissors, Lizard, Spock");
        System.out.println("\t\tDo you want the rules?\n[Yes] - [No]");
        
        Scanner RulesScanner = new Scanner(System.in);
        String RulesString = RulesScanner.nextLine();

        if (RulesString.equalsIgnoreCase("Yes")) {
            System.out.println("Scissors Beats Paper and Lizard");  //0
            System.out.println("Paper Beats Spock and Rock");       //1
            System.out.println("Rock Beats Scissors and Lizard");   //2
            System.out.println("Spock Beats Scissors and Rock");    //3
            System.out.println("Lizard Beats Spock and Paper");     //4
        }

        System.out.println("\t\tWhat are you playing?\n[Rock] - [Paper] - [Scissors] - [Lizard] - [Spock]");

        Scanner SpockLizardScanner = new Scanner(System.in);
        String SpockLizardString = SpockLizardScanner.nextLine();

        int RandomNumberSpockLizard = (int)(Math.random()*5);

        if (SpockLizardString.equalsIgnoreCase("Rock")) {
            if (RandomNumberSpockLizard==0) {
                    System.out.println("You Won, I played scissors");
            } else {
                if (RandomNumberSpockLizard==4) {
                    System.out.println("You Won, I played lizard");
                } else {
                    if (RandomNumberSpockLizard==1||RandomNumberSpockLizard==2||RandomNumberSpockLizard==3 ) {
                        System.out.println("Nobody won");
                    }
                }
            }
        } else {
            if (SpockLizardString.equalsIgnoreCase("Paper")) {
                if (RandomNumberSpockLizard==2) {
                        System.out.println("You Won, I played rock");
                } else {
                    if (RandomNumberSpockLizard==3) {
                        System.out.println("You Won, I played spock");
                    } else {
                        if (RandomNumberSpockLizard==0||RandomNumberSpockLizard==1||RandomNumberSpockLizard==4 ) {
                            System.out.println("Nobody won");
                        }
                    }
                }
            } else {
                if (SpockLizardString.equalsIgnoreCase("Scissors")) {
                    if (RandomNumberSpockLizard==1) {
                            System.out.println("You Won, I played paper");
                    } else {
                        if (RandomNumberSpockLizard==4) {
                            System.out.println("You Won, I played lizard");
                        } else {
                            if (RandomNumberSpockLizard==0||RandomNumberSpockLizard==2||RandomNumberSpockLizard==3 ) {
                                System.out.println("Nobody won");
                            }
                        }
                    }
                } else {
                    if (SpockLizardString.equalsIgnoreCase("Spock")) {
                        if (RandomNumberSpockLizard==0) {
                                System.out.println("You Won, I played scissors");
                        } else {
                            if (RandomNumberSpockLizard==2) {
                                System.out.println("You Won, I played rock");
                            } else {
                                if (RandomNumberSpockLizard==1||RandomNumberSpockLizard==3||RandomNumberSpockLizard==4 ) {
                                    System.out.println("Nobody won");
                                }
                            }
                        }
                    } else {
                        if (SpockLizardString.equalsIgnoreCase("lizard")) {
                            if (RandomNumberSpockLizard==3) {
                                    System.out.println("You Won, I played spock");
                            } else {
                                if (RandomNumberSpockLizard==1) {
                                    System.out.println("You Won, I played paper");
                                } else {
                                    if (RandomNumberSpockLizard==0||RandomNumberSpockLizard==2||RandomNumberSpockLizard==4 ) {
                                        System.out.println("Nobody won");
                                    }
                                }
                            }
                        } else {
                            System.out.println("I dont understand your imput");
                        }
                    }
                }
            }
        }
        // RulesScanner.close();
        // SpockLizardScanner.close();
    }
}
