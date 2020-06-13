public class Principal {

    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Leonaaardo");
        pessoa.setSobrenome("Heinle");
        pessoa.setEmail("contatoplayerx@gmail.com");
        pessoa.setDataDeNascimento("03/04/2000");
        
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getSobrenome());
        System.out.println(pessoa.getEmail());
        System.out.println(pessoa.getDataDeNascimento());
        
        Aluno aluno = new Aluno();
        
        aluno.setNome("Leonardo");
        aluno.setSobrenome("Heinle");
        aluno.setEmail("contatoplayerx@gmail.com");
        aluno.setDataDeNascimento("03/04");
        aluno.setNota1(7);
        aluno.setNota2(6);
        System.out.println(aluno);
        
        Funcionario funcionario = new Funcionario();
        
        funcionario.setNome("Leonardo");
        funcionario.setSobrenome("Heinle");
        funcionario.setEmail("contatoplayerx@gmail.com");
        funcionario.setDataDeNascimento("03/04");
        funcionario.setNumeroDeRegistro(30296279);
        funcionario.setSalarioFixo(1000);
        System.out.println(funcionario);
        
        Professor professor = new Professor();
        
        professor.setNome("Leonardo");
        professor.setSobrenome("Heinle");
        professor.setEmail("contatoplayerx@gmail.com");
        professor.setDataDeNascimento("03/04");
        professor.setNumeroDeRegistro(30296279);
        professor.setNumeroDeHorasTrabalhadas(10);
        professor.setValorHora(10);
        System.out.println(professor);
        
    }

}