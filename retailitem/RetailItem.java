

import java.text.DecimalFormat; //needed to format the Output
public class RetailItem 
{



   public static void main(String[] args)

   {
   
DecimalFormat formatter = new DecimalFormat("$#,##0.00");


// Jackets.
	RetailItem item1 = new RetailItem();
      item1.setDescription("Jacket");
      item1.setUnitsOnHand(12);
      item1.setRetailPrice(59.95);

// designerJeans.
	RetailItem item2 =new RetailItem();
		item2.setDescription("designerJeans");
		item2.setUnitsOnHand(40);
		item2.setRetailPrice(34.95);

// Shirts.
	RetailItem item3 = new RetailItem();
      item3.setDescription("Shirt");
      item3.setUnitsOnHand(20);
      item3.setRetailPrice(24.95);

// Display the info for Jacket.
      System.out.println("Jacket");
      System.out.println("Description: " + item1.getDescription());
      System.out.println("Units on hand: " + item1.getUnitsOnHand());
      System.out.println("Price: " + item1.getRetailPrice());

// Display the info for designerJeans.
      System.out.println("\ndesignerJeans");
      System.out.println("Description: " + item2.getDescription());
      System.out.println("Units on hand: " + item2.getUnitsOnHand());
      System.out.println("Price: " + item2.getRetailPrice());

// Display the info for Shirts.
      System.out.println("\nShirts");
      System.out.println("Description: " + item3.getDescription());
      System.out.println("Units on hand: " + item3.getUnitsOnHand());
      System.out.println("Price: " + item3.getRetailPrice());
   }
}


