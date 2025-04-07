package abstract_class.proj_carros;

public class Celta extends Carro {
    private int max_vel = 100;
    public Celta(String name, String color, int autonomy) {
        super(name, color, autonomy);
    }

    @Override
    void acelerar(int tempo) {
        velocity = init_vel;
        for (int i = 0; i < tempo;i++){
            velocity += 5;
            if (velocity <= max_vel) {
                velocity = init_vel + tempo * 10;
            }
            else{
                System.out.println("O carro atingiu a velocidade máxima");
            }
        }

    }
    @Override
    void acelerar(int tempo, int curr_vel){
        velocity = curr_vel;
        for (int i = 0; i < tempo; i++){
            velocity += 5;if (velocity <= max_vel) {
                velocity = init_vel + tempo * 10;
            }
            else{
                System.out.println("O carro atingiu a velocidade máxima");
                break;
            }
        }
    }
}
