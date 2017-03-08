package ch.heigvd.res.lab00;

import org.junit.Assert;

/**
 *
 * @author lognaume
 */
public class CymbalsTest {
      public void cymbalsShouldMakeClash() {
    IInstrument cymbals = new Cymbals();
    String sound = cymbals.play();
    Assert.assertEquals("Clash", sound);
  }
}
