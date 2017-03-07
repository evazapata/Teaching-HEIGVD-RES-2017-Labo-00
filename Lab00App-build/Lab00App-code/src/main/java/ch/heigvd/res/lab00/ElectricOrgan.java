package ch.heigvd.res.lab00;

/**
 * @author Mathias Gilson
 */
public class ElectricOrgan implements IInstrument {

    @Override
    public String play() {
        return "Dvuuuuund";
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
