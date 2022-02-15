package com.demo.auth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicFoundation {

    @Test
    public void givenTwoIntegers_whenAndOperator_thenNewDecimalNumber() {
        int value1 = 6;
        int value2 = 5;
        int result = value1 & value2;
        assertEquals(4, result);
    }

    @Test
    public void givenTwoIntegers_whenOrOperator_thenNewDecimalNumber() {
        int value1 = 6;
        int value2 = 5;
        int result = value1 | value2;
        assertEquals(7, result);
    }

    @Test
    public void givenTwoIntegers_whenXorOperator_thenNewDecimalNumber() {
        int value1 = 6;
        int value2 = 5;
        int result = value1 ^ value2;
        assertEquals(3, result);
    }

    @Test
    public void givenOneInteger_whenNotOperator_thenNewDecimalNumber() {
        int value1 = 6;
        int result = ~value1;
        assertEquals(-7, result);
    }


    public static void main(String[] args){

        int n = 32;
        int hp2 = getHighestPowerOf2(n);
        System.out.println("HighestPowerOf2 : "+ hp2);
    }

    private static int getHighestPowerOf2(int n) {
        int res = 0;
        int pow =1;
        int pows =1;
        int nn =n;



        while(n>=2) {
            System.out.println("HighestPowerOf2 fff : "+ n);
            n = n/2;
            res += 1;
            pow = pow*2;
        }

        System.out.println("pow fff : "+ pow);

        for(int i=0; i<nn; i++){
            System.out.println("HighestPowerOf2 iii : "+ i);

            nn=nn/2;
            System.out.println("HighestPowerOf2 fff : "+ nn);
            pows = pows*2;
            if(nn<2){
                break;
            }


        }
        System.out.println("pows: "+ pows);

        return pow;
    }


}
