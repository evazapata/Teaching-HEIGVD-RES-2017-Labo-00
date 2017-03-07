package ch.heigvd.res.lab00;

import org.junit.Assert;

public class SaxophoneTest {
    
    public void aSaxophoneShouldMakePouetPouet() {
        IInstrument saxophone = new Saxophone();
        String sound = saxophone.play();
        Assert.assertEquals("PouetPouet", sound);
    }
}
