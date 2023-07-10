package mycafe;

public class newOrder {
    public static void main(String[] args) {
        // Menu items
        // Order variables -- order1, order2 etc.
        // Application Simulations
        // Use this example code to test various orders' updates
        CoffeeKiosk cafe = new CoffeeKiosk();
        cafe.addMenuItem("water", 5);
        cafe.addMenuItem("coffee", 15);
        cafe.addMenuItem("cappuccino", 10);
        cafe.addMenuItem("milkshake", 70);
        cafe.addMenuItem("sandwich", 80);
        cafe.addMenuItem("drink", 90);

        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter your name:");
        String orderName = System.console().readLine();
        Order order1 = new Order(orderName);

        cafe.displayMenu();

        // Prompts the user to enter an item number
        String itemNumber = "";

        // Write a while loop to collect all user's order items
        while (!itemNumber.equals("q")) {
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            if (itemNumber.equals("q"))
                break;
            int newitem = Integer.parseInt(itemNumber);
            order1.addItem(cafe.getMenu().get(newitem));
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details

        System.out.println("Customer Name: " + order1.getName());
        for (int i = 0; i < order1.getItems().size(); i++) {
            System.out.println(order1.getItems().get(i).getName() + " - " + order1.getItems().get(i).getPrice() + "$ ");
        }
        System.out.println("Total: " + order1.getOrderTotal() + "$ ");

    }
}