

package bankaccount;

/*
 @author KeshavKumar
 */

public class BankAccount 
{
	private double Balance; //Account Balance 

	/**
	 * This constructor sets the starting balance at 
	 * 0.0; 
	 */
	public BankAccount()
	{
		Balance = 0.0;
	}
	/** 
	 * Copy Constructor: 
	 * This constructor accepts a reference to another BankAccount object. 
	 * The object that is constructed is a copy of the argument object. 
	 * @param obj A reference to a BankAccount object.
	 */

	public BankAccount (BankAccount obj)
	{
		Balance = obj. Balance; 
	}
	/**
	 * This constructor sets the starting balance 
	 * to the value passed as an argument 
	 * @param startBalance the starting balance. 
	 */
	public BankAccount (double startBalance)
	{
		Balance = startBalance;
	}
	/**
	 * This constructor sets the starting balance 
	 * to the value in the string argument. 
	 * @return the current balance
	 */
	public double getBalance()
	{   
		return Balance;
	}
	private double balance;
}
