package simple.carproject;

import java.util.Scanner;

public class SimpleDriver { 
  public static void main(String[] args) { 
    Scanner lineScanner = new Scanner(System.in);

    System.out.println("Welcome to the Garage!");
    System.out.println("Let's build your dream car and take it for a spin!");
    //wait
    
    System.out.println("What color is your car?");
      String carColor = lineScanner.nextLine();
    System.out.println("Alright, your car is " + carColor + "!");

    System.out.println("What is the make of your car? Nissan, Ford, etc...");
      String carMake = lineScanner.nextLine();
    System.out.println("Alright, your car is a " + carColor + " car made by " + carMake + "!");

    System.out.println("What is the model of your car? F150, Altima, etc...");
      String carModel = lineScanner.nextLine();

    SimpleCar yourCar = new SimpleCar(carColor, carMake, carModel); //add parameters to trigger
    
    System.out.println("Alright, your car is a " + carColor + " " + carMake + " " + carModel + "!");

  }
}


/*
String carColor = "Red";
String carMake = "Ford";
String carModel = "Mustang";
*/