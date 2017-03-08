package ch.heigvd.res.lab00;

/**
 * Created by benoit on 3/8/17.
 */
public class Cymbals implements IInstrument {

    @Override
    public String play() {
        return "Clash";
    }

    @Override
    public int getSoundVolume() {
        return 42 * 10;
    }

    @Override
    public String getColor() {
        return "green";
    }
}
