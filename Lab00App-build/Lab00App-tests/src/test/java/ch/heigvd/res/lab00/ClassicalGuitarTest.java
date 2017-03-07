package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Gabriel Luthier
 */
public class ClassicalGuitarTest {
      
  @Test
  public void aClassicalGuitarShouldMakeDwing() {
    IInstrument classicalGuitar = new ClassicalGuitar();
    String sound = classicalGuitar.play();
    Assert.assertEquals("dwing", sound);
  }
}
