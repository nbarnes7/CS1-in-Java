import java.util.Scanner;

public class ShoppingCartPrinter
{
   public static void main(String[] args) {

//create objects
String itemName1;
String itemName2;
int itemPrice1;
int itemPrice2;
int itemQuantity1;
int itemQuantity2;

ItemToPurchase item1 = new ItemToPurchase();
ItemToPurchase item2 = new ItemToPurchase();

//get info from user for item 1
System.out.println("Item 1");
System.out.println("Enter the item name:");
Scanner scnr = new Scanner(System.in);
itemName1 = scnr.nextLine();
item1.setName(itemName1);

System.out.println("Enter the item price:");
itemPrice1 = scnr.nextInt();
item1.setPrice(itemPrice1);

System.out.println("Enter the item quantity:");
itemQuantity1 = scnr.nextInt();
item1.setQuantity(itemQuantity1);

System.out.println();
scnr.nextLine();

//get info from user for item 2
System.out.println("Item 2");
System.out.println("Enter the item name:");
itemName2 = scnr.nextLine();
item2.setName(itemName2);

System.out.println("Enter the item price:");
itemPrice2 = scnr.nextInt();
item2.setPrice(itemPrice2);

System.out.println("Enter the item quantity:");
itemQuantity2 = scnr.nextInt();
item2.setQuantity(itemQuantity2);

System.out.println();

//calculate total cost
System.out.println("TOTAL COST");
System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + (item1.getQuantity() * item1.getPrice()));
System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + (item2.getQuantity() * item2.getPrice()));

System.out.println();

System.out.println("Total: $" + ((item1.getQuantity() * item1.getPrice()) + (item2.getQuantity() * item2.getPrice())));

   }
}
