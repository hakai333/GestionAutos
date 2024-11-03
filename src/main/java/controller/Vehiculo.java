package controller;

import java.time.LocalDate;

/**
 *
 * @author Miguel Reyes
 */
public abstract class Vehiculo implements Arrendable{
    private String marca, modelo;
    private int anioFabricacion;
    private double precioPorDia;
    private int diasArriendo;
    private int diasArriendoMes;
    //
    private boolean arrendado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anioFabricacion, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precioPorDia = precioPorDia;
        this.diasArriendo = 0;
        this.arrendado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public int getDiasArriendo() {
        return diasArriendo;
    }

    public void setDiasArriendo(int diasArriendo) {
        this.diasArriendo = diasArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }

    public int getDiasArriendoMes() {
        return diasArriendoMes;
    }

    public void setDiasArriendoMes(int diasArriendoMes) {
        this.diasArriendoMes = diasArriendoMes;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + ", precioPorDia=" + precioPorDia + '}';
    }
    
    public void mostrarInformacion(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Anio de fabricacion: "+anioFabricacion);
        System.out.println("Precio por dia: "+precioPorDia);
    }
    
}
