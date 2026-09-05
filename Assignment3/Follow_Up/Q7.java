import java.util.Scanner;

class Product {
    int productId;
    String name;
    int quantity;
    double unitPrice;

    
    Product(int productId, String name, int quantity, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
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


public class Q7{
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

        
        System.out.println("\n===== PRODUCT DETAILS =====");

        for (int i = 0; i < n; i++) {
            products[i].display();
        }

       
        int highest = 0;

        for (int i = 1; i < n; i++) {
            if (products[i].inventoryValue() >
                products[highest].inventoryValue()) {
                highest = i;
            }
        }

        System.out.println("===== HIGHEST INVENTORY VALUE =====");
        products[highest].display();
    }
}