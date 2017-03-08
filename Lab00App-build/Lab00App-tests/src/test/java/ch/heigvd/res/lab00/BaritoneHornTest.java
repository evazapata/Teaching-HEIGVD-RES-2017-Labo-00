
package ch.heigvd.res.lab00;

/**
 *
 * @author annie
 */
public class BaritoneHornTest {
   
   @Test
  public void aBaritoneHornShouldMakeConcertina() {
    IInstrument baritoneHorn = new BaritoneHorn();
    String sound = baritoneHorn.play();
    Assert.assertEquals("concertina", sound);
  }
   
}
