package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ALi on 27/02/2017.
 */
public class CowbellTest {
    @Test
    public void thereShouldBeACowbellClass() {
        IInstrument cowbell = new Cowbell();
        Assert.assertNotNull(cowbell);
    }

    @Test
    public void aCowbellShouldSoundDingDangDong(){
        IInstrument cowbell = new Cowbell();
        String sound = cowbell.getSound();
        Assert.assertEquals(sound, "DingDangDong");
    }

    @Test
    public void aCowbellShouldBeLouderThanATrumpet(){
        IInstrument trumpet  = new Trumpet();
        IInstrument cowbell = new Cowbell();
        int trumpetVolume = trumpet.getSoundVolume();
        int cowbellVolume = cowbell.getSoundVolume();
        Assert.assertTrue(cowbellVolume > trumpetVolume);
    }
}
