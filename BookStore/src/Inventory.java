import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Book> inventory;

    public Inventory() {
        this.inventory = new ArrayList<>();
    }

    public Book getBookbyISBN(String ISBN){
        for(Book book :inventory){
            if(book.getISBN()==ISBN){
                return book;
            }
        }
        return null;
    }

    public void addBook(Book book) throws Exception{
        Book bookFound = getBookbyISBN(book.getISBN());
        if(bookFound!=null){
            if(book instanceof paperBook){
                ((paperBook)book).addBook();
            }else{
                throw new Exception("There is already an electronic book with this ISBN");
            }
        }else{
            inventory.add(book);
        }
       
    }

    public double buy(String ISBN,int quantity,String email,String address)throws Exception{
        Book book = getBookbyISBN(ISBN);

        if(book==null){
            throw new Exception("Ther is no book with this ISBN found in the inventory");
        }

        if(book instanceof demoBook){
            throw new Exception("This is a demo book. Demo books are not for sale");
        }

        if(book instanceof paperBook){
            if(((paperBook)book).getStock()<quantity){
                throw new Exception("Quantity requested is not available");
            }else{
                ((paperBook)book).setStock(quantity);
            }
        }

        double price = book.getPrice()*quantity;

        if(book instanceof paperBook){
            //Send Paper book to the ShippingService with the address provided
        }

        if(book instanceof EBook){
            //Send EBook to MailService with the email provided
        }

        return price;
    }


    public void remove(int yearThreshold){
        int currentYear = LocalDate.now().getYear();
        List<Book> booksToRemove = new ArrayList<>();
        for(Book book : inventory){
            if(currentYear-book.getYear()>yearThreshold){
                booksToRemove.add(book);
            }
        }

        for(Book book:booksToRemove){
            inventory.remove(book);
        }
    }

    public void showInventory(){
        System.out.println("Current Inventory List:");
        for(Book book:inventory){
            int quantity =0;
            if(book instanceof paperBook){
                quantity=((paperBook)book).getStock();
            }
            
            System.out.println(book.getISBN()+"  "+ quantity);
        }
        
        System.out.println("-------------------------------");
    }

    
    
    
}
