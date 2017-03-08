/**
 * Branch: RES
 * Projet: Lab00App-tests
 * File: SpoonsTest
 * 27.02.17 at 12:06
 *
 * @author Lawrence Stalder
 * @brief Tests for spoons
 */

package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

public class SpoonsTest {
    @Test
    public void aSpoonsShouldMakeClack() {
        Spoons spoons = new Spoons();
        String sound = spoons.play();
        Assert.assertEquals("clack", sound);
    }
}