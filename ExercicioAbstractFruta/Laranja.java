public class Laranja extends Fruta {

    @Override
    public String comer() {
        return "azedo e doce";
    }
    
    @Override
    public String retirarCasca() {
        return "sem tempo irmão, como com casca mesmo!";
    }
    
    @Override
    public String toString() {
        return "\nLaranja:"
             +"\nCor: " + this.cor
             + "\nComendo: " + this.comer()
             + "\nRetirando a Casca: " + this.retirarCasca();
    }
}