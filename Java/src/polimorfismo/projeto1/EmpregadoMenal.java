package polimorfismo.projeto1;

public class EmpregadoMenal extends Empregados {
    private int salarioMensal;
    private double encargosTrabalhistas;
    EmpregadoMenal(int salarioMensal, double encargosTrabalhistas){
        this.salarioMensal = salarioMensal;
        this.encargosTrabalhistas = encargosTrabalhistas;
    }
    @Override
    int pagamentoMensal() {
        return (int) ((int) salarioMensal*(1+encargosTrabalhistas));
    }
}
