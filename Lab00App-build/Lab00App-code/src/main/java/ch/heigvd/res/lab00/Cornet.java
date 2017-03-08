/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Lemdjo
 */

public class Cornet implements IInstrument {

   private String color = "gold";

   private int soundVolume = 30;

  

   public Cornet() {}

   public String play() {

      return "thuuum";

   }

   public int getSoundVolume() {

      return soundVolume;

   }


   public String getColor() {

      return color;

   }

}