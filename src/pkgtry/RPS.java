package pkgtry;

import java.util.*;

public class RPS {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    String[] selection = {"Rock", "Paper", "Scissors"};
    
    String enemy, player;
    
    public void run(){
        
        System.out.printf("%s %s %s\n", selection[0], selection[1], selection[2]);
        
        System.out.print("\nYour Pick: ");
        player = scan.next();
        
        enemy = selection[rand.nextInt(3)];
        System.out.println("Enemy: " + enemy);
        
        if(enemy.equals(player)){
            System.out.println("Draw!");
        }else if(this.player_won()){
            System.out.println("You Won!");
        }else{
            System.out.println("You Lost!");
        }
        
    }
    
    public boolean player_won(){
        return (player.equals("Rock") && enemy.equals("Scissors")) || 
                (player.equals("Paper") && enemy.equals("Rock")) ||
                (player.equals("Scissors") && enemy.equals("Paper"));
    }

}
