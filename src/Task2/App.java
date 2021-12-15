package Task2;


//        2. Интерфейс Printable
//        Определить интерфейс Printable, содержащий метод void print().
//        Определить класс Book, реализующий интерфейс Printable.
//        Определить класс Magazine, реализующий интерфейс Printable.
//        Создать массив типа Printable, который будет содержать книги и журналы.
//        В цикле пройти по массиву и вызвать метод print() для каждого объекта.

//        Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.

//        Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг.

//        Используем оператор instanceof.

//        Смотрите решение задачи в https://youtu.be/YQAY9HDdezs.

public class App {
    public static void main(String[] args) {
        Printable Vogue = new Magazine("Vogue");

        Printable Time = new Magazine("Time");

        Printable Idiot = new Book("Idiot by Fedor Dostoevsky");

        Printable It = new Book("It by Steven King");


//        Magazine.printMagazines(Vogue, Time);

        Printable [] printables = {Vogue,Time,Idiot,It};
        for (Printable printable : printables){
            printable.print();
        }

//        Magazine.printMagazines(new Printable[]{Vogue, Time});


    }
}
