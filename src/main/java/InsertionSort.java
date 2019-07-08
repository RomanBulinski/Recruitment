import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class InsertionSort {


    public static Integer[] insertSort(Integer[] arr){

        Integer[] tempArr = arr;

        for(int i = 1; i<arr.length; i++){
            for(int j = i; j>0; j--){
                if (tempArr[j] < tempArr[j-1]) {
                   int temp =  tempArr[j-1];
                    tempArr[j-1] = tempArr[j];
                    tempArr[j] = temp;
                }
            }
        }

        Stream<Integer> stream1 = Arrays.stream(tempArr);
        stream1.forEach(x -> System.out.println(x));

        return tempArr;
    }


}
