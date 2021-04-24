/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamproject;

 import java.util.Scanner;
public class Task3 {

     public static String removeInteger( String s)
    {
        String out="";
        for(int i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)>='0'  &&  s.charAt(i)<='9'))
            {
                out=out+s.charAt(i);
                
            }
        }
        
        return out;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner obj=new Scanner(System.in);
        String sentence;
        System.out.print(" enter a string   ");
       sentence=obj.nextLine();
       String remove;
       remove=removeInteger(sentence);
       System.out.println(" string without integer is  "+remove);
    }
    
}
