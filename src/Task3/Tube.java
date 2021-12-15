package Task3;

public class Tube implements Instrument{
    String name = "Труба";
    int диаметрТрубы;

    public Tube(int диаметрТрубы) {
        this.диаметрТрубы = диаметрТрубы;
    }

    public void play(){
        System.out.println("Сейчас играет "+name+" с диаметром трубы - "+диаметрТрубы+" мм");
    }
}
