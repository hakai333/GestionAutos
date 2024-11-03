package controller;
import java.util.Scanner;
import java.util.InputMismatchException;




//AGREGAR UN LIMPIADOR DE PANTALLA
//DIAS DE ARRIENDO LO TENGO EN VEHICULO, TENGO QUE SACARLO PARA USARLO SOLO EN LOS METODOS
    //ESTO NO LO HARE XD
    //PORQUE NECESITO TENER LOS DIAS DE ARRIENDO COMO ATRIBUTO YA QUE EN LOS METODO PARA MOSTRAR LA INFORMACION
    //Y PARA CALCULAR EL COSTO TOTAL, NECESITO ACCEDER A LOS DIAS DE ARRIENDO QUE APUNTEN A UN VEHICULO EN ESPECIFICO
    //SI NO TRABAJO ASI LOS METODO ABSTRACTOS DEBERIAN RECIBIR LOS DIAS DE ARRIENDO Y NO LO QUIERO HACER ASI
//PREGUNTARLE AL PROFESOR SI NECESITO CONDICIONAR LOS SETTER
    //POR EJEMPLO QUE NO ME IMGRESEN DATOS EN BLANCO O NUMERO ES ATRIBUTOS STRING O VICEVERSA

/**
 *
 * @author Miguel Reyes
 */
public class Main {
    //EL MEJOR LIMPIADO DE PANTALLA QUE HE VISTO XD
    public static void limpiarPantalla(){for (int i = 0; i < 50; i++) {System.out.println();}}
    
