package polimorfismo.projeto2;

public class vendaCarro extends Carros{
    private final int valorVenda;
    private final String nomeComprador;
    private final String nomeVendedor;
    private final String dataVenda;

    public vendaCarro(int valorVenda, String nomeComprador, String nomeVendedor, String dataVenda) {
        this.valorVenda = valorVenda;
        this.nomeComprador = nomeComprador;
        this.nomeVendedor = nomeVendedor;
        this.dataVenda = dataVenda;
    }

    public int getValorVenda() {
        return valorVenda;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    int pagemento() {
        return valorVenda;
    }
}
