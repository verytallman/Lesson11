package Task3;

public class Guitar implements Instrument{
        String name = "Гитара";
        int количествоСтрун;

        public Guitar(int количествоСтрун) {
                this.количествоСтрун = количествоСтрун;
        }

        public void play(){
                System.out.println("Сейчас играет "+name+" с количеством струн - "+количествоСтрун+".");
        }
}
