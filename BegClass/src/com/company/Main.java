package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal myAnimal = new Animal("Tiger","Bob","Blue");
        myAnimal.MakeSound();
        myAnimal.SetAge(4);
        myAnimal.PrintDescription();
    }
}
