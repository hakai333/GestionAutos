package controller;

/**
 *
 * @author Miguel Reyes
 */
public class Camion extends Vehiculo implements Arrendable{
    private int capacidadPorTonelada;

    public Camion() {
    }

    public Camion(int capacidadPorTonelada) {
        this.capacidadPorTonelada = capacidadPorTonelada;
    }

    public Camion(String marca, String modelo, int anioFabricacion, double precioPorDia, int capacidadPorTonelada) {
        super(marca, modelo, anioFabricacion, precioPorDia);
        this.capacidadPorTonelada = capacidadPorTonelada;
    }

    public int getCapacidadPorTonelada() {
        return capacidadPorTonelada;
    }

    public void setCapacidadPorTonelada(int capacidadPorTonelada) {
        this.capacidadPorTonelada = capacidadPorTonelada;
    }

    @Override
    public String toString() {
        return "Camion{" + "capacidadPorTonelada=" + capacidadPorTonelada + '}';
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("---Camion---");
        super.mostrarInformacion();
        System.out.println("Capacidad en toneladas: "+capacidadPorTonelada);
        if(getDiasArriendoMes() == 30){
            System.out.println("Descuento por arrendar mas de 10 dias! (20%)");
            System.out.println("Dias de arriendo: "+getDiasArriendoMes());
            System.out.println("Costo por cada tonelada: "+20000);
            //Esto se puede optimizar al hacer el condicional if(getDiasArriendoMes() == 30) en calcularCostoArriendo() 
            System.out.println("Costo total: "+ ((getPrecioPorDia() * getDiasArriendoMes() + (20000 * capacidadPorTonelada) * getDiasArriendoMes()) - (getPrecioPorDia() * getDiasArriendoMes() + (20000 * capacidadPorTonelada) * getDiasArriendoMes()) * 0.2) + "\n");
            //Reseteamos para que apareza solo cuando llamamos el metodo arriendoPorMes
            setDiasArriendoMes(0);
        } else {
            System.out.println("Dias de arriendo: "+getDiasArriendo());
            if(getDiasArriendo() > 10){
                System.out.println("Descuento por arrendar mas de 10 dias! (20%)");
                System.out.println("Costo por cada tonelada: "+20000);
                System.out.println("Costo total: "+calcularCostoArriendo()+ "\n");
            } else {
                System.out.println("Sin descuento!");
                System.out.println("Costo por cada tonelada: "+20000);
                System.out.println("Costo total: "+calcularCostoArriendo()+ "\n");
            }
        }
    }
   
    @Override
    public double calcularCostoArriendo(){
        if(getDiasArriendo() > 10){
            return (getPrecioPorDia() * getDiasArriendo() + (20000 * capacidadPorTonelada) * getDiasArriendo()) - (getPrecioPorDia() * getDiasArriendo() + (20000 * capacidadPorTonelada) * getDiasArriendo()) * 0.2;
        } else {
            return getPrecioPorDia() * getDiasArriendo() + (20000 * capacidadPorTonelada) * getDiasArriendo();
        }
        
    }
    
    
    
}
