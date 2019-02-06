/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabuilder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author offic
 */
public class Pizza {
    private List<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }
    
    public void showItems(){
        for(Item item : items){
            System.out.println("Item: " + item.name());
            System.out.println(", Price: " + item.price());
        }
    }
}
