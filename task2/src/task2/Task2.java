/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String displayVertical(String s) {
        String vertical_String = "";
        for (int i = 0; i < s.length(); i++) {
            vertical_String = vertical_String + s.charAt(i) + "\n";
        }
        return vertical_String;
    }
}
