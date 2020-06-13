public class Gato extends Animal {

    private double pesoEmQuilos;
    private String raca;
    private double poderDeLuta;
    
    public Gato() {
        super();
    }
    
    public double getPesoEmQuilos() {
        return this.pesoEmQuilos;
    }
    
    public void setPesoEmQuilos(double pesoEmQuilos) {
        this.pesoEmQuilos = pesoEmQuilos;
    }
    
    public String getRaca() {
        return this.raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public double getPoderDeLuta() {
        return this.poderDeLuta;
    }
    
    public void setPoderDeLuta(double poderDeLuta) {
        this.poderDeLuta = poderDeLuta;
    }
    
    public double converterQuiloParaLibra() {
        return this.pesoEmQuilos * 2.20462;
    }
    
    public double converterQuiloParaGrama() {
        return this.pesoEmQuilos * 1000;
    }
    
    @Override
    public String toString(){
        return "\nTo string gato"
                +"\nNome : " + this.getNome()
                +"\nIdade : " + this.getIdade()
                +"\nPeso em Quilos: " + this.getPesoEmQuilos()
                +"\nPeso em Gramas: " + this.converterQuiloParaGrama()
                +"\nPeso em Libras: " + this.converterQuiloParaLibra()
                +"\nRaça: " + this.getRaca()
                +"\nPoder de luta: " + this.getPoderDeLuta();       
    }
}