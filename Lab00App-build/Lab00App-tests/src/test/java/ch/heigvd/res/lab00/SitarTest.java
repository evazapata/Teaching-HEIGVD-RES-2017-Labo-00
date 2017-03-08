package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

public class SitarTest {

  @Test
  public void aSitarShouldMakeDring() {
    IInstrument sitar = new Sitar();
    String sound = sitar.play();
    Assert.assertEquals("dring", sound);
  }
}
