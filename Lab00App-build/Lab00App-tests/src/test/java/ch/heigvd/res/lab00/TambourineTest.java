package ch.heigvd.res.lab00;

/**
 * Created by Thuy-My on 27.02.2017.
 */
public class TambourineTest {
    public void aTambourineShouldMakeBam() {
        IInstrument tambourine  = new Tambourine();
        String sound = tambourine.play();
        Assert.assertEquals("bam", sound);
    }
}
