public class Calculadora implements CalculadoraInterface {
    
    private double numero1;
    private double numero2;
    
    public Calculadora() {
    }
    
    public double getNumero1() {
        return this.numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return this.numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    @Override
    public double somar(){
        return this.numero1 + this.numero2;
    }
    
    @Override
    public double subtrair(){
        return this.numero1 - this.numero2;
    }
    
    @Override
    public double multiplicar(){
        return this.numero1 * this.numero2;
    }
    
    @Override
    public double dividir(){
        return this.numero1 / this.numero2;
    }
    
    @Override
    public String toString() {
        return "\nNúmero 1: " + this.numero1
             + "\nNúmero 2: " + this.numero2
             + "\nSoma: " + this.somar()
             + "\nSubtração: " + this.subtrair()
             + "\nMultiplicação: " + this.multiplicar()
             + "\nDivisão: " + this.dividir();
    }
}