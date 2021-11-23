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

        System.out.println("Cor do carro: " + carro.getCor());
        System.out.println("Número de portas do carro: " + carro.getNumPortas());
        System.out.println("Placa do carro: " + carro.getPlaca());
        System.out.println("Modelo do carro: " + carro.getTipo());

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gustavo");
        pessoa.setSobrenome("Lima");
        pessoa.setIdade(32);
        pessoa.setPeso(69.23);
        
        System.out.println("Nome da pessoa: "+pessoa.getNome());
        System.out.println("Sobrenome da pessoa: "+pessoa.getSobrenome());
        System.out.println("Idade da pessoa: "+pessoa.getIdade());
        System.out.println("Peso da pessoa: "+pessoa.getPeso());
    }

}
