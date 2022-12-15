/* 
 * There are three different types of candies that has different prices per
   pound and weight. The point of this program is to calculate the total price
   for all three candy types. 

   Due: 9/8/22
 */
package cisc1115fall2022;

public class HW1 {
    public static void main(String [] args){
        System.out.println("This program will calculate the price of three "
                + "different candies according to weight");
        
        double pricePerPound = .5; //first candy type
        double weightOfCandy = 3.4;
        System.out.println("Price per lb        Weight         Total Price/n");
        double totalPrice = pricePerPound * weightOfCandy;
        System.out.println("$" + pricePerPound + "                "
                + weightOfCandy +"            " + "$" + totalPrice);
        
        pricePerPound=.9; //second candy type
        weightOfCandy=5.4;
        totalPrice=pricePerPound * weightOfCandy;
        System.out.println("$" + pricePerPound + "                "
                + weightOfCandy + "            " + "$" + totalPrice); 
        
        pricePerPound=5.9; //third candy type
        weightOfCandy=.5;
        totalPrice=pricePerPound * weightOfCandy;
        System.out.println("$"+pricePerPound + "                "
                + weightOfCandy + "            " + "$" + totalPrice);
    }
    
}
