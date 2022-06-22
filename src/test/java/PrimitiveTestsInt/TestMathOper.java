package PrimitiveTestsInt;

import MathMetodInt.MathOperation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOper {

    MathOperation mathOperation = new MathOperation();

    @Test
    public void checkSum() {
        Assert.assertTrue(mathOperation.sum(2, 3) == 5);
        Assert.assertTrue(mathOperation.sum(1, 4) == 5);
        Assert.assertTrue(mathOperation.sum(5, 4) == 9);

    }

    @Test
    public void checkMinus() {
        Assert.assertTrue(mathOperation.minus(2, 3) == -1);
        Assert.assertTrue(mathOperation.minus(1, 4) == -3);
        Assert.assertTrue(mathOperation.minus(5, 4) == 1);
    }

    @Test
    public void multiply() {
        Assert.assertTrue(mathOperation.multiply(2, 3) == 6);
        Assert.assertTrue(mathOperation.multiply(1, 4) == 4);
        Assert.assertTrue(mathOperation.multiply(5, 4) == 20);
    }

    @Test
    public void divide() {
        Assert.assertTrue(mathOperation.divide(6, 3) == 2);
        Assert.assertTrue(mathOperation.divide(4, 1) == 4);
        Assert.assertTrue(mathOperation.divide(20, 4) == 5);
    }

    @Test
    public void divideOst() {
       Assert.assertTrue(mathOperation.divideOst(8, 3) == 2);
       Assert.assertTrue(mathOperation.divideOst(5, 4) == 1);
       Assert.assertTrue(mathOperation.divideOst(3, 3) == 0);
    }
}
