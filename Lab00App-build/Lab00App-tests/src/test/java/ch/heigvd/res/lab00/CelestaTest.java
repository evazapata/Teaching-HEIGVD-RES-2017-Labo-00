package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Remi
 */
public class CelestaTest {

    @Test
    public void aCelestaShouldMakeGling() {
        IInstrument celesta = new Celesta();
        String sound = celesta.play();
        Assert.assertEquals("gling", sound);
    }
}
