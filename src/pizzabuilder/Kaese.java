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
public class Kaese extends Belag{

    @Override
    public float price() {
        return 3.50f;
    }

    @Override
    public String name() {
        return "Käse";
    }
    
}
