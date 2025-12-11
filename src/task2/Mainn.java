package task2;

public class Mainn {
    public static void main(String[] args) {
        Book book = new Book("Idiot",30,"Dostoyevski");
        Electronic elec= new Electronic("watch",850,"apple");

        System.out.println("20% endirim tetbiq olunub");
        book.applyDiscount(20);
        elec.applyDiscount(20);
        book.displayInfo();
        elec.displayInfo();
    }
}
