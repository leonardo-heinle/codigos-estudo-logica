import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste AlunoTest.
 *
 * @author  Leonardo Heinle
 * @version 1.0 27/05/2020
 */
public class AlunoTest {

    Aluno aluno = new Aluno();
    
    public AlunoTest() {
        aluno.setNome("Leo");
        aluno.setNota1(10);
        aluno.setNota2(10);
        aluno.setTotalDeAulas(2);
        aluno.setNumeroDePresencas(2);
    }
    
    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp() {
        aluno.setNota1(10);
        aluno.setNota1(10);
        aluno.setTotalDeAulas(2);
        aluno.setNumeroDePresencas(2);
        System.out.println("passou no setup");
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown() {
        System.out.println("passou no tearDown");
    }
    
    @Test
    public void testCalcularFrequencia() {
        System.out.println("passou no frequencia");
        assertEquals(100.0, aluno.calcularFrequencia(), 0.0);
        
        aluno.setTotalDeAulas(10);
        aluno.setNumeroDePresencas(3);
        assertEquals(30.0, aluno.calcularFrequencia(), 0.0);
        
        aluno.setTotalDeAulas(10);
        aluno.setNumeroDePresencas(7);
        assertEquals(70.0, aluno.calcularFrequencia(), 0.0);
    }
    
    
    
    @Test
    public void testCalcularMediaAritmetica() {
        System.out.println("passou no media");
        assertEquals(10.0, aluno.calcularMediaAritmetica(), 0.0);
        
        aluno.setNota1(5);
        aluno.setNota2(2);
        assertEquals(3.5, aluno.calcularMediaAritmetica(), 0.0);
        
        aluno.setNota1(8);
        aluno.setNota2(9);
        assertEquals(8.5, aluno.calcularMediaAritmetica(), 0.0);
    }
}
