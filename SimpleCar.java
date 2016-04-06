package simple.carproject;

import java.util.Scanner;

public class SimpleCar { 

  public String color; 
  public String make; 
  public String model; 
  public boolean isCarStarted = false; 
  public int speed = 0; 
  public int gasLevel = 10; 

  public void startCar() {
    if (!isCarStarted){
    System.out.println("Starting your car!"); 
    isCarStarted = true; }
    else {
      System.out.println("Your car is already running, dumbass.  Now your starter is fucked.");
    }
  }

  public void stopCar() {
    if (isCarStarted) {
      isCarStarted = false;
    } else {
      System.out.println("Your car isn't running, idiot.");
    }
  }

  public void accelerate(String accelAmount)throws Exception { 
    int increaseBy = Integer.parseInt(accelAmount);
    System.out.println("You are going to accelerate by " + increaseBy + "MPH.");
    if (isCarStarted && gasLevel > 0) {
      System.out.println("Found the long, skinny pedal. Pressing it!");
        speed = (speed + increaseBy);
        gasLevel = gasLevel - 1;
      }
      else {
        if (gasLevel < 1) { 
          throw new Exception("Dude you're out of gas!!!  Better fill up!");

        } else if (!isCarStarted) { 
          throw new Exception("Maybe try starting the car first, brah..."); 
        }
      }
  }

  public void brake() {
    if (speed > 0) {
      System.out.println("Slowing down...your speed is now " + speed + "MPH.");
      speed = (speed - 5);
    } else {
      System.out.println("You aren't moving, so there's no need to break.");
    }
  }

  public void fillUp() {
    System.out.println("Filling up the tank!");
    gasLevel = 20;
    try {
      Thread.sleep(3000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
    }
    System.out.println("Your tank is full!");
  }

  public void printInfo() {
    System.out.println("You are driving a " + color + " " + make + " " + model + ".");
      if (isCarStarted){
      System.out.println("You are moving at " + speed + " mph, and currently have " + gasLevel + " gallons of fuel remaining.");
    } else {
      System.out.println("Your car is currently not running.  You have " + gasLevel + " gallons of fuel remaining.");
    }
  }

  public SimpleCar() { 
    color = "Red";
    make = "Shelby"; 
    model = "Mustang"; 
  }

  public SimpleCar(String inputColor, String inputMake, String inputModel) {
    color = inputColor;
    make = inputMake;
    model = inputModel;  
  }

}