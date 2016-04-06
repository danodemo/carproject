package simple.carproject;

import java.util.Scanner;

public class SimpleDriver { 

  public static void carCommands(){
    System.out.println("What would you like to do now? Please pick a number!");
      System.out.println("1. Start Car");
      System.out.println("2. Accelerate");
      System.out.println("3. Brake");
      System.out.println("4. Stop Car");
      System.out.println("5. Print Car Info");
      System.out.println("6. Exit");
      System.out.println("7. Activate the Hellgate");
  }
  
  public static void playGame(){
    //GET CAR INFO STARTS HERE
    Scanner lineScanner = new Scanner(System.in);
    System.out.println("What color is your car?");
      String carColor = lineScanner.nextLine();
    System.out.println("Alright, your car is " + carColor + "!");

    System.out.println("What is the make of your car? Nissan, Ford, etc...");
      String carMake = lineScanner.nextLine();
    System.out.println("Alright, your car is a " + carColor + " car made by " + carMake + "!");

    System.out.println("What is the model of your car? F150, Altima, etc...");
      String carModel = lineScanner.nextLine();

    SimpleCar yourCar = new SimpleCar(carColor, carMake, carModel); //add parameters to trigger
    System.out.println("");
    System.out.println("Alright, your car is a " + carColor + " " + carMake + " " + carModel + "!");
    //CAR INFO ENDS HERE

    //DESTINATION INFO STARTS HERE
    String destination = " "; //destination
    int distance = 0; //distance to travel = 1 to 1 with gasLevel
    System.out.println("You are ready to drive!  Where would you like to go?");
    System.out.println("1. The Bank - 2. The Grocery Store - 3. The Club");
    String destChoice = lineScanner.nextLine();
    if (destChoice.equals("1")){
      destination = "The Bank";
      distance = 5;
    }
    else if (destChoice.equals("2")){
      destination = "The Grocery Store";
      distance = 3;
    }
    else if (destChoice.equals("3")){
      destination = "The Club";
      distance = 10;
    }
    else {
      System.out.println("That's not a valid destination, and now your car has exploded.");
    }
    System.out.println("You have chosen " + destination + " and it is " + distance + " miles away!");
    System.out.println("You have " + yourCar.gasLevel + " units of fuel.");
    System.out.println("Now to drive!");
    //DESTINATION INFO ENDS HERE

    try {
      Thread.sleep(2000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
    }
    System.out.print("\033[H\033[2J");

    //USER ACTION MENU
    for (int counter = 0; counter < 1000; counter ++) { //ACTION CHOICE LOOP BEGINS
      System.out.println(" ");
      carCommands();
      String userAction = lineScanner.nextLine();
      System.out.print("\033[H\033[2J");

      boolean userChoseOptionOne = userAction.equals("1");
      boolean userChoseOptionTwo = userAction.equals("2");
      boolean userChoseOptionThree = userAction.equals("3");
      boolean userChoseOptionFour = userAction.equals("4");
      boolean userChoseOptionFive = userAction.equals("5");
      boolean userChoseOptionSix = userAction.equals("6");
      boolean userChoseOptionSeven = userAction.equals("7");
      if (userChoseOptionOne) {
        yourCar.startCar();
      }
      else if (userChoseOptionTwo) {
          try {
          yourCar.accelerate();
        } catch (Exception myCustomException){
          System.out.println(myCustomException.getMessage()); 
          //myCustomException.printStackTrace(); 
        }
      }
      else if (userChoseOptionThree) {
        yourCar.brake();
      }
      else if (userChoseOptionFour) {
        yourCar.stopCar();
      }
      else if (userChoseOptionFive) {
        yourCar.printInfo();
      }
      else if (userChoseOptionSix) {
        System.out.println("Thanks for visiting the garage!  Be safe out there!");
        break;
      }
      else if (userChoseOptionSeven) {
        System.out.println("We're sorry, the hellgate is currently closed.");
      }
      else {
        System.out.println("That's not a valid CHOICE, you asshole!");
      }
    }
  
  }



  public static void main(String[] args) { 
    System.out.println("Welcome to the Garage!");
    System.out.println("Let's build your dream car and take it for a spin!");
    //wait or Clear Screen
    playGame();
  }
}
