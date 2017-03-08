
package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Rafidimalala Iando
 */
public class PiccoloTest {
      @Test
  public void aPiccoloShouldMakeFufu() {
    IInstrument piccolo = new Piccolo();
    String sound = piccolo.play();
    Assert.assertEquals("fufu", sound);
  }
}
