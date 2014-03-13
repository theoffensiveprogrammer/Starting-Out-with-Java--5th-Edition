/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celsiustemperaturetable;

public class CelsiusTemperatureTable
{
	public static void main(String[] args)
	{
		for(double i = 0; i < 20.0; i++)
		{
			System.out.println("Fahrenheit: " + i + " Centigrade: " + centigrade(i));
		}
	}

	private static double centigrade(double f)
	{
		return (5.0 / 9.0) * (f - 32.0);
	}
}