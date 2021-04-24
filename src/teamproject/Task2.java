/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import java.util.Scanner;

public class Task2 {

    public static String displayVertical(String sent) {
        String out = "";
        for (int i = 0; i < sent.length(); i++) {
           if (sent.charAt(i) != ' ') {            
                out = out + sent.charAt(i) + "\n";

           }
        }
        return out;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        String sentence;
        System.out.print(" Please enter a sentence: ");
        sentence = obj.nextLine();
        System.out.println(" Your string presented vertically is ");
        String out=displayVertical(sentence);
        System.out.println(out);
    }

}
