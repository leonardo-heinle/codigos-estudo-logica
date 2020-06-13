import java.util.Scanner;
/**
 *
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 09:13
 * @category View
 */
public class Principal {
   public static void main(String args[]) {
   
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       Nadador nadador = new Nadador();
       
       System.out.println("Digite seu nome:");
       nadador.setNome(scanner.next());
       
       System.out.println("Digite sua idade:");
       nadador.setIdade(scanner.nextInt());
       System.out.println(nadador);
   }
}
