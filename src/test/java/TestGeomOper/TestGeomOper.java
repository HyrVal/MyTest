package TestGeomOper;

import GeometryOperation.GeometricOper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGeomOper {

    GeometricOper geometricOper = new GeometricOper();


    @Test
    public void checkSquareCirclePos() {

        Assert.assertEquals(geometricOper.doSquareCircle(3),28.26);
    }
    @Test
    public void checkSquareCircleNeg() {

        Assert.assertNotEquals(geometricOper.doSquareCircle(3),28.00);
    }
}

