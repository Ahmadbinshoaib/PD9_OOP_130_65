/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author Maria
 */
public class Task3 {

    public static String ridMultipleBlanks(String s) {
        String newString = "";
        String[] toks = s.split(" ");
        for (int i = 0; i < toks.length; i++) {
            newString = newString + toks[i] + " ";

        }

        return newString;
    }

    public static String removeInteger(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            } else {
                newString = newString + s.charAt(i);
            }

        }
        return newString;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String menu = "Select the Following Option :\n"+"1. For RidMultipleBlanks \n"+
                     "2. For RemoveTnteger\n"+"3. For stringEncryption\n"+
                     "0. For Exit\n"+"Enter option ";
      Scanner input = new Scanner(System.in);
      String option = "" ;
      do{
      System.out.print(menu);
      option = input.next();
           switch (option) {
               case "1":
                   {
                       System.out.println("---------------RidMultipleBlanks--------------\n\n");
                       System.out.println("Input String :");
                       String line = input.nextLine();
                       System.out.println(ridMultipleBlanks(line));
                       break;
                   }
               case "2":
                   {
                       System.out.println("---------------RemoveInteger--------------\n\n");
                       System.out.println("Input String :");
                       String line = input.nextLine();
                       System.out.println(removeInteger(line));
                       break;
                   }
               case "3":
                   {
                       System.out.println("---------------stringEncryption--------------\n\n");
                       System.out.println("Input String :");
                       String line = input.nextLine();
                       System.out.println(ridMultipleBlanks(line));
                       break;
                   }
               case "0":
                   break;
               default:
                   System.out.print("\n Invalid Option \n");
                   break;
           }
      }while(!option.equals("0"));
      
       
       
    }

}
