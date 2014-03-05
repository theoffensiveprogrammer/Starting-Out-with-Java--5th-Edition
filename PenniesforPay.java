package penniesforpay;
import java.util.Scanner;
import java.text.DecimalFormat;


public class PenniesforPay 
{
    public static void main(String[] args) 
    {
       int pennies;         //Penny Accumulator
       int totalPay;        //Total Pay Accumulator
       int maxDays;         //Max. Number of Days
       int dayCount;        //Day Counter
       
       //Create a scanner object for keyboard input
       Scanner keyboard = new Scanner (System.in);
       
       //Get the maximum number of days 
       System.out.print ("For how many days will you work?");
       maxDays =keyboard.nextInt();
       
       //Validate the input
       while (maxDays < 1)
       {
           //Prompt the user to enter a correct value
           System.out.println ("The number of days will be at least 1");
           System.out.println ("Enter the number of days");
           maxDays = keyboard.nextInt();
       }
       //Initialize the day counter to day 1
       dayCount = 1;
       
       //Initialize the penny accumulator for
       //the first day of work
       pennies = 1;
       
       //Initialize the total pay accumulator
       totalPay = 0;
       
       //Display the report header
       System.out.println();
       System.out.println("Day \t\tPennies Earned");
       System.out.println("------------------------------------");
       
       //Display the income report 
       while (dayCount <= maxDays)
       {
          //Display the day number and pennies earned 
           System.out.println(dayCount + "\t\t" +pennies);
           
           //Accumulate the total pay
           totalPay += pennies;
           
           //Increment dayCount for the next day
           dayCount++;
           
           //Double the number of pennies
           pennies *= 2; 
       }
       //Create a DecimalFormat object to format output
       DecimalFormat dollar = new DecimalFormat("#,##0.00");
       
       //Display the total pay
       System.out.println("Total pay $ " + dollar.format(totalPay /100.0));
    }
}