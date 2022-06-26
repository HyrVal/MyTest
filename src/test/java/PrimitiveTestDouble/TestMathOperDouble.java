package PrimitiveTestDouble;

import MathMetodDoгble.MathMetodDouble;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperDouble {

        MathMetodDouble mathMetodDouble = new MathMetodDouble();

        @Test
        public void checkSumDoublePoz() {
            Assert.assertTrue(mathMetodDouble.sumDouble(2.2,3.3) == 5.5);
            Assert.assertTrue(mathMetodDouble.sumDouble(5.4,4.3) == 9.7);
        }
    @Test
    public void checkSumDoubleNeg() {

        Assert.assertFalse(mathMetodDouble.sumDouble(5.4,4.3) == 9.9);
    }

    @Test
    public void checkMinusDoublePoz() {

        Assert.assertTrue(mathMetodDouble.minusDouble(5.4,4.4) == 1.0);
    }
    @Test
    public void checkMinusDoubleNeg() {

        Assert.assertFalse(mathMetodDouble.minusDouble(5.4,4.3) == 1.2);
    }
    @Test
    public void checkMyltiplyDoublePoz() {

        Assert.assertTrue(mathMetodDouble.multiplyDouble(5.4,4.3) == 23.22);
    }
    @Test
    public void checkMyltiplyDoubleNeg() {

        Assert.assertFalse(mathMetodDouble.multiplyDouble(5.4,4.3) == 23.23);
    }
    @Test
    public void checkDivideDoublePoz() {

        Assert.assertTrue(mathMetodDouble.divideDouble(10.0,2.5) == 4.0);
    }
    @Test
    public void checkDivideDoubleNeg() {

        Assert.assertFalse(mathMetodDouble.divideDouble(5.4,4.3) == 1.2);
    }
}

