import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    int num1;
    int num2;
    Calculator calculator;

    @Before
    public void before(){
        num1 = 4;
        num2 = 2;
        calculator = new Calculator();
    }

    @Test
    public void doesCalcAddTwoInts(){
        assertEquals(6, calculator.addTwoInts(num1, num2));
    }

    @Test
    public void doesCalcSubtractTwoInts(){
        assertEquals(2, calculator.subtractTwoInts(num1, num2));
    }

    @Test
    public void doesCalcMultiplyTwoInts(){
        assertEquals(8, calculator.multiplyTwoInts(num1, num2));
    }

    @Test
    public void doesCalcDivideTwoDoubles(){
        double num1 = 10.0;
        double num2 = 5.0;
        assertEquals(2.0, calculator.divideTwoDoubles(num1, num2), 0.1);
    }

}
