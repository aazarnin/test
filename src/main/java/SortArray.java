import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortArray {
    /* Есть массив А. Надо переложить его в массив В,
    оставив там только УНИКАЛЬНЫЕ значения.
         А           |        В
       -----------------------------------
     1) {1,2,1,2}        | {1,2}
     2) {1,2,3,4}        | {1,2,3,4}
     3) {1,2,3,2}        | {1,2,3}
     */
    Integer[] a1 = {1,2,1,2};
    Integer[] a2 = {1,2,3,4};
    Integer[] a3 = {1,2,3,2};

    @Test
    public void sortUniqueValuesViaStream(){
        Stream<Integer> streamFromA1 = Arrays.stream(a1);
        System.out.println("Unique values in a1 array are: "+ streamFromA1.distinct().collect(Collectors.toList()));
        Stream<Integer> streamFromA2 = Arrays.stream(a2);
        System.out.println("Unique values in a2 array are: "+ streamFromA2.distinct().collect(Collectors.toList()));
        Stream<Integer> streamFromA3 = Arrays.stream(a3);
        System.out.println("Unique values in a3 array are: "+ streamFromA3.distinct().collect(Collectors.toList()));
    }

    @Test
    public void sortUniqueValuesViaSet(){
        Set<Integer> setFromA1 = new HashSet<>();
        setFromA1.addAll(a1);
        System.out.println("Unique values in a1 array are: "+ setFromA1.toString());

    }

    /* Есть массив А. Надо переложить его в массив В,
    оставив там только НЕПОВТОРЯЮЩИЕСЯ УНИКАЛЬНЫЕ значения.*/





    /* Есть массив А. Надо переложить его в массив В,
    оставив там только повторяющиеся значения.
         А           |        В
       -----------------------------------
     1) {1,2,1,2}        | {1,2,1,2}
     2) {1,2,3,4}        | {}
     3) {1,2,3,2}        | {2,2}
     */


}

