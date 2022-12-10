package test.proba.test9; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import proba.test9.CalculatorImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** 
* CalculatorImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���. 25, 2022</pre> 
* @version 1.0 
*/ 
public class CalculatorImplTest {
    private CalculatorImpl calculator;

@Before
public void setUp() throws Exception {
    calculator = new CalculatorImpl();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: calculate(String expression) 
* 
*/ 
@Test
public void zero_test()  {
//TODO: Test goes here...
        double result = calculator.calculate("0");
        assertEquals(0 , result, 1e-9);
    }
    @Test
    public void  floating_point_test() throws Exception {
        double result = calculator.calculate("-3e3");
        assertEquals(-3000 , result, 1e-9);
    }
    @Test
    public void addition_test() throws Exception {
        double result = calculator.calculate("2+2");
        assertEquals(4 , result, 1e-9);
    }

    @Test
    public void complex_expression() throws Exception {
        double result = calculator.calculate("(2+2)*(2+3)");
        assertEquals(20 , result, 1e-9);
    }

    @Test
    public void function_test() throws Exception {
        double result = calculator.calculate("cos(0)+sin(0)");
        assertEquals(1 , result, 1e-9);
    }
}
