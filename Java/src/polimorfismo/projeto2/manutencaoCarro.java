package polimorfismo.projeto2;

public class manutencaoCarro extends Carros{
    private final int anoCarro;
    private final int valorManutencao;
    private final String dataManutencao;

    public manutencaoCarro(int anoCarro, int valorManutencao, String dataManutencao) {
        this.anoCarro = anoCarro;
        this.valorManutencao = valorManutencao;
        this.dataManutencao = dataManutencao;
    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public int getValorManutencao() {
        return valorManutencao;
    }

    public String getDataManutencao() {
        return dataManutencao;
    }

    int pagemento() {
        return valorManutencao;
    }
}
