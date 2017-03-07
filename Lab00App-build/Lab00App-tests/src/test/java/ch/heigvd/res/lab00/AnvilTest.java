
package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author damien
 */
public class AnvilTest {
    
    public void aAnvilShouldMakeTinn() {
    IInstrument anvil = new Anvil();
    String sound = anvil.play();
    Assert.assertEquals("Tinn", sound);
  }
    
    
}
