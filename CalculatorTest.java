package africa.tutored.chaptertwoClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    @Test
    public void calculatorCanAddTest(){
        //given there is a calculator
        Calculator myCalculator = new Calculator();
        //when i do this
        int sum = myCalculator.add(2,6);
        // check /assert
        assertEquals(8, sum);
        //assertTrue(result == 8);
        sum = myCalculator.add(6, 11);
        assertEquals(17, sum);
    }
    @Test
    public void testThatCalculatorCanMultiply() {
        //given that there is a calculator
        Calculator calculator = new Calculator();
        // when i do this
        int product = calculator.multiply(2, 6);
        //confirm
        assertEquals(12, product);
    }

    @Test
    public void testThatCalculatorCanSubtract() {
        //given
        Calculator newCalculator = new Calculator();
        //when
        float difference = newCalculator.subtract(2.0f, 6.0F);
        //confirm
        assertEquals(4.0, difference );
    }
    @Test
    public void testThatCalculatorCanDivide() {
        //given
        Calculator newCalculator = new Calculator();
        //when
        float result = newCalculator.divide(2.0,6.0);
        //confirm
        assertEquals(2.0f/6.0f, result);
        System.out.printf("The result of 2.0 divided by 6.0 is: %.2f", 2.0/6.0);
    }

    @Test
    public void testThatCalculatorCanReturnZeroWhenDividedByZero() {
        //given
        Calculator newCalculator = new Calculator();
        //when
        float result = newCalculator.divide(2.0, 0.0);
        //confirm
        assertEquals(0.0, result);
    }
}
