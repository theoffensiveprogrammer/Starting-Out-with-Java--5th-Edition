/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpetcalculator;
public class RoomCarpet
{
	private RoomDimension thisRoomDimension;
	final int carpetUnitCost=8;
	public void setRoomDimension(RoomDimension thisroomdimension)
	{
		this.thisRoomDimension = thisroomdimension;
	}
	public int getTotalAmount()
	{
		return thisRoomDimension.getRoomArea()* carpetUnitCost;
	}
}
