package ch.heigvd.res.lab00;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Luana Martelli
 */
public class CongaDrumTest {
    @Test
    public void aCongaDrumShouldMakDum() {
        IInstrument conga = new CongaDrum();
        String sound = conga.play();
        Assert.assertEquals("dum", sound);
    }
}