    public static void main(String[] args) {
        
        
        EmpresaArriendo empresa1 = new EmpresaArriendo();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean condicion = true;
        do {
            limpiarPantalla();
            boolean entradaValida = false;
            System.out.println("---Sistema de gestion de vehiculos---");
            System.out.println("1.- Agregar Auto");
            System.out.println("2.- Agregar Motocicleta");
            System.out.println("3.- Agregar Camion");
            System.out.println("4.- Mostrar vehiculos ingresados");
            System.out.println("5.- Mostrar costos");
            System.out.println("6.- Lista vehiculos arrendados un mes: ");
            System.out.println("7.- Salir");
            while(!entradaValida){               
                try {
                    System.out.println("Ingrese una opcion: ");
                    opcion = scanner.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada invalida, ingrese un numero");
                    scanner.nextLine();
                }
            }
            //Este scanner se agrega para consumir el salto de linea residual que genera el nextInt o nextDouble
            scanner.nextLine();
            switch(opcion){
                case 1:
                    limpiarPantalla();
                    Auto auto = new Auto();
                    System.out.println("--Agregar Auto--");
                    System.out.println("Ingrese la marca del auto: ");
                    String marcaAuto = scanner.nextLine();
                    auto.setMarca(marcaAuto);
                    
                    System.out.println("Ingrese el modelo del auto: ");
                    String modeloAuto = scanner.nextLine();
                    auto.setModelo(modeloAuto);
                    
                    System.out.println("Ingrese el anio de fabricacion: ");
                    int anioFabricacionAuto = scanner.nextInt();
                    scanner.nextLine();
                    auto.setAnioFabricacion(anioFabricacionAuto);
                    
                    System.out.println("Ingrese la cantidad de puertas: ");
                    int numeroPuertas = scanner.nextInt();
                    scanner.nextLine();
                    auto.setNumeroPuertas(numeroPuertas);
                    
                    System.out.println("Ingrese el precio por dia: ");
                    double precioPorDiaAuto = scanner.nextDouble();
                    scanner.nextLine();
                    auto.setPrecioPorDia(precioPorDiaAuto);
                    
                    System.out.println("Ingrese cuantos dias arrendara el vehiculo: ");
                    int diasArriendoAuto = scanner.nextInt();
                    scanner.nextLine();
                    auto.setDiasArriendo(diasArriendoAuto);
                    
                    empresa1.agregarVehiculoArrendado(auto, diasArriendoAuto);
                    System.out.println("Auto ingresado!");
                    
                    
                    System.out.println("Presiona 'Enter' para continuar...");
                    scanner.nextLine();
                    break;
                case 2:
                    limpiarPantalla();
                    System.out.println("--Agregar Motocicleta--");
                    Motocicleta motocicleta = new Motocicleta();
                    System.out.println("Ingrese la marca de la motocicleta: ");
                    String marcaMotocicleta = scanner.nextLine();
                    motocicleta.setMarca(marcaMotocicleta);
                    
                    System.out.println("Ingrese el modelo de la motocicleta: ");
                    String modeloMotocicleta = scanner.nextLine();
                    motocicleta.setModelo(modeloMotocicleta);
                    
                    System.out.println("Ingrese el anio de fabricacion: ");
                    int anioFabricacionMotocicleta = scanner.nextInt();
                    scanner.nextLine();
                    motocicleta.setAnioFabricacion(anioFabricacionMotocicleta);
                    
                    System.out.println("Ingrese el cilindraje de la moto: ");
                    int valorCilindrada = scanner.nextInt();
                    scanner.nextLine();
                    motocicleta.setValorCilindrada(valorCilindrada);
                    
                    System.out.println("Ingrese el precio por dia: ");
                    double precioPorDiaMotocicleta = scanner.nextDouble();
                    scanner.nextLine();
                    motocicleta.setPrecioPorDia(precioPorDiaMotocicleta);
                    
                    System.out.println("Ingrese cuantos dias arrendara el vehiculo: ");
                    int diasArriendoMotocicleta = scanner.nextInt();
                    scanner.nextLine();
                    motocicleta.setDiasArriendo(diasArriendoMotocicleta);
                    
                    empresa1.agregarVehiculoArrendado(motocicleta, diasArriendoMotocicleta);
                    System.out.println("Motocicleta ingresada!");
                    
                    System.out.println("Presiona 'Enter' para continuar...");
                    scanner.nextLine();
                    break;
                case 3:
                    limpiarPantalla();
                    System.out.println("--Agregar Camion--");
                    Camion camion = new Camion();
                    System.out.println("Ingrese la marca del camion: ");
                    String marcaCamion = scanner.nextLine();
                    camion.setMarca(marcaCamion);
                    
                    System.out.println("Ingrese el modelo del camion: ");
                    String modeloCamion = scanner.nextLine();
                    camion.setModelo(modeloCamion);
                    
                    System.out.println("Ingrese el anio de fabricacion: ");
                    int anioFabricacionCamion = scanner.nextInt();
                    scanner.nextLine();
                    camion.setAnioFabricacion(anioFabricacionCamion);
                    
                    System.out.println("Ingrese la capacidad del camion en toneladas: ");
                    int capacidadPorTonelada = scanner.nextInt();
                    scanner.nextLine();
                    camion.setCapacidadPorTonelada(capacidadPorTonelada);
                    
                    System.out.println("Ingrese el precio por dia: ");
                    double precioPorDiaCamion = scanner.nextDouble();
                    scanner.nextLine();
                    camion.setPrecioPorDia(precioPorDiaCamion);
                    
                    System.out.println("Ingrese cuantos dias arrendara el vehiculo: ");
                    int diasArriendoCamion = scanner.nextInt();
                    scanner.nextLine();
                    camion.setDiasArriendo(diasArriendoCamion);
                    
                    empresa1.agregarVehiculoArrendado(camion, diasArriendoCamion);
                    System.out.println("Camion ingresado!");
                    
                    System.out.println("Presiona 'Enter' para continuar...");
                    scanner.nextLine();
                    break;
                case 4:
                    limpiarPantalla();
                    System.out.println("--Vehiculos ingresados--");
                    empresa1.vehiculosArrendados();
                    System.out.println("Presiona 'Enter' para continuar...");
                    scanner.nextLine();
                    break;
                case 5:
                    limpiarPantalla();
                    System.out.println("--Costos--");
                    empresa1.calcularIngresosTotales();
                    System.out.println("Presiona 'Enter' para continuar...");
                    scanner.nextLine();
                    break;
                case 6:
                    limpiarPantalla();
                    System.out.println("--Arriendo por un mes--");
                    empresa1.arriendoPorMes();
                    System.out.println("Presiona 'Enter' para continuar...");
                    scanner.nextLine();
                    break;
                case 7:
                    condicion = false;
                    break;
                default:
                    System.out.println("Dato invalido!");
                    break;                
            }
        }while(condicion);
        System.out.println("Programa finalizado...");
        
        scanner.close();
       
        /*
        Auto auto1 = new Auto("Hyundai", "Accent", 2020, 25000, 4);
        Auto auto2 = new Auto("Hyundai", "Tucson", 2024, 30000, 4);
        Motocicleta moto1 = new Motocicleta("Honda", "CGL", 2020, 10000, 200);
        Motocicleta moto2 = new Motocicleta("Honda", "CBR", 2024, 10000, 400);
        Camion camion1 = new Camion("Volvo", "FH", 2008, 20000, 38);
        Camion camion2 = new Camion("Mercedes", "Actros", 2010, 20000, 40);
        
        
        empresa1.agregarVehiculoArrendado(auto1, 30);
        empresa1.agregarVehiculoArrendado(auto2, 30);
        empresa1.agregarVehiculoArrendado(moto1, 30);
        empresa1.agregarVehiculoArrendado(moto2, 30);
        empresa1.agregarVehiculoArrendado(camion1, 30);
        empresa1.agregarVehiculoArrendado(camion2, 30);
        
        
        empresa1.vehiculosArrendados();
        empresa1.calcularIngresosTotales();
        */
        
    }
}
