package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author doriane
 */
public class TablaTest {
    
    
    @Test
    public void aTablaShouldMakeBoumBoum() {
        IInstrument tabla = new Tabla();
        String sound = tabla.play();
        Assert.assertEquals("BoumBoum", sound);
    }
    
    
}
