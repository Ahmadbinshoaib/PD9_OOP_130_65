/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Random;
import java.util.Scanner;

/** @author Maria */
public class Task3 {

  public static String ridMultipleBlanks(String s) {
    String newString = "";
    String[] toks = s.split(" ");
    for (int i = 0; i < toks.length; i++) {
      if (toks[i].equals("")) {

      } else {

        newString = newString + toks[i] + " ";
      }
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

  public static String stringEncryption(String s) {
    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";

    // Combine all Strings
    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

    // create random String Builder
    StringBuilder sb = new StringBuilder();

    // create an object of Random class
    Random random = new Random();

    // Specify length of random String
    int length = s.length() / 4;

    for (int i = 0; i < length; i++) {

      // generate random index number
      int index = random.nextInt(alphaNumeric.length());

      // get character sepecifed by index
      // from the string
      char randomChar = alphaNumeric.charAt(index);

      // append the character to string builder
      sb.append(randomChar);
    }
    String randomString = sb.toString();
    return randomString;
  }
  /** @param args the command line arguments */
  public static void main(String[] args) {
    // TODO code application logic here
    String menu =
        "Select the Following Option :\n"
            + "1. For RidMultipleBlanks \n"
            + "2. For RemoveTnteger\n"
            + "3. For stringEncryption\n"
            + "0. For Exit\n"
            + "Enter option ";
    Scanner input = new Scanner(System.in);
    String option;
    do {
      System.out.print(menu);
      option = input.next();
      switch (option) {
        case "1":
          {
            System.out.println("---------------RidMultipleBlanks--------------");
            System.out.println("Input String :");
            Scanner s = new Scanner(System.in);
            String line = s.nextLine();
            System.out.println(ridMultipleBlanks(line));
            System.out.println();
            break;
          }
        case "2":
          {
            System.out.println("---------------RemoveInteger--------------");
            System.out.println("Input String :");
            Scanner s = new Scanner(System.in);
            String line = s.nextLine();
            System.out.println(removeInteger(line));
            System.out.println();
            break;
          }
        case "3":
          {
            System.out.println("---------------stringEncryption--------------");
            System.out.println("Input String :");
            Scanner s = new Scanner(System.in);
            String line = s.nextLine();
            System.out.println(stringEncryption(line));
            System.out.println();
            break;
          }
        case "0":
          break;
        default:
          System.out.print("\n Invalid Option \n");
          break;
      }
    } while (!option.equals("0"));
  }
}
