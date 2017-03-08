package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the Pipa instrument 
 * @author Eddie
 */
public class PipaTest {
    
  @Test
  public void aPipaShouldMakeAyy() {
    IInstrument pipa = new Pipa();
    String sound = pipa.play();
    Assert.assertEquals("ayy", sound);
  }
}
