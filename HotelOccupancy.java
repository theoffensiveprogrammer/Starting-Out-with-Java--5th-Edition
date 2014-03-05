package hoteloccupancy;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelOccupancy 
{
    public static void main(String[] args)
    {

            int floor;//Let's you define # of floors
            int rooms;//Let's you define # of rooms
            int occupied;//Allows you to enter # of occuipied rooms
            int totalRooms;//Gives you the total amount of rooms
            int totalOccupied;//Gives you total occupancy
            int totalVacant;//Gives you the total vacancies
            double occupancyRate;//Do fanciful math for # of guests
        
            //This is for the input of information
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Please enter the number of floors in the hotel: ");
            floor = keyboard.nextInt(); //Entry of # of floors
        
            while (floor < 3) 
        {
            System.out.print("The number of floors cannot be less than 3, please re-enter: ");
            floor = keyboard.nextInt(); //Error message pretaining to floors
        }

            totalRooms = 0; //Always remember to have a value of 0
            totalOccupied = 0;//Always remember to have a value of 0

            for (int i = 1; i <= floor; i++) 
            {

            System.out.print("Please enter the number of rooms in floor " + i + ": ");
            rooms = keyboard.nextInt(); //number of rooms in a floor
        
            while (rooms < 10)//while statement
       {
            System.out.print("Number of rooms cannot be less than 10, please re-enter: ");
            rooms = keyboard.nextInt(); //Error message pretaining to # of rooms
       }  
       
            totalRooms += rooms;

            System.out.print("Please enter the number of occupied rooms in floor " + i + ": ");
            occupied = keyboard.nextInt(); //Entry of occupuied rooms
        
             while (occupied > rooms || occupied < 0) //While statement
        {
            System.out.print("The number of rooms occupied must be between 0 and " + rooms + ". Please re-enter: ");
            occupied = keyboard.nextInt(); //Error message pretaining to number of rooms
        }
        
            totalOccupied += occupied;
        }

            totalVacant = totalRooms - totalOccupied;
            occupancyRate = ((double) totalOccupied / totalRooms) * 100;

            DecimalFormat form = new DecimalFormat("###.00");
            String value = form.format(occupancyRate);

            System.out.println("\nThe total number of rooms in the hotel is " + totalRooms);
            System.out.println("The total number of rooms occupied in the hotel is " + totalOccupied);
            System.out.println("The total number of vacant rooms in the hotel is: " + totalVacant);
            System.out.println("The occupancy rate for the hotel is " + value +"%");

     }
}
