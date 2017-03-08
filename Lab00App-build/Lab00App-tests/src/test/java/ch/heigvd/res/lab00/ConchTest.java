package ch.heigvd.res.lab00;
import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Adrien
 */
public class ConchTest {
   
   
    @Test
    public void aConchShouldMakeDuuuuh() {
    IInstrument conch = new Conch();
    String sound = conch.play();
    Assert.assertEquals("duuuuh", sound);
  }
   
}
