import java.util.ArrayList;
import java.util.Scanner;
 
public class SeatReservation {
   private static Scanner scnr = new Scanner(System.in);
     /*** Methods for ArrayList of Seat objects ***/
   public static void makeSeatsEmpty(ArrayList<Seat> seats) {
      int i = 0;
      for (i = 0; i < seats.size(); ++i) {
         seats.get(i).makeEmpty();
      }
      return;
   }
 
   public static void printSeats(ArrayList<Seat> seats) {
      int i = 0;
      for (i = 0; i < seats.size(); ++i) {
         System.out.print(i + ": ");
         seats.get(i).print();
      }
      return;
   }
 
   public static void addSeats(ArrayList<Seat> seats, int numSeats) {
      int i = 0;
      for (i = 0; i < numSeats; ++i) {
         seats.add(new Seat());
      }
      return;
   }
   
   public static void makeSeatReservations(ArrayList<Seat> seats) {
      String firstName, lastName;
      int amountPaid = 0;
      int seatNumber = 0;
      Seat newSeat;
       
      System.out.println("Enter seat num: ");
      seatNumber = scnr.nextInt();
   
      if ( !(seats.get(seatNumber).isEmpty()) ) {
         System.out.println("Seat not empty.");
      }
      else {
         System.out.println("Enter first name: ");
         firstName = scnr.next();
         System.out.println("Enter last name: ");
         lastName = scnr.next();
         System.out.println("Enter amount paid: ");
         amountPaid = scnr.nextInt();
      
         newSeat = new Seat(); // Create new Seat object
         newSeat.reserve(firstName, lastName, amountPaid); // Set fields
         seats.set(seatNumber, newSeat); // Add new object to ArrayList
      
         System.out.println("Completed.");
      }
   }
   /*** End methods for ArrayList of Seat objects ***/

   public static void main (String [] args) {
      String usrInput = "";
      int seatNumber = 0;
      ArrayList<Seat> allSeats = new ArrayList<Seat>();
   
      // Add 5 seat objects to ArrayList
      addSeats(allSeats, 5);
   
      // Make all seats empty
      makeSeatsEmpty(allSeats);
   
      while (!usrInput.equals("q")) {
      
         System.out.println();
         System.out.println("Enter command (p/r/d/q): ");
         usrInput = scnr.next();
      
         if (usrInput.equals("p")) { // Print seats
            printSeats(allSeats);
         }
         else if (usrInput.equals("r")) { // Reserve seat
            makeSeatReservations(allSeats);
         }
         else if (usrInput.equals("d")) { //delete a reservation
            System.out.println("Enter seat number of reservation to be deleted: ");
            seatNumber = scnr.nextInt();
            allSeats.get(seatNumber).makeEmpty();
         }
         else if (usrInput.equals("q")) { // Quit
            System.out.println("Quitting.");
         }
         else {
            System.out.println("Invalid command.");
         }
      }
   
      return;
   }
}