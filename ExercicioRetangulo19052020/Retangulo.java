public class Retangulo {
    private double base;
    private double altura;
    
    public double getBase() {
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularAreaDoRetangulo() {
        return this.base * this.altura; 
    }
    
    public double calcularPerimetroDoRetangulo() {
        return (this.base * 2) + (this.altura * 2);
    }
    
    @Override
    public String toString(){
        return "\nBase: " + this.base
               +"\nAltura: " + this.altura
               +"\nÁrea do Retângulo: " + this.calcularAreaDoRetangulo()
               +"\nPerímetro do Retângulo: " + 
               this.calcularPerimetroDoRetangulo();
    }
}

