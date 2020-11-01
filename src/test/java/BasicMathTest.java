import org.junit.Assert;
import org.junit.Before;

import org.junit.BeforeClass;
import org.junit.Test;

public class BasicMathTest {

    BasicMath BTM;

    @Before
    public void setup(){
        BasicMath BTM = new BasicMath();
    }

    @Test
    public void testAddition() {

        BasicMath BTM = new BasicMath();

        // Run the test
        final int result = BTM.addition(4,2);

        // Verify the results
        Assert.assertEquals(6, result);
    }


    @Test
    public void testSubtraction(){
        BasicMath BTM = new BasicMath();

        final int result = BTM.subtraction(5,3);

        Assert.assertEquals(2, result);
    }

    @Test
    public void testNegitiveNum(){
        BasicMath BTM = new BasicMath();

        final int result = BTM.subtraction(4,6);

        Assert.assertEquals(-2, result);
    }

}
