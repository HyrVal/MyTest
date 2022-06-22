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

}
