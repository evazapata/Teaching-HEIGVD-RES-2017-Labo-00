package ch.heigvd.res.lab00;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Gallouche
 */
public class BassGuitarTest {
   @Test
  public void bassGuitarShouldDoAWalk(){
    IInstrument bassGuitar = new BassGuitar();
    String sound = bassGuitar.play();
    Assert.assertEquals("Dum Tudum Tudum Tudum Dum Dum !",sound);
  }
}
