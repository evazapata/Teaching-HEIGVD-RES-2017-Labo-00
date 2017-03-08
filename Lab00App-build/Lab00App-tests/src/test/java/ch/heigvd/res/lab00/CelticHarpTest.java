package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/** 
 * @author Loan Lassalle
 */

public class CelticHarpTest
{ 
    public void aCelticHarpShouldMakeDruum()
    {
        IInstrument celticHarp = new CelticHarp();
        String sound = celticHarp.play();
        Assert.assertEquals("druum", sound);
    }  
}
