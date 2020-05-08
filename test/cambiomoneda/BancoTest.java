package cambiomoneda;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Javier Perez Garcia
 */

public class BancoTest {
    
    Banco caja1, caja2;
    float entrada1, entrada2;
    float salida1, salida2;
    
    public BancoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        int i=0;
        float valor1 = 100F, valor2 = 100F;
        float resu1 = 0F, resu2 = 0F;
        caja1 = new Banco(100F, "EURO");
        caja2 = new Banco(100F, "LIBRA");
        resu1 = caja1.Dinero();
        resu2 = caja2.Dinero();
    
            entrada1 = valor1;
            resu1 += valor1 * 2F;
            salida1 = resu1;            
            valor1 += 100F;
            
            entrada2 = valor2;
            resu2 += valor2 / 2F;
            salida2 = resu2;            
            valor2 += 100F;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cambio method, of class Banco.
     */
    @Test
    public void testCambio() {
        System.out.println("cambio");
        float EL_ = 0.5F;
        caja1.cambio(EL_);
        caja2.cambio(EL_);
    }

    /**
     * Test of Suma method, of class Banco.
     */
    @Test
    public void testSuma() {
        //testCambio();
        int i=0;
        float valor1 = 0F, valor2 = 0F;
        caja1.cambio(0.5F);
        caja2.cambio(0.5F);
        System.out.println("Suma");

          caja1.Suma(entrada1, "LIBRA");
          assertEquals(salida1, caja1.Dinero(), 0.1F);

          caja2.Suma(entrada2, "EURO");
          assertEquals(salida2, caja2.Dinero(), 0.1F);
        
        valor1 = salida1 + 50F;
        caja1.Suma(50, "EURO");
        assertEquals(valor1, caja1.Dinero(), 0.1F);
        valor2 = salida2 + 50F;
        caja2.Suma(50, "LIBRA");
        assertEquals(valor2, caja2.Dinero(), 0.1F);
        caja1.Suma(0F, "EURO");
        assertEquals(valor1, caja1.Dinero(), 0.1F);
        caja1.Suma(-100F, "EURO");
        assertEquals(valor1 - 100, caja1.Dinero(), 0.1F);
    }

    /**
     * Test of visualiza method, of class Banco.
     */
    @Test
    public void testVisualiza() {
        System.out.println("visualiza");
        caja1.visualiza();
    }   

    /**
     * Test of Dinero method, of class Banco.
     */
    @Test
    public void testDinero() {
        System.out.println("Dinero");
        System.out.println(caja1.Dinero());
    }
}
