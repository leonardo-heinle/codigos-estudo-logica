import java.util.Scanner;
/**
 *
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 08:40
 * @category View
 */
public class Principal {
    public static void main(String args[]){
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Trimestre trimestre = new Trimestre();
        
        System.out.println("Digite o número do mês que você nasceu:");
        trimestre.setNumeroDoMes(scanner.nextInt());
        System.out.println(trimestre);
    }
}

