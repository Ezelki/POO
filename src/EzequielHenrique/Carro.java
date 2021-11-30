package EzequielHenrique;

/**
 *
 * @author Ezequiel Henrique
 */
public class Carro {

    private String cor, tipo, placa;
    private int numPortas, cambio;
    Pessoa dono;

    void impC() {
        System.out.println("Cor do carro: " + cor);
        System.out.println("Número de portas do carro: " + numPortas);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Modelo do carro: " + tipo);
        System.out.println("Dono: "+dono);
    }

    void Ligar() {
        System.out.println("Ligando...");
    }

    void Desligar() {
        System.out.println("Desligando...");
    }

    void Acelerar() {
        System.out.println("Vrum Vrum...");
    }

    void Frear() {
        System.out.println("Iiiiiiiii...");
    }
    
    public int getCambio() {
        System.out.println("Marcha: "+this.cambio);
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }
    
    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
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
