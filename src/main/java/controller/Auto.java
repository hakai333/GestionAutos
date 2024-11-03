package controller;

/**
 *
 * @author Miguel Reyes
 */
public class Auto extends Vehiculo implements Arrendable{
    private int numeroPuertas;

    public Auto() {
    }

    public Auto(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Auto(String marca, String modelo, int anioFabricacion, double precioPorDia, int numeroPuertas) {
        super(marca, modelo, anioFabricacion, precioPorDia);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" + "numeroPuertas=" + numeroPuertas + '}';
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("---Auto---");
        super.mostrarInformacion();
        System.out.println("Numero de puertas: "+numeroPuertas);
        if(getDiasArriendoMes() == 30){
            System.out.println("Descuento por arrendar mas de 10 dias! (20%)");
            System.out.println("Dias de arriendo: "+getDiasArriendoMes());
            //Esto se puede optimizar al hacer el condicional if(getDiasArriendoMes() == 30) en calcularCostoArriendo() 
            System.out.println("Costo total: "+ (getPrecioPorDia() * getDiasArriendoMes() - ((getPrecioPorDia() * getDiasArriendoMes()) * 0.2)+ "\n"));
            //Reseteamos para que apareza solo cuando llamamos el metodo arriendoPorMes
            setDiasArriendoMes(0);
        } else{
            System.out.println("Dias de arriendo: "+getDiasArriendo());
            if(getDiasArriendo() > 10){
                System.out.println("Descuento por arrendar mas de 10 dias! (20%)");
                System.out.println("Costo total: "+calcularCostoArriendo()+ "\n");
            } else {
                System.out.println("Sin descuento!");
                System.out.println("Costo total: "+calcularCostoArriendo()+ "\n");
            }
        }
        
        
    }
    
    @Override
    public double calcularCostoArriendo(){
        //Si los dias de arriendo es mayor a 10, se le aplica un descuento de 20%
        if(getDiasArriendo() > 10){
            return (getPrecioPorDia() * getDiasArriendo()) - ((getPrecioPorDia() * getDiasArriendo()) * 0.2);
        } else {
            return getPrecioPorDia() * getDiasArriendo();
        }
        
    }
    
}
