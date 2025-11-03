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
    
    
    
    public Customer(String name, String size){
        this.name = name;
        this.size = size;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}

