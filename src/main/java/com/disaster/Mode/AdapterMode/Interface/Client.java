package com.disaster.Mode.AdapterMode.Interface;

public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat();
        new Dog(cat).dogbarking();
    }
}
