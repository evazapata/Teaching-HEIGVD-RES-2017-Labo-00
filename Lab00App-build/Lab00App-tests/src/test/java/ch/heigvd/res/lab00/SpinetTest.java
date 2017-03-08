package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class SpinetTest {

  
  @Test
  public void aSpinetShouldMakeTang() {
    IInstrument spinet = new Spinet();
    String sound = spinet.play();
    Assert.assertEquals("tang ting ting tang", sound);
  }
  
 
}
