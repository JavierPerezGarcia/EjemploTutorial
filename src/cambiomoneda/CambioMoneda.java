package cambiomoneda;

/**
 * 
 * @author Javier Perez Garcia
 */

public class CambioMoneda 
{
     public static void main(String[] args) 
     {
        Banco caja1 = new Banco(150, "EURO");
        Banco caja2 = new Banco(200, "LIBRA");
        caja1.cambio(((float)0.5));
        caja1.visualiza();
        caja1.Suma(30, "LIBRA");
        caja1.visualiza();
        caja2.cambio(((float)0.5));
        caja2.visualiza();
        caja2.Suma(30, "EURO");
        caja2.visualiza();

     }
}
