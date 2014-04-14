/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
     Person class
 */
package person;
public class Person
{


	private String name;
	private String address;
	private int age;
	private String phone;

	/**
     The no arg constructor initializes an empty object
	 */

	public Person()
	{
		name = "";
		address = "";
		age= 0;
		phone="";

	}

	/**
     The parameterized constructor accepts arguments for the object's fields. 
          @paran myName= A person's name.
          @paran myAddress= A person's address.
          @paran myAge= A person's age.
          @paran myPhone= A person's phone number.

	 */


	public Person(String myName, String myAddress, int myAge, String myPhone)
	{
		name= myName;
		address= myAddress;
		age= myAge;
		phone= myPhone;
	}
	/**
The setName method sets the person's name
     @param myName = The Person's name
	 */

	public void setName(String myName)
	{
		name= myName;
	}
	/**
The setAge method sets the person's age.
     @param myAge = The Person's age
	 */
	public void setAge(int myAge)
	{
		age= myAge;
	}

	/**
The setAddress method sets the person's address.
     @param myAddress The person's address
	 */

	public void setAddress (String myAddress)
	{
		address= myAddress;
	}

	/**
The setPhone method sets the person's phone number    
         @param myPhone The person's phone number
	 */

	public void setPhone (String myPhone)
	{
		phone= myPhone;
	}

	/**
The getName method returns the person's name
     @return the person's name
	 */

	public String getName()
	{
		return name;
	}
	/**
 The getAge method returns the person's age
       @return the person's age
	 */
	public int getAge()
	{
		return age;
	}

	/**
  The getAddress method returns the person's address
       @return The person's address
	 */

	public String getAddress()
	{
		return address;
	}

	/**
  The getPhone method returns the person's phone number
       @return The person's phone number  
	 */

	public String getPhone()
	{     
		return phone;
	}
}