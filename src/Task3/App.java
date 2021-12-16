package Task3;

//        3. Интерфейс Инструмент
//        Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//        Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
//        Гитара содержит переменные класса количествоСтрун,  Барабан - размер, Труба - диаметр.
//        Создать массив типа Инструмент, содержащий инструменты разного типа.
//        В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент, с такими-то характеристиками".

public class App {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(5);
        Instrument drums = new Drums(7);
        Instrument tube = new Tube(123);


        Instrument [] instruments = new Instrument[]{guitar,drums,tube};
        for (Instrument instrument : instruments){
            instrument.play();
        }

    }
}
