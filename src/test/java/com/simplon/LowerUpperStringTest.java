package com.simplon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alonso on 27/02/17.
 */
public class LowerUpperStringTest {

    @Test
    public void performAlternativeString(){
        //set
        LowerUpperString sLU = new LowerUpperString();
        //test
        String result = sLU.toAlternativeString("altERnaTIng cAsE");
        //assert
        assertEquals("ALTerNAtiNG CaSe", result);
    }

    @Test
    public void performAlternativeStringWithNull(){
        //set
        LowerUpperString sLU = new LowerUpperString();
        //test
        String result = sLU.toAlternativeString(null);
        //assert
        assertEquals("", result);
    }

    @Test
    public void performAlternativeStringWithEmpty(){
        //set
        LowerUpperString sLU = new LowerUpperString();
        //test
        String result = sLU.toAlternativeString("");
        //assert
        assertEquals("", result);
    }

}
