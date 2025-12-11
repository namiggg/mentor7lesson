package task2;

public class Book extends Product {
    String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println(author+" "+name+" "+price);
    }
}
