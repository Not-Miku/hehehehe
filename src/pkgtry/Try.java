package pkgtry;

import java.util.Scanner;
import java.util.Random;

public class Try {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int min = 1, max = 50, guess;
        boolean guessed = false;
        
        int random = (int) (rand.nextDouble() * (max - min + 1) + min);
        System.out.println(random);      
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your guess: ");
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
        }
        
        if (!guessed) {
            System.out.println("Game Over");
        }
        
    }
    
}
