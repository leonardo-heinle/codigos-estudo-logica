public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Animal animal = new Animal();
        
        animal.setNome("Darius");
        animal.setIdade(1);
        
        System.out.println(animal.getNome());
        System.out.println(animal.getIdade());
        
        Gato gato = new Gato();
        
        gato.setNome("Darius");
        gato.setIdade(2);
        gato.setPesoEmQuilos(2);
        gato.setRaca("SRD");
        gato.setPoderDeLuta(8000);
        
        System.out.println(gato);
        
        Cachorro cachorro = new Cachorro();
        
        cachorro.setNome("Darius");
        cachorro.setIdade(2);
        cachorro.setCorDoPelo("Marrom");
        cachorro.setComprimentoEmMetro(1.5);
        cachorro.setPorte("Grande");
        
        System.out.println(cachorro);
    }
}