package polimorfismo.projeto1;

public class Freelancer extends Empregados {
    private int costService;
    Freelancer(int costService){
        this.costService = costService;
    }
    @Override
    int pagamentoMensal() {
        return costService;
    }
}
