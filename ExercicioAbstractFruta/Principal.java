import java.util.Scanner;
public class Principal {
    
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Limao limao = new Limao();
        System.out.println("Limão:");
        System.out.println("Digite a cor da fruta: ");
        limao.setCor(scanner.next()); 
        System.out.println(limao);
        
        Damasco damasco = new Damasco();
        System.out.println("Damasco:");
        System.out.println("Digite a cor da fruta: ");
        damasco.setCor(scanner.next());
        System.out.println(damasco);
        
        Laranja laranja = new Laranja();
        System.out.println("Laranja:");
        System.out.println("Digite a cor da fruta: ");
        laranja.setCor(scanner.next());
        System.out.println(laranja);
        
    }
}