package Task1;

import java.util.SortedMap;

public class Rectangle extends FigureBasicClass{
    int length;
    int width;

    public Rectangle(int Длина, int Ширина) {
        this.length = Длина;
        this.width = Ширина;
    }

    public void perimeterCounter(){
        int s = length * width;
        System.out.println("Площадь заданого прямоугольника равна "+s+" см2.");
    }
}
