package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author camilo
 */
public class MarimbaTest {
    @Test
  public void aMarimbaShouldMakeDumdumdum() {
    IInstrument marimba = new Marimba();
    String sound = marimba.play();
    Assert.assertEquals("dumdumdum", sound);
  }
}
