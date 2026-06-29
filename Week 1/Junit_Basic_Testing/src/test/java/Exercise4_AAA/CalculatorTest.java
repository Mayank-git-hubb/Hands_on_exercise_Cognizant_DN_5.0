package Exercise4_AAA;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup Complete");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Complete");
    }

    @Test
    public void testAdd() {

        int result = calculator.add(10, 20);

        assertEquals(30, result);

    }

}