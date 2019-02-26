package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray1 = new int[50];
        int[] arrayOfNumbers = new int[3];
        int[] numbersArray = new int[5];

        double[] dblArray = new double[4];
        double[] arrayOfDoubles = new double[15];
        double[] playerPoints = new double[39];

        String[] stringArray1 = new String[20];
        String[] arrayOfStrings = new String[25];
        String[] wordArray = new String[6];

        numbersArray[0] = 12;
        numbersArray[1] = 13;
        numbersArray[2] = 14;
        numbersArray[3] = 15;
        numbersArray[4] = 16;

        arrayOfNumbers[0] = 47;
        arrayOfNumbers[1] = 46;
        arrayOfNumbers[2] = 39;

        dblArray[0] = 12.43;
        dblArray[1] = 5.12;
        dblArray[2] = 43.21;
        dblArray[3] = 1.34;

        wordArray[0] = "What";
        wordArray[1] = "is";
        wordArray[2] = "Forrest";
        wordArray[3] = "Gump's";
        wordArray[4] = "password?";
        wordArray[5] = "1Forrest1";

        int numbers;

        numbers = numbersArray[0];
        System.out.println(numbers);
        numbers = numbersArray[1];
        System.out.println(numbers);
        numbers = numbersArray[2];
        System.out.println(numbers);
        numbers = numbersArray[3];
        System.out.println(numbers);

        String words;

        words = wordArray[0];
        System.out.println(words);
        words = wordArray[1];
        System.out.println(words);
        words = wordArray[2];
        System.out.println(words);

        numbers = numbersArray[3];
        System.out.println(numbers);
        numbers = numbersArray[4];
        System.out.println(numbers);

        words = wordArray[5];
        System.out.println(words);
    }
}
