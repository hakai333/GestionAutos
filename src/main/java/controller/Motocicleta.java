package controller;

/**
 *
 * @author Miguel Reyes
 */
public class Motocicleta extends Vehiculo implements Arrendable{
    private int valorCilindrada;

    public Motocicleta() {
    }

    public Motocicleta(int valorCilindrada) {
        this.valorCilindrada = valorCilindrada;
    }

    public Motocicleta(String marca, String modelo, int anioFabricacion, double precioPorDia, int valorCilindrada) {
        super(marca, modelo, anioFabricacion, precioPorDia);
        this.valorCilindrada = valorCilindrada;
    }

    public int getValorCilindrada() {
        return valorCilindrada;
    }

    public void setValorCilindrada(int valorCilindrada) {
        this.valorCilindrada = valorCilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "valorCilindrada=" + valorCilindrada + '}';
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("---Motocicleta---");
        super.mostrarInformacion();
        System.out.println("Valor de cilindrada: "+valorCilindrada);
        if(getDiasArriendoMes() == 30){
            System.out.println("Descuento por arrendar mas de 10 dias! (20%)");
            System.out.println("Dias de arriendo: "+getDiasArriendoMes());
            //Esto se puede optimizar al hacer el condicional if(getDiasArriendoMes() == 30) en calcularCostoArriendo() 
            System.out.println("Costo total: "+ ((getPrecioPorDia() * getDiasArriendoMes() + ((getPrecioPorDia()*0.1) * valorCilindrada/100) * getDiasArriendoMes()) - (getPrecioPorDia() * getDiasArriendoMes() + ((getPrecioPorDia()*0.1) * valorCilindrada/100) * getDiasArriendoMes()) * 0.2) + "\n");
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
        if(getDiasArriendo() > 10){
            return (getPrecioPorDia() * getDiasArriendo() + ((getPrecioPorDia()*0.1) * valorCilindrada/100) * getDiasArriendo()) - (getPrecioPorDia() * getDiasArriendo() + ((getPrecioPorDia()*0.1) * valorCilindrada/100) * getDiasArriendo()) * 0.2;
        } else {
            return getPrecioPorDia() * getDiasArriendo() + ((getPrecioPorDia()*0.1) * valorCilindrada/100) * getDiasArriendo();
        }
        
    }
    
    
    
}
