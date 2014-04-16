/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validator;

/**
 *
 * @author KeshavKumar
 */
public class Validator

{
     //Array of Valid Numbers
     private int [] valid = {  5658845, 4520125, 7985122, 8777541,
                                8451277, 1302850, 8080152, 4562555,
                                5552012, 5050552, 7825877, 1250255,
                                1005231, 6545231, 3852085, 7576651,
                                7881200, 4581002
                                    };
                                  
          /**
          The isValid method uses a sequential search to determine
          whether a number appears in the array of valid numbers.
          @param number The number to search for.
          @return true if the number is found, false if otherwise
          */
         
          public boolean isValid(int number)
          {
               boolean found = false; //Search flag
               int index = 0; // Array Index
              
               /**
               Search through the valid array to find out if
               numbers appear in it.
               */
          while (!found && index < valid.length)    
               {
                    if   (valid[index] == number)
                         found = true;
                    else
                          index++;
                   
                        }
               //Return the status of the search
               return found;
               }
                
          } 


