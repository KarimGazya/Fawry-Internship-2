public class EBook extends Book  {
    String fileType;

    public EBook(String ISBN, String title, int year, double price, String fileType) {
        super(ISBN, title, year, price);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

}
