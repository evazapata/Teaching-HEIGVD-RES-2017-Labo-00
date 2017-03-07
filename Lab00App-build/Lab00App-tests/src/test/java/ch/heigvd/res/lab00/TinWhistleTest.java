package ch.heigvd.res.lab00;

public class TinWhistleTest {
	  @Test
	  public void aTinWhistleShouldMakeFluu() {
	    IInstrument tinwhistle = new TinWhistle();
	    String sound = tinwhistle.play();
	    Assert.assertEquals("fluu", sound);
	  }
}
