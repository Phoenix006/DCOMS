/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcoms;

import java.util.Scanner;

/**
 *
 * @author Felix Tio
 */
public class ClientMethod {
    
    int Quantity, choices;
    public String[] registermainMenu() {
        
        String[] userDetails = null;
        
        System.out.println("First Name:  ");
        Scanner s1 = new Scanner(System.in);
        userDetails[0] = s1.nextLine();
        
        System.out.println("\nLast Name:   ");
        Scanner s2 = new Scanner(System.in);
        userDetails[1] = s2.nextLine();
       
        System.out.println("\nIC or Passport Number:  ");
        Scanner s3 = new Scanner(System.in);
        userDetails[2] = s3.nextLine();
        
        return userDetails;
    }
    
    public int mainMenu() {
        System.out.println("Food Menu\n1) Nasi Goreng\n2) Mi Goreng\n3) Nasi Lemak\n");
        
        //need to implement error handling here
        
        Scanner s = new Scanner(System.in);
        
        choices = s.nextInt();
        
        return choices;
    }
    
    public void Quantity() {
        System.out.println("Enter quantity:  ");
        
        Scanner s = new Scanner(System.in);
        
        Quantity = s.nextInt();
    }
    
   public void Checkout() {
       System.out.println("Do you wish to checkout?");
       
       Scanner s = new Scanner(System.in);
       String checkout = s.nextLine();
       if (checkout == "Y") {
           return;
           
           //implement checkout in client.java by using RMI
       }
       
       else {
       
       }
   }
}
