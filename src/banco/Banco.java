
package banco;

/**
 * Contiene metodos y funciones necesarias para emular una Banco.
 * @author Isaac Cebrián Barragán
 * @version 1.0 2017-11-28
 */
public class Banco {
    final private String nombre;
    double capital = 5.2;
    String direccion ="Sin direccion";
    
    /**
     * Constructor simple con un parámetro.
     * @param nombre Nombre del banco.
     */
    public Banco(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Constructor con todos los parámetros.
     * @param nombre
     * @param capital
     * @param direccion 
     */
    public Banco (String nombre, double capital, String direccion){
        
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }
    
    /**
     * Muestra información por consola, relativa al banco.
     */
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capital: " + capital);
        System.out.println("Direccion: " + direccion);
        System.out.println("");        
    }
  
}  


