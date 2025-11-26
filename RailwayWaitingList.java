import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RailwayWaitingList {
    public static void main(String[] args) {

        Queue<String> waitingList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Railway Waiting List System =====");
            System.out.println("1. Add Passenger to Waiting List");
            System.out.println("2. Confirm Ticket for Next Passenger");
            System.out.println("3. View Waiting List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter passenger name: ");
                    String name = sc.nextLine();
                    waitingList.add(name);
                    System.out.println(name + " added to waiting list.");
                    break;

                case 2:
                    if (waitingList.isEmpty()) {
                        System.out.println("Waiting list is empty. No passengers to confirm.");
                    } else {
                        String confirmed = waitingList.poll();
                        System.out.println("Ticket confirmed for: " + confirmed);
                    }
                    break;

                case 3:
                    if (waitingList.isEmpty()) {
                        System.out.println("Waiting list is empty.");
                    } else {
                        System.out.println("Current Waiting List: " + waitingList);
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
