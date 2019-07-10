import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalsses {

    @Test
    public void AplusBequalsCTest(){
        int[] input = {1,2,3,5};
        assertEquals( 2, AplusBequalsC.checkPairs(input) );
    }
    @Test
    public void AplusBequalsCTest02(){
        int[] input = {1,2,4,10};
        assertEquals( 0, AplusBequalsC.checkPairs(input) );
    }

    @Test
    public void insertSort(){
        Integer[] input = {10,5,4,1};
        Integer[] result = {1,4,5,10};
        assertArrayEquals( result, InsertionSort.insertSort(input));

    }

    @Test
    public void quiskSort(){
        int[] input = {1,2,100,3};
        QuickSort.quicksort(0,input.length-1,input);
        int[] result = {1,2,3,100};
        assertArrayEquals( result, input);
    }

    @Test
    public void  fizzBuzTest(){
        FizzBuzz.fuuuf();
    }


    @Test
    public void  MergeNames(){
        String[] n1 = {"a","b","c"};
        String[] n2 = {"a","x","y","b"};
        String[] result = {"a","b"};

        assertArrayEquals( result, MergeNames.checked(n1,n2));
    }

    @Test
    public void  Palindrome(){
        String s = "daaassaaad";
        assertTrue( Palindrome.isPalindrome(s));
    }




}
