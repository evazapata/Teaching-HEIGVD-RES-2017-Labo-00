package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * 
 * @author François Quellec
 */

public class MelodeonTest { 
  @Test
  public void aMelodeonShouldMakeTralala() {
    IInstrument melodeon = new Melodeon();
    String sound = melodeon.play();
    Assert.assertEquals("Tralala", sound);
  } 
}

