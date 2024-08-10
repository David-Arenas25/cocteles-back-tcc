package org.example.helpers.mensajes;

public enum MensajesCoctel {
    NOMBRE_REQUERIDO("El nombre es obligatorio."),
    TIPO_LICOR_REQUERIDO("El tipo de licor es obligatorio."),
    SABOR_REQUERIDO("El sabor es obligatorio."),
    COLOR_REQUERIDO("El color es obligatorio."),
    PRECIO_UNITARIO_INVALIDO("El precio unitario debe ser mayor que 0."),
    CANTIDAD_ALCOHOL_INVALIDA("La cantidad de alcohol debe ser mayor o igual a 0."),
    TAMAÑO_REQUERIDO("El tamaño es obligatorio."),
    INGREDIENTES_REQUERIDOS("Los ingredientes son obligatorios.");

    private final String mensaje;

    MensajesCoctel(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
