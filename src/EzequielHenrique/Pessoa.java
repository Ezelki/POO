package EzequielHenrique;

/**
 *
 * @author Ezequiel Henrique
 */
public class Pessoa {

    String nome, sobrenome;
    int idade;
    double peso;
    
    void imprimirPessoa(){
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Sobrenome da pessoa: " + sobrenome);
        System.out.println("Idade da pessoa: " + idade);
        System.out.println("Peso da pessoa: " +peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
