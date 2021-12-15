package Task3;

public class Drums implements Instrument{
    String name = "Барабан";
    int размерБарабана;

    public Drums(int размерБарабана) {
        this.размерБарабана = размерБарабана;
    }

    public void play(){
        System.out.println("Сейчас играет "+name+" с размером барабана - "+размерБарабана);
    }
}
