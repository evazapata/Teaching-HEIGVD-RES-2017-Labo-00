package ch.heigvd.res.lab00;


import org.junit.Assert;
import org.junit.Test;

public class ConcertinaTest {

   @Test
   public void aConcertinaShouldMakeDjulidou() {
      IInstrument c = new Concertina();
      Assert.assertEquals("Djulidou", c.play());
   }

}
