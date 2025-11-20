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
public class Customer {
    private String name;
    private String size;
    private Clothing[] items;
    
    public Customer(){
        
    }
    
    
    public Customer(String userName, String userSize){
        name = userName;
        size = userSize;
    }
    
    public void setSize(int measurement){
           switch(measurement){
            case 1: case 2: case 3:{
                setSize("S");
                break;
            }case 6 : case 4: case 5:{
                setSize("M");
                break;
            }case 7: case 8 :case 9:{
                setSize("L");
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void addItems(Clothing[] Someitems){
        items = Someitems;
    }
    
    public Clothing[] getItems(){
        return this.items;
    }
    public double getTotalClothingCost(){
        double total = 0;
        for(Clothing item : items){
            total +=  item.getPrice();
            System.out.println(item.getDescription()+ ": "  + item.getPrice());
         }
        return total;
    }
    
     public void averagePrice(){
        double total = 0.0;
         try {
             for(Clothing item: items){
                 total += item.getPrice();
                 if(item.getSize().equals("M")){
                     throw new ArithmeticException("Item is not Medium");
                 }
             }
             
             System.out.println("Average " + total / items.length);
             
         } catch (ArithmeticException e){
             System.out.println("" + e.getMessage());
         }
    }
    
    
}

