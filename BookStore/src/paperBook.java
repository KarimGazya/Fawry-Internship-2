public class paperBook extends Book {

    int stock;

    public paperBook(String ISBN, String title, int year, double price, int stock) {
        super(ISBN, title, year, price);
        this.stock = stock;
    }

    public void addBook(){
        this.stock+=1;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int quantity){
        this.stock-=quantity;
    }
    
    
}
