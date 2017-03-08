package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

public class TheraminTest {
	@Test
    public void aTheraminShouldMakeBzzz() {
        IInstrument theramin = new Theramin();
        String sound = theramin.play();
        Assert.assertEquals("bzzz", sound);
    }
}
