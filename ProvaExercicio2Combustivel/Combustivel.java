/**
 *
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 09:25
 * @category Model
 */
public class Combustivel {
    
    private double litros;
    
    public Combustivel() {
    }
    
    public double getLitros() {
        return this.litros;
    }
    
    public void setLitros(double litros) {
        this.litros = litros;
    }
    
    /**
     * @return Retorna o valor total de litros vezes o preço da gasolina.
     * 
     */
    public double calcularGasolina() {
        return this.litros * 4.49;
    }
    
    /**
     * @return Retorna o valor total de litros vezes o preço do alcool.
     * 
     */
    public double calcularAlcool() {
        return this.litros * 3.68;
    }
    
    /**
     * @return Retorna o valor total de litros vezes o preço do diesel.
     * 
     */
    public double calcularDiesel() {
        return this.litros * 3.71;
    }
    
    @Override
    public String toString() {
        return "\nQuantidade de litros: " + this.litros
             + "\nValor total em Gasolina: " + this.calcularGasolina()
             + "\nValor total em Álcool: " + this.calcularAlcool()
             + "\nValor total em Diesel: " + this.calcularDiesel();
    }
    
}