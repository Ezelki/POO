package EzequielHenrique;

/**
 *
 * @author Ezequiel Henrique
 */
public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setNumPortas(2);
        carro.setPlaca("AAA-0000");
        carro.setTipo("Chevette");

        carro.imprimirCarro();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gustavo");
        pessoa.setSobrenome("Lima");
        pessoa.setIdade(32);
        pessoa.setPeso(69.23);

        pessoa.imprimirPessoa();
    }

}
