package org.example.helpers.generals;

import org.example.helpers.mensajes.MensajesCoctel;
import org.example.helpers.mensajes.RegexExpresion;

public class RegexValidators {

    public static String validarNombre(String nombre) {
        if (!nombre.matches(RegexExpresion.NOMBRE.getRegex())) {
            return MensajesCoctel.NOMBRE_INVALIDO.getMensaje();
        }
        return "Nombre válido";
    }

    public static String validarTipoLicor(String tipoLicor) {
        if (!tipoLicor.matches(RegexExpresion.TIPO_LICOR.getRegex())) {
            return MensajesCoctel.TIPO_LICOR_INVALIDO.getMensaje();
        }
        return "Tipo de licor válido";
    }

    public static String validarSabor(String sabor) {
        if (!sabor.matches(RegexExpresion.SABOR.getRegex())) {
            return MensajesCoctel.SABOR_INVALIDO.getMensaje();
        }
        return "Sabor válido";
    }

    public static String validarColor(String color) {
        if (!color.matches(RegexExpresion.COLOR.getRegex())) {
            return MensajesCoctel.COLOR_INVALIDO.getMensaje();
        }
        return "Color válido";
    }

    public static String validarTamaño(String tamaño) {
        if (!tamaño.matches(RegexExpresion.TAMAÑO.getRegex())) {
            return MensajesCoctel.TAMAÑO_INVALIDO.getMensaje();
        }
        return "Tamaño válido";
    }

    public static String validarIngredientes(String ingredientes) {
        if (!ingredientes.matches(RegexExpresion.INGREDIENTES.getRegex())) {
            return MensajesCoctel.INGREDIENTES_INVALIDOS.getMensaje();
        }
        return "Ingredientes válidos";
    }

    public static String validarDiaEnQueSeVence(String diaEnQueSeVence) {
        if (!diaEnQueSeVence.matches(RegexExpresion.DIA_EN_QUE_SE_VENCE.getRegex())) {
            return MensajesCoctel.DIA_EN_QUE_SE_VENCE_INVALIDO.getMensaje();
        }
        return "Fecha de vencimiento válida";
    }

    public static String validarTipo(String tipo) {
        if (!tipo.matches(RegexExpresion.TIPO.getRegex())) {
            return MensajesCoctel.TIPO_INVALIDO.getMensaje();
        }
        return "Tipo válido";
    }

    public static String validarPrecioUnitario(double precioUnitario) {
        if (!String.valueOf(precioUnitario).matches(RegexExpresion.PRECIO_UNITARIO.getRegex())) {
            return MensajesCoctel.PRECIO_UNITARIO_INVALIDO.getMensaje();
        }
        return "Precio unitario válido";
    }

    public static String validarCantidadAlcohol(int cantidadAlcohol) {
        if (!String.valueOf(cantidadAlcohol).matches(RegexExpresion.CANTIDAD_ALCOHOL.getRegex())) {
            return MensajesCoctel.CANTIDAD_ALCOHOL_INVALIDA.getMensaje();
        }
        return "Cantidad de alcohol válida";
    }

    public static String validarEsDecorado(boolean esDecorado) {
        if (!String.valueOf(esDecorado).matches(RegexExpresion.ES_DECORADO.getRegex())) {
            return MensajesCoctel.ES_DECORADO_INVALIDO.getMensaje();
        }
        return "Valor de 'es decorado' válido";
    }
}
