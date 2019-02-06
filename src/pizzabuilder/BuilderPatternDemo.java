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
public class BuilderPatternDemo {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza schinken = pizzaBuilder.prepareSchinkenPizza();
        System.out.println("Schinken");
        schinken.showItems();
        System.out.println("");
        System.out.println("Total Cost: " + schinken.getCost());
        System.out.println("");
        
        Pizza margherita = pizzaBuilder.prepareMargheritaPizza();
        System.out.println("Margherita");
        margherita.showItems();
        System.out.println("");
        System.out.println("Total Cost: " + margherita.getCost());
        System.out.println("");
    }
}
