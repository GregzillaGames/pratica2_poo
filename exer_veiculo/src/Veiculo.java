
public class Veiculo {

    public int ano;
    public int quilometragem;
    public String cor;
    public String modelo;

    public Veiculo() {
        //Construtor Padrão
    }

    public Veiculo(int ano, int quilometragem, String cor, String modelo) {
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.cor = cor;
        this.modelo = modelo;

        //Construtor Completo
    }

    public void verificarManutencao(int q) {
        if (q < 25000) {
            System.out.println("\nTudo OK!");
        } else if (q >= 25000 && q <= 75000) {
            System.out.println("\nNecessário realizar uma revisão parcial!");
        } else {
            System.out.println("\nNecessário realizar uma revisão completa!");
        }
    }

    public void mudarCor(String cor) {
        System.out.println("\nTrocando a cor do veículo...");
        this.cor = cor;
    }

    public void exibirCor() {
        System.out.println("\nA cor do carro atualmente é " + cor);

    }

}