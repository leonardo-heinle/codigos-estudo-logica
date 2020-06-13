/**
 *
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 08:55
 * @category Model
 */
public class Nadador {
    
    private String nome;
    private int idade;
    
    public Nadador() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * @return Retorna a categoria conforme a idade do nadador
     */  
    public String classificarNadador() {
        if(idade < 8) {
            return "Não pode ser nadador, mínimo 8 anos.";
        } else if(idade >= 8 && idade <= 10) {
            return "Infantil";
        } else if(idade >= 11 && idade <= 17) {
            return "Juvenil";
        }
        return "Adulto";
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nCategoria: " + this.classificarNadador();
    }
    
}