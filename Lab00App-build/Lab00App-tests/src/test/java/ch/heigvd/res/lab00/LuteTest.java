package ch.heigvd.res.lab00;

import org.junit.Assert;
import org.junit.Test;

public class LuteTest {
	
	public void aLuteShouldMakeTingTing() {
		
		IInstrument lute = new Lute();
		String sound = lute.play();
		Assert.assertEquals("tingting", sound);
	}
	
}