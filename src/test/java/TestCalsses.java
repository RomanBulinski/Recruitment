import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
