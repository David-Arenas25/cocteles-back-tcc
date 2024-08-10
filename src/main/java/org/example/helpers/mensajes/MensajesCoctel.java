package org.example.helpers.mensajes;

public enum MensajesCoctel {
    NOMBRE_INVALIDO("El nombre solo puede contener letras y espacios."),
    TIPO_LICOR_INVALIDO("El tipo de licor solo puede contener letras y espacios."),
    SABOR_INVALIDO("El sabor solo puede contener letras y espacios."),
    COLOR_INVALIDO("El color solo puede contener letras y espacios."),
    TAMAÑO_INVALIDO("El tamaño solo puede contener letras y espacios."),
    INGREDIENTES_INVALIDOS("Los ingredientes solo pueden contener letras, espacios y comas."),
    DIA_EN_QUE_SE_VENCE_INVALIDO("La fecha de vencimiento debe estar en el formato YYYY-MM-DD."),
    TIPO_INVALIDO("El tipo solo puede contener letras y espacios."),
    PRECIO_UNITARIO_INVALIDO("El precio unitario debe ser un número con hasta dos decimales."),
    CANTIDAD_ALCOHOL_INVALIDA("La cantidad de alcohol debe ser un número entero."),
    ES_DECORADO_INVALIDO("El valor de 'es decorado' debe ser true o false.");

    private final String mensaje;

    MensajesCoctel(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return this.mensaje;
    }
}
