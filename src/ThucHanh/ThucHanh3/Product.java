package ThucHanh.ThucHanh3;

public class Product {
    private String productId;
    private String productName;
    private double productPrice;
    private Category category;


    public Product() {

    }

    public Product(String productId, String productName, double productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public void display() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product Price: " + this.productPrice);
        System.out.println("Category:");
        this.category.display();
    }
}
