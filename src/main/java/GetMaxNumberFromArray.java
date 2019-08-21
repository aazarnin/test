import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;

public class GetMaxNumberFromArray {
    // Есть массив А. Надо вычислить максимальное число из всех элементов массива.

    @Test
    public void viaForCycle() {
        int[] numbers = {1,3,8,4,9,2};
        int maxNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]>maxNumber){
                maxNumber = numbers[i];
            }System.out.println(maxNumber);
        }
    }

    @Test
    public void viaCollectionsMax(){
        Integer[] numbers = {1,3,8,4,9,2};
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers[0]);
    }

    @Test
    public void viaStreamMax(){
        int [] numbers = {1,3,8,4,9,2};
       OptionalInt maxNumber = Arrays.stream(numbers).max();
        System.out.println(maxNumber.getAsInt());
    }
}
