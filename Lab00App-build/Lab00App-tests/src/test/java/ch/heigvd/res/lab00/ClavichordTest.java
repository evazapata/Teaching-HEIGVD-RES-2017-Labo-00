
package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Chaymae
 */
public class ClavichordTest {
    
      @Test
  public void aClavichordShouldMakeTing() {
    IInstrument clavichord = new Clavichord();
    String sound = clavichord.play();
    Assert.assertEquals("ting", sound);
  }
  
}
