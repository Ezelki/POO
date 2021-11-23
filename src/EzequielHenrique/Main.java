package EzequielHenrique;

/**
 *
 * @author Ezequiel Henrique
 */
public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("Azul","Fusca","AAA-2252",2);
        carro.imprimirCarro();

        Carro carro2 = new Carro();
        carro2.setCor("Azul");
        carro2.setNumPortas(2);
        carro2.setPlaca("AAA-0000");
        carro2.setTipo("Chevette");
        carro2.imprimirCarro();
        
        //Pessoa pessoa = new Pessoa();
        //pessoa.setNome("Gustavo");
        //pessoa.setSobrenome("Lima");
        //pessoa.setIdade(32);
        //pessoa.setPeso(69.23);

        //pessoa.imprimirPessoa();
    }

}
