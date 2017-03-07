package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class BalalaikaTest {

    @Test
    public void aBalalaikaShouldMakeDling() {
        IInstrument balalaika = new Balalaikia();
        String sound = balalaika.play();
        Assert.assertEquals("dling", sound);
    }

}

