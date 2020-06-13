import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste MesTest.
 *
 * @author  Leonardo Heinle
 * @version 1.0 31/05/2020
 */
public class MesTest
{
    
    Mes mes = new Mes();
    
    public MesTest(){
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp(){
        mes.setNumero(1);
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown(){
    }
    
    @Test
    public void testVerificarMes() {
        mes.setNumero(2);
        assertEquals("Fevereiro", mes.verificarMes());
        
        mes.setNumero(3);
        assertEquals("Março", mes.verificarMes());
        
        mes.setNumero(4);
        assertEquals("Abril", mes.verificarMes());
        
        mes.setNumero(5);
        assertEquals("Maio", mes.verificarMes());
        
        mes.setNumero(6);
        assertEquals("Junho", mes.verificarMes());
        
        mes.setNumero(7);
        assertEquals("Julho", mes.verificarMes());
        
        mes.setNumero(8);
        assertEquals("Agosto", mes.verificarMes());
        
        mes.setNumero(9);
        assertEquals("Setembro", mes.verificarMes());
        
        mes.setNumero(10);
        assertEquals("Outubro", mes.verificarMes());
        
        mes.setNumero(11);
        assertEquals("Novembro", mes.verificarMes());
        
        mes.setNumero(12);
        assertEquals("Dezembro", mes.verificarMes());
        
        mes.setNumero(20);
        assertEquals("Mês inválido!", mes.verificarMes());
    }
}
