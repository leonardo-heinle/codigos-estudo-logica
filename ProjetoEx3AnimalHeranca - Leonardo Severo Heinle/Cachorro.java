public class Cachorro extends Animal {
    
    private String corDoPelo;
    private double comprimentoEmMetro;
    private String porte;
    
    public Cachorro() {
        super();
    }
    
    public String getCorDoPelo() {
        return this.corDoPelo;
    }
    
    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
    
    public double getComprimentoEmMetro() {
        return this.comprimentoEmMetro;
    }
    
    public void setComprimentoEmMetro(double comprimentoEmMetro) {
        this.comprimentoEmMetro = comprimentoEmMetro;
    }
    
    public String getPorte() {
        return this.porte;
    }
    
    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    public double converterComprimentoDeMetroParaJarda() {
        return this.comprimentoEmMetro * 1.094;
    }
    
    public double converterComprimentoDeMetroParaPes() {
        return this.comprimentoEmMetro * 3.281;
    }
    
    @Override
    public String toString(){
        return "\nTo string Cachorro"
                +"\nNome: " + this.getNome()
                +"\nIdade: " + this.getIdade()
                +"\nCor da Pelagem: " + this.getCorDoPelo()
                +"\nComprimento em Metros: " + this.getComprimentoEmMetro()
                +"\nComprimento em Jardas: " 
                + this.converterComprimentoDeMetroParaJarda()
                +"\nComprimento em Pés: " 
                + this.converterComprimentoDeMetroParaPes();
    }
}