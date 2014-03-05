package timecalc;
import javax.swing.JOptionPane;

/**
 * Chapter 3, Programming Challenge 6: Time Calculator
 * @author KeshavKumar
 */

public class TimeCalc {
    
    public static void main(String[] args) {
       double seconds; // The number of seconds
       String input; // This is to hold the keyboard input
       
       //constants 
        final double SECONDS_PER_MINUTE = 60.0; //Seconds in a minute 
        final double SECONDS_PER_HOUR = 3600.0; //Seconds in an hour
        final double SECONDS_PER_DAY = 86400.0; //Seconds in a day
       
       //This is to get the number of seconds
      input= JOptionPane.showInputDialog ("Enter the number of seconds");
      seconds= Double.parseDouble (input);
        
        //Display the number of minutes, if any
        if (seconds >= SECONDS_PER_MINUTE)
        {
          //Caculate the number of minutes
            double minutes = seconds / SECONDS_PER_MINUTE;
            
        // Display the number of minutes 
         JOptionPane.showMessageDialog (null,  " There are " + 
                         minutes + " minutes in " + seconds + " seconds ");
        }
    //Display the number of hours, if any.  
	if (seconds >= SECONDS_PER_HOUR)
	{
		//calculate the number of hours 
		double hours = seconds / SECONDS_PER_HOUR; 
		
		//Display the number of hours 
		JOptionPane.showMessageDialog (null, "There are " + 
		hours + " hours in " + seconds + " seconds " );
		
 	}

	//Display the number of days, if any.  
	if (seconds > SECONDS_PER_DAY)
	{
		//calculate the number of days. 
		double days = seconds /SECONDS_PER_DAY;
		
		//Display the number of days 
		JOptionPane. showMessageDialog (null, " There are " + 
		days + " days in " + seconds + " seconds " ); 
		
	}
	//Exit the application 
	System.exit (0);
	
  }
}