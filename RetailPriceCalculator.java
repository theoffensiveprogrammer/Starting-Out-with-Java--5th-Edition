package retailpricecalculator;
import java.util.Scanner;
import java.text.DecimalFormat;

    public class RetailPriceCalculator 
    {
         public static void main (String[] args)
         {
             //Variables to hold an item's wholesale cost.
             //Markup percentage, and retail price.
             double wholesaleCost;
             double markupPct;
             double retailPrice;
             
             //Create a Scanner object for keyboard input.
             Scanner keyboard = new Scanner (System.in);
             
             //Get the item's wholesale cost.  
             System.out.print ("Enter the item's wholesale cost:");
             wholesaleCost = keyboard.nextDouble(); 
             
             //Get the item's markup percentage.  
             System.out.println ("Enter item's markup percentage");
             System.out.println ("(Example: enter 50 for 50%):");
             markupPct = keyboard.nextDouble();
             
             //Convert the markup percentage.
             markupPct /= 100.0;
             
             //Get the retail price.
             retailPrice = calculateRetail(wholesaleCost, markupPct);
             
             //Create a DecimalFormat object.
             DecimalFormat dollar = new DecimalFormat("#,00");
             
             //Display the retail price.
             System.out.println ("The item's retail price will be $" +
                                dollar.format(retailPrice));
             
         }
         /** 
          The calculateRetail method calculates an item's retail price.  
          @param wholesale The item's wholesale cost.  
          @param markup The item's markup percentage.  
              (ex: 50% would be passed as 0.5)
          @return The item's retail price.  
          */
         public static double calculateRetail(double wholesale, double markup)
         {
           double retail = wholesale + (wholesale * markup);  
           return retail;
         }
}
         