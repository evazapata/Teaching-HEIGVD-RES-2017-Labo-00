package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * @author Quentin Zeller
 */
public class TriangleTest {


    @Test
    public void checkInstrumentAndClass() {
        IInstrument triangle = new Triangle();
        assertNotNull(triangle);
    }

    @Test
    public void aTriangleShouldMakDing() {
        IInstrument triangle = new Triangle();
        String sound = triangle.play();
        Assert.assertEquals("ding", sound);
    }


}