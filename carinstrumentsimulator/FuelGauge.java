/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carinstrumentsimulator;

public class FuelGauge {
        //Defines your private integer for the fuel gauge
	private int amountOfFuel;
	public FuelGauge(int gallons){
		amountOfFuel = gallons;
	}
        //Defines your public integer for the amount of fuel
	public int getAmountOfFuel(){
		return amountOfFuel;
	}
        //Another public statement for fuel tank (increase)
	public void incrementFuelTank(){
		if (amountOfFuel < 15 )
			amountOfFuel++;
	}
        //Last public statement for fuel tank (decrease)
	public void decrementFuelTank(){
		if (amountOfFuel > 0 )
			amountOfFuel--;
	}
}