package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class SlideWhistleTest {
	
  @Test
  public void shouldMakeFuuu() {
    IInstrument slideWhistle = new SlideWhistle();
    String sound = slideWhistle.play();
    Assert.assertEquals("fuuu", sound);
  }

}
