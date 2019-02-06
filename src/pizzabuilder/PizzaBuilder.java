/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzabuilder;

/**
 *
 * @author offic
 */
public class PizzaBuilder {
    public Pizza prepareSchinkenPizza(){
        Pizza pizza = new Pizza();
        pizza.addItem(new Normal());
        pizza.addItem(new Kaese());
        pizza.addItem(new Schinken());
        return pizza;
    }
    
    public Pizza prepareMargheritaPizza(){
        Pizza pizza = new Pizza();
        pizza.addItem(new Natur());
        pizza.addItem(new Kaese());
        return pizza;
    }
}
