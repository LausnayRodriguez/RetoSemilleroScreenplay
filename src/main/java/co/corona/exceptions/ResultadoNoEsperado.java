package co.corona.exceptions;

public class ResultadoNoEsperado extends AssertionError {

    public static final String AGOTADO = "¡Agotado temporalmente!";
    public static final String FALLO_REGISTRO = "Fallo en el registro, revise los datos ingresados";

    public ResultadoNoEsperado(String message) {

        super(message);
    }
    public ResultadoNoEsperado(String message, Throwable cause) {
        super(message, cause);
    }
}
