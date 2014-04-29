/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpetcalculator;

/**
 *
 * @author KeshavKumar
 */


	import java.util.Scanner;
	import java.io.*;
	public class CarpetCalculator
	{
		public static void main(String[] args)
		{
			int roomLength;
			int roomWidth;
			Scanner keyboard= new Scanner(System.in); //This creates the scanner object
			
                        //This directs the user to enter the width of the room
   
                        System.out.println("Enter The Width Of The Room");
			roomWidth = keyboard.nextInt();
                        
                        //This directs the user to enter the length of the room
			System.out.println("Enter The Length Of The Room");
			roomLength= keyboard.nextInt();
			
			//Establishing the dimensions of the room
			RoomDimension roomd = new RoomDimension();
			
                        //Defining variables
			roomd.setRoomLength(roomLength);
			roomd.setRoomWidth(roomWidth);
                        
			//Calling out to the carpet class
			RoomCarpet room1 = new RoomCarpet();
                        
			//function which sets the dimensions
			room1.setRoomDimension(roomd);
                        
			//Everything the customer sees
			System.out.println("Room dimensions: ");
			
			System.out.println("Length: " + roomLength + " Width: " + roomWidth + "Area: " + roomd.getRoomArea());
			
			System.out.println("Carpet cost:$" + room1.getTotalAmount());
		}
	}