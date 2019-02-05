package com.company;

/**
 * Created by sd1500 on 2/5/2019.
 */
public class Dog {
    String species;
    String name;
    boolean dockedTail;

    public Dog(String Name,boolean DockedTail){
        species = "Dog";
        name = Name;
        dockedTail = DockedTail;
    }

    public void MakeSound(){
        System.out.println("Woof");
    }

    public void PrintName(){
        System.out.println(name);
    }

    public void PlayFetch(){
        System.out.println("*chases ball 5 times then quits*");
    }

    public boolean getDockedTail(){
        return dockedTail;
    }
}
