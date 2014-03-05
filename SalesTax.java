
package salestax;
import java.util.Scanner;

public class SalesTax {
    

    public static void main(String[] args)
    {
       
        double total, subtotal, state_tax, county_tax, total2, total3,total4,total_tax;
         Scanner keyboard = new Scanner (System.in);
         
         
   
       subtotal = 5;
       state_tax= 0.04;
       county_tax= 0.02;
       total_tax = 0.06;
       
       total = (subtotal * state_tax);
       total2 = (subtotal * county_tax);
       total3 = (subtotal * county_tax + state_tax);
       total4 = (subtotal + total_tax);
       
      System.out.println ("The total is "+total);
      System.out.println ("The total is "+total2);
      System.out.println ("The total is "+total3);
       
       System .out .print("Enter your  subtotal");
        subtotal = keyboard.nextDouble();
    }
   
   
}





