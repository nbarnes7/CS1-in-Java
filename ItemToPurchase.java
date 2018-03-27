public class ItemToPurchase
{

//private fields
   private String itemName = "none";
   private int itemPrice = 0;
   private int itemQuantity = 0;
   private String itemDescription = "none";

//Constructor
   public ItemToPurchase()
   {
      itemName = "none";
      itemPrice = 0;
      itemQuantity = 0;
      itemDescription = "none";
   }

//Parameterized constructor
   public ItemToPurchase(String name, String description, int price, int quantity)
   {
      itemName = name;
      itemPrice = price;
      itemQuantity = quantity;
      itemDescription = description;
   }

// Setter methods
   public void setName(String name)
   {
      itemName = name;
   }

   public void setPrice(int price)
   {
      itemPrice = price;
   }

   public void setQuantity(int quantity)
   {
      itemQuantity = quantity;
   }

   public void setDescription(String description)
   {
      itemDescription = description;
   }

//Getter methods
   public String getName()
   {
      return itemName;
   }
    
   public int getPrice()
   {
      return itemPrice;
   }
    
   public int getQuantity()
   {
      return itemQuantity;
   }

   public String getDescription()
   {
      return itemDescription;
   }

//printItemCost
   public void printItemCost() {
      System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemQuantity * itemPrice));
   }
   
//printItemDescription
   public void printItemDescription() {
      System.out.println(itemName + ": ");
   }
   
// hasDefaultValues
   public boolean hasDefaultValues() {
      return itemName.equals("none") && itemDescription.equals("none") && itemQuantity == 0 && itemPrice == 0;
   }

}
