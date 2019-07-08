import java.util.HashMap;

public class AplusBequalsC {

    
    public static int checkPairs(int[] arr){

        HashMap<Integer , Integer> sum = new HashMap<Integer, Integer>();
        for(int i =0 ; i<arr.length; i++) {
            sum.put(arr[i], 0);
        }

        for(int i =0 ; i<arr.length; i++){
            for( int j = i+1; j<arr.length; j++){
                if( sum.keySet().contains(arr[i]+arr[j])){
                    sum.put(arr[i]+arr[j], sum.get(arr[i]+arr[j]) +1);
                }
            }
        }

        return sum.values().stream().mapToInt(num -> Integer.valueOf(num)).sum();

    }



}
