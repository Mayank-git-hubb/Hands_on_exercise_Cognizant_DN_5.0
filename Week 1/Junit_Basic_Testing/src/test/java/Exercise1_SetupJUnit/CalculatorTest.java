package Exercise1_SetupJUnit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(5, 2 + 3);
    }

}