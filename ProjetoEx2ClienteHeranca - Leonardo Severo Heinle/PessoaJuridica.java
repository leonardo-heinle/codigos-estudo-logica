public class PessoaJuridica extends Cliente {
    
    private String razaoSocial;
    private int CNPJ;
    private int inscricaoEstadual;
    private double capitalInicial;
    
    public PessoaJuridica() {
        super();
    }
    
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public int getCNPJ() {
        return this.CNPJ;
    }
    
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public int getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }
    
    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public double getCapitalInicial() {
        return this.capitalInicial;
    }
    
    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }
    
    @Override
    public String toString(){
        return "\nTo string pessoa juridica"
                +"\nCódigo do cliente: " 
                + this.getCodigoDoCliente()
                +"\nRazão Social: " + this.getRazaoSocial()
                +"\nCNPJ: " + this.getCNPJ()
                +"\nInscrição Estadual: " 
                + this.getInscricaoEstadual()
                +"\nNome: " + this.getNome()
                +"\nCapital Inicial: " + this.getCapitalInicial()
                +"\nProfissão: " + this.getProfissao();
                
    } 
}
