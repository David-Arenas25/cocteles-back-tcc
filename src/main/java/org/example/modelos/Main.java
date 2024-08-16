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
                        44,              // Precio unitario
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

                coctelConJugo1.calcularCostoVenta();
                coctelConJugo2.calcularCostoVenta();
                coctelConJugo3.calcularCostoVenta();
                coctelConJugo4.calcularCostoVenta();

                // Generar el output
                System.out.println("╔════════════════════════════════════════════╗");
                System.out.println("║           Resumen de Compras               ║");
                System.out.println("╠════════════════════════════════════════════╣");
                System.out.println("║ Hoy es: " + LocalDate.now() + "              ║");
                System.out.println("╠════════════════════════════════════════════╣");
                System.out.printf("║ Compra hace 3 días: %-20s Total: $%.2f ║\n", coctelConJugo1.getNombre(), coctelConJugo1.getPrecioUnitario());
                System.out.printf("║ Compra hace 2 días: %-20s Total: $%.2f ║\n", coctelConJugo2.getNombre(), coctelConJugo2.getPrecioUnitario());
                System.out.printf("║ Compra hace 1 día : %-20s Total: $%.2f ║\n", coctelConJugo3.getNombre(), coctelConJugo3.getPrecioUnitario());
                System.out.printf("║ Compra 2025/07     : %-20s Total: $%.2f ║\n", coctelConJugo4.getNombre(), coctelConJugo4.getPrecioUnitario());
                System.out.println("╚════════════════════════════════════════════╝");
            }
        }




