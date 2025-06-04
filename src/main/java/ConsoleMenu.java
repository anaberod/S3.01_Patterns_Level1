import java.util.Scanner;

public class ConsoleMenu {

    private Scanner scanner = new Scanner(System.in);
    private UndoManager undoManager = UndoManager.getInstance();

    public void display () {
        int option;
        do {
            System.out.println("\n----Menu----");
            System.out.println("1. Add order. ");
            System.out.println("2. Undo last order. ");
            System.out.println("3. Show order history. ");
            System.out.println("4. Exit. ");
            System.out.println("Choose an option. ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1-> {
                    System.out.println("Enter order name: ");
                    String name = scanner.nextLine();
                    Order order = new Order(name);
                    undoManager.addOrder(order);
                }
                case 2->undoManager.undoOrder();
                case 3->undoManager.showHistory();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (option !=4);
    }



}
