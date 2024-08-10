package org.example.modelos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public enum RegexExpresions {

        VALIDAR_SOLO_LETRAS_Y_ESPACIOS("^[a-zA-Z\\s]*$"),

        //ID_VEHICULO_NO_EXISTE("Revisa el id no existe"),
        SOLO_POSITIVOS_MAX100("^([0-9]{1,4}(\\.[0-9]+)?|99999(\\.0+)?)$"),
        SOLO_LETRAS_Y_ESPACIOSMAX20("^[a-zA-Z\\s]{1,20}$"),
        MAX100_CARACTERES("^[a-zA-Z\\s]{1,100}$"),
        SOLO_LETRAS_SIN_ESPACIOS("^[a-zA-Z]+$"),
        NUMEROS_POSITIVOS_MAX_72("^(?!0)\\d{1,72}$"),
        NUMEROS_POSITIVOS_MAX_1000("^(?:1000(?:\\.0+)?|[0-9]{1,3}(?:\\.[0-9]+)?)$"),
        SOLO_POSITIVOS("^[1-9]\\d*$"),
        FORMATO_FECHA_MM_YY("^(0[1-9]|1[0-2])/\\d{4}$");


        private String expresionRegular;

        public String getExpresionRegular() {
            return expresionRegular;
        }

        public void setExpresionRegular(String expresionRegular) {
            this.expresionRegular = expresionRegular;
        }

        RegexExpresions(String expresionRegular) {
            this.expresionRegular = expresionRegular;
        }
    }
}