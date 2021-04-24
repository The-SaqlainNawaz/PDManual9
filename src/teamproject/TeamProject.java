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

    public static int wordCounter(String s) {
        int wordCount = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ') {
                wordCount++;
            }
        }

        return wordCount;
    }

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

    public static int intpuncCount(String s) {
        String trim = s.trim();
        String punct = ".,?!;:'-/";
        int punccounter = 0;
        for (int i = 0; i < trim.length(); i++) {
            for (int j = 0; j < punct.length(); j++) {
                if (trim.charAt(i) == punct.charAt(j)) {
                    punccounter++;
                }
            }
        }
        return punccounter;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = obj.nextLine();
        int number = wordCounter(str);
        System.out.println("Number of words  = " + number);
        int counter = vowelcounter(str);
        System.out.println("Number of vowels =" + counter);
        int puncoutere = intpuncCount(str);
        System.out.println("Number of punctuations =" + puncoutere);
    }

}
