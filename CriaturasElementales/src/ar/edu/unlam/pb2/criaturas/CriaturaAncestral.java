package ar.edu.unlam.pb2.criaturas;

public class CriaturaAncestral extends Criatura {

	public CriaturaAncestral(String nombre, Integer energia, Afinidad afinidad) {
		super(nombre, energia, afinidad);
	}

	@Override
	public void entrenar() {
		modificarEnergia(50);
	}

	@Override
	public void pacificar() {
		this.inestable = false;
		modificarEnergia(10);
	}

	@Override
	public void modificarEnergia(Integer delta) {
		this.energia += delta;
		if (this.energia < 100) {
			this.energia = 100;
		}
	}
}
