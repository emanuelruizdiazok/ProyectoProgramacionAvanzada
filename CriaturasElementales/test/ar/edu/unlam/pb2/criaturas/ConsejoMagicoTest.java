package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class ConsejoMagicoTest {

	@Test
	public void queSeListanTodasLasCriaturasDeTodosLosMaestros() {
		MaestroElemental maestro1 = new MaestroElemental("Aang", 20, Afinidad.AIRE);
		MaestroElemental maestro2 = new MaestroElemental("Katara", 18, Afinidad.AGUA);

		maestro1.agregarCriatura(new CriaturaDomesticada("Momo", 50, Afinidad.AIRE));
		maestro2.agregarCriatura(new CriaturaSalvaje("Appa", 100, Afinidad.AGUA));

		List<MaestroElemental> maestros = Arrays.asList(maestro1, maestro2);

		List<Criatura> criaturas = ConsejoMagico.listarTodasLasCriaturas(maestros);

		assertEquals(2, criaturas.size());
	}

	@Test
	public void queObtengaLaCriaturaConMayorEnergia() {
		MaestroElemental maestro = new MaestroElemental("Zuko", 20, Afinidad.FUEGO);
		maestro.agregarCriatura(new CriaturaDomesticada("Draco", 90, Afinidad.FUEGO));
		maestro.agregarCriatura(new CriaturaAncestral("Phoenix", 150, Afinidad.FUEGO));

		Criatura maxEnergia = ConsejoMagico.obtenerCriaturaConMayorEnergia(List.of(maestro));

		assertEquals("Phoenix", maxEnergia.getNombre());
	}

}