package com.disaster.Mode.AdapterMode.Interface;

public class Dog implements Bark{
    private Catch aCatch;
    public Dog(Catch aCatch){
        this.aCatch = aCatch;
    }
    @Override
    public void dogbarking() {
        aCatch.catching();
    }
}
