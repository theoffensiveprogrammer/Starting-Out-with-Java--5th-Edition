/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testscoresgrade;
import javax.swing.*;
import java.util.*;
public class TestScoresGrade 
{
    public static void main(String[] args) 
    {
        int score1; //First Score 
        int score2; //Second Score
        int score3; //Third Score 
        int totalscore=0; //Min. Score
        double grade=0; //Constant
        char totalgrade = 0 ; //Total Grade
        Scanner keyboard = new Scanner(System.in); //Inputting information
       
        System.out.println("Enter your first test score.");
   score1 = keyboard.nextInt();//Input of first score
   
        System.out.println("Enter your second test score.");
 score2 = keyboard.nextInt();//Input of second score 
 
        System.out.println("Enter your third test score.");
 score3 = keyboard.nextInt();//Input of third score
 
        totalscore = score1 + score2 +score3;//Fun Math
 grade = totalscore /3;//Total of fun math 
 
 System.out.println("Your average is " + grade);//Display of the average grade
 
//If/Then Statements from here on
    if (grade>= 90)
    {
  totalgrade = 'A';
    }
    else if (grade>= 80)
    {
   totalgrade = 'B';
    } 
 else if (grade >= 70)
    {
   totalgrade = 'C';
    }
 else if (grade >= 60)
    {
   totalgrade = 'D';
    }
 else if (grade >59)
    {
   totalgrade = 'F';
    }
   System.out.println("Over all you have an " + totalgrade); //Display of grade
    }
}