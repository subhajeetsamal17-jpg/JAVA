import java.util.Scanner;

class Product {
    int productId;
    String name;
    int quantity;
    double unitPrice;

   
    static String storeName;
    static double gstPercentage;
    static int totalProducts;

    
    static {
        storeName = "Puchu Store";
        gstPercentage = 18.0;
        totalProducts = 0;
    }

    
    Product(int productId, String name, int quantity, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;

        totalProducts++;
    }

    
    double inventoryValue() {
        return quantity * unitPrice;
    }

    
    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Inventory Value: " + inventoryValue());
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter Unit Price: ");
            double price = sc.nextDouble();

            products[i] = new Product(id, name, quantity, price);
        }

        
        double totalValue = 0;

        int highest = 0;

        for (int i = 0; i < n; i++) {

            totalValue = totalValue + products[i].inventoryValue();

            if (products[i].inventoryValue() >
                products[highest].inventoryValue()) {
                highest = i;
            }
        }

        
        double averageValue = totalValue / Product.totalProducts;

        
        System.out.println("\n===== STORE INFORMATION =====");
        System.out.println("Store Name: " + Product.storeName);
        System.out.println("GST Percentage: " + Product.gstPercentage + "%");
        System.out.println("Total Number of Products: "
                + Product.totalProducts);

        
        System.out.println("\n===== MOST VALUABLE PRODUCT =====");
        products[highest].display();

        
        System.out.println("Total Inventory Value: " + totalValue);
        System.out.println("Average Product Value: " + averageValue);
    }
}