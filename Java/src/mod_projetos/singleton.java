package mod_projetos;
import java.util.Scanner;
public class singleton {
    static private singleton Carro = null;
    String cor;
    String marca;
    String modelo;
    int ano;
    int km;
    Scanner v_ano = new Scanner(System.in);
    Scanner v_km = new Scanner(System.in);
    Scanner v_cor = new Scanner(System.in);
    Scanner v_modelo = new Scanner(System.in);
    Scanner v_marca = new Scanner(System.in);
    int f_ano = v_ano.nextInt();
    int f_km = v_km.nextInt();
    String f_cor = v_cor.next();
    String f_modelo = v_modelo.next();
    String f_marca = v_marca.next();

    private singleton() {
        this.ano = f_ano;
        this.cor = f_cor;
        this.marca = f_marca;
        this.modelo = f_modelo;
        this.km = f_km;
    }
    static singleton getInstance(){
        if (Carro == null) //se já tiver algo instanciado nunca criará algo novo, parecendo com uma variável global
            Carro = new singleton();
        return Carro;
    }

    public String cor(){
        return f_cor;
    }

    public String modelo(){
        return f_modelo;
    }

    public String marca(){
        return f_marca;
    }

    public int ano(){
        return f_ano;
    }

    public int km(){
        return f_km;
    }

    public static void main(String[] args) {
        singleton car_fav = singleton.getInstance();
        System.out.println(car_fav);
    }
}
