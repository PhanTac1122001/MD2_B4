package ThucHanh.ThucHanh3;

public class Category {
    private String categoryId;
    private String categoryName;

    public Category() {
        this.categoryId = "";
        this.categoryName = "";
    }

    public Category(String categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public void display() {
        System.out.println("Category ID: " + this.categoryId);
        System.out.println("Category Name: " + this.categoryName);
    }
}
