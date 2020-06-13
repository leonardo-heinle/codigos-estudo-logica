import java.util.Scanner;
/**
 *
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 10:42
 * @category View
 */
public class Principal {
   public static void main(String args[]) {
   
       System.out.println("\f");
       
       Scanner scanner = new Scanner(System.in);
       
       Combustivel combustivel = new Combustivel();     
       
       System.out.println("Digite o número de litros desejado:");
       combustivel.setLitros(scanner.nextDouble());
       
       System.out.println(combustivel);
       
   }
}
