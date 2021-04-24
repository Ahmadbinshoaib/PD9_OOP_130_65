/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static int wordCounter(String s)
    { int noOfWords=0;
      int TotalWords=0;
    int len= s.length();
    char[] wordCounter= new char[len];
    wordCounter= s.toCharArray();
    for(int i=0; i<len; i++)
    {
        if(wordCounter[i]==' ')
        {
            noOfWords++;
           
            
        }
    }
    TotalWords= noOfWords+1; 
   
        return TotalWords;
    }
    
    
     public static int vowelcounter(String s)
    {
    int TotalVowels=0;
    int len= s.length();
    char[] wordCounter= new char[len];
    wordCounter= s.toCharArray();
    for(int i=0; i<len; i++)
    {
        if(wordCounter[i]=='a' || wordCounter[i]=='A')
        {
            TotalVowels++;
        }
        if(wordCounter[i]=='e' || wordCounter[i]=='E')
        {
            TotalVowels++;
        }
        if(wordCounter[i]=='i' || wordCounter[i]=='I')
        {
            TotalVowels++;
        }
        if(wordCounter[i]=='o' || wordCounter[i]=='O')
        {
            TotalVowels++;
        }
        if(wordCounter[i]=='u' || wordCounter[i]=='U')
        {
            TotalVowels++;
        }
        
        
    }
      return TotalVowels;  
    }
     
     public static int puncCounter(String s)
    {
    int TotalPunc=0;
    int len= s.length();
    char[] wordCounter= new char[len];
    wordCounter= s.toCharArray();
    for(int i=0; i<len; i++)
    {
        if(wordCounter[i]=='.' )
        {
            TotalPunc++;
        }
        if(wordCounter[i]==',')
        {
            TotalPunc++;
        }
        if(wordCounter[i]==':')
        {
            TotalPunc++;
        }
        if(wordCounter[i]=='?')
        {
            TotalPunc++;
        }
       
        
    }
      return TotalPunc;  
    }
    
      public static boolean findSubString(String s, String sub)
    { 
    
    char[] string= s.toCharArray();
    char[] Sub=  sub.toCharArray();
        
        
        for (int i = 0; i < string.length - Sub.length+1; i++) {
        for (int j = 0; j < Sub.length; j++) {
            if (string[i + j] == Sub[j]) {
                if (j == Sub.length - 1) {
                    return true;
                }
            } else {
                break;
            }
        }
    }
    return false;
  
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str= JOptionPane.showInputDialog("Please enter the String: ");
        String sub= JOptionPane.showInputDialog("Please enter the SubString: ");
        
        int totalWords= wordCounter(str);
        int totalVowels= vowelcounter(str);
        int TotalPunc= puncCounter(str);
        
         System.out.println("Total words in String are: " +totalWords);
         System.out.println("Total vowels in String are: " +totalVowels);
         System.out.println("Total Punctuation Marks in String are: " +TotalPunc);
         if(findSubString( str,  sub))
        {
         System.out.println(sub + " is in the string ");  
        }
        else
        {
         System.out.println(sub + " is not in the string ");     
        }
        
      
        
    }
    
}
