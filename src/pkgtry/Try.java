package pkgtry;

import java.util.*;

public class Try {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        
        System.out.println("1. Guess the Number");
        System.out.println("2. TicTacToe");
        System.out.println("3. Rock Paper Scissors");
        System.out.print("Choose a game: ");
        choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Chosen Game: Guess the Number\n");
                NumberGuess guess = new NumberGuess();
                guess.number_guess();
                break;
            case 2:
                System.out.println("Chosen Game: TicTacToe\n");
                Tictactoe game = new Tictactoe();
                game.run();
                break;
            case 3:
                System.out.println("Chosen Game: Rock Paper Scissors\n");
                RPS rps = new RPS();
                rps.run();
                break;
            default:
                break;
        }
    }   
}
