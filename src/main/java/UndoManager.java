import java.util.Stack;

public class UndoManager {

    private static UndoManager instance;
    private Stack<Order> orders;

    private UndoManager() {
        orders = new Stack<>();
    }

    public static UndoManager getInstance() {
        if (instance==null) {
            instance = new UndoManager();
        }
        return instance;
    }

    public void addOrder(Order order) {
        orders.push(order);
    }

    public void undoOrder() {
        if (!orders.isEmpty()) {
            Order removed =orders.pop();
            System.out.println("Removed order: " + removed);
        }else {
            System.out.println("No orders to undo. ");

            }
        }
        public void showHistory() {
        if (orders.isEmpty()) {
            System.out.println("No orders yet");
        } else {
            System.out.println("Orders history: ");
            for (int i = 0; i < orders.size(); i ++) {
                System.out.println((i + 1) + ". " + orders.get(i));
            }
        }

        }

}
