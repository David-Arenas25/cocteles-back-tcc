package org.example.modelos;

import org.example.calculos.CostoDeUnaVenta;
import org.example.modelos.Coctel;

public class ShotDeAlcohol extends Coctel implements CostoDeUnaVenta {
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

    @Override
    public void calcularCostoVenta() {
        System.out.println(STR."Ingrese la cantidad de \{this.getNombre()}");
        String cantidad = sc.nextLine();
        double cantidadDouble = Double.parseDouble(cantidad);
        setPrecioUnitario(getPrecioUnitario() * cantidadDouble);

        System.out.print("El precio que vas a pagar por la compra es " + getPrecioUnitario());
        System.out.println("La cantidad es " + cantidad);


    }
}
