package Converter;

public class FahrenheitConverter implements Converter{

    @Override
    public double getConvertedValue(double someValue) {
        return 1.8 * someValue + 32;
    }
}
