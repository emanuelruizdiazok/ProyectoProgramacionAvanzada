package ar.edu.unlam.pb2.criaturas;

import java.util.ArrayList;
import java.util.List;

public class GestorDeInteracciones implements Interaccion {

	private List<List<Afinidad>> parejasOpuestas;

	public GestorDeInteracciones() {
		this.parejasOpuestas = new ArrayList<>();
		cargarParejas();
	}

	private void cargarParejas() {

		List<Afinidad> pareja1 = new ArrayList<>();
		pareja1.add(Afinidad.AGUA);
		pareja1.add(Afinidad.FUEGO);

		this.parejasOpuestas.add(pareja1);

		List<Afinidad> pareja2 = new ArrayList<>();
		pareja2.add(Afinidad.FUEGO);
		pareja2.add(Afinidad.AGUA);

		this.parejasOpuestas.add(pareja2);

		List<Afinidad> pareja3 = new ArrayList<>();
		pareja3.add(Afinidad.AIRE);
		pareja3.add(Afinidad.TIERRA);

		this.parejasOpuestas.add(pareja3);

		List<Afinidad> pareja4 = new ArrayList<>();
		pareja4.add(Afinidad.TIERRA);
		pareja4.add(Afinidad.AIRE);

		this.parejasOpuestas.add(pareja4);
	}

	@Override
	public void aplicar(Criatura criatura1, Criatura criaturaOtra) {
		if (criatura1 instanceof CriaturaAncestral || criaturaOtra instanceof CriaturaAncestral) {
			aplicarReglaAncestral(criatura1, criaturaOtra);
		} else if (criatura1.getAfinidad() == criaturaOtra.getAfinidad()) {
			criatura1.modificarEnergia(10);
			criaturaOtra.modificarEnergia(10);
		} else if (sonAfinidadesOpuestas(criatura1.getAfinidad(), criaturaOtra.getAfinidad())) {
			criatura1.setInestable(true);
			criaturaOtra.setInestable(true);
		}
	}

	private boolean sonAfinidadesOpuestas(Afinidad a1, Afinidad a2) {

		List<Afinidad> parejaAverificar = new ArrayList<>();
		parejaAverificar.add(a1);
		parejaAverificar.add(a2);

		return this.parejasOpuestas.contains(parejaAverificar);
	}

	private void aplicarReglaAncestral(Criatura criatura1, Criatura criatura2) {
		if (criatura1 instanceof CriaturaAncestral) {
			criatura1.modificarEnergia(20);
			criatura2.modificarEnergia(-15);
		} else {
			criatura2.modificarEnergia(20);
			criatura1.modificarEnergia(-15);
		}
	}
}