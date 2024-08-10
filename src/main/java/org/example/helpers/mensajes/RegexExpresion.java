package org.example.helpers.mensajes;

public enum RegexExpresion {
    NOMBRE("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$"),
    TIPO_LICOR("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$"),
    SABOR("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$"),
    COLOR("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$"),
    TAMAÑO("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$"),
    INGREDIENTES("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s,]+$"),
    DIA_EN_QUE_SE_VENCE("^\\d{4}-\\d{2}-\\d{2}$"), // Formato de fecha YYYY-MM-DD
    TIPO("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$"),
    PRECIO_UNITARIO("^\\d+(\\.\\d{1,2})?$"), // Número con hasta dos decimales
    CANTIDAD_ALCOHOL("^\\d+$"), // Número entero
    ES_DECORADO("^(true|false)$"); // Valor booleano

    private final String regex;

    RegexExpresion(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return this.regex;
    }
}
