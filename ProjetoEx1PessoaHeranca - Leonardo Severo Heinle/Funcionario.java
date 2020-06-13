public class Funcionario extends Pessoa {
    
    public int numeroDeRegistro;
    public double salarioFixo;
    
    public Funcionario() {
        super();
    }
    
    public int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getSalarioFixo() {
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public double calcularFGTS() {
        return this.salarioFixo * 0.08;
    }
    
    @Override
    public String toString(){
        return "\nTo string funcionário"
                +"\nNome: Completo: " + this.getNome() + " " 
                + this.getSobrenome()
                +"\nE-Mail: " + this.getEmail()
                +"\nData de Nascimento: " + this.getDataDeNascimento()
                +"\nNúmero de Registro: " + this.getNumeroDeRegistro()
                +"\nSalário Fixo: " + this.getSalarioFixo()
                +"\nValor do FGTS: " + this.calcularFGTS();
                
                
    }
}