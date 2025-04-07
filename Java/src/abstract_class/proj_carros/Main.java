package abstract_class.proj_carros;

public class Main {
    public static void main(String[] args) {
        Celta celta = new Celta("Celta","Prata",100);
        celta.acelerar(5);
        celta.show_velocity();
        celta.acelerar(10, celta.getVelocity());
    }
}
