package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        ArrayList<Integer> listOfInts = new ArrayList<Integer>();
        ArrayList<Integer> testScores = new ArrayList<Integer>();

        ArrayList<Double> dblList = new ArrayList<Double>();
        ArrayList<Double> listOfDoubles = new ArrayList<Double>();
        ArrayList<Double> playerPoints = new ArrayList<Double>();

        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<String> listOfStrings = new ArrayList<String>();
        ArrayList<String> studentName = new ArrayList<String>();

        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Double> doubleList = new ArrayList<Double>();
        ArrayList<String> strList = new ArrayList<String>();

        intList.add(12);
        intList.add(5);
        intList.add(7);
        intList.add(3);

        int intElement;

        intElement = intList.get(0);
        System.out.println(intElement);
        intElement = intList.get(1);
        System.out.println(intElement);
        intElement = intList.get(2);
        System.out.println(intElement);
        intElement = intList.get(3);
        System.out.println(intElement);

        intList.set(0,13);
        intList.set(3,8);

        intElement = intList.get(0);
        System.out.println(intElement);
        intElement = intList.get(1);
        System.out.println(intElement);
        intElement = intList.get(2);
        System.out.println(intElement);
        intElement = intList.get(3);
        System.out.println(intElement);

        doubleList.add(12.1);
        doubleList.add(5.2);
        doubleList.add(7.3);

        Double dblElement;

        dblElement = doubleList.get(0);
        System.out.println(dblElement);
        dblElement = doubleList.get(1);
        System.out.println(dblElement);
        dblElement = doubleList.get(2);
        System.out.println(dblElement);

        doubleList.set(1,13.1);
        doubleList.set(2,8.2);

        dblElement = doubleList.get(0);
        System.out.println(dblElement);
        dblElement = doubleList.get(1);
        System.out.println(dblElement);
        dblElement = doubleList.get(2);
        System.out.println(dblElement);

        strList.add("Hi");
        strList.add("How");
        strList.add("Are");
        strList.add("You?");

        String strElement;

        strElement = strList.get(0);
        System.out.println(strElement);
        strElement = strList.get(1);
        System.out.println(strElement);
        strElement = strList.get(2);
        System.out.println(strElement);
        strElement = strList.get(3);
        System.out.println(strElement);

        strList.set(1,"good");
        strList.set(2,"thanks");

        strElement = strList.get(0);
        System.out.println(strElement);
        strElement = strList.get(1);
        System.out.println(strElement);
        strElement = strList.get(2);
        System.out.println(strElement);
        strElement = strList.get(3);
        System.out.println(strElement);
    }
}
