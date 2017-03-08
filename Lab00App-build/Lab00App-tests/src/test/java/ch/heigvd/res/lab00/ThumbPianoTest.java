package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Xavier Vaz Afonso
 */
public class ThumbPianoTest {

    @Test
    public void aThumbPianoShouldMakeCling() {
        IInstrument thumbPiano = new ThumbPiano();
        String sound = thumbPiano.play();
        Assert.assertEquals("cling", sound);
    }
}