package org.example.modelos;

import org.example.modelos.Coctel;

public class CoctelConJugo extends Coctel {

    private String diaEnQueSeVence;


    public CoctelConJugo() {
    }

    public CoctelConJugo(String nombre, String tipoLicor, String sabor, String color, double precioUnitario, int cantidadAlcohol, String tamaño, boolean esDecorado, String ingredientes, String diaEnQueSeVence) {
        super(nombre, tipoLicor, sabor, color, precioUnitario, cantidadAlcohol, tamaño, esDecorado, ingredientes);
        this.diaEnQueSeVence = diaEnQueSeVence;
    }

    public String getDiaEnQueSeVence() {
        return diaEnQueSeVence;
    }

    public void setDiaEnQueSeVence(String diaEnQueSeVence) {
        this.diaEnQueSeVence = diaEnQueSeVence;
    }
}
