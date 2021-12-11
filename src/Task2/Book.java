package Task2;

public class Book implements Printable {
    public static String bookName;

    public void print(){
        System.out.println("Название книги "+ bookName);
    }
}
