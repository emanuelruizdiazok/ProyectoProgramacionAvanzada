package ar.edu.unlam.pb2.criaturas;

public class AscensoDelViento extends Transformacion {

	private Afinidad afinidadOriginal;

	public AscensoDelViento(Criatura original) {
		super(original);
		this.afinidadOriginal = original.getAfinidad();
	}

	@Override
	public void entrenar() {
		original.afinidad = Afinidad.AIRE;
		original.entrenar();
		original.afinidad = afinidadOriginal;
	}

	@Override
	public void pacificar() {
		original.pacificar();
	}
}