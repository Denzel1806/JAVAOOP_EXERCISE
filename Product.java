import java.util.ArrayList;

class Product {
    private String name;
    private int quantity;

    
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to inventory.");
    }

    
    public void removeProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                products.remove(product);
                System.out.println(productName + " removed from inventory.");
                return;
            }
        }
        System.out.println("Product not found: " + productName);
    }

    // Check low inventory (quantity <= 5)
    public void checkLowInventory() {
        System.out.println("Low Inventory Products:");
        boolean found = false;

        for (Product product : products) {
            if (product.getQuantity() <= 5) {
                System.out.println("- " + product.getName() + " (Qty: " + product.getQuantity() + ")");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No items are low in stock.");
        }
    }

    // Display all products
    public void displayInventory() {
        System.out.println("\nINVENTORY LIST:");
        for (Product product : products) {
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity());
        }
    }
}

class ProductApp {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addProduct(new Product("Milk", 10));
        inv.addProduct(new Product("Eggs", 4));
        inv.addProduct(new Product("Bread", 3));

        inv.displayInventory();

        System.out.println();
        inv.checkLowInventory();

        System.out.println();
        inv.removeProduct("Eggs");
        inv.displayInventory();
    }
}
