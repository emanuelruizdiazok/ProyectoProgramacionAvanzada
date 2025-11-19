package ar.edu.unlam.pb2.criaturas;

public class EnergiaExcedidaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EnergiaExcedidaException(String mensaje) {
        super(mensaje);
    }
}
