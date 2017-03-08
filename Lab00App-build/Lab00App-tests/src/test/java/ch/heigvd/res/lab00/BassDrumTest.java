package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Project : Lab00App-build
 * Author(s) : Antoine Friant
 * Date : 27.02.17
 */
public class BassDrumTest {
    @Test
    public void aBassDrumShouldMakeBadaboum() {
        BassDrum bd = new BassDrum();
        String sound = bd.play();
        Assert.assertEquals("Badaboum", sound);
    }
}