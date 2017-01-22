
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leo
 */
public class CalculadoraProjetoTeste {
    
    public CalculadoraProjetoTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testeCalculaPrecoProjetoMargemLucroZerado() {
        System.out.println("\nTeste do Método calculaPrecoProjeto - Teste com margem de lucro zerado");
        System.out.println("\nVariáveis e Dados de Entrada:\nCusto = 100\nMargem de Lucro = 0%");
        System.out.println("\nResultado Esperado:\nPreço do Projeto = 100\n");
        Double custo = 100.00;
        Double margem = 0.00;
        CalculadoraProjeto instance = new CalculadoraProjeto();
        Double expResult = 100.00;
        Double result = instance.calculaPrecoProjeto(custo, margem);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testeCalculaPrecoProjetoDecimais() {
        System.out.println("\nTeste do Método calculaPrecoProjeto - Teste com valores decimais");
        System.out.println("\nVariáveis e Dados de Entrada:\nCusto = 350.80\nMargem = 50%");
        System.out.println("\nResultado Esperado:\nPreço do Projeto = 526.20\n");
        Double custo = 350.80;
        Double margem = 50.00;
        CalculadoraProjeto instance = new CalculadoraProjeto();
        Double expResult = 526.20;
        Double result = instance.calculaPrecoProjeto(custo, margem);
        assertEquals(expResult, result);       
    }
}
