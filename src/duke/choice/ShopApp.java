/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import java.util.Arrays;
import java.util.Set;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;

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

        System.out.println("Customer is " + c1.getName());

        // Excersize 2
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "M");
        Clothing item4 = new Clothing("Blue Shirt", 10.5, "S");;

        //Excersize 4
        Clothing[] items = {item1, item2, item3, item4};
        c1.addItems(items);
        System.out.println("");
        System.out.println("Shopping List");
      
        c1.averagePrice();
        
        System.out.println("Min Price " + Clothing.MIN_PRICE);
        for( Clothing item: items ){
            System.out.println(item);
        }
        
        
        System.out.println("---------");
        Arrays.sort(c1.getItems());
         for( Clothing item: items ){
            System.out.println(item);
        }
         
         
         try{
             ItemList list = new ItemList(items);
             Routing routing = Routing.builder()
                     .get("/items", list).build();
             ServerConfiguration  config = ServerConfiguration.builder()
                     .bindAddress(InetAddress.getLocalHost())
                     .port(8888).build();
             WebServer ws = WebServer.create(config,routing);
             ws.start();
         } catch(UnknownHostException ex){
             ex.printStackTrace();
         }
    }

}
