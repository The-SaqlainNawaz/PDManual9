/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Proud To Be Muslims
 */
public class Task4{ 

    private static char Parsechar(String y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String repeater(String sentence, String y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String str=new String();
    
    public static String norpeat(String s) {
        System.out.print("Element of array that appear once in an array:");
        boolean flag = false;
        int sameindex = 0;
        String norepeater = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            flag = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag == true) {
                //System.out.print(s.charAt(i) + " ");
                norepeater = norepeater + s.charAt(i)+" ";
            }
        }
        return norepeater;
    }
    
     public static int repeater(String s, char y) {
        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
           if(s.charAt(i)==y)
           {
               count++;
           }

        }

        return count;

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String sentence;
        int input = -1;
        do {
            String choose = JOptionPane.showInputDialog("Features" + "\n" + "Press 1.To check the Words that appear once in string Method " + "\n" + "Press 2.To Check a word that reapts how many times Method " + "\n" + "Press 3.To reverse a String Method" + "\n" + "Press 0.To Exit");
            input = Integer.parseInt(choose);
            switch (input) {
                case 1:
                    sentence = JOptionPane.showInputDialog("Enter a string: ");
                    String out = norpeat(sentence);
                    JOptionPane.showMessageDialog(null, "Element of array that appear once in this  String:" + "\n" + out);

                    break;
                case 2:
                    sentence = JOptionPane.showInputDialog("Enter a string: ");
<<<<<<< HEAD
                    String remove;
                    String y=JOptionPane.showInputDialog("Enter a string: ");
                    char x=Parsechar(y);
                    remove = repeater(sentence,y);
                    JOptionPane.showMessageDialog(null, "Output:" + "\n" + remove);
=======
                    String remove=JOptionPane.showInputDialog("Enter a Word: ");
                    int cout = removeInteger(sentence,remove);                  
                    JOptionPane.showMessageDialog(null, "The Word "+remove+" appers :" + cout+ " Times");                         
>>>>>>> 06aca88e1ef41d777afc906a39426bde2390bd0e
                    break;
                case 3:
                    sentence = JOptionPane.showInputDialog("Enter a string: ");
                    String encrp;
                    encrp = stringEncryption(sentence);
                    JOptionPane.showMessageDialog(null, "Output:" + "\n" + encrp);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (input != 0);
    }
    
}
