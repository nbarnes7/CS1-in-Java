import java.util.Scanner;

public class ShoppingCartManager
{

//printMenu
   public static void printMenu(ShoppingCart cart)
   {
      System.out.println("MENU" + '\n' +
                "a - Add item to cart" + '\n' +
                "d - Remove item from cart" + '\n' +
                "c - Change item quantity" + '\n' +
                "i - Output items\' descriptions" + '\n' +
                "o - Output shopping cart" + '\n' +
                "q - Quit" + '\n' + '\n' +
                "Choose an option:");
   }   
    
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String customerName = "";
      String currentDate = "";
      char userInput = ' ';
   
   
      System.out.println("Enter Customer's Name:");
      customerName = scnr.nextLine();
      System.out.println("Enter Today's Date:");
      currentDate = scnr.nextLine();
      System.out.println();
      System.out.println("Customer Name: " + customerName);
      System.out.println("Today's Date: " + currentDate);
      ShoppingCart cart = new ShoppingCart(customerName, currentDate);
      printMenu(cart);
      userInput = scnr.next().charAt(0);
   
   
      while(userInput != 'q')
      {
      
         switch (userInput)
         {
            case 'a':
               System.out.println("ADD ITEM TO CART");
               System.out.println("Enter the item name:");
               scnr.nextLine();
               String itemName = scnr.nextLine();
               System.out.println("Enter the item description:");
               String itemDescription = scnr.nextLine();
               System.out.println("Enter the item price:");
               int itemPrice = scnr.nextInt();
               System.out.println("Enter the item quantity:");
               int itemQuantity = scnr.nextInt();
               cart.addItem(new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity));
               printMenu(cart);
               break;
            case 'd':
               String itemToRemove = "";
               System.out.println("REMOVE ITEM FROM CART");
               System.out.println("Enter name of item to remove:");
               scnr.nextLine();
               itemToRemove = scnr.nextLine();
               cart.removeItem(itemToRemove);
               printMenu(cart);
               break;
            case 'c':
               String name = "";
               int itemQty = 0;
               System.out.println("CHANGE ITEM QUANTITY");
               System.out.println("Enter the item name:");
               scnr.nextLine();
               name = scnr.nextLine();
               System.out.println("Enter the new quantity:");
               itemQty = scnr.nextInt();
               ItemToPurchase item = new ItemToPurchase(name, "none", 0, itemQty);
               cart.modifyItem(item);
               printMenu(cart);
               break;
            case 'i':
               System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
               cart.printDescriptions();
               printMenu(cart);
               break;
            case 'o':
               System.out.println("OUTPUT SHOPPING CART");
               cart.printTotal();
               printMenu(cart);
               break;
            case 'q':
               break;
            default:
               System.out.println("Choose an option:");
               break;
         }  
      
         userInput = scnr.next().charAt(0);
      }  
   
   }

}