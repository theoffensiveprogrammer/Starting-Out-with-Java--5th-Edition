
package bankaccount;
import java.text.DecimalFormat;
/*
  @author KeshavKumar
 */
public class BankAccountDemo {

	public static void main(String[] args)
	{
		//Create a BankAccount object with a 
		//balance of $1200.00.
		BankAccount account1 = new BankAccount(1200.0);

		//Create another BankAccount object as
		// copy of the first.
		BankAccount account2 = new BankAccount (account1);

		//Create a DecimalFormat object to format
		//the balances when displayed.
		DecimalFormat dollar = new DecimalFormat("#,##0.00");

		//Display the balance in each account.
		System.out.println("The balance in account #1 is $"+
				dollar.format(account1.getBalance()));
		System.out.println("The balance in account #2 is $"+ 
				dollar.format(account2.getBalance()));
	}
}
