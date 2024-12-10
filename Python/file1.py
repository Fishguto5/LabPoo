class Carro:
    def __init__(self,marca,ano,cor):
        self.marca = marca
        self.ano = ano
        self.cor = cor
    def imprime_carro(self):
        print(f'O modelo do seu carro é {self.marca}, sua cor é {self.cor} e seu ano de lançamento é {self.ano}')

class Carro_f1(Carro): #uso de herança
    def __init__(self, marca, ano, cor, v_max):
        super().__init__(marca, ano, cor)
        self.v_max = v_max
    def imprime_carro_f1(self):
        print(f'A escuderia do seu carro de fórmula 1 é {self.marca}, o ano de fabricação é {self.ano}, sua cor é {self.cor} e sua velocidade máxima é {self.v_max}')

def main():
    carro_urbano =  Carro("Peugeot",2024,"cinza")
    carro_urbano.imprime_carro()
    print()
    carro_f1 = Carro_f1("Red Bull",2022,"azul",450)
    carro_f1.imprime_carro_f1()

main()