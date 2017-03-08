package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Luca
 */
public class SnareDrumTest {
   @Test
   public void thereShouldBeASnareDrumClass() {
      IInstrument snareDrum = new SnareDrum();
      assertNotNull(snareDrum);
   }
   
   @Test
  public void aSnareDrumShouldMakeBoum() {
    IInstrument snareDrum = new SnareDrum();
    String sound = snareDrum.play();
    Assert.assertEquals("boum", sound);
  }
}
