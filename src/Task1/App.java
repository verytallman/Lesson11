package Task1;

//1.      Сделать иерархию по геометрическим фигурам(базовый класс фигура)
//        абстрактные методы вычисления площади/периметра и конкретные классы треугольник,
//        прямоугольник и т.д.
//        (минимум 3 класса реализующие этот интерфейс)
//

public class App {
    public static void main(String[] args) {
        FigureBasicClass triangle = new Triangle(6,6);
        triangle.perimeterCounter();

        FigureBasicClass square = new Rectangle(5,5);
        square.perimeterCounter();

        FigureBasicClass diamond = new Diamond(5,5);
        diamond.perimeterCounter();

    }
}
