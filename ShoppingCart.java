import java.util.ArrayList;

public class ShoppingCart {

//fields
   private String customerName;
   private String currentDate;
   private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

//constructor
   public ShoppingCart() {
   
      customerName = "none";
      currentDate = "January 1, 2016";
   
   }

//Parameterized constructor
   public ShoppingCart(String name, String date) {
   
      customerName = name;
      currentDate = date;
   }


//Getter methods
   public String getCustomerName() {
   
      return customerName;
   }

   public String getDate() {
   
      return currentDate;
   }

   public void addItem(ItemToPurchase x) {
      cartItems.add(x);
   }

//removeItem
   public void removeItem(String itemName) {
      int i = 0;
      boolean found = false;
      for(i = 0; i < cartItems.size(); i++){
         if(cartItems.get(i).getName().equals(itemName)){
            cartItems.remove(i);
            found = true;
                    
         }            
      }
      if (!found) {
         System.out.println("Item not found in cart. Nothing removed.");
      } 
   }

//modifyItem
   public void modifyItem(ItemToPurchase item) {
      boolean found = false;
   
      for (int i = 0; i < cartItems.size(); i++)
      {
         if(cartItems.get(i).getName().equals(item.getName()))
         {
            if( !cartItems.get(i).hasDefaultValues())
            {
               cartItems.get(i).setQuantity(item.getQuantity());
               found = true;
            }   
         }   
      }   
   
      if(!found)
      {
         System.out.println("Item not found in cart. Nothing modified.");
      }
   }

//getNumItemsInCart
   public int getNumItemsInCart() {
      int totalItems = 0;
      for(int i = 0; i < cartItems.size(); i++)
      {
         totalItems += cartItems.get(i).getQuantity();
      }
      return totalItems;
   }

//getCostofCart
   public int getCostOfCart() {
      int total = 0;
      int i = 0;
      int temp = 0;
   
      for (i = 0; i < cartItems.size(); ++i) {
         temp = cartItems.get(i).getPrice() * cartItems.get(i).getQuantity();
         total += temp;
      }
      return total;
   }

//printTotal
   public void printTotal() {
      int i = 0;
      int total = 0;
      
      System.out.println(customerName + "'s Shopping Cart - " + currentDate);
      System.out.println();
      System.out.println("Number of Items: " + getNumItemsInCart());
      
      if (cartItems.size() > 0) {
      
         for (i = 0; i < cartItems.size(); ++i) {
            cartItems.get(i).printItemCost();
         }
         System.out.println();
      }
      
      else {
         System.out.println("SHOPPING CART IS EMPTY");
      }
      System.out.println("Total: $" + getCostOfCart());
   }

//printDescriptions
   public void printDescriptions(){
      int i = 0;
      System.out.println(customerName + "'s Shopping Cart - " + currentDate);
      System.out.println();
      System.out.println("Item Descriptions");
      for (i = 0; i < cartItems.size(); ++i) {
         System.out.println(cartItems.get(i).getName() + ": " + cartItems.get(i).getDescription());
      }
   }


 



}