package Task2;

import java.util.Objects;

public class Magazine implements Printable {
    private String magazineName;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public void print() {
        System.out.println("Название журнала " + magazineName);
    }

//    public static boolean printMagazines(Printable[] printable) {
//        if (printable instanceof Magazine) {
//            System.out.println("true");
//        }
//        return false;
//    }
}
