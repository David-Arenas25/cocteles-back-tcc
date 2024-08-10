package org.example.modelos;

import java.util.Scanner;

public abstract class Coctel {

    private String nombre;
    private String tipoLicor;
    private String sabor;
    private String color;
    private double precioUnitario;
    private int cantidadAlcohol;
    private String tamaño;
    private boolean esDecorado;
    private String ingredientes;
    static Scanner sc = new Scanner(System.in);



    public Coctel() {
    }

    public Coctel(String nombre, String tipoLicor, String sabor, String color, double precioUnitario, int cantidadAlcohol, String tamaño, boolean esDecorado, String ingredientes) {
        this.nombre = nombre;
        this.tipoLicor = tipoLicor;
        this.sabor = sabor;
        this.color = color;
        this.precioUnitario = precioUnitario;
        this.cantidadAlcohol = cantidadAlcohol;
        this.tamaño = tamaño;
        this.esDecorado = esDecorado;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoLicor() {
        return tipoLicor;
    }

    public void setTipoLicor(String tipoLicor) {
        this.tipoLicor = tipoLicor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isEsDecorado() {
        return esDecorado;
    }

    public void setEsDecorado(boolean esDecorado) {
        this.esDecorado = esDecorado;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
