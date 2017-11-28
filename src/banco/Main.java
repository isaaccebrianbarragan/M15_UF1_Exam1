
package banco;

/**
 * Clase principal que contiene el Main que ejecutará toda la aplicación.
 * @author Isaac Cebrián Barragán
 * @version 1.0 2017-11-28
 */
public class Main {
    
    /**
     * Main que ejecutará la lógica de toda la aplicación.
     * @param args String[] Argumentos recibidos por parámetros (no se controla).
     */
    public static void main(String[] args) {
        
        CuentaCorriente c1,c2,c3;
        Banco b1,b2;              
              
        //Instanciem 2 objectes Banc
        b1 = new Banco("Tokio Internacional Banc ");
        b2 = new Banco("BNC Internacional Banc",10.5,"C/llacuna, 10");
        
        
        
        //Instaciem varies comptes de corrent
        c1 = new CuentaCorriente("Ana Pastor","24876987Y",b1,3);
        c1.ingreso(100000);
        c1.mostrarInformacion();
        c1.retirar(10000000);
        
        c2 = new CuentaCorriente("Juan Jose","45876123O",b1,6);
        c2.ingreso(50000);
        c2.mostrarInformacion();
        c2.retirar(40000);
        c2.cambiarBanco(b2);
        c2.mostrarInformacion();
        System.out.println("InteresTAE: " + c2.interesTAE());
        
        c3= new CuentaCorriente("Maria Perez","90876345E",null,2);
        c3.mostrarInformacion();
                     
    }
}
