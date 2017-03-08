package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Di Pietro Adrian
 */
public class BanjoTest {
    @Test
    public void aBanjoShouldMakeBoing() {
        IInstrument banjo = new Banjo();
        String sound = banjo.play();
        Assert.assertEquals("boing", sound);
    }
}
