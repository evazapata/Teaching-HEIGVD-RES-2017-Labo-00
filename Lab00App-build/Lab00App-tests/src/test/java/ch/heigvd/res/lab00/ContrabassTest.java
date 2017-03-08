/*
 * Auteur : Nathalie Mégevand
 * Date : 28.02.2017
 * Specification for a contrabass
 */
package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import ch.heigvd.res.lab00.*;

public class ContrabassTest {
      @Test
  public void aContrabassShouldMakeDzing() {
    IInstrument contrabass = new Contrabass();
    String sound = contrabass.play();
    Assert.assertEquals("dzing", sound);
  }
}
