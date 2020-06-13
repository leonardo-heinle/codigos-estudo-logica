public class Limao extends Fruta {

    @Override
    public String comer() {
        return "azedo demais meeeu";
    }
    
    @Override
    public String retirarCasca() {
        return "Fatiou, passou e a casca acabou";
    }
    
    @Override
    public String toString() {
        return "\nLimão:"
             +"\nCor: " + this.cor
             + "\nComendo: " + this.comer()
             + "\nRetirando a Casca: " + this.retirarCasca();
    }
}