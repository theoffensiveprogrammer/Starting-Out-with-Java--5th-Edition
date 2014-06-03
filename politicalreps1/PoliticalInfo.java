


package politicalreps1;
import java.util.Scanner;
public class PoliticalInfo {

	public static void main(String[] args)
        {
           
           boolean isDone = false;

          while(!isDone){  // while the user is not done entering info
          //code to handle input of party member

           
            
            //creating the object
          PoliticalReps1 Governor = new PoliticalReps1();
          PoliticalReps1 Congressman = new PoliticalReps1();
          PoliticalReps1 Senator = new PoliticalReps1();
          PoliticalReps1 Senator2 = new PoliticalReps1();
          PoliticalReps1 Assemblyman = new PoliticalReps1();
          int[] PoliticalReps1;
          
       
         
         
          
     //________________________________________________________________________      
         
               PoliticalReps1 = new int[5];
		//Set my information up
		Governor.setName("Edmund G. Brown");
		Governor.setyearsofservice(43);
		Governor.setParty("democrat");
		Governor.setDescription("The boy governor and california native");

		
		Congressman.setName("Doug LaMalfa");
		Congressman.setyearsofservice(12);
		Congressman.setParty("Republican");
		Congressman.setDescription("A farmer who plays a large role in farm rights");

		
		Senator.setName("Barbara Boxer");
		Senator.setyearsofservice(32);
		Senator.setParty("Democrat");
		Senator.setDescription("A junior senator who is in charge of security");
                
                Senator2.setName("Dianne Feinstein");
		Senator2.setyearsofservice(52);
		Senator2.setParty("Democrat");
		Senator2.setDescription("San Francisco's best mayor turned senator");
                
                 Assemblyman.setName("Brian Dahle");
                 Assemblyman.setyearsofservice(18);
                 Assemblyman.setParty("Republican");
                 Assemblyman.setDescription("County controller, until assembly election");
                 
	
                
          
		System.out.println("Governors Info: ");
		System.out.println("Name: "+ Governor.getName());
		System.out.println("Years of Service: " +Governor.getYearsofservice());
		System.out.println("Party: " + Governor.getParty());
		System.out.println("Description: " + Governor.getDescription());
               
		System.out.println("\nCongressman's information: ");
		System.out.println("Name: "+ Congressman.getName());
		System.out.println("Years of Service: "+ Congressman.getYearsofservice());
		System.out.println("Party: " + Congressman.getParty());
		System.out.println("Description: " + Congressman.getDescription());

		
		System.out.println("\nSenator's information: ");
		System.out.println("Name: "+ Senator.getName());
		System.out.println("Years of Service:" + Senator.getYearsofservice());
		System.out.println("Party: " + Senator.getParty());
		System.out.println("Description: " + Senator.getDescription());
                
                System.out.println("\nSenator2's information: ");
		System.out.println("Name: "+ Senator2.getName());
		System.out.println("Years of Service:" + Senator2.getYearsofservice());
		System.out.println("Party: " + Senator2.getParty());
		System.out.println("Description: " + Senator2.getDescription());
                
                System.out.println("\nAssemblyman's information: ");
		System.out.println("Name: "+ Assemblyman.getName());
		System.out.println("Years of Service:" + Assemblyman.getYearsofservice());
		System.out.println("Party: " + Assemblyman.getParty());
		System.out.println("Description: " + Assemblyman.getDescription());
                 
         

        char repeat;
        String input;
        String Rep1;       // Miles driven
        String Rep2;     // Gallons used
        String Reps;         // Miles-Per-Gallon
        do 
           {
     
        
        
        //Create a scanner object for keyboard input
        Scanner keyboard = new Scanner (System.in);
        
        
        //Prompt the user to enter miles driven
         System .out .print("Enter your first representative using only their first name");
         Rep1 = keyboard.next();
         
         //Prompt the user to enter the gallons used
        System .out .print("Enter your second representative using only their first name ");
        Rep2 = keyboard.next();
     
        //Display the miles-per-gallon
        System. out. println("The first representative is " + Rep1 + " and the second represenative is " + Rep2 );
        
        System.out.print ("Would you like to enter two more representative's names?");
        input = keyboard.nextLine();
        repeat = input.charAt(0);
          
          } while (repeat == 'Y' || repeat == 'y');
    }      

}
}

	




