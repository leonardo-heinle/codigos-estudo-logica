public class Principal {
    
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Aluno aluno = new Aluno();
        aluno.setNome("Leo");
        aluno.setTotalDeAulas(2);
        aluno.setNumeroDePresencas(2);
        aluno.setNota1(5);
        aluno.setNota2(5);
        
        System.out.println(aluno);        
        
    } 
}