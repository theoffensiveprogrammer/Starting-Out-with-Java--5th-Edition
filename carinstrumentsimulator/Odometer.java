/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carinstrumentsimulator;

public class Odometer {
	private int currentMileage;
	public Odometer(int gallons){
		currentMileage = gallons;
	}
	public int getcurrentMileage(){
		return currentMileage;
	}
	public void incrementcurrentMileage(){ 
		if (currentMileage < 999999 ) 
			currentMileage++; 
		if (currentMileage == 999999)
			currentMileage = 0;
	}
	public void incrementMileage(){
	}
}