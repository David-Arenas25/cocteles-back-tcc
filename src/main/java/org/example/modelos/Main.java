package org.example.modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws Exception {

        LocalDate dosDiasMas = LocalDate.now().minusDays(2);
        LocalDate tresDiasMas = LocalDate.now().minusDays(3);
        LocalDate unDiaMas = LocalDate.now().minusDays(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String unDiasMasString = unDiaMas.format(formatter);
        String dosDiasMasString = dosDiasMas.format(formatter);
        String tresDiasMasString = tresDiasMas.format(formatter);

        CoctelConJugo coctelConJugo1 = new CoctelConJugo(
                "Piña Colada",      // Nombre
                "Ron",              // Tipo de licor
                "Dulce",            // Sabor
                "Amarillo",         // Color
                44,                 // Precio unitario
                35,                 // Cantidad de alcohol
                "Grande",           // Tamaño
                true,               // Es decorado
                "Ron, Piña, Coco",  // Ingredientes
                tresDiasMasString   // Día en que se vence
        );

        CoctelConJugo coctelConJugo2 = new CoctelConJugo(
                "Mojito",           // Nombre
                "Ron",              // Tipo de licor
                "Refrescante",      // Sabor
                "Transparente",     // Color
                44,                 // Precio unitario
                30,                 // Cantidad de alcohol
                "Mediano",          // Tamaño
                true,               // Es decorado
                "Ron, Menta, Limón, Azúcar", // Ingredientes
                dosDiasMasString   // Día en que se vence
        );

        CoctelConJugo coctelConJugo3 = new CoctelConJugo(
                "Margarita",        // Nombre
                "Tequila",          // Tipo de licor
                "Cítrico",          // Sabor
                "Verde",            // Color
                44,                 // Precio unitario
                40,                 // Cantidad de alcohol
                "Mediano",          // Tamaño
                false,              // Es decorado
                "Tequila, Limón, Sal", // Ingredientes
                unDiasMasString       // Día en que se vence
        );

        CoctelConJugo coctelConJugo4 = new CoctelConJugo(
                "Daiquiri",         // Nombre
                "Ron",              // Tipo de licor
                "Ácido",            // Sabor
                "Rojo",             // Color
                44,                 // Precio unitario
                25,                 // Cantidad de alcohol
                "Pequeño",          // Tamaño
                false,              // Es decorado
                "Ron, Limón, Azúcar", // Ingredientes
                "2025/07"           // Día en que se vence
        );

        ShotDeAlcohol shotDeAlcohol = new ShotDeAlcohol(
                "Tequila Sunrise",  // Nombre
                "Tequila",          // Tipo de licor
                "Dulce",            // Sabor
                "Rojo",             // Color
                44,               // Precio unitario
                40,                 // Cantidad de alcohol
                "Mediano",          // Tamaño
                true,               // Es decorado
                "Tequila, Jugo de Naranja, Granadina",  // Ingredientes
                "Premium"           // Tipo
        );

        coctelConJugo1.calcularCostoVenta();
        coctelConJugo2.calcularCostoVenta();
        coctelConJugo3.calcularCostoVenta();
        coctelConJugo4.calcularCostoVenta();
        shotDeAlcohol.calcularCostoVenta();

        // Imprimir la fecha actual
        System.out.println("Fecha actual: " + LocalDate.now());
        System.out.println();

        // Imprimir información de los cócteles
        System.out.printf("Cóctel: %-15s | Precio: $%5.2f | Vence: %s%n",
                coctelConJugo1.getNombre(), coctelConJugo1.getPrecioUnitario(), coctelConJugo1.getDiaEnQueSeVence());
        System.out.printf("Cóctel: %-15s | Precio: $%5.2f | Vence: %s%n",
                coctelConJugo2.getNombre(), coctelConJugo2.getPrecioUnitario(), coctelConJugo2.getDiaEnQueSeVence());
        System.out.printf("Cóctel: %-15s | Precio: $%5.2f | Vence: %s%n",
                coctelConJugo3.getNombre(), coctelConJugo3.getPrecioUnitario(), coctelConJugo3.getDiaEnQueSeVence());
        System.out.printf("Cóctel: %-15s | Precio: $%5.2f | Vence: %s%n",
                coctelConJugo4.getNombre(), coctelConJugo4.getPrecioUnitario(), coctelConJugo4.getDiaEnQueSeVence());

        // Imprimir información del shot
        System.out.printf("Shot: %-15s | Precio: $%5.2f | Tipo: %s%n",
                shotDeAlcohol.getNombre(), shotDeAlcohol.getPrecioUnitario(), shotDeAlcohol.getTipo());

        System.out.println();
    }
}
