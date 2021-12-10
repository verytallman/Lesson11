package Task1;

public class Diamond extends FigureBasicClass {
    int a; // a - сторона ромба
    int h; // h - высота

    public Diamond(int СторонаРомба, int Высота) {
        this.a = СторонаРомба;
        this.h = Высота;
    }

    public void perimeterCounter(){
        int s = (int) (a * h);
        System.out.println("Площадь заданого ромба равна "+s+" см2");
    }
}
