
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 08:21
 * @category Test
 */
public class TrimestreTest {
    
    private Trimestre trimestre = new Trimestre();
    
    /**
     * Construtor default para a classe de teste TrimestreTest
     */
    public TrimestreTest() {
        trimestre.setNumeroDoMes(1);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        trimestre.setNumeroDoMes(1);
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
     * Testes realizados com os números dos meses(numeroDoMes) do ano e mais um mês inválido.
     */  
    @Test
    public void testVerificarMes() {
        assertEquals("1º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(2);
        assertEquals("1º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(3);
        assertEquals("1º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(4);
        assertEquals("2º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(5);
        assertEquals("2º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(6);
        assertEquals("2º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(7);
        assertEquals("3º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(8);
        assertEquals("3º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(9);
        assertEquals("3º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(10);
        assertEquals("4º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(11);
        assertEquals("4º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(12);
        assertEquals("4º Trimestre", trimestre.verificarMes());
        
        trimestre.setNumeroDoMes(13);
        assertEquals("Mês inválido!", trimestre.verificarMes());
    }
}
