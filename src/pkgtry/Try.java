package pkgtry;

import java.util.*;

public class Try {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        
        System.out.println("1. Guess the Number");
        System.out.println("2. TicTacToe");
        System.out.print("Choose a game: ");
        choice = scan.nextInt();
        
        if (choice == 1){
            System.out.println("Chosen Game: Guess the Number\n");
            NumberGuess guess = new NumberGuess();          
            guess.number_guess();    
        }else if (choice == 2){
            System.out.println("Chosen Game: TicTacToe\n");
            Tictactoe game = new Tictactoe();
            game.printBoard();
            game.run();
        }   
    }   
}
