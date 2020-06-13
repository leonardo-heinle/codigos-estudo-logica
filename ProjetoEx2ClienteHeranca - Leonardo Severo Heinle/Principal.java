public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Cliente cliente = new Cliente();
        
        cliente.setCodigoDoCliente(30296279);
        cliente.setNome("Leonardo");
        cliente.setProfissao("Técnico em informática");
        
        System.out.println(cliente);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        
        pessoaJuridica.setCodigoDoCliente(30296279);
        pessoaJuridica.setNome("Leonardo");
        pessoaJuridica.setProfissao("Técnico");
        pessoaJuridica.setRazaoSocial("Leonardo");
        pessoaJuridica.setCNPJ(123456);
        pessoaJuridica.setInscricaoEstadual(98765);
        pessoaJuridica.setCapitalInicial(6279.94);
        
        System.out.println(pessoaJuridica);
        
        PessoaFisica pessoaFisica = new PessoaFisica();
        
        pessoaFisica.setCodigoDoCliente(30296279);
        pessoaFisica.setNome("Leonardo");
        pessoaFisica.setProfissao("Técnico");
        pessoaFisica.setEstadoCivil("Solteiro");
        pessoaFisica.setCPF(1234567);
        pessoaFisica.setDataDeNascimento("03/04/2000");
        
        System.out.println(pessoaFisica);
    }
}