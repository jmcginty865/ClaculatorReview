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
        // Run the test
        final int result = BTM.addition(0, 0);

        // Verify the results
        Assert.assertEquals(0, result);
    }



}
