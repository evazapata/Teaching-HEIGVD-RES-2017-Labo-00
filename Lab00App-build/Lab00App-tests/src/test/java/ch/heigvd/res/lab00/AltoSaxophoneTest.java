package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Nax Caduff
 */
public class AltoSaxophoneTest {


    @Test
    public void anAltoSaxophoneIsLikeFuuuiiiiiii() {
        IInstrument altoSaxophone = new AltoSaxophone();
        Assert.assertEquals("fuuuiiiiiii", altoSaxophone.play());
    }

}