package ch.heigvd.res.lab00;

import org.junit.Assert;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BowTest {

    @Test
    public void thereShouldBeAnIInstrumentInterfaceAndABowClass() {
        IInstrument bow = new Bow();
        assertNotNull(bow);
    }

    @Test
    public void itShouldBePossibleToPlayAnInstrument() {
        IInstrument bow = new Bow();
        String sound = bow.play();
        assertNotNull(sound);
    }

    @Test
    public void aBowShouldMakePouet() {
        IInstrument bow = new Bow();
        String sound = bow.play();
        Assert.assertEquals("puet", sound);
    }

}
