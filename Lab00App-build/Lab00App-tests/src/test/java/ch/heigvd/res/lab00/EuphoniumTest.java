package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**

 * 
 * @author wojciech myszkorowski
 */
public class EuphoniumTest {

  
  @Test
  public void aEuphoniumShouldMakeTrum() {

    IInstrument euphonium = new Euphonium();
    String noise = euphonium.play();
    Assert.assertEquals("trum", noise);

  }

}
