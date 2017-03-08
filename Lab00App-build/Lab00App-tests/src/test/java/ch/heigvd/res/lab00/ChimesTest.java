package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by celestius on 27.02.17.
 */
public class ChimesTest {

    @Test
    public void aChimesShouldDoTheRightSound() {
        IInstrument chimes = new Chimes();
        String sound = chimes.play();
        Assert.assertEquals("dring", sound);
    }

}
