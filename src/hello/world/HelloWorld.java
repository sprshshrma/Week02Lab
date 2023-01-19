/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world;

/**
 *
 * @author Sparsh
 */
import java.util.*;
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        
        System.out.println("Are you a hacker....");
        System.out.println("Enter 'YES' for Hacker OR 'NO' for User");
        
        
        String x  = in.nextLine();
        
        if (x.equalsIgnoreCase("YES")) {
            System.out.println("Welcome hacker");
        } 
        else if (x.equalsIgnoreCase("NO")) {
            System.out.println("WELCOME USER");
        }
        else {
            System.out.println("ENTER VALUE CORRECLTY");
        }
        
        
        
    }
    
    
}
