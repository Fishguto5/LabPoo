package polimorfismo.projeto2;

import java.util.HashMap;

public abstract class Carros {

    public static void main(String[] args) {
        HashMap<Carros, Integer> carros = new HashMap<>();
        vendaCarro c1 = new vendaCarro(60000,"Jesé","João","10/10/2010");
        carros.put(c1,c1.pagemento());
        aluguelCarro c2 = new aluguelCarro(30,"Tesla Testa",2024,1000,"Bob Esponja");
        carros.put(c2,c2.pagemento());
        compraCarro c3 = new compraCarro(100000,"Aston Martin",2025,"Verde",20000,10000);
        carros.put(c3,(-1)*c3.pagemento());
        manutencaoCarro c4 = new manutencaoCarro(2018,15000,"10/10/2020");
        carros.put(c4,c4.pagemento());
        int custoMensal = c1.pagemento() + c2.pagemento() + c3.pagemento() + c4.pagemento();
        System.out.println("O relatório financeiro da empresa está em: R$" + custoMensal);
    }
}
