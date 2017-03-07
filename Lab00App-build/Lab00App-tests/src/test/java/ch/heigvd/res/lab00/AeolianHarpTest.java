package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class AeolianHarpTest {

  @Test
  public void aAeolianHarpShouldMakeDing() {
    IInstrument aeolianHarp = new AeolianHarp();
    String sound = aeolianHarp.play();
    Assert.assertEquals("ding", sound);
  }



  
 
}
