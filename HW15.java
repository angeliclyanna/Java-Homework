/* 
 *  Print a menu and offer the user at least 3 types of candies.
    You will also ask the user to enter the weight. 
    Then, your program will charge the price according the user's choice.
    
some questions: 
1. how would I sum all candies a customer buys
2. how would I allow the program to run for several customers( 
    Due: 9/15/22
 */
package cisc1115fall2022;
import java.util.Scanner;


public class HW15 {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose type of candy\n"
                + "1. Gummy Bears 2. Black Licorice 3. Candy Corn");
        int choice=keyboard.nextInt();
        double pricePerPound = 0, weightOfCandy=0,totalPrice=0;
        final double GUMMY=0.5,BLACK=0.9,CORN=5.9;
        boolean isValid=true;
        double pricePerlb=0;
        
        if (choice==1){
            pricePerPound = GUMMY;}
              
        else if (choice == 2){
            pricePerPound=BLACK;}
        
        else if (choice == 3){
            pricePerPound=CORN;}
        else {
            System.out.println("There is an ERROR in your answer, try again");
            isValid=false;
        }
        if(isValid=true){
        System.out.println("Enter weight in pounds");
        double weight=keyboard.nextDouble();
        double price = pricePerPound * weight;
        System.out.println("Price per lb        Weight         Total Price");
        System.out.println("$"+pricePerPound + "                " +
                 + weightOfCandy + "            " + "$" + totalPrice);
        isValid=true;//for next time around
        
        
        }
        else {
            isValid = true;
        }
    }
}
/**
 * 
        switch (choice){
            case 1: //...this means that choice==1
                pricePerlb = GUMMY;
                break;
            case 2: //...
                break;
            default: System.out.println("invalid choice");
 * */
