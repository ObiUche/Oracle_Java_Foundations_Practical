/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author Quant
 */
public class Clothing implements Comparable<Clothing>{

    private String description;
    private double price;
    private String size = "M";
    public static final double TAX  = 0.2;
    public static final double MIN_PRICE = 10;
   

    public Clothing(String desc, double price, String size) {
        this.description = desc;
        
        if (price > MIN_PRICE){
            this.price = price;
        }else {
            this.price = MIN_PRICE;
        }
            
        this.size = size;
    }

    public Clothing() {
        this.description = "Default";
        this.price = 24.99;
        this.size = "M";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return (price * TAX) + price;
    }

    public void setPrice(double price) {
        this.price = price < MIN_PRICE ? MIN_PRICE : price;
        
    }

    public String getSize() {
        return size;
    }
    
   

    public void setSize(String size) {
        this.size = size;
    }
    
   // Excerise 8
    @Override 
    public String toString(){
         return (getDescription() + " " + getPrice() + " "+ getSize());
    }
    
  

    @Override
    public int compareTo(Clothing o) {
        
        return this.description.compareTo(o.description);
   
    }
    
    

}
