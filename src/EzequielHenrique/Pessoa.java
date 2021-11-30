package EzequielHenrique;

/**
 *
 * @author Ezequiel Henrique
 */
public class Pessoa {

    private String nome, sobrenome;
    private int idade;
    private double peso;
    Carro carro;

    void impP() {
        System.out.println("Nome da pessoa: " + nome);
        System.out.println("Sobrenome da pessoa: " + sobrenome);
        System.out.println("Idade da pessoa: " + idade);
        System.out.println("Peso da pessoa: " + peso);
    }
    
    protected void ligarCarro(){
        carro.Ligar();
    }
    
    protected void desligarCarro(){
        carro.Desligar();
    }
    
    protected void acelerarCarro(){
        carro.Acelerar();
    }
    
    protected void frearCarro(){
        carro.Frear();
    }
    
    protected void setCambioMarcha(int marcha){
        carro.setCambio(marcha);
    }
    
    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
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
