/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Lab 1 problem 3 
package assignment.pkg1;
import java.util.Scanner ;


/**
 *
 * @author Hatem Moahmed
 */
public class Lab1_Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dep , purchase , years , salvage ;
        System.out.println("Please enter purchase value , slavage and no. pf years ");
        Scanner scan = new Scanner (System.in); 
        purchase = scan.nextInt();
        salvage =  scan.nextInt();
        years= scan.nextInt();
        dep = (purchase - salvage)/years ;
        System.out.println("The depercation = " + dep);
        
        
    }
    
}
