/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

import java.util.Scanner;

/**
 *
 * @author Proud To Be Muslims
 */
public class TeamProject {

    public static int vowelcounter(String s) {
        String trim = s.trim();
        String vowels = "aeiouAEIOU";
        int countedVowels = 0;
        for (int i = 0; i < trim.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (trim.charAt(i) == (vowels.charAt(j))) {
                    countedVowels++;
                    break;
                }
            }
        }
        return countedVowels;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = obj.nextLine();
        int counter=vowelcounter(str);
        System.out.println("Vowel counts :" + counter);
    }

}
