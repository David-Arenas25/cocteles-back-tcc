package org.example.modelos;

import org.example.calculos.CostoDeUnaVenta;
import org.example.modelos.Coctel;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CoctelConJugo extends Coctel implements CostoDeUnaVenta {

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

    @Override
    public void calcularCostoVenta() {
        System.out.println(STR."Ingrese la cantidad de \{this.getNombre()}");
        String cantidad = sc.nextLine();
        double cantidadDouble = Double.parseDouble(cantidad);
        cantidadDouble = getPrecioUnitario() * cantidadDouble;
        LocalDate fechaHoy = LocalDate.now();
        LocalDate formato = LocalDate.parse(getDiaEnQueSeVence());
        long diferenciaDias = ChronoUnit.DAYS.between(fechaHoy, formato);

        if (diferenciaDias == -3) {
            setPrecioUnitario(cantidadDouble - getPrecioUnitario() * 0.02);
        } else if (diferenciaDias == -2) {
            setPrecioUnitario(cantidadDouble - getPrecioUnitario() * 0.035);
        } else if (diferenciaDias == -1) {
            setPrecioUnitario(cantidadDouble - getPrecioUnitario() * 0.02);
        } else {
            System.out.println("No hay productos perecederos");
        }

        System.out.println("La cantidad de " + getNombre() + "es " + cantidad);
        System.out.println("El descuento fue de " + cantidadDouble);
        System.out.println("El total fue de " + getPrecioUnitario());
        System.out.println("La diferencia de dias fueron " + diferenciaDias);


    }
}
