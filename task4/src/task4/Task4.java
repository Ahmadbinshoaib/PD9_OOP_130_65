/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import javax.swing.JOptionPane;

/**
 *
 * @author Maria
 * 
 */
class MyString{
    
     /**
     * This function of class MyString is used to return Total uppercase characters in a String. In certain projects, it might get used. So, you just need to call the function.
     * @param s
     * @return upper (Total uppercase characters)
     */
    public static int countUppercase(String s){
    int upper=0;    
    int len= s.length();
    char[] wordCounter= new char[len];
    wordCounter= s.toCharArray(); 
    for(int i = 0; i < s.length(); i++)
        {
            if ( wordCounter[i]>= 'A' && wordCounter[i] <= 'Z')
            {
                upper++;
            }
        }
     
 return upper;       
}
    
    
   public static int countLowercase(String s){
    int lower=0;    
    int len= s.length();
    char[] wordCounter= new char[len];
    wordCounter= s.toCharArray(); 
    for(int i = 0; i < s.length(); i++)
        {
            if ( wordCounter[i]>= 'a' && wordCounter[i] <= 'z')
            {
                lower++;
            }
        }
     
 return lower;       
}  
    
    
}
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyString w= new MyString();
        String a= JOptionPane.showInputDialog("Ënter String");
        int b= w.countUppercase(a);
        System.out.println(b);
        
        int c= w.countLowercase(a);
        System.out.println(c);
        
        
    }
    
}
