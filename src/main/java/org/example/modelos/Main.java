package org.example.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LocalDate local = LocalDate.now().minusDays(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Convertir LocalDate a String usando el formato
        String dateString = local.format(formatter);
        System.out.println(dateString);



// Objeto para ShotDeAlcohol
        ShotDeAlcohol shotDeAlcohol = new ShotDeAlcohol(
                "Tequila Sunrise",  // Nombre
                "Tequila",          // Tipo de licor
                "Dulce",            // Sabor
                "Ambar",            // Color
                15.00,              // Precio unitario
                40,                 // Cantidad de alcohol
                "Pequeño",          // Tamaño
                true,               // Es decorado
                "Tequila, Naranja, Granadina", // Ingredientes
                "Shot"              // Tipo
        );

// Objeto para CoctelConJugo
        CoctelConJugo coctelConJugo = new CoctelConJugo(
                "Margarita",        // Nombre
                "Tequila",          // Tipo de licor
                "Cítrico",          // Sabor
                "Verde",            // Color
                12.50,              // Precio unitario
                40,                 // Cantidad de alcohol
                "Mediano",          // Tamaño
                false,              // Es decorado
                "Tequila, Limón, Sal", // Ingredientes
                dateString       // Día en que se vence
        );


        coctelConJugo.calcularCostoVenta();
        shotDeAlcohol.calcularCostoVenta();



    }
    }

