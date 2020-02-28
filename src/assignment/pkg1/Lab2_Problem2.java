/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;
import java.util.Scanner;
/**
 *
 * @author Hatem Moahmed
 */
public class Lab2_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int price , days , price_then=0 ;
       int temp =0 ;
       
       while (true){
       System.out.println("please enter the intial price of crud and the numbeer of days ");
       Scanner scan = new Scanner ( System.in);
       price = scan.nextInt();
       days = scan.nextInt();
       for (int i=0 ; i<days ; i+=4 ){  
        price_then = temp +price ; 
        temp=price;
        price= price_then ;
        
       
       }
        System.out.println("The price will be "+ price_then);
       }
    }
    
}
