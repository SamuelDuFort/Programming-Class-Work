package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal myAnimal = new Animal("Tiger","Jimmy");
        Dog myDog = new Dog("Fighto",true);
        Cat myCat = new Cat("Fluffykins");
        OrangeTabby myTabby = new OrangeTabby("Flapjacks");
        RussianBlue myBlue = new RussianBlue("Apples");
        Garfield myGarfield = new Garfield();

        myAnimal.MakeSound();
        myAnimal.PrintName();

        myDog.MakeSound();
        myDog.PrintName();
        myDog.PlayFetch();
        System.out.println(myDog.getDockedTail());

        myCat.MakeSound();
        myCat.PrintName();
        myCat.BeHappy();
        myCat.SeeLaser();

        myTabby.MakeSound();
        myTabby.PrintName();
        myTabby.BeHappy();
        myTabby.LayOnLap();
        myTabby.SeeLaser();

        myBlue.MakeSound();
        myBlue.PrintName();
        myBlue.BeHappy();
        myBlue.SeeLaser();

        myGarfield.MakeSound();
        myGarfield.PrintName();
        myGarfield.BeHappy();
        myGarfield.LayOnLap();
        myGarfield.SeeLaser();
    }
}
