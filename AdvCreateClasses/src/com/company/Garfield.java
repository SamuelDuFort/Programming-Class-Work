package com.company;

/**
 * Created by sd1500 on 2/5/2019.
 */
public class Garfield {
    String species;
    String name;

    public Garfield(){
        species = "Cat";
        name = "Garfield";
    }

    public void MakeSound(){
        System.out.println("mmmm, lasagna");
    }

    public void PrintName(){
        System.out.println(name);
    }

    public void BeHappy(){
        LayOnLap();
        System.out.println("*takes a nap*");
    }

    public void LayOnLap(){
        System.out.println("*cuddles on owner's lap*");
    }

    public void SeeLaser(){
        BeHappy();
    }
}
