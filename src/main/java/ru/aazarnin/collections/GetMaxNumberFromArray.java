package ru.aazarnin.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class GetMaxNumberFromArray {
    // Есть массив numbers. Надо вычислить максимальное число из всех элементов массива.

    @Test
    public void viaForCycle() {
        int[] numbers = {1,3,8,4,9,2};
        int maxNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]>maxNumber){
                maxNumber = numbers[i];
            }
        }System.out.println(maxNumber);
        Assert.assertEquals(9, maxNumber);
        System.out.println("Verification OK");
    }

    @Test
    public void viaArraysSort(){
        Integer[] numbers = {1,3,8,4,9,2};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers[0]);
        Assert.assertEquals(9,numbers[0].intValue());
        System.out.println("Verification OK");
    }

    @Test
    public void viaStreamMax(){
        int [] numbers = {1,3,8,4,9,2};
       OptionalInt maxNumber = Arrays.stream(numbers).max();
        System.out.println(maxNumber.getAsInt());
        Assert.assertEquals(9, maxNumber.getAsInt());
        System.out.println("Verification OK");
    }
}
