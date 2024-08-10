package org.example.helpers.validaciones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CoctelValidacionTest {

    private ValidacionesCoctel validacionesCoctel;

    @BeforeEach
    public void setUp() {
        this.validacionesCoctel = new ValidacionesCoctel();
    }

    @Test
    public void validarNombreOperaCorrectamente() {
        // Prepare
        String nombrePrueba = "Margarita";
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarNombre(nombrePrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarNombreLanzaError() {
        // Prepare
        String nombrePrueba = "Margarita123";
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarNombre(nombrePrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarTipoLicorOperaCorrectamente() {
        // Prepare
        String tipoLicorPrueba = "Tequila";
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarTipoLicor(tipoLicorPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarTipoLicorLanzaError() {
        // Prepare
        String tipoLicorPrueba = "Tequila123";
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarTipoLicor(tipoLicorPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarSaborOperaCorrectamente() {
        // Prepare
        String saborPrueba = "Dulce";
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarSabor(saborPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarSaborLanzaError() {
        // Prepare
        String saborPrueba = "Dulce123";
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarSabor(saborPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarColorOperaCorrectamente() {
        // Prepare
        String colorPrueba = "Rojo";
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarColor(colorPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarColorLanzaError() {
        // Prepare
        String colorPrueba = "Rojo123";
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarColor(colorPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarTamañoOperaCorrectamente() {
        // Prepare
        String tamañoPrueba = "Grande";
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarTamaño(tamañoPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarTamañoLanzaError() {
        // Prepare
        String tamañoPrueba = "Grande123";
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarTamaño(tamañoPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarIngredientesOperaCorrectamente() {
        // Prepare
        String ingredientesPrueba = "Tequila, Limón, Sal";
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarIngredientes(ingredientesPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarIngredientesLanzaError() {
        // Prepare
        String ingredientesPrueba = "Tequila, Limón, Sal123";
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarIngredientes(ingredientesPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarDiaEnQueSeVenceOperaCorrectamente() {
        // Prepare
        String fechaVencimientoPrueba = "2024-12-31";
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarDiaEnQueSeVence(fechaVencimientoPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarDiaEnQueSeVenceLanzaError() {
        // Prepare
        String fechaVencimientoPrueba = "31-12-2024";
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarDiaEnQueSeVence(fechaVencimientoPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarTipoOperaCorrectamente() {
        // Prepare
        String tipoPrueba = "Cóctel";
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarTipo(tipoPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarTipoLanzaError() {
        // Prepare
        String tipoPrueba = "Cóctel123";
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarTipo(tipoPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarPrecioUnitarioOperaCorrectamente() {
        // Prepare
        double precioPrueba = 12.50;
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarPrecioUnitario(precioPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarPrecioUnitarioLanzaError() {
        // Prepare
        double precioPrueba = 12.505;
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarPrecioUnitario(precioPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarCantidadAlcoholOperaCorrectamente() {
        // Prepare
        int cantidadAlcoholPrueba = 40;
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarCantidadAlcohol(cantidadAlcoholPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }

    @Test
    public void validarCantidadAlcoholLanzaError() {
        // Prepare
        int cantidadAlcoholPrueba = -1;
        // Ejecute
        Assertions.assertThrows(Exception.class, () -> this.validacionesCoctel.validarCantidadAlcohol(cantidadAlcoholPrueba));
        // Verifique (no es necesario ya que esperamos excepciones)
    }

    @Test
    public void validarEsDecoradoOperaCorrectamente() {
        // Prepare
        boolean esDecoradoPrueba = true;
        // Ejecute
        Assertions.assertDoesNotThrow(() -> this.validacionesCoctel.validarEsDecorado(esDecoradoPrueba));
        // Verifique (no es necesario ya que no esperamos excepciones)
    }


    @Test
    public void validarEsDecoradoLanzaError() {
        // Prepare
        boolean esDecoradoPrueba = false; // Esto debería causar una excepción según la lógica actual

        // Ejecute y Verifique
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            validacionesCoctel.validarEsDecorado(esDecoradoPrueba);
        });
    }
}
