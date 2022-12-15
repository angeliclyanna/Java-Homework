/*
 * 2 pounds or less                         $1.59
over 2 and less than or equal 5 pounds      $3.10
over 5 and less than or equal 9 pounds      $4.25
over 9 pounds                               $5.00

*/

package cisc1115fall2022;
import java.util.Scanner;
public class HW2{
    
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        int count =0;
        while (count>=0){
        System.out.print("Enter the package weight in pounds: ");
            double weight = keyboard.nextDouble();
            
        System.out.println("Enter the shipping distance in miles");
            int distance = keyboard.nextInt();
                double rate =0.0;
                if ((distance%100)>0)
                    distance = distance/100 + 1;
                else if ((distance%100)==0)
                distance = distance/100;
                if (weight <= 2)
                    rate = 1.59;
                else if (weight > 2 && weight <= 5)
                    rate = 3.1;
                else if (weight > 5 && weight <=9)
                    rate = 4.25;
                else
                    rate = 5;
                
                double total = rate * distance;
                System.out.println("The shipping cost for your package is: $" 
                        + total + ". This was calculated by using the "
                                + "base cost of $" + rate 
                        + " per 100 miles");
                count++;}

                }
    }

         


