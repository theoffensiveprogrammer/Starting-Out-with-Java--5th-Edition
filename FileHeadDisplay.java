/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fileheaddisplay;
import java.util.*;
import java.util.Scanner;
import java.io.*;
public class FileHeadDisplay {

	public static void main(String[] args) throws IOException
	{ 
		// This creates the scanner
		Scanner input = new Scanner(System.in);

		// Tells the user to enter the file path
		System.out.println("Enter the file path: ");
		String fileName = input.nextLine();

		// Open file
		File file = new File(fileName + ".txt");
                

		// Makes sure the file exists
		if(!file.exists()){
			System.out.println("The file " + fileName + ".txt does not exist.");
			System.exit(0);
		}

		// Instantiate scanner with file
		Scanner inputFile = new Scanner(file);

		// Line
		String line;

		// This intializes the line counter
		int counter = 0;

		// A while statement in the form of a loop
		while(inputFile.hasNext())
                {
			line = inputFile.nextLine();
                            if(counter < 5)
                               System.out.println(line);
			counter += 1;
		}
		// Close file
		inputFile.close();
	}
}