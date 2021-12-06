package Converter;

public class App {
    public static void main(String[] args) {


        double temp = 36.6;


        System.out.println("Celsius: " + new CelsiusConverter().getConvertedValue(temp));
        System.out.println("Kelvin: " + new KelvinConverter().getConvertedValue(temp));
        System.out.println("Fahrenheit: " + new FahrenheitConverter().getConvertedValue(temp));

    }
}
