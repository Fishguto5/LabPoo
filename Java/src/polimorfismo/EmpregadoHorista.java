package polimorfismo;

public class EmpregadoHorista extends Empregados {
    private int salarioHora;
    private int horasTrabalhadas;

    EmpregadoHorista(int salarioHora, int horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }
    @Override
    int pagamentoMensal() {
        return horasTrabalhadas*salarioHora;
    }
}
