package ar.edu.unlam.pb2.criaturas;

public class AscensoDelViento extends Transformacion {

    private Afinidad afinidadOriginal;

    public AscensoDelViento(Criatura original) {
        super(original);
        this.afinidadOriginal = original.getAfinidad();
    }

    @Override
    public void entrenar() {
        // Cambio temporal a AIRE
        original.afinidad = Afinidad.AIRE;
        original.entrenar();
        // Restaurar afinidad original
        original.afinidad = afinidadOriginal;
    }

    @Override
    public void pacificar() {
        original.pacificar();
    }
}