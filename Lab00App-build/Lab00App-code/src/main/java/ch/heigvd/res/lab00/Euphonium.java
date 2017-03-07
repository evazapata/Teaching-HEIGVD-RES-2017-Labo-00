/*
 * 
 * @author Maxime Guillod
 */
package ch.heigvd.res.lab00;

public class Euphonium implements IInstrument {

    @Override
    public String play() {
        return "trum";
    }

    @Override
    public int getSoundVolume() {
        return 20;
    }

    @Override
    public String getColor() {
        return "gold";
    }

}
