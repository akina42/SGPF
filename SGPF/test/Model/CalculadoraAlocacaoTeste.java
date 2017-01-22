
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CalculadoraAlocacaoTeste {
    
    public CalculadoraAlocacaoTeste() {
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
    public void testeCalculaPrecoAlocacaoZerados() {
        System.out.println("\nTeste do método calculaPrecoAlocacao - Teste com valores zerados");
        System.out.println("\nVariáveis e Dados de Entrada:\nQuantidade = 0\nCusto = 0");
        System.out.println("\nResultado Esperado:\nCusto da Alocação = 0\n");
        Double qtd = 0.00;
        Double custo = 0.00;
        CalculadoraAlocacao instance = new CalculadoraAlocacao();
        Double expResult = 0.00;
        Double result = instance.calculaPrecoAlocacao(qtd, custo);
        assertEquals(expResult, result);        
    }
    
    @Test
    public void testeCalculaPrecoAlocacaoDecimal() {
        System.out.println("\nTeste do método calculaPrecoAlocacao - Teste com valores decimais");
        System.out.println("\nVariáveis e Dados de Entrada:\nQuantidade = 25.55\nCusto = 2.55");
        System.out.println("\nResultado Esperado:\nCusto da Alocação = 65.1525\n");
        Double qtd = 25.55;
        Double custo = 2.55;
        CalculadoraAlocacao instance = new CalculadoraAlocacao();
        Double expResult = 65.1525;
        Double result = instance.calculaPrecoAlocacao(qtd, custo);
        assertEquals(expResult, result);        
    }  
   
    
}
