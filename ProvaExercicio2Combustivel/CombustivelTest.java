import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo Heinle
 * @version 1.0
 * @since 01/06/2020 - 10:28
 * @category Test
 */
public class CombustivelTest {
    
    private Combustivel combustivel = new Combustivel();
    
    /**
     * Construtor default para a classe de teste CombustivelTest
     */
    public CombustivelTest() {
        combustivel.setLitros(10);
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        combustivel.setLitros(2);
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
     * Teste realizado com 2(litros).
     * Segundo teste realizado com 1(litros).
     */
    @Test
    public void testCalcularGasolina() {
        assertEquals(8.98, combustivel.calcularGasolina(), 0.0);
        
        combustivel.setLitros(1);
        assertEquals(4.49, combustivel.calcularGasolina(), 0.0);
    }
    
    /**
     * 
     * Teste realizado com 2(litros).
     * Segundo teste realizado com 1(litros).
     */
    @Test
    public void testCalcularAlcool() {
        assertEquals(7.36, combustivel.calcularAlcool(), 0.0);
        
        combustivel.setLitros(1);
        assertEquals(3.68, combustivel.calcularAlcool(), 0.0);
    }
    
    /**
     * 
     * Teste realizado com 2(litros).
     * Segundo teste realizado com 1(litros).
     */
    @Test
    public void testCalcularDiesel() {
        assertEquals(7.42, combustivel.calcularDiesel(), 0.0);
        
        combustivel.setLitros(1);
        assertEquals(3.71, combustivel.calcularDiesel(), 0.0);
    }
}
