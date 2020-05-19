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


import java.util.Scanner; // scanner java utility

public class IntegrationProject {

  public static void main(String[] args) {

    int itemOne = 25; // # of inventory of itemOne
    double inventoryValue = 0; // $ value of inventory
    final double PRODUCTCOST = 24.05; // putting final in front of a variable means it cannot be                                      
    String prompt = "Are you adding (true) or subtracting (false) inventory?";        // changed

    System.out.println("Welcome");
    System.out.print("Your current inventory is ");
    System.out.println(itemOne);
    System.out.println(prompt);

    try (Scanner scan = new Scanner(System.in)) {
      boolean addInventory = scan.nextBoolean(); // scans for true or false value

      if (addInventory == true) { // runs if true
        System.out.println("How many items would you like to add?");
        itemOne = itemOne + scan.nextInt(); // adds the next int input to the current inventory of
                                            // item one
        inventoryValue = itemOne * PRODUCTCOST; // multiplies the inventory of item one by the product
                                                // cost
        System.out.print("The available inventory is now ");
        System.out.println(itemOne);
        System.out.print("The current inventory value is $");
        System.out.println(inventoryValue);
      }
      else // runs if false
        System.out.println("How many items would you like to subtract");
        itemOne = itemOne - scan.nextInt(); // subtracts the next int input from the current inventory
                                           // of item one
    
        inventoryValue = itemOne * PRODUCTCOST; // multiplies the inventory of item one by the product
                                            // cost

        System.out.print("The available inventory is now ");
        System.out.println(itemOne);
        System.out.print("The current inventory value is $");
        System.out.println(inventoryValue);
    }
  }
}


