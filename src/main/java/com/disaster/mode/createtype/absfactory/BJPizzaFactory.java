package com.disaster.mode.createtype.absfactory;

public class BJPizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String PizzaType) {
        Pizza pizza = null;
        if (PizzaType.equals("CheesePizza")){
            pizza = new BJCheesePizza();
        }else if(PizzaType.equals("GreekPizza")){
            pizza = new BJGreekPizza();
        }else {
            return null;
        }
        return pizza;
    }
}
