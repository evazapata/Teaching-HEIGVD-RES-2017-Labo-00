package ch.heigvd.res.lab00;

import org.junit.Test;
import static org.junit.Assert.*;

public class BongoDrumTest {

  public BongoDrumTest(){}

  @Test
  public String aBongoDrumShouldMakeBongoBongo()
  {
    IInstrument bongo = new BongoDrum();
    String sound = bongo.play();
    assertEquals(sound, "bongo bongo");
  }
}

