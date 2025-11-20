package ar.edu.unlam.pb2.criaturas;

import java.util.*;

public class ConsejoMagico {

	public static List<Criatura> listarTodasLasCriaturas(List<MaestroElemental> maestros) {
		List<Criatura> criaturas = new ArrayList<>();

		for (MaestroElemental maestro : maestros) {
			criaturas.addAll(maestro.getCriaturasRegistradas());
		}

		return criaturas;
	}

	public static Criatura obtenerCriaturaConMayorEnergia(List<MaestroElemental> maestros) {
		List<Criatura> todasLasCriaturas = listarTodasLasCriaturas(maestros);
		Criatura criaturaConMayorEnergia = null;
		Integer maximaEnergiaEncontrada = -1;

		for (Criatura criatura : todasLasCriaturas) {
			Integer energiaActual = criatura.getEnergia();

			if (energiaActual > maximaEnergiaEncontrada) {
				maximaEnergiaEncontrada = energiaActual;
				criaturaConMayorEnergia = criatura;
			}
		}

		return criaturaConMayorEnergia;
	}

	public static MaestroElemental obtenerMaestroConMasCriaturasTransformadas(List<MaestroElemental> maestros) {
		MaestroElemental maestroGanador = null;
		Integer maximoDeTransformadas = -1;

		for (MaestroElemental maestro : maestros) {
			Integer contadorTransformadas = 0;

			for (Criatura criatura : maestro.getCriaturasRegistradas()) {
				if (criatura instanceof Transformacion) {
					contadorTransformadas++;
				}
			}

			if (contadorTransformadas > maximoDeTransformadas) {
				maximoDeTransformadas = contadorTransformadas;
				maestroGanador = maestro;
			}
		}

		return maestroGanador;
	}

	public static Map<Afinidad, Integer> obtenerConteoCriaturasPorAfinidad(List<MaestroElemental> maestros) {
		Map<Afinidad, Integer> conteo = new HashMap<>();

		for (MaestroElemental maestro : maestros) {
			for (Criatura criatura : maestro.getCriaturasRegistradas()) {

				Afinidad afinidadActual = criatura.getAfinidad();

				if (conteo.containsKey(afinidadActual)) {

					Integer cantidadActual = conteo.get(afinidadActual);
					conteo.put(afinidadActual, cantidadActual + 1);
				} else {

					conteo.put(afinidadActual, 1);
				}
			}
		}

		return conteo;
	}
}