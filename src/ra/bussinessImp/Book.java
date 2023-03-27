package ra.bussinessImp;

import ra.bussiness.IBook;

import java.util.Scanner;

public class Book implements IBook,Comparable<Book> {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    Scanner scanner = new Scanner(System.in);

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, float importPrice, float exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData(Scanner sc) {

    }

    @Override
    public void inputData() {
        System.out.println("Nhập Tên Sách: ");
        bookName = scanner.nextLine();
        System.out.println("Nhập Tiêu Đề Sách: ");
        title = scanner.nextLine();
        System.out.println("Nhập Số Trang Sách: ");
        numberOfPages = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Giá Nhập Sách: ");
        importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập Giá Bán Sách: ");
        exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập Trạng Thái Sách: ");
        bookStatus = Boolean.parseBoolean(scanner.nextLine());
        interest = exportPrice - importPrice;
    }

    @Override
    public void displayData() {
        System.out.println("---------------------------------------");
        System.out.println("Mã Sách: " + bookId);
        System.out.println("Tên Sách: " + bookName);
        System.out.println("Tiêu Đề Sách: " + title);
        System.out.println("Số Trang Sách: " + numberOfPages);
        System.out.println("Giá Nhập Sách: " + importPrice);
        System.out.println("Giá Bán Sách: " + exportPrice);
        System.out.println("Lợi Nhuận Bán Sách: " + interest);
        System.out.println("Trạng thái: " + ((bookStatus) ? "Còn Sách" : "Hết Sách"));
        System.out.println("---------------------------------------");
    }

    @Override
    public int compareTo(Book o) {
        return (int) (o.interest - interest);
    }
}
