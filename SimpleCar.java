package simple.carproject;

public class SimpleCar {
  //These are INITIALIZED, INSTANCE variables, available to objects of the
  //public class, in this case SimpleCar.  So when new.SimpleCar is called,
  //It will have all the following variables ready or assigned to it
  public String color;
  public String make;
  public String model;
  public boolean isCarStarted= false;
  public int speed = 0;
  public int gasLevel = 10;

  /*CONSTRUCTORS have the SAME NAME AS THE PUBLIC CLASS
  public SimpleCar() {
    color = "s";
    make = "Nissan";
    moadel = "Altima S";
  }
  */
  public SimpleCar(String inputColor, String inputMake, String inputModel) {
    color = inputColor;

      if (inputMake.equals("Dodge")) {
       make = "Piece of Shit"; }
      else {
        make = inputMake;
      }

    model = inputModel;
  }


}