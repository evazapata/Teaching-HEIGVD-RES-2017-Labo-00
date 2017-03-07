package ch.heigvd.res.labo00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class BellTest {
  @Test
  public void aBellShouldMakeBell() {
    IInstrument bell = new Bell();
    String sound = bell.play();
    Assert.assertEquals("bell", sound);
  }
}

