public class App {
    public static void main(String[] args) throws Exception {
        Book book1 = new paperBook("A","book1",2019,25,5);
        Book book2 = new EBook("B","book2",2024,30,"PDF");
        Book book3 = new EBook("B","book3",2024,30,"PDF");
        Book book4 = new demoBook("C","book4",2015,40);

        Inventory inventory = new Inventory();

        inventory.addBook(book1);
        inventory.addBook(book2);

        try{
            inventory.addBook(book3);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        inventory.addBook(book4);


        inventory.showInventory();
        inventory.addBook(book1);

        inventory.showInventory();
        try{
            System.out.println(inventory.buy("A",8,"s","s"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(inventory.buy("A",2,"s","s"));

        System.out.println(inventory.buy("B",6,"s","s"));
        
        try{
            System.out.println(inventory.buy("C",6,"s","s"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        inventory.showInventory();

        inventory.remove(9);

        inventory.showInventory();
        
    }
}
