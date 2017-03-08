package ch.heigvd.res.lab00;

public class ElectricGuitar implements IInstrument {

  private String sound;
  private int cords;

  public ElectricGuitar() {
    sound = "waawaaaa";
    cords = 6;
  }

  public String play() {
    return sound;
  }

  public String getConnector() {
    return "Jack";
  }

  public int getNumberOfStrings() {
    return cords;
  }

  public String getColor() {
    return "black";
  }

  public int getSoundVolume() {
    return 42;
  }

}
