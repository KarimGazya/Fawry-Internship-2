public abstract class Book {
    String ISBN;
    String title;
    int year;
    double price;

    public Book(String ISBN, String title, int year,double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price=price;
    }

    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isForSale() {
        return true;
    }
    
    
}
