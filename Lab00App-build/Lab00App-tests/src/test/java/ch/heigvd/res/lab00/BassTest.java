package ch.heigvd.res.lab00;

import ch.heigvd.res.lab00.Application;
import org.junit.Test;
import static org.junit.Assert.*;

public class BassTest {
	public BassTest() {
		
	}
	
	@Test
	public void classExists() {
		IInstrument bass = new Bass();
		assertNotNull(bass);
	}
	
	@Test
	public void bassMakesSound() {
		IInstrument bass = new Bass();
		String sound = bass.play();
		assertNotNull(sound);
	}
	
	@Test
	public void bassShouldMakeBoumBoum() {
		IInstrument bass = new Bass();
		String sound = bass.play();
		assertEquals(sound, "boum boum");
	}
}