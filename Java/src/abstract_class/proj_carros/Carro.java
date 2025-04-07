package abstract_class.proj_carros;

public abstract class Carro {
    private String name;
    private String color;
    private int autonomy;
    static int init_vel = 0;
    protected int velocity;

    public Carro(String name, String color, int autonomy) {
        this.name = name;
        this.color = color;
        this.autonomy = autonomy;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAutonomy() {
        return autonomy;
    }

    public int getVelocity(){
        return velocity;
    }

    public void setAutonomy(int autonomy) {
        this.autonomy = autonomy;
    }

    abstract void acelerar(int tempo);
    abstract void acelerar(int tempo, int init_vel);

    void show_details(){
        System.out.println("O modelo do carro é" + getName()+"\n");
        System.out.println("A cor do carro é" + getColor()+"\n");
        System.out.println("A autonomia do carro é" + getAutonomy()+"\n");
    }

    void show_velocity(){
        System.out.println("A velocidade do carro agora é " + getVelocity()+"\n");
    }



}
