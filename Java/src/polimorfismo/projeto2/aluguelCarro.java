package polimorfismo.projeto2;

public class aluguelCarro extends Carros{
    private final String nomeLocator;
    private final  int diasAluguel;
    private final String modeloCarro;
    private final int anoCarro;
    private final int custoDiaria;


    public aluguelCarro(int diasAluguel, String modeloCarro, int anoCarro, int custoDiaria,String nomeLocator) {
        this.diasAluguel = diasAluguel;
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
        this.custoDiaria = custoDiaria;
        this.nomeLocator = nomeLocator;
    }

    public int getDiasAluguel() {
        return diasAluguel;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public int getCustoDiaria() {
        return custoDiaria;
    }

    public String getNomeLocator(){
        return nomeLocator;
    }

    int pagemento() {
        return diasAluguel*custoDiaria;
    }
}
