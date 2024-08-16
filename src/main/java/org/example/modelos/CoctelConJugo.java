package org.example.modelos;

import org.example.calculos.CostoDeUnaVenta;
import org.example.modelos.Coctel;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
        LocalDate fechaVencimiento = null;
        System.out.println("Ingrese la cantidad de " + this.getNombre() + ":");
        String cantidadIngresada = sc.nextLine();
        double cantidad = Double.parseDouble(cantidadIngresada);
        LocalDate fechaHoy = LocalDate.now();

        String[] formatos = {
                "yyyy/MM/dd",
                "yyyy-MM-dd",
                "dd/MM/yyyy",
                "dd-MM-yyyy",
                "yyyy/MM",
                "yyyy-MM"
        };

        boolean formatoValido = false;

        for (String formato : formatos) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);

                // Intentar con formatos que incluyen día
                try {
                    fechaVencimiento = LocalDate.parse(getDiaEnQueSeVence(), formatter);
                } catch (DateTimeParseException e) {
                    // Intentar con formatos sin día
                    if (formato.contains("yyyy/MM") || formato.contains("yyyy-MM")) {
                        YearMonth yearMonth = YearMonth.parse(getDiaEnQueSeVence(), formatter);
                        fechaVencimiento = yearMonth.atDay(1); // Usar el primer día del mes
                    } else {
                        throw e; // Lanzar excepción si no se puede parsear
                    }
                }

                formatoValido = true; // Se encontró un formato válido
                break; // Salir del bucle si se pudo parsear correctamente
            } catch (DateTimeParseException e) {
                // Intentar con el siguiente formato
            }
        }

        if (!formatoValido) {
            throw new IllegalArgumentException("Formato de fecha no soportado: " + getDiaEnQueSeVence());
        }

        long diferenciaDias = ChronoUnit.DAYS.between(fechaHoy, fechaVencimiento);
        double costoNormal = cantidad * this.getPrecioUnitario();

        if (diferenciaDias == -3) {
            setPrecioUnitario(costoNormal - (0.02 * costoNormal));
        } else if (diferenciaDias == -2) {
            setPrecioUnitario(costoNormal - (0.035 * costoNormal));
        } else if (diferenciaDias == -1) {
            setPrecioUnitario(costoNormal - (0.05 * costoNormal));
        } else if(diferenciaDias > 0) {
            setPrecioUnitario(getPrecioUnitario() * cantidad);
        }

    }


}