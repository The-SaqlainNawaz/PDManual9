/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Task3 {

    public static String removeInteger(String s) {
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                out = out + s.charAt(i);

            }
        }

        return out;
    }

    public static String ridMultipleBlank(String s) {
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ' && s.charAt(i + 1) == ' ')) {
                out = out + s.charAt(i);

            }
        }

        return out;
    }

    public static String stringEncryption(String s) {
        int size = s.length();
        Random rand = new Random();
        String alphaNumericCharacters = "abcdefghijklmnopqrstuvwxyz"
                + "ABCDEFGHIJLMNOPQRSTUVWXYZ"
                + "1234567890";

        // Use StringBuilder in place of String to avoid unnecessary object formation
        String result = new String();
        result = "";
        if (size >= 8) {
            for (int i = 0; i < size / 4; i++) {
                result = result + (alphaNumericCharacters.charAt(rand.nextInt(alphaNumericCharacters.length())));
            }
        } else {
            for (int i = 0; i < size; i++) {
                result = result + (alphaNumericCharacters.charAt(rand.nextInt(alphaNumericCharacters.length())));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String sentence;
        int input = -1;
        do {
            String choose = JOptionPane.showInputDialog("Features" + "\n" + "Press 1.To Use ridMultipleBlank Method " + "\n" + "Press 2.To use removeInteger Method " + "\n" + "Press 3.To use stringEncryption Method" + "\n" + "Press 0.To Exit");
            input = Integer.parseInt(choose);
            switch (input) {
                case 1:
                    sentence = JOptionPane.showInputDialog("Enter a string: ");
                    String out = ridMultipleBlank(sentence);
                    JOptionPane.showMessageDialog(null, "Output:" + "\n" + out);

                    break;
                case 2:
                    sentence = JOptionPane.showInputDialog("Enter a string: ");
                    String remove;
                    remove = removeInteger(sentence);
                    JOptionPane.showMessageDialog(null, "Output:" + "\n" + remove);
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
