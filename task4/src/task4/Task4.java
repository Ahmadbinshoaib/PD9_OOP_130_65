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
    
   
     /**
     * This function of class MyString is used to return Total Lowercase characters in a String. In certain projects, it might get used. So, you just need to call the function.
     * @param s
     * @return lower (Total Lowercase characters)
     */ 
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
   
  
     /**
     * This function of class MyString is used to return Total Numbers in a String. In certain projects, it might get used. So, you just need to call the function.
     * @param s
     * @return numbers (Total Numbers)
     */ 
   public static int countNumbers(String s){
    int numbers=0;    
    int len= s.length();
    char[] wordCounter= new char[len];
    wordCounter= s.toCharArray(); 
    for(int i = 0; i < s.length(); i++)
        {
            if ( wordCounter[i]>= '0' && wordCounter[i] <= '9')
            {
                numbers++;
            }
        }
     
 return numbers;       
} 
    /**
     * This function of class MyString is used to return Total Special Characters in a String. In certain projects, it might get used. So, you just need to call the function.
     * @param s
     * @return special (Total Special Characters)
     */ 
   
   public static int countSpecialCharacters(String s){
    int special=0;    
    int len= s.length();
    char[] wordCounter= new char[len];
    wordCounter= s.toCharArray(); 
    for(int i = 0; i < s.length(); i++)
        {
            if ( !(wordCounter[i]>= '0' && wordCounter[i] <= '9'))
            {
                if(!( wordCounter[i]>= 'a' && wordCounter[i] <= 'z'))    
                {
                    if(!( wordCounter[i]>= 'A' && wordCounter[i] <= 'Z'))
                    {
                     special++; 
                    }
                 }
                
            }
        }
     
 return special;       
} 
   
   
   /**
     * This function of class MyString is used to validate individual's CNIC. In certain projects, it might get used. So, you just need to call the function.
     *  It'll validate CNIC keeping in mind typical rules, Can contain only numbers of not more than 13 number. Alphabets or special characters are not allowed.
     * @param CNIC
     * @return flag(true if CNIC entered is correct else false) 
     */
    
    
     public boolean ValidateCNIC(String CNIC) {
     boolean flag= false;
     int count=0;
     int len= CNIC.length();
     char [] aCNIC= new char [len];
     aCNIC= CNIC.toCharArray();
     if(len==13)
      {
      if(aCNIC[0]>='0' && aCNIC[0]<='9' && aCNIC[1]>='0' && aCNIC[1]<='9' && aCNIC[2]>='0' && aCNIC[2]<='9' && aCNIC[3]>='0' && aCNIC[3]<='9' && aCNIC[4]>='0' && aCNIC[4]<='9' && aCNIC[5]>='0' && aCNIC[5]<='9' && aCNIC[6]>='0' && aCNIC[6]<='9' && aCNIC[7]>='0' && aCNIC[7]<='9' && aCNIC[8]>='0' && aCNIC[8]<='9' && aCNIC[9]>='0' && aCNIC[9]<='9' && aCNIC[10]>='0' && aCNIC[10]<='9' && aCNIC[11]>='0' && aCNIC[11]<='9' && aCNIC[12]>='0' && aCNIC[12]<='9'  )
      {
        count= count+1;
      }
      
     
     if(count==1)
     {
         flag=true;
     }
  }
  return flag;
   }
     
     /**
     * This function of class MyString is used to validate individual's Email. In certain projects, it might get used. So, you just need to call the function.
     *  It'll validate Email keeping in mind typical rules. e.g (someone@gmail.com)
     * @param Email
     * @return flag(true if Email entered is correct else false) 
     */    
     
      public  boolean ValidateEmail(String Email){
        boolean test=true;
        int index = 0;
        char[] ch = new char[Email.length()];
        
        if (ch[0] == '@') {
            test= false;
        } else {
            for (int i = 1; i < Email.length(); i++) {
                if (ch[i] == '@') {
                    index = i;
                    break;
                }
            }
            if (ch[index] == '.') {
               test = false;
            }
        }
        if (test== true) {
            
            return true;
            
        } else {
           return false;

        }
}
      
      
    public  static boolean isCheckUppLow(String str)
    {
  
     int len = str.length();
     String lowerStr = "", upperStr = "";
  
     char[] str1 = str.toCharArray();
     // Traverse the string
     for (int i = 0; i < len; i++) {
  
         // Store both lowercase and uppercase
         // in two different strings
           
         if ((int)(str1[i]) >= 65 && (int)str1[i] <= 91)
             upperStr = upperStr + str1[i];
  
         else
             lowerStr = lowerStr + str1[i];
     }
  
     // transform lowerStr1 to upper
     String transformStr = lowerStr.toUpperCase();
       
     return(transformStr.equals(upperStr));
  
    }
   
    
    
}
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyString w= new MyString();
       
        
       // int c= w.countLowercase(a);
        //System.out.println(c);
        
        String choose;
        char chose;
        do{
        choose= JOptionPane.showInputDialog("Choose the following option: \n Choose 1 to count Uppercase characters in a String  \n Choose 2 to count Lowercase characters in a String  \n Choose 3 to count Numbers in a String  \n Choose 4 to count Special Characters in a String \n Choose 5 to validate CNIC  \n Choose 6 to validate Email \n Choose 7 to Check if lowercase and uppercase characters are in same order \n Choose 0 to exit" );
        chose=choose.charAt(0);
    
    switch(chose)
    { 
      case '1':
      {
        String z= JOptionPane.showInputDialog("Ënter String to count Uppercase");
        
        int b= w.countUppercase(z);
        JOptionPane.showMessageDialog(null, "Total Uppercase Characters are: " + b );
        //System.out.println("Total Uppercase Characters are: " + b);
        break;  
      }
          
      case '2':
      {
        String z= JOptionPane.showInputDialog("Ënter String to count Lowercase");
        
        int b= w.countLowercase(z);
        JOptionPane.showMessageDialog(null, "Total Lowercase Characters are: " + b );
        //System.out.println("Total Lowercase Characters are: " + b);
        break;  
      }
      case '3':
      {
        String z= JOptionPane.showInputDialog("Ënter String to count Numbers");
        
        int b= w.countNumbers(z);
        JOptionPane.showMessageDialog(null, "Total Numbers are : " + b );
        //System.out.println("Total Numbers are: " + b);
       break;   
      }
      case '4': 
      {
          String z= JOptionPane.showInputDialog("Ënter String to count Special Characters");
        
        int b= w.countSpecialCharacters(z);
        JOptionPane.showMessageDialog(null, "Total Special Characters are are : " + b );
        //System.out.println("Total Numbers are: " + b);
       break;   
          
      }
      case '5':
      {
        String z= JOptionPane.showInputDialog("Ënter CNIC to validate it");
        
        if(w.ValidateCNIC(z)){
        JOptionPane.showMessageDialog(null, "CNIC is correct");
        }
        else
        {
         JOptionPane.showMessageDialog(null, "CNIC is incorrect");   
        }
        break; 
      }
      case '6':
      {
        String z= JOptionPane.showInputDialog("Ënter E-mail to validate it");
        
        if(w.ValidateEmail(z)){
        JOptionPane.showMessageDialog(null, "Email is correct");
        }
        else
        {
         JOptionPane.showMessageDialog(null, "Email is incorrect");   
        }
        break; 
          
      }
      case '7':
      {
          String z= JOptionPane.showInputDialog("Ënter String to Check if lowercase and uppercase characters are in same order");
        
        if(w.isCheckUppLow(z)){
        JOptionPane.showMessageDialog(null, "Same Order");
        }
        else
        {
         JOptionPane.showMessageDialog(null, "Not Same Order");   
        }
          
          
      }
    }
        }while(chose!='0');
        
        
        
        
    }
    
}
