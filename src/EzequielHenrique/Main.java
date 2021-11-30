package EzequielHenrique;

/**
 *
 * @author Ezequiel Henrique
 */
public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jorge");
        pessoa.setSobrenome("Augusto");
        pessoa.setIdade(32);
        pessoa.setPeso(69.23);

        pessoa.impP();
        
        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setNumPortas(2);
        carro.setPlaca("AAA-0001");
        carro.setTipo("Chevette");
        carro.setDono(pessoa);
        carro.impC();

        pessoa.setCarro(carro);
        pessoa.ligarCarro();
        pessoa.setCambioMarcha(1);
        pessoa.acelerarCarro();
        pessoa.setCambioMarcha(2);
        pessoa.acelerarCarro();
        pessoa.setCambioMarcha(3);
        pessoa.frearCarro();
        pessoa.getCarro().getCambio();

    }

}
