public class Professor extends Pessoa {

    public int numeroDeRegistro;
    public int numeroDeHorasTrabalhadas;
    public double valorHora;
    
    public Professor() {
        super();
    }
    
    public int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public int getNumeroDeHorasTrabalhadas() {
        return this.numeroDeHorasTrabalhadas;
    }
    
    public void setNumeroDeHorasTrabalhadas(int numeroDeHorasTrabalhadas) {
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
    }
    
    public double getValorHora() {
        return this.valorHora;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calcularSalarioBruto() {
        return this.numeroDeHorasTrabalhadas * this.valorHora;
    }
    
    public double calcularFGTS() {
        return this.calcularSalarioBruto() * 0.08;
    }
    
    @Override
    public String toString(){
        return "\nTo string Professor"
                +"\nNome: Completo: " + this.getNome() + " " 
                + this.getSobrenome()
                +"\nE-Mail: " + this.getEmail()
                +"\nData de Nascimento: " + this.getDataDeNascimento()
                +"\nNúmero de Registro: " + this.getNumeroDeRegistro()
                +"\nNúmero de Horas trabalhadas: " 
                + this.getNumeroDeHorasTrabalhadas()
                +"\nValor Hora: " + this.getValorHora()
                +"\nSalário Bruto: " + this.calcularSalarioBruto()
                +"\nValor do FGTS: " + this.calcularFGTS();
                
                
    }
    
}