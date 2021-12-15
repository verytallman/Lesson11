package Task2;

import java.util.Objects;

public class Magazine implements Printable{
    private String magazineName;

    public Magazine(String magazineName){
        this.magazineName = magazineName;
    }

    public void print(){
        System.out.println("Название журнала " + magazineName);
}

    public static void printMagazines(Printable[] printables){
        for (Printable print : printables){
            if (print instanceof Magazine){
                print.print();
            }
        }

    }



}

