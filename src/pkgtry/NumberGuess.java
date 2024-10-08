package pkgtry;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public void number_guess(){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Try2nd tr = new Try2nd();
        
        int min = 1, max = 50, max_guess = 10, guess;
        boolean guessed = false;
        
        int random = (int) (rand.nextDouble() * (max - min + 1) + min);
//        System.out.println(random);    
        
        System.out.println("Guess a Number Between " + min + " and " + max);
        System.out.println("You Have " + max_guess + " Attempts");
    
        for (int i = 0; i < max_guess; i++) {
            
            System.out.print("\nEnter your guess: ");
            guess = scan.nextInt();
            
            if (guess == random) {
                System.out.println("You guessed right!");
                guessed = true;
                break;
            }else if (guess < random) {
                System.out.println("Higher!");
            }else{
                System.out.println("Lower!");
            }
            System.out.println((max_guess - (i + 1)) + " Attempts Left");
            if ((max_guess - (i + 1)) == 1){
                tr.give_up();
            }
        }
        
        if (!guessed) {
            System.out.println("Game Over");
            System.out.println("\nThe Number was " + random);
        }
        
    }
}
