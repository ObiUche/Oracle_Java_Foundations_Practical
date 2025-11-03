/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import java.util.Set;

/**
 *
 * @author Quant
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Duke Choice Shop");
        Customer c1 = new Customer("Pinky", "S");
        c1.setSize(3);
        System.out.println("Pinky Size " + c1.getSize());
        
        System.out.println("Customer is "+ c1.getName());
      
     
    
        // Excersize 2
        
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5 , "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "M");
        System.out.println(item3.getPrice());
        Clothing item4 = new Clothing("Blue Shirt", 10.5, "S");
        
        System.out.println(item1.getDescription() + "," + item1.getPrice()+ "," + item1.getSize());
        System.out.println(item2.getDescription() + "," + item2.getPrice()+ "," + item2.getSize());
        
        double tax = 0.2;
  
        double total = (item2.getPrice() * 2) + item1.getPrice() ;
        double totalTax = (total * tax) + total ; 
        
        System.out.println("Total " +  totalTax); // Calculates the total value + tax
       
       //Excersize 4
       
       Clothing[] items = {item1, item2, item3, item4};
       total = 0;
        
        for(Clothing item : items){
           if (total > 15){
               break;
           } else {
           
            if (c1.getSize().equals(item.getSize())){
                 total +=  item.getPrice();
            System.out.println(item.getDescription()+ ": "  + item.getPrice());
            } else {
                System.out.println(item.getDescription() + " is not your size");
            }
           }
           
        }
        System.out.println("Final bill Total " + total);
        
    }
    
    
}
