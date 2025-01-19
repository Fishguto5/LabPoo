package mod_projetos;
import java.lang.Math;
//Esse arquivo está aplicando o padrão de projeto adaptador, para casos da função logarítmica
public class adaptador {
    static double log_natural (double x){
        return Math.log(x);
    }
    static double log_base_5 (double x){
        double y = Math.log10(5);
        return Math.log10(x)/y; //adapta a biblioteca disponível para solucionar o problema
    }
    static double log_any_base (double x, double y){ //logaritmando y e base x
        double f_log = Math.log(y);
        double s_log = Math.log(x);
        return f_log/s_log; //adapta a biblioteca disponível para solucionar o problema
    }
    public static void main(String[] args) {
        System.out.println(log_any_base(2,2)); ;
        System.out.println(log_base_5(25));
        System.out.println(log_any_base(3,81));
        System.out.println(log_natural(10));
    }

}
