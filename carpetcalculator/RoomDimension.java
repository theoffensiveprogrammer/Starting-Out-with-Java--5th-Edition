/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpetcalculator;

public class RoomDimension
{
        //Zeros out the private variables
	private int roomLength=0;
	private int roomWidth=0;
	public void setRoomLength(int roomlength)
	{
		this.roomLength = roomlength;
	}
        //Defines the needed public statements
	public void setRoomWidth(int roomwidth)
	{
		this.roomWidth = roomwidth;
	}
	public RoomDimension()
	{
            
	}
	public int getRoomArea()
	{
		return roomLength*roomWidth;
	}
}