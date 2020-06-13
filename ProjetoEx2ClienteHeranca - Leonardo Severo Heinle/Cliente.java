public class Cliente {

    private int codigoDoCliente;
    private String nome;
    private String profissao;
    
    public Cliente(){
    }
    
    public int getCodigoDoCliente() {
        return this.codigoDoCliente;
    }
        
    public void setCodigoDoCliente(int codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }
    
    public String getNome() {
        return this.nome;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getProfissao() {
        return this.profissao;
    }
        
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public String toString(){
        return "\nTo string cliente"
                +"\nCódigo do cliente: " + this.getCodigoDoCliente()
                +"\nNome: " + this.getNome()
                +"\nProfissão: " + this.getProfissao();
                
    }
        
}