package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * Created by Christopher Meier on 27.02.17.
 */
public class CornetTest {
    @Test
    public void aCornetShouldMakeSound() {
        IInstrument cornet = new Cornet();
        String sound = cornet.play();
        Assert.assertEquals("thuuum", sound);
    }
}
