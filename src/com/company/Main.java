package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to the Deadly Plunge");
        System.out.println(" You've slipped off the top of a building and started fall to your death. You go " +
                "into this weird hyper instinct mode and it gives you just a moment to think about what to" +
                " do to save your life.");

        System.out.println("What option will you chose to save your life?");
        System.out.println("Enter a number to select your option.");
        System.out.println("1. spread you arms and legs out and try to guide your fall to grab a power line to slow " +
                "yourself down before you hit the ground.");
        System.out.println("2. realize that you are holding a umbrella and attempt to open it to slow you down.");
        System.out.println("3. Do some air acrobatics and have fun with the last moments of your life. ");
        System.out.println("4. turn around and face the sky and say your last prayers.");
        System.out.println("5. I don't want to play anymore.");

//Creating the scanner to allow the user to input into the console
        Scanner gameStartQuestion = new Scanner(System.in);


//Saving the user input into a variable.  The .nextInt will allow me to target the user input based on what number the user inputs.
        int answer = gameStartQuestion.nextInt();
        Boolean secondAnswer = gameStartQuestion.nextBoolean();
        do {

            if (answer == 1) {
                System.out.println("Upon grabbing the power line you manage to swing on in falling in a near by open dumpster. " +
                        " You are alive and well but you are in need of a shower now.");
                System.out.println("want to play again? Enter true for yes or false for no");
//                gameStartQuestion.nextLine();
//                if (secondAnswer == true) {
//                    System.out.println(answer);
//
//                } else {
//                    break;
//                }


            } else if (answer == 2){
                System.out.println("You open your umbrella and it immediately breaks and you fall to your death" +
                                   " when you arrive to heaven the first thing god ask you is: Did you think you were Marry Poppins? lol");


            } else if (answer == 3) {

                System.out.println("This was a bad idea, when you hit the ground you burst into pieces flying in all directions" +
                                   " the police could not find all of the body parts.  The funeral was closed casket");

            } else if ( answer == 4) {
                System.out.println("Just as you hit the ground you wake up from this horrible dream and realized that you are safe" +
                                   " in your bed.  You hate when you have this dream.");
            } else if(answer == 5) {
                System.out.println("Thank you for playing Deadly Plunge");
            } else {
                System.out.println("Good Bye");
            }

        } while (false);




    }





    }

