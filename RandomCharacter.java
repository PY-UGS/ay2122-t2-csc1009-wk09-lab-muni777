package com.Munigal.lab9;

import java.util.Random;


public class RandomCharacter {
    public static final String ALPHANUMERIC_CHARACTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXY";
    Random ran = new Random();

    // Generating random lowercase letters //
    public char getRandomLowerCaseLetter() {
        var r = (char) ('a' + ran.nextInt(26));
        return (r);
    }

    // Generating random uppercase letter //
    public char getRandomUpperCaseLetter() {
        var r = (char) ('A' + ran.nextInt(26));
        return (r);
    }

    //Generate a random digit character //
    public char getRandomDigitCharacter() {
        var r = (char) ('0' + ran.nextInt(10));
        return (r);
    }

    // Generate a random character //
    public char getRandomCharacter() {
        Random ran = new Random();
        var r = (char) (ran.nextInt(ALPHANUMERIC_CHARACTERS.length()));
        return ALPHANUMERIC_CHARACTERS.charAt(r);

    }

    public int getRandomPrime() {
        while (true) {
            //generate a number from range 2 to 100
            int r = (int) (ran.nextInt(98) + '2');
            //check if generated number is prime
            if (isPrimeNumber(r) == true) {
                //return value if it is prime, go through the while loop again if it is not
                return r;
            }
        }
    }


    public boolean isPrimeNumber(int r) {
        boolean isPrimeNumber = true;
        if (r <= 1)
            isPrimeNumber = false;
        else
            for (int i = 2; i <= r / 2; i++) {
                if (r % 2 == 0) {
                    isPrimeNumber = true;
                } else
                    isPrimeNumber = false;
            }
        return isPrimeNumber;
    }

    // Main //
    public static void main(String[] args) {

        RandomCharacterTest ran = new RandomCharacterTest();
        System.out.println("15 Random Characters: ");
        for (int i = 0; i < 15; i++) {
            int r = ran.getRandomCharacter();
            System.out.println(ran.getRandomCharacter());
        }
        System.out.println("15 Random lower case Characters: ");
        for (int i = 0; i < 15; i++) {
            int r = ran.getRandomLowerCaseLetter();
            System.out.println(ran.getRandomLowerCaseLetter());
        }
        System.out.println("15 Random UPPER CASE Characters: ");
        for (int i = 0; i < 15; i++) {
            int r = ran.getRandomDigitCharacter();
            System.out.println(ran.getRandomDigitCharacter());
        }
        System.out.println("15 Random digits numbers: ");
        for (int i = 0; i < 15; i++) {
            int r = ran.getRandomUpperCaseLetter();
            System.out.println(ran.getRandomUpperCaseLetter());
        }
        System.out.println("15 Random Primes: ");
        for (int i = 0; i < 15; i++) {
            int r = ran.getRandomPrime();
            System.out.println(ran.getRandomPrime());
        }
    }
}
