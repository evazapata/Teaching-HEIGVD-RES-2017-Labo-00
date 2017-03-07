package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * @author Tony Clavien
 */
public class BandoneonTest {

  @Test
  public void aBandoneonShouldMakeBandura() {
    IInstrument bandoneon = new Bandoneon();
    String sound = bandoneon.play();
    Assert.assertEquals("coin", sound);
  }

}
