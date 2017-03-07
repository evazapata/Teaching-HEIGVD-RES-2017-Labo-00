
package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Dany Cleve
 */
public class SteelDrumTest {
      @Test
  public void aSteelDrumShouldMakeDrumDrum() {
    IInstrument steeldrum = new SteelDrum();
    String sound = steeldrum.play();
    Assert.assertEquals("drum-drum", sound);
  }
   
}
