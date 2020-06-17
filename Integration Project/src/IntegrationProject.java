// Andrew Griswold

// This program will keep track of inventory sold over different e-commerce sites

// The Java primitive data types are byte, char, short, int, long, float, double, boolean, and
// string
// Each data types have their own characteristics that are needed in different situations for
// storing memory in code

// Variables are used to store information that can be used by the program. In this code below,
// itemOne and productCost are examples of variables.

// Scope refers to where variables are accessible to in a program. For example public and private
// modifiers can be used to allow or disallow code to be used across different classes.

// operator precedence is the order that operators are used in when put in a sequence together
//is the same as order of operations in math : 
//Parenthesis Exponents Multiplication Division Addition Subtraction


import java.util.Scanner; // scanner java utility
import java.util.Random;

public class IntegrationProject { 


  public static double total(double inventoryValueOne, double inventoryValueTwo,
      double inventoryValueThree) { // these are parameters - inside the ()
    double totalValue = inventoryValueOne + inventoryValueTwo + inventoryValueThree;
    double averageValue = totalValue / 3;
    double difference = inventoryValueOne - inventoryValueTwo;
    double modulus = inventoryValueOne % inventoryValueTwo;
    double decrement = --inventoryValueOne;
    double largest = Math.max(inventoryValueOne, inventoryValueTwo);
    double mostValueable = Math.max(largest, inventoryValueThree);
    double ternary =
        (inventoryValueOne > inventoryValueTwo) ? (inventoryValueOne + inventoryValueTwo)
            : (inventoryValueOne - inventoryValueTwo);
    int intCasting = 25;
    double doubleCasting = intCasting; // casting changes the data type

    System.out.println("The total value of all inventory is $" + totalValue);
    System.out.println("The average value of inventory is $" + averageValue);
    System.out.println("The most valueable product inventory is $" + mostValueable);
    System.out.println(difference); // do not have a use for any of these yet
    System.out.println(modulus);
    System.out.println(decrement);
    System.out.println(mostValueable);
    System.out.println(ternary);
    System.out.println(intCasting);
    System.out.println(doubleCasting);
    System.out.println(inventoryValueOne == inventoryValueThree);
    return totalValue;
  }

  public static void calculate() { // this is a header

    try (Scanner scan = new Scanner(System.in)) {
      int inventoryOne = 25; // # of inventory of itemOne
      int inventoryTwo = 20;  
      int inventoryThree = 15;
      int inventory = 0;
      final double COST_ONE = 24.05; // putting final in front of a variable means it cannot be
      final double COST_TWO = 15.92;
      final double COST_THREE = 28.67;
      double cost = 0;
      double inventoryValueOne = inventoryOne * COST_ONE;
      double inventoryValueTwo = inventoryTwo * COST_TWO;
      double inventoryValueThree = inventoryThree * COST_THREE;
      double inventoryValue = 0;
      String prompt = "Are you adding (true) or subtracting (false) inventory?";
      int item;

      item = scan.nextInt();

      switch (item) {

        case 1:
          cost = COST_ONE;
          inventoryValue = inventoryValueOne;
          inventory = inventoryOne;

          inventoryValueOne = inventoryValue;
          inventoryOne = inventory;
          break;

        case 2:
          cost = COST_TWO;
          inventoryValue = inventoryValueTwo;
          inventory = inventoryTwo;

          inventoryValueTwo = inventoryValue;
          inventoryTwo = inventory;
          break;

        case 3:
          cost = COST_THREE;
          inventoryValue = inventoryValueThree;
          inventory = inventoryThree;

          inventoryValueThree = inventoryValue;
          inventoryThree = inventory;
          break;
      }

      System.out.print("Your current inventory for item " + item + " is ");
      System.out.println(inventory);
      System.out.println(prompt);

      boolean addInventory = scan.nextBoolean(); // scans for true or false value

      if (addInventory == true) { // runs if true
        System.out.println("How many items would you like to add?");
        inventory = inventory + scan.nextInt(); // adds the next int input to the current
        // inventory of
        // item one
        inventoryValue = inventory * cost; // multiplies the inventory of item one by
                                           // the product cost

        System.out.print("The available inventory for item " + item + " is now ");
        System.out.println(inventory);
        System.out.print("The current inventory value of item " + item + " is $");
        System.out.println(inventoryValue);


      } else // runs if false
        System.out.println("How many items would you like to subtract");
      inventory = inventory - scan.nextInt(); // subtracts the next int input from the current
      // inventory
      // of item one
      inventoryValue = inventory * cost; // multiplies the inventory of item one by the
      // product
      // cost
      System.out.print("The available inventory for item " + item + " is now ");
      System.out.println(inventory);
      System.out.print("The current inventory value of item " + item + " is $");
      System.out.println(inventoryValue);
      
      total(inventoryValueOne, inventoryValueTwo, inventoryValueThree); // this is a method call
                                                              // they are arguments inside ()
    }
  }


  public static void main(String[] args) { 


    Random rand = new Random();

    int compared = 0; // == only shows as true when it is pointing to the same
    Scanner scan = new Scanner(System.in); // object
    System.out.println("Would You like to access this tool?");
    String access;
    do {


      access = scan.nextLine();
      compared = access.compareTo("yes");

      if (compared == 0) {
        String correctPassword = "CTG";
        String websites[] = {"eBay", "Mercari", "Amazon"};


        System.out.println("Welcome to \"CTG LLC\"."); // escape sequence
        System.out.println("This promgram will keep track of inventory for the following sites");

        for (String siteList : websites) { //for loop
          System.out.println(siteList);

        }
        System.out.println("What is the password?");

        String inputPassword = scan.nextLine();
        inputPassword = inputPassword.trim();
        inputPassword = inputPassword.toUpperCase();

        if (inputPassword.equals(correctPassword)) {

          System.out.println("Are you a robot?");
          System.out.println("Repeat back the number shown below.");
          int timesRun = 0;

          while (timesRun < 3) {

            int randomInt = rand.nextInt(100);
            System.out.println(randomInt);
            int inputValue = scan.nextInt();

            if (randomInt == inputValue) {
              break; // breaks the loop and continues the program
            } else
              timesRun++;

            if (timesRun == 3) {
              System.out.println("Access Denied");
              System.exit(timesRun);
            } else {
              continue; // continues running the loop

            }
          }

          System.out.println("Access Granted");
          System.out.println("Which item?");

          calculate();

        } else {
          System.out.println("Access Denied");
          break;
        }
      } else {

        System.out.println("Goodbye");
        break;
      }
    }

    while (compared == -3 || compared == 0);
    System.out.println("Would you like to run this tool again?");
    access = scan.nextLine();

    scan.close();
  }

}

