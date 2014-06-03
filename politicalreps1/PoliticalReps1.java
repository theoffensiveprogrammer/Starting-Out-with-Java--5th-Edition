/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package politicalreps1;
import java.util.Scanner;
public class PoliticalReps1 
{

        private String name;
	private String party;
	private int yearsofservice;
	private String description;

	/**
     The no arg constructor initializes an empty object
	 */

	public PoliticalReps1()
	{
		name = "";
		party = "";
		yearsofservice= 0;
		description = "";

	}
        

	/**
     The parameterized constructor accepts arguments for the object's fields. 
          @paran theirName= A person's name.
          @paran theirParty= A politician's political party.
          @paran theirYearsofservice= A person's age.
          @paran theirDescription= A person's phone number.

	 */


	public PoliticalReps1(String theirName, String theirParty, int theirYearsofservice, String theirDescription)
	{
		name= theirName;
		party= theirParty;
		yearsofservice= theirYearsofservice;
		description= theirDescription;
	}
        
      
	/**
        The setName method sets the person's name
        @param theirName = The Person's name
	 */

	public void setName(String theirName)
	{
		name= theirName;
	}
        
       
        
        /**
        The setParty method sets the person's party leaning.
        @param theirParty = The candidate's party
	 */
	public void setParty (String theirParty)
	{
		party= theirParty;
	}

 
       
        /**
        The setyearsofservice method sets the persons public service tenure.
        @param theirYearsofservice = Amount of public service provided by candidate
	 */
	public void setyearsofservice(int theirYearsofservice)
	{
		yearsofservice= theirYearsofservice;
	}


        /**
        The setPhone method sets the person's phone number    
         @param theirDescription Candidate's description.  
	 */
	public void setDescription (String theirDescription)
	{
                description = theirDescription;
        }
        /**______________________________________________________*/
       
	/**
        The getName method returns the person's name
        @return the candidate's name
	 */
	public String getName()
	{
		return name;
	}
        
        
        
        /**
        The getParty method returns the candidate's Party
         @return Party affiliation(Democrat, Republican, or Independent) 
	 */
	public String getParty()
	{
		return party;
	}
        
        

	/**
        The getYearsofservice method returns the candidate's public service record
         @return public service record.
	 */
	public int getYearsofservice()
	{
		return yearsofservice;
	}

	

	/**
         The getDescription method returns the candidate's biography and why they 
        * have decided to run.  
       @return The person's phone number  
	 */
	public String getDescription()
	{     
		return description;
	}

    
}