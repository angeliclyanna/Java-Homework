/*
 * HW 3
Your program begins by describing
the rules of the game. You allow the user to play any number of rounds of this game.

*/

package cisc1115fall2022;
import java.util.Scanner;

public class HW3 {  
   public static void main(String[] args) {
       System.out.println("Welcome to the Dice Spinning Game!"
               + "\nHere are the instructions:"
               + "\nTwo players will play, and the player with the highest total"
               + " will win!\nThe computer plays both players."
               + " It is up to you to continue the game by saying yes or no."
               + "\nLet's begin!");
       int die1, die2, total1, total2;
       char choice = 'Y';
       int player1=0, player2 =0;
       do {
            die1 = (int)(Math.random()*6) + 1;   // roll the dice
            die2 = (int)(Math.random()*6) + 1;
            total1 = (die1+die2);
            System.out.println("First player spun: " + die1 + " and "+ 
                   die2 + ", the total is: "+ total1 );
            die1 = (int)(Math.random()*6) + 1;   // roll the dice
            die2 = (int)(Math.random()*6) + 1;
            total2 = (die1+die2);
            System.out.println("Second player spun: " + die1 + " and "+ 
                   die2 + ", the total is: "+ total2 );
            if (total1>total2){
                System.out.println("First player won!");
                player1++;}
            else if (total1==total2){
                System.out.println("It's a tie!");}
            else{
                System.out.println("Second player won!");
                player2++;}
            Scanner keyboard = new Scanner(System.in);
       System.out.println("Continue? (Y/N)");
       choice = keyboard.next().charAt(0);
       }    while(choice=='y' || choice=='Y');
        System.out.println("Player 1 won "+player1+" round(s) and Player 2 won "
                +player2+ " round(s)");
   }  // end main()

}  // end class
  
