package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Maxime Guillod
 */
public class BugleTest {

    @Test
    public void aBugleShouldMakePouetpouet() {
        IInstrument bugle = new Bugle();
        String sound = bugle.play();
        Assert.assertEquals("pouetpouet", sound);
    }

}
