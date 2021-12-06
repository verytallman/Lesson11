package Converter;

public class KelvinConverter implements Converter{



    @Override
    public double getConvertedValue(double someValue) {
        return someValue + 273.15;
    }
}
