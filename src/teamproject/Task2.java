/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;
import java.util.Scanner;
public class Task2 {

    
      public static void displayVertical(String sent)
    {
        for(int i=0;i<sent.length();i++)
        {
            if(sent.charAt(i)!=' ')
            {
                System.out.println(sent.charAt(i));
            }
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner obj=new Scanner(System.in);
        String sentence;
        System.out.println(" please enter a string ");
        sentence=obj.nextLine();
        System.out.println(" your string presented vertically is ");
        displayVertical(sentence);
    
    }
    
}
