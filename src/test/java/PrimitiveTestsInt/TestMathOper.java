package PrimitiveTestsInt;

import MathMetodInt.MathOperation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOper {
    MathOperation mathOperation = new MathOperation();

    @Test
    public void checkSumPositive() {

        Assert.assertEquals(mathOperation.sum(3, 4), 7);
    }
    @Test
    public void checkSumNegative() {

        Assert.assertNotEquals(mathOperation.sum(5, 4), 10);
    }

    @Test
    public void checkMinusPozitive() {
        Assert.assertEquals(mathOperation.minus(2, 3), -1);

    }

    @Test
    public void checkMinusNegative() {
        Assert.assertNotEquals(mathOperation.minus(1, 4), 3);

    }

    @Test
    public void multiplyPozitive() {
        Assert.assertEquals(mathOperation.multiply(2, 3), 6);

    }
    @Test
    public void multiplyNegative() {
        Assert.assertNotEquals(mathOperation.multiply(2, 3), 5);

    }

    @Test
    public void checkDividePozitive() {

        Assert.assertEquals(mathOperation.divide(6, 3), 2);
    }
    @Test
    public void checkDivideNegative() {

        Assert.assertNotEquals(mathOperation.divide(20, 4), 6);
    }

    @Test
    public void divideOstPozit() {
        Assert.assertEquals(mathOperation.divideOst(8, 3), 2);
    }
    @Test
    public void divideOstNegat() {
        Assert.assertFalse(mathOperation.divideOst(8, 3) == 1);

    }
    @Test
    public void sqearTestPoz() {

        Assert.assertTrue(mathOperation.squareNumber(4)==16);
    }
    @Test
    public void sqearTestNeg() {

        Assert.assertFalse(mathOperation.squareNumber(4)==8);
    }
}
