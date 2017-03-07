package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class MellophoneTest {

  @Test
  public void aMellophoneShouldMakePouet() {
    IInstrument Mellophone = new Mellophone();
    String sound = Mellophone.play();
    Assert.assertEquals("Pouet", sound);
  }
}
