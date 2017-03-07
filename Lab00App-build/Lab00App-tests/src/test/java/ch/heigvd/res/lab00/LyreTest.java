package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * @author Gaëtan Othenin-Girard
 */
public class LyreTest {
  @Test
  public void thereShouldBeAnIInstrumentInterfaceAndALyreClass() {
    IInstrument lyre = new Lyre();
    assertNotNull(lyre);
  }
  
  @Test
  public void itShouldBePossibleToPlayAnInstrument() {
    IInstrument lyre = new Lyre();
    String sound = lyre.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aLyreShouldMakeDrlingDrling() {
    IInstrument lyre = new Lyre();
    String sound = lyre.play();
    Assert.assertEquals("drlingdrling", sound);
  }
}
