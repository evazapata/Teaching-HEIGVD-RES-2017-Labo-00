package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AlphornTest {
   @Test
   public void alphornDoBrooo() {
      IInstrument alpHorn = new Alphorn();
      String sound = alpHorn.play();
      Assert.assertEquals("Brooo", sound);
   }
}
