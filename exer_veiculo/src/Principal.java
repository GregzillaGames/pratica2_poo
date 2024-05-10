
public class Principal {
    public static void main(String[] args) {

        Veiculo v = new Veiculo(2005, 28902, "Branco", "Opala");

        v.verificarManutencao(v.quilometragem);
        v.exibirCor();
        v.mudarCor("Digite aqui a nova cor do carro");
        v.exibirCor();

    }
}