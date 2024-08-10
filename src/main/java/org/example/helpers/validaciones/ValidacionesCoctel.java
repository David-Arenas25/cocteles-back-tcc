package org.example.helpers.validaciones;

import org.example.helpers.mensajes.MensajesCoctel;
import org.example.helpers.mensajes.RegexExpresion;

public class ValidacionesCoctel {

    public ValidacionesCoctel() {
    }

    public void validarNombre(String nombre) throws Exception {
        if (!nombre.matches(RegexExpresion.NOMBRE.getRegex())) {
            throw new Exception(MensajesCoctel.NOMBRE_INVALIDO.getMensaje());
        }
    }

    public void validarTipoLicor(String tipoLicor) throws Exception {
        if (!tipoLicor.matches(RegexExpresion.TIPO_LICOR.getRegex())) {
            throw new Exception(MensajesCoctel.TIPO_LICOR_INVALIDO.getMensaje());
        }
    }

    public void validarSabor(String sabor) throws Exception {
        if (!sabor.matches(RegexExpresion.SABOR.getRegex())) {
            throw new Exception(MensajesCoctel.SABOR_INVALIDO.getMensaje());
        }
    }

    public void validarColor(String color) throws Exception {
        if (!color.matches(RegexExpresion.COLOR.getRegex())) {
            throw new Exception(MensajesCoctel.COLOR_INVALIDO.getMensaje());
        }
    }

    public void validarTamaño(String tamaño) throws Exception {
        if (!tamaño.matches(RegexExpresion.TAMAÑO.getRegex())) {
            throw new Exception(MensajesCoctel.TAMAÑO_INVALIDO.getMensaje());
        }
    }

    public void validarIngredientes(String ingredientes) throws Exception {
        if (!ingredientes.matches(RegexExpresion.INGREDIENTES.getRegex())) {
            throw new Exception(MensajesCoctel.INGREDIENTES_INVALIDOS.getMensaje());
        }
    }

    public void validarDiaEnQueSeVence(String diaEnQueSeVence) throws Exception {
        if (!diaEnQueSeVence.matches(RegexExpresion.DIA_EN_QUE_SE_VENCE.getRegex())) {
            throw new Exception(MensajesCoctel.DIA_EN_QUE_SE_VENCE_INVALIDO.getMensaje());
        }
    }

    public void validarTipo(String tipo) throws Exception {
        if (!tipo.matches(RegexExpresion.TIPO.getRegex())) {
            throw new Exception(MensajesCoctel.TIPO_INVALIDO.getMensaje());
        }
    }

    public void validarPrecioUnitario(double precioUnitario) throws Exception {
        if (!String.valueOf(precioUnitario).matches(RegexExpresion.PRECIO_UNITARIO.getRegex())) {
            throw new Exception(MensajesCoctel.PRECIO_UNITARIO_INVALIDO.getMensaje());
        }
    }

    public void validarCantidadAlcohol(int cantidadAlcohol) throws Exception {
        if (!String.valueOf(cantidadAlcohol).matches(RegexExpresion.CANTIDAD_ALCOHOL.getRegex())) {
            throw new Exception(MensajesCoctel.CANTIDAD_ALCOHOL_INVALIDA.getMensaje());
        }
    }

    public void validarEsDecorado(boolean esDecorado) throws Exception {
        // Ejemplo: solo consideramos válido si esDecorado es true
        if (!esDecorado) {
            throw new Exception(MensajesCoctel.ES_DECORADO_INVALIDO.getMensaje());
        }
    }



}
