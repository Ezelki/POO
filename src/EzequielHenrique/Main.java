package EzequielHenrique;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ezequiel Henrique
 */
public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setNumPortas(2);
        carro.setPlaca("AAA-0001");
        carro.setTipo("Chevette");
        
        carro.impC();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jorge");
        pessoa.setSobrenome("Augusto");
        pessoa.setIdade(32);
        pessoa.setPeso(69.23);
        carro.setPessoa(dono);
        pessoa.impP();
        
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
