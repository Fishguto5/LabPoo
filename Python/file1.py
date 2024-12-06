class Carro:
    def __init__(self, modelo, cor, ano, dim):
        self.modelo = modelo
        self.cor = cor
        self.ano =  ano
        self.dim = dim
    def mostra_carro(self):
        print(f'O meu carro é {self.modelo}, seu ano é {self.ano}, sua cor é {self.cor} e tem {self.dim} e tem {self.dim} de altura',end="")

class carro_f1(Carro): #exemplo de Herança sendo usada em Python
    def __init__(self, modelo, cor, ano, dim,v_max):
        super().__init__(modelo,cor,ano,dim)
        self.v_max = v_max
    def mostra_carro_f1(self):
        super().mostra_carro()
        print(f' e sua velocidade máxima é de {self.v_max}')
def main():
    red_bull = carro_f1("Red Bull","Azul",2022,1,350)
    red_bull.mostra_carro_f1()
    carro_unicamp = Carro("Peugeot","cinza",2023,1.5)
    carro_unicamp.mostra_carro()

main()
