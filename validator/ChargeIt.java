/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Validator.Validator;
import javax.swing.JOptionPane; 

public class ChargeIt


/**
	Demo program for the validating class
	Chapter 7 Programming Challenge 3
*/


{
	public static void main (String [] args)
	{
		String input; //To hold keyboard input 
		int accountNumber; //Account number to validate
		
		//Create a Validator object.
		Validator val = new Validator ();
		
		//Get a charge account number.
		input = JOptionPane.showInputDialog ("Enter your charge account number: ");
		accountNumber = Integer.parseInt (input);
	
		//Determine wether it is valid 
		if (val.isValid(accountNumber))
			JOptionPane.showMessageDialog(null, "That's a valid account number.");
			
		else
			JOptionPane.showMessageDialog(null, "That's an INVALID account number.");
			
		System.exit(0);
		
	}
}