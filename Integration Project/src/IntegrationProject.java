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


import java.util.Scanner; // scanner java utility
import java.util.Random;

public class IntegrationProject { // this is a header

  public static double totals(double inventoryValueOne, double inventoryValueTwo,
      double inventoryValueThree) {
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

  public static void main(String[] args) { // this is a method call

    try (Scanner scan = new Scanner(System.in)) {
      Random rand = new Random();
      int itemOne = 25; // # of inventory of itemOne
      int itemTwo = 20; // this is a parameter / method argument
      int itemThree = 15;
      final double COST_ONE = 24.05; // putting final in front of a variable means it cannot be
      final double COST_TWO = 15.92;
      final double COST_THREE = 28.67;
      double inventoryValueOne = itemOne * COST_ONE;
      double inventoryValueTwo = itemTwo * COST_TWO;
      double inventoryValueThree = itemThree * COST_THREE;
      String access = "yes";
      String yes = "yes";
      int compared = access.compareTo(yes); // == only shows as true when it is pointing to the same
                                            // object

      do {
        System.out.println("Would You like to access this tool?");
        access = scan.nextLine();
        String prompt = "Are you adding (true) or subtracting (false) inventory?"; // changed
        String correctPassword = "CTG";
        String websites[] = {"eBay", "Mercari", "Amazon"};


        System.out.println("Welcome to \"CTG LLC\"."); // escape sequence
        System.out.println("This promgram will keep track of inventory for the following sites");

        for (String siteList : websites) {
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
          int item = scan.nextInt();

          switch (item) {

            case 1:

              System.out.print("Your current inventory for item 1 is ");
              System.out.println(itemOne);
              System.out.println(prompt);

              boolean addInventoryOne = scan.nextBoolean(); // scans for true or false value

              if (addInventoryOne == true) { // runs if true
                System.out.println("How many items would you like to add?");
                itemOne = itemOne + scan.nextInt(); // adds the next int input to the current
                                                    // inventory of
                                                    // item one
                inventoryValueOne = itemOne * COST_ONE; // multiplies the inventory of item one by
                                                        // the
                // product
                // cost
                System.out.print("The available inventory for item 1 is now ");
                System.out.println(itemOne);
                System.out.print("The current inventory value of item 1 is $");
                System.out.println(inventoryValueOne);

                totals(inventoryValueOne, inventoryValueTwo, inventoryValueThree);

              } else // runs if false
                System.out.println("How many items would you like to subtract");
              itemOne = itemOne - scan.nextInt(); // subtracts the next int input from the current
                                                  // inventory
                                                  // of item one
              inventoryValueOne = itemOne * COST_ONE; // multiplies the inventory of item one by the
              // product
              // cost
              System.out.print("The available inventory for item 1 is now ");
              System.out.println(itemOne);
              System.out.print("The current inventory value of item 1 is $");
              System.out.println(inventoryValueOne);

              totals(inventoryValueOne, inventoryValueTwo, inventoryValueThree);
              break;

            case 2:

              System.out.print("Your current inventory for item 2 is ");
              System.out.println(itemTwo);
              System.out.println(prompt);

              boolean addInventoryTwo = scan.nextBoolean(); // scans for true or false value

              if (addInventoryTwo == true) { // runs if true
                System.out.println("How many items would you like to add?");
                itemTwo = itemTwo + scan.nextInt(); // adds the next int input to the current
                                                    // inventory of
                                                    // item one
                inventoryValueTwo = itemTwo * COST_TWO; // multiplies the inventory of item one by
                                                        // the
                // product
                // cost
                System.out.print("The available inventory for item 2 is now ");
                System.out.println(itemTwo);
                System.out.print("The current inventory value of item 2 is $");
                System.out.println(inventoryValueTwo);

                totals(inventoryValueOne, inventoryValueTwo, inventoryValueThree);

              } else // runs if false
                System.out.println("How many items would you like to subtract");
              itemTwo = itemTwo - scan.nextInt(); // subtracts the next int input from the current
                                                  // inventory
                                                  // of item one
              inventoryValueTwo = itemTwo * COST_TWO; // multiplies the inventory of item one by the
              // product
              // cost
              System.out.print("The available inventory for item 2 is now ");
              System.out.println(itemTwo);
              System.out.print("The current inventory value of item 2 is $");
              System.out.println(inventoryValueTwo);

              totals(inventoryValueOne, inventoryValueTwo, inventoryValueThree);
              break;

            case 3:

              System.out.print("Your current inventory of item 3 is ");
              System.out.println(itemThree);
              System.out.println(prompt);

              boolean addInventory = scan.nextBoolean(); // scans for true or false value

              if (addInventory == true) { // runs if true
                System.out.println("How many items would you like to add?");
                itemThree = itemThree + scan.nextInt(); // adds the next int input to the current
                                                        // inventory of
                // item one
                inventoryValueThree = itemThree * COST_THREE; // multiplies the inventory of item
                                                              // one by
                // the
                // product
                // cost
                System.out.print("The available inventory for item 3 is now ");
                System.out.println(itemThree);
                System.out.print("The current inventory value of item 3 is $");
                System.out.println(inventoryValueThree);

                totals(inventoryValueOne, inventoryValueTwo, inventoryValueThree);

              } else // runs if false
                System.out.println("How many items would you like to subtract");
              itemThree = itemThree - scan.nextInt(); // subtracts the next int input from the
                                                      // current
              // inventory
              // of item one
              inventoryValueThree = itemThree * COST_THREE; // multiplies the inventory of item one
                                                            // by the
              // product
              // cost
              System.out.print("The available inventory for item 3 is now ");
              System.out.println(itemThree);
              System.out.print("The current inventory value of item 3 is $");
              System.out.println(inventoryValueThree);

              totals(inventoryValueOne, inventoryValueTwo, inventoryValueThree);
              break;

          }
        } else {
          System.out.println("Access Denied");

        }
      }

      while (compared == 0);
    }
  }
}

