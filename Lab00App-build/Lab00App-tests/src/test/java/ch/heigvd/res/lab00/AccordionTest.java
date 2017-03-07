package ch.heigvd.res.lab00;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 * @author Julien Baeriswyl
 */
public class AccordionTest
{
    @Test
    public void anAccordionSoundShouldBeFuui()
    {
        Accordion accordion = new Accordion();
        String sound = accordion.play();
        Assert.assertEquals("fuui", sound);
    }
}
