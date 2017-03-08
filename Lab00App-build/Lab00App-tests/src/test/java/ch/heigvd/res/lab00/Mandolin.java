package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class Mandolin {
   
   @Test
   public void aMandolinShouldMakeZing() {
     IInstrument mandolin = new Mandolin();
     String sound = mandolin.play();
     Assert.assertEquals("zing", sound);
   }
}
