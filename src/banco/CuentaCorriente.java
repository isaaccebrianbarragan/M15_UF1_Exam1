
package banco;

/**
 * Contiene metodos y funciones necesarias para emular una cuenta corriente ligada a un usuario.
 * @author Isaac Cebrián Barragán
 * @version 1.0 2017-11-28
 */
public class CuentaCorriente {
    private double saldo;
    private double limite;
    public String nombre;
    String dni;
    Banco banco;
    private double interes;
    
    /**
     * Constructor con todos los parámetros.
     * @param nombre String Nombre del titular de la cuenta corriente.
     * @param dni String DNI del titular de la cuenta corriente.
     * @param banco Banco Banco al que está asociada esta cuenta.
     * @param interes double interés impuesto.
     */
    public CuentaCorriente(String nombre, String dni, Banco banco, double interes) {
        saldo = 0;
        limite = -50;
        this.nombre = nombre;
        this.dni = dni;
        this.banco = banco;
        this.interes = interes;
     }
    
    /**
     * Retira la cantidad especificada de dinero de la cuenta corriente.
     * @param cant int Cantidad en euros.
     * @return true En caso de que se haya retirado correctamente la cantidad deseada en el saldo de la cuenta corriente. false En caso de que no se haya podido retirar debido a que lo que se desea retirar sea menor al saldo actual menos el límite establecido.
     */
    public boolean retirar(double cant) {
        boolean result = false;
        if(saldo - cant >= limite && cant > 0) {
            saldo = saldo - cant;
            result = true;
        }
        return result;
    }
    
     
    /**
     * Ingresa la cantidad especificada.
     * @param cant double Cantidad especificada.
     */
    public void ingreso(double cant){
        saldo += cant;
    }
    
    /**
     * Calcula la cantidad de interés en Tasa Anual Equivalente.
     * @return double resultado de aplicar el interés al saldo de esta cuenta corriente.
     */
    public double interesTAE() {
       return saldo * (interes / 100);
    }
    
    /**
     * Cambia de banco.
     * @param banco banco a cambiar, puede ser null.
     */
    void cambiarBanco(Banco banco){
        this.banco = banco;        
    }
    
    /**
     * Muestra información por consola, relativa a la cuenta corriente de usuario, así como de la cuenta bancaria si dispone de ella.
     */
    void mostrarInformacion() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        if(banco != null) {
            banco.mostrarInformacion();
        } else {
            System.out.println("");  
        }
    }
}
