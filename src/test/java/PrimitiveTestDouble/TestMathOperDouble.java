package PrimitiveTestDouble;

import MathMetodDouble.MathMetodDouble;
import MathMetodInt.MathOperation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathOperDouble {

        MathMetodDouble mathMetodDouble = new MathMetodDouble();

        @Test
        public void checkSum() {
            Assert.assertTrue(mathMetodDouble.sumDouble(2.2,3.3) == 5.5);
            Assert.assertTrue(mathMetodDouble.sumDouble(1.4,4.2) == 5.6);
            Assert.assertTrue(mathMetodDouble.sumDouble(5.4,4.3) == 9.7);

        }
}
