

package retailitem;
import java.text.DecimalFormat;
import java.util.Scanner;
public class RetailTest2 {





	 public static void main(String[] args)

   {
       
   }

	//fields
	private String description;		// description of item
	private int unitsOnHand;		// number of items
	private double retailPrice;		// price of item



	/**
	set methods to appropriate name
	*/

	public void setDescription(String des)

	{
		description = des;

	}

	public void setUnitsOnHand(int unit)

	{
		unitsOnHand = unit;

	}

	public void setRetailPrice(double price)

	{
		retailPrice = price;

	}

	/**
	get method and return value of each variable
	*/


	private String getDescription()

	{
		return description;

	}

	public int getUnitsOnHand()

	{
		return unitsOnHand;

	}

	public double getRetailPrice()

	{

		return retailPrice;

	}
}

