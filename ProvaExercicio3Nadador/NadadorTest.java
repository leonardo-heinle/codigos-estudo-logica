
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 09:03
 * @category Test
 */
public class NadadorTest {
    
    private Nadador nadador = new Nadador();
    /**
     * Construtor default para a classe de teste NadadorTest
     */
    public NadadorTest() {
        nadador.setNome("Leo");
        nadador.setIdade(5);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
    }
    
    /**
     * 
     * Teste realizado com 5(idade).
     * Segundo teste realizado com 9(idade).
     * Terceiro teste realizado com 12(idade).
     * Quarto teste realizado com 21(idade).
     */
    @Test
    public void testClassificarNadador() {
        assertEquals("Não pode ser nadador, mínimo 8 anos.",nadador.classificarNadador());
        
        nadador.setIdade(9);
        assertEquals("Infantil",nadador.classificarNadador());
        
        nadador.setIdade(12);
        assertEquals("Juvenil",nadador.classificarNadador());
        
        nadador.setIdade(21);
        assertEquals("Adulto",nadador.classificarNadador());
    }
}
