
package ch.heigvd.res.lab00;

import org.junit.Assert;

/**
 *
 * @author SILVERCORP
 */

public class CelloTest {
     public void aCelloShouldMakeBoumBoum() {
    IInstrument cello = new CelloTest();
    String sound = cello.play();
    Assert.assertEquals("boum boum", sound);
  }
    
}
