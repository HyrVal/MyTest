package TestGeomOper;

import GeometryOperation.GeometricOper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGeomOper {

    GeometricOper geometricOper = new GeometricOper();


    @Test
    public void checkSquareCirclePos() {

        Assert.assertEquals(geometricOper.areaOfCircle(3),28.26);
    }
    @Test
    public void checkSquareCircleNeg() {

        Assert.assertNotEquals(geometricOper.areaOfCircle(3),28.00);
    }
    @Test
    public void checkAreaOfSquare() {

        Assert.assertEquals(geometricOper.areaOfSquare(3),  9);
    }
    @Test
    public void checkAreaOfRectangle() {

        Assert.assertEquals(geometricOper.areaOfRectangle(2, 3),  6);
    }
}

