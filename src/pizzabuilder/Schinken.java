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
public class Schinken extends Belag{

    @Override
    public float price() {
        return 4.50f;
    }

    @Override
    public String name() {
        return "Schinken";
    }
    
}
