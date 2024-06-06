package ThucHanh.ThucHanh3;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category();
        category1.display();


        Category category2 = new Category("C001", "Electronics");
        category2.display();

        Product product1 = new Product();
        product1.display();

        Product product2 = new Product("P001", "Laptop", 999.99, category2);
        product2.display();
    }
}
