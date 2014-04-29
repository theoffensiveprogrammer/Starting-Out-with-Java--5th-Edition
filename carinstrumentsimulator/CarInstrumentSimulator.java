/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinstrumentsimulator;
public class CarInstrumentSimulator {
	public static void main(String []args)
	{
                //Defining the the fuel gauge and the amount of fuel
		FuelGauge amountOfFuel = new FuelGauge(15);
		Odometer currentMileage = new Odometer(0);
		while (amountOfFuel.getAmountOfFuel() > 0) {
			// add a mile to the odometer
			currentMileage.incrementcurrentMileage();
			if( currentMileage.getcurrentMileage() % 24 == 0 )
				amountOfFuel.decrementFuelTank();
			{
                                //All of the statements the user sees
				System.out.printf("Amount Of Fuel = %s\tCurrent Mileage = %s\n",
						amountOfFuel.getAmountOfFuel(), currentMileage.getcurrentMileage());
			}
		}
	}
}