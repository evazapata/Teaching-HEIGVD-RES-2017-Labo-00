package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SaxophoneTest {

    @Test
    public void aSaxophoneShouldMakePouetPouet() {
        IInstrument saxophone = new Saxophone();
        String sound = saxophone.play();
        Assert.assertEquals("PouetPouet", sound);
    }
}
