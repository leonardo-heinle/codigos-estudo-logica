/**
 * @author Leonardo Heinle 
 * @version 1.0 27/05/2020
 */
public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double totalDeAulas;
    private double numeroDePresencas;
    
    public Aluno() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getTotalDeAulas() {
        return this.totalDeAulas;
    }
    
    public void setTotalDeAulas(double totalDeAulas) {
        this.totalDeAulas = totalDeAulas;
    }
    
    public double getNumeroDePresencas() {
        return this.numeroDePresencas;
    }
    
    public void setNumeroDePresencas(double numeroDePresencas) {
        this.numeroDePresencas = numeroDePresencas;
    }
    
    /**
     * @return Retorna a frequência do aluno em porcentagem.
     */
    public double calcularFrequencia() {
        return (this.numeroDePresencas / this.totalDeAulas) * 100;
    }
    
    /**
     * @return Retorna a média aritmética das notas.
     */
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nNota 1: " + this.nota1
             + "\nNota 2: " + this.nota2
             + "\nMédia: " + this.calcularMediaAritmetica()
             + "\nFrequência: " + this.calcularFrequencia();
    }
}