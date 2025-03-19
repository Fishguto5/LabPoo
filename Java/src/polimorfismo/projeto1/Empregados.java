package polimorfismo.projeto1;

import java.util.ArrayList;

public abstract class Empregados {
    abstract int pagamentoMensal();

    public static void main(String[] args) {
        ArrayList<Empregados> time = new ArrayList<>();
        time.add(new EmpregadoMenal(5000,0.7));
        time.add(new Freelancer(4000));
        time.add(new EmpregadoHorista(200,10));
        int custoTotal = 0;
        for(Empregados trabalhador:time){
            custoTotal += trabalhador.pagamentoMensal();
        }
        System.out.println("O custo mensal de todos salários é R$" + custoTotal);
    }
}
