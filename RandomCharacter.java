package com.Munigal.lab9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RandomCharacter {
    RandomCharacterTest test ;                        //Declaring ran

    @Before/* run before @test */
    public void setUp(){
         test = new RandomCharacterTest(); //initialize new ran

    }
    @Test
    public void testGetUpperCase(){
        char val = test.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(val));
    }
    //test getRandomDigitCharacter() method
    @Test
    public void testGetRandomDigitCharacter(){
        //store the output of the getRandomDigitCharacter() method into a char variable called output
        char output = test.getRandomDigitCharacter();
        //test if output is a digit
        assertTrue(Character.isDigit(output));
    }

    //test getRandomCharacter() method
    @Test
    public void testGetRandomCharacter(){
        //store the output of the getRandomCharacter() method into a char variable called output
        char output = test.getRandomCharacter();
        //test if output is an alphanumerical character
        assertTrue(Character.isLetterOrDigit(output));
    }



}
