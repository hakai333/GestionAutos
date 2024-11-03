package controller;

/**
 *
 * @author Miguel Reyes
 */
public interface Arrendable {
    public abstract double calcularCostoArriendo();   
    
    default void mostrarInformacion(){

    }

    
    
}
