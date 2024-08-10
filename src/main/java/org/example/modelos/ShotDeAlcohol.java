package org.example.modelos;

import org.example.modelos.Coctel;

public class ShotDeAlcohol extends Coctel {
    private String tipo;

    public ShotDeAlcohol() {
    }

    public ShotDeAlcohol(String nombre, String tipoLicor, String sabor, String color, double precioUnitario, int cantidadAlcohol, String tamaño, boolean esDecorado, String ingredientes, String tipo) {
        super(nombre, tipoLicor, sabor, color, precioUnitario, cantidadAlcohol, tamaño, esDecorado, ingredientes);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
