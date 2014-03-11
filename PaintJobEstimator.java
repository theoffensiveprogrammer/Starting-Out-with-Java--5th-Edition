/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paintjobestimator;
import javax.swing.JOptionPane;
public class PaintJobEstimator 
{
	private static int SizeToCost = 115;	// Cost calculated per 115 squared feet
	private static int PaintToCost = 1;	// 1 gallon of paint used per 115 squared feet
	private static int LabourToCost = 8;	// 8 hours to paint per 115 squared feet
	private static int LabourCostPerHour = 18;	// Labour cot per hour


	public static void main(String[] args)
	{
		// --------------
		// Get user input
		// --------------
		//Get the user input of square feet.
		double RoomSize = getDouble("Enter size of each room (in squared feet): ");

		//Get the user's input on gallons of paint needed
		double PaintCost = getDouble("Enter price of paint per gallon: ");

		//Get the user's input on gallons of paint needed
		double RoomCount = getDouble("Enter number of rooms to paint: ");

		// ------------------------
		// Now, do our calculations
		// ------------------------
		// Calc. how many of 115 sq. feet blocks is there 
		double RoomCostUnit = (RoomSize * RoomCount) / SizeToCost;

		// The number of gallons of paint required
		double PaintCountTotal = PaintToCost * RoomCostUnit;

		//2. The hours of labor required
		double LabourCountTotal = LabourToCost * RoomCostUnit;

		//3. The cost of the paint
		double PaintCostTotal = PaintCountTotal * PaintCost;

		//4. The labor charges
		double LabourCostTotal = LabourCountTotal * LabourCostPerHour;

		//5. The total cost of the paint job
		double JobCostTotal = PaintCostTotal + LabourCostTotal;

		// ---------------
		// Display results
		// ---------------
		double DisplayPaintCountTotal = (double)((int)(PaintCountTotal * 100) / 100.0);
		double DisplayLabourCountTotal = (double)((int)(LabourCountTotal * 100) / 100.0);
		double DisplayPaintCostTotal = (double)((int)(PaintCostTotal * 100) / 100.0);
		double DisplayLabourCostTotal = (double)((int)(LabourCostTotal * 100) / 100.0);
		double DisplayJobCostTotal = (double)((int)(JobCostTotal * 100) / 100.0);

		String Message = "The number of gallons of paint required = " + DisplayPaintCountTotal + "\n" +
				"The hours of labor required = " + DisplayLabourCountTotal + "\n" +
				"The cost of the paint = " + DisplayPaintCostTotal + "\n" +
				"The labor charges = " + DisplayLabourCostTotal + "\n" +
				"The total cost of the paint job = " + DisplayJobCostTotal + "\n";
		JOptionPane.showMessageDialog(null, Message);
	}

	private static double getDouble (String Prompt)
	{
		//System.out.print(Prompt);
		//Scanner InFile = new Scanner(System.in);
		//String UserInput = InFile.nextLine();
		String UserInput = JOptionPane.showInputDialog(Prompt);
		return ((double)Double.parseDouble(UserInput));
	}
}