public class Damasco extends Fruta {

    @Override
    public String comer() {
        return "sou um atleta de alto nível meu!";
    }
    
    @Override
    public String retirarCasca() {
        return "tem casca não meu patrão";
    }
    
    @Override
    public String toString() {
        return "\nDamasco:"
             +"\nCor: " + this.cor
             + "\nComendo: " + this.comer()
             + "\nRetirando a Casca: " + this.retirarCasca();
    }
}