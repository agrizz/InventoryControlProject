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
import java.util.Random;

public class IntegrationProject {

  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      int itemOne = 25; // # of inventory of itemOne
      int itemTwo = 20;
      int itemThree = 15;
      double inventoryValue = 0; // $ value of inventory
      Random rand = new Random();
      final double COST_ONE = 24.05; // putting final in front of a variable means it cannot be
      final double COST_TWO = 15.92;
      final double COST_THREE = 28.67;
      String prompt = "Are you adding (true) or subtracting (false) inventory?"; // changed
      String correctPassword = "CTG";
      String websites[] = {"eBay", "Mercari", "Amazon"};
      

      System.out.println("Welcome");
      System.out.println("This promgram will keep track of inventory for the following sites");
      
      for(String siteList:websites) {
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
        
        switch(item) {
          
          case 1 :
        
            System.out.print("Your current inventory is ");
            System.out.println(itemOne);
            System.out.println(prompt);
    
            boolean addInventoryOne = scan.nextBoolean(); // scans for true or false value
    
            if (addInventoryOne == true) { // runs if true
              System.out.println("How many items would you like to add?");
              itemOne = itemOne + scan.nextInt(); // adds the next int input to the current inventory of
                                                  // item one
              inventoryValue = itemOne * COST_ONE; // multiplies the inventory of item one by the
                                                      // product
                                                      // cost
              System.out.print("The available inventory is now ");
              System.out.println(itemOne);
              System.out.print("The current inventory value is $");
              System.out.println(inventoryValue);
           
            } else // runs if false
              System.out.println("How many items would you like to subtract");
            itemOne = itemOne - scan.nextInt(); // subtracts the next int input from the current
                                                // inventory
                                                // of item one
            inventoryValue = itemOne * COST_ONE; // multiplies the inventory of item one by the
                                                    // product
            // cost
            System.out.print("The available inventory is now ");
            System.out.println(itemOne);
            System.out.print("The current inventory value is $");
            System.out.println(inventoryValue);
            
          case 2 :
            
            System.out.print("Your current inventory is ");
            System.out.println(itemTwo);
            System.out.println(prompt);
    
            boolean addInventoryTwo = scan.nextBoolean(); // scans for true or false value
    
            if (addInventoryTwo == true) { // runs if true
              System.out.println("How many items would you like to add?");
              itemTwo = itemTwo + scan.nextInt(); // adds the next int input to the current inventory of
                                                  // item one
              inventoryValue = itemTwo * COST_TWO; // multiplies the inventory of item one by the
                                                      // product
                                                      // cost
              System.out.print("The available inventory is now ");
              System.out.println(itemTwo);
              System.out.print("The current inventory value is $");
              System.out.println(inventoryValue);
           
            } else // runs if false
              System.out.println("How many items would you like to subtract");
            itemTwo = itemTwo - scan.nextInt(); // subtracts the next int input from the current
                                                // inventory
                                                // of item one
            inventoryValue = itemTwo * COST_TWO; // multiplies the inventory of item one by the
                                                    // product
            // cost
            System.out.print("The available inventory is now ");
            System.out.println(itemTwo);
            System.out.print("The current inventory value is $");
            System.out.println(inventoryValue);
            
          case 3 :
            
            System.out.print("Your current inventory is ");
            System.out.println(itemThree);
            System.out.println(prompt);
    
            boolean addInventory = scan.nextBoolean(); // scans for true or false value
    
            if (addInventory == true) { // runs if true
              System.out.println("How many items would you like to add?");
              itemThree = itemThree + scan.nextInt(); // adds the next int input to the current inventory of
                                                  // item one
              inventoryValue = itemThree * COST_THREE; // multiplies the inventory of item one by the
                                                      // product
                                                      // cost
              System.out.print("The available inventory is now ");
              System.out.println(itemThree);
              System.out.print("The current inventory value is $");
              System.out.println(inventoryValue);
           
            } else // runs if false
              System.out.println("How many items would you like to subtract");
            itemThree = itemThree - scan.nextInt(); // subtracts the next int input from the current
                                                // inventory
                                                // of item one
            inventoryValue = itemThree * COST_THREE; // multiplies the inventory of item one by the
                                                    // product
            // cost
            System.out.print("The available inventory is now ");
            System.out.println(itemThree);
            System.out.print("The current inventory value is $");
            System.out.println(inventoryValue);
        }
      } else
        System.out.println("Access Denied");
    }
  }
}


