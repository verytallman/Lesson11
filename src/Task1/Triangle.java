package Task1;

public class Triangle extends FigureBasicClass{
    int b; // b - основание треугольника
    int h; // h - высота

    public Triangle(int ОснованиеТреугольника, int Высота) {
        this.b = ОснованиеТреугольника;
        this.h = Высота;
    }

    public void perimeterCounter(){
        int s = (int) (0.5 * b * h);
        System.out.println("Площадь заданого треугольника равна "+s+" см2");
    }

}
