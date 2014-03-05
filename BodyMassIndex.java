

package bodymassindex;
import javax.swing.JOptionPane;

public class BodyMassIndex 
{
    public static void main(String[] args) 
    {
         String input;
            double weight; //Inputted weight
            double height; //Inputted height
            double BodyMassIndex = 100; //Value of BMI
        
            // Prompt the user for a weight.
            input = JOptionPane.showInputDialog("What is your weight ");
            weight = Double.parseDouble(input); //What's your weight?
  
            // Prompt the user for a height.
            input = JOptionPane.showInputDialog("What is your height ");
            height = Double.parseDouble(input);
         
            BodyMassIndex = (weight * 703)/(height * height);//Fun Math
            
         //If then statements from here on
         if (BodyMassIndex >= 18.5 && BodyMassIndex < 25)  
         {
             JOptionPane.showMessageDialog(null, "You are Optimal weight "
 + "Your BMI is " + BodyMassIndex);
         }
         else if (BodyMassIndex < 18.5)
         { 
             JOptionPane.showMessageDialog(null, "You are underweight"
 + "Your BMI is " + BodyMassIndex);
         }
         else
         {
             JOptionPane.showMessageDialog(null, "You are overweight "
 + "Your BMI is " + BodyMassIndex);
        System.out.println("BodyMassIndex "); //Display of overall BMI
         }
    }
}