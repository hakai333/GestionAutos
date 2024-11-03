package controller;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Miguel Reyes
 */
public class EmpresaArriendo{
    private ArrayList<Vehiculo> vehiculos;
    

    
    public EmpresaArriendo() {
        this.vehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
    

    
    public void agregarVehiculoArrendado(Vehiculo vehiculo, int diasArriendo) {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaFin = fechaActual.plusDays(vehiculo.getDiasArriendo());
        //Esta linea la encuentro innecesaria
        vehiculo.setDiasArriendo(diasArriendo);
        vehiculo.setArrendado(true);
        vehiculo.setFechaInicio(fechaActual);
        vehiculo.setFechaFin(fechaFin);
        vehiculos.add(vehiculo);
    }
    
    public void calcularIngresosTotales(){
        double ingresosTotales = 0;
        double ingresosAutos = 0;
        double ingresosMotos = 0;
        double ingresosCamiones = 0;
        for(Vehiculo v: vehiculos){
            ingresosTotales += v.calcularCostoArriendo();
            if(v instanceof Auto){
                ingresosAutos += v.calcularCostoArriendo();
            }
            else if(v instanceof Motocicleta){
                ingresosMotos += v.calcularCostoArriendo();  
            }
            else if(v instanceof Camion){
                ingresosCamiones += v.calcularCostoArriendo();
            }
        }       
        System.out.printf("Ingresos totales autos: %.0f\n", ingresosAutos);
        System.out.printf("Ingresos totales motocicletas: %.0f\n", ingresosMotos);
        System.out.printf("Ingresos totales camiones: %.0f\n", ingresosCamiones);
        System.out.printf("Ingresos totales: %.0f\n", ingresosTotales);
        System.out.println("\n");
    }
    
    public void vehiculosArrendados(){
        for(Vehiculo v: vehiculos){
            v.mostrarInformacion();
            System.out.println("Fecha Inicio Arriendo: "+v.getFechaInicio());
            System.out.println("Fecha Fin de arriendo: "+v.getFechaFin());
        }
    }
    
    public void arriendoPorMes(){
        for(Vehiculo v : vehiculos){
            if(v.isArrendado()){
                v.setDiasArriendoMes(30);
                v.mostrarInformacion();
            }
        }
    }
    
}
