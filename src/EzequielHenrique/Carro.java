package EzequielHenrique;

/**
 *
 * @author Ezequiel Henrique
 */
public class Carro {

    String cor, tipo, placa;
    int numPortas;
    
    public Carro(){
        System.out.println("Oi");
    }
    public Carro(String cor, String tipo, String placa, int numPortas){
        this.cor = cor;
        this.tipo = tipo;
        this.placa = placa;
        this.numPortas = numPortas;
    }
    void imprimirCarro() {
        System.out.println("Cor do carro: " + cor);
        System.out.println("Número de portas do carro: " + numPortas);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Modelo do carro: " + tipo);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
