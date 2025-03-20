package polimorfismo.projeto2;

public class compraCarro extends Carros{
    private final int custoCarro;
    private final String modeloCarro;
    private final int anoCarro;
    private final String corCarro;
    private int taxaCarro;
    private int seguroCarro;

    public compraCarro(int custoCarro, String modeloCarro, int anoCarro, String corCarro, int taxaCarro, int seguroCarro) {
        this.custoCarro = custoCarro;
        this.modeloCarro = modeloCarro;
        this.anoCarro = anoCarro;
        this.corCarro = corCarro;
        this.taxaCarro = taxaCarro;
        this.seguroCarro = seguroCarro;
    }

    public int getCustoCarro() {
        return custoCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public int getAnoCarro() {
        return anoCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public int getTaxaCarro(){
        return taxaCarro;
    }

    public int getSeguroCarro(){
        return seguroCarro;
    }

    int custoTotal(){
        return custoCarro + taxaCarro + seguroCarro;
    }

    int pagemento() {
        return (-1)*custoTotal();
    }
}
