package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * @author Ludovic Delafontaine
 */
public class BanduraTest {

  @Test
  public void aBanduraShouldMakeBandura() {
    IInstrument bandura = new Bandura();
    String sound = bandura.play();
    Assert.assertEquals("bandura", sound);
  }

}
