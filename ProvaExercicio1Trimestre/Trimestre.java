/**
 * 
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 08:12
 * @category Model
 */
public class Trimestre {
    
    private int numeroDoMes;
    
    public Trimestre() {
    }

    public int getNumeroDoMes() {
        return this.numeroDoMes;
    }
    
    public void setNumeroDoMes(int numeroDoMes) {
        this.numeroDoMes = numeroDoMes;
    }
    
    /**
     * @return Retorna o trimestre conforme o número do mês.
     */ 
    public String verificarMes() {
        switch(this.numeroDoMes) {
            case 1: return "1º Trimestre";
            case 2: return "1º Trimestre";
            case 3: return "1º Trimestre";
            case 4: return "2º Trimestre";
            case 5: return "2º Trimestre";
            case 6: return "2º Trimestre";
            case 7: return "3º Trimestre";
            case 8: return "3º Trimestre";
            case 9: return "3º Trimestre";            
            case 10: return "4º Trimestre";
            case 11: return "4º Trimestre";
            case 12: return "4º Trimestre";            
            default: return "Mês inválido!";
        }
    }
    
    @Override
    public String toString() {
        return "\nMês que você nasceu: " + this.numeroDoMes
             + "\nTrimestre que você nasceu: " + this.verificarMes();
    }
}