package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * 
 * @author Zanone Jérémie
 */
public class TomTomDrumTest {


  @Test
  public void aTomTomDrumShouldMakeTomTom() {
    IInstrument TomTomDrum = new TomTomDrum();
    String sound = TomTomDrum.play();
    Assert.assertEquals("tom-tom", sound);
  }
   
 
}
