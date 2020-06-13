public class PessoaFisica extends Cliente {

    public String estadoCivil;
    public int CPF;
    public String dataDeNascimento;
    
    public PessoaFisica() {
        super();
    }
    
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public int getCPF() {
        return this.CPF;
    }
    
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    
    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    @Override
    public String toString(){
        return "\nTo string pessoa fisica"
                +"\nCódigo do cliente: " 
                + this.getCodigoDoCliente()
                +"\nNome: " + this.getNome()
                +"\nProfissão: " + this.getProfissao()
                +"\nEstado Civil: " + this.getEstadoCivil()
                +"\nCPF: " + this.getCPF()
                +"\nData de Nascimento: " 
                + this.getDataDeNascimento();
    }
}