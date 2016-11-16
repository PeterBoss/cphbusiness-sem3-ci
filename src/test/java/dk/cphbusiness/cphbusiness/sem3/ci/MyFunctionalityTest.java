package dk.cphbusiness.cphbusiness.sem3.ci;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author jens
 */
public class MyFunctionalityTest {
    //test
    @Test
    public void testFunctionality() {
        assertEquals(10, MyFunctionality.giveMeTen());
    }

}
