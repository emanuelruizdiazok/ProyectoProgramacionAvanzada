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
	
	@Test
    public void queDetermineElMaestroConMasCriaturasTransformadas() {
        MaestroElemental maestro1 = new MaestroElemental("Maestro1", 15, Afinidad.AIRE);
        MaestroElemental maestro2 = new MaestroElemental("Maestro2", 15, Afinidad.AGUA);

        Criatura base1 = new CriaturaDomesticada("Criatura1", 50, Afinidad.AIRE);
        Criatura base2 = new CriaturaDomesticada("Criatura2", 40, Afinidad.AGUA);
        Criatura decorada1 = new AscensoDelViento(base1);
        Criatura decorada2 = new BendicionDelRio(base2);


        maestro1.agregarCriatura(decorada1);
        maestro2.agregarCriatura(decorada2);
        maestro2.agregarCriatura(new LlamaInterna(base1)); // maestro2 tiene 2 transformadas

        MaestroElemental ganador = ConsejoMagico
                .obtenerMaestroConMasCriaturasTransformadas(List.of(maestro1, maestro2));

        assertEquals("Maestro2", ganador.getNombre());
    }

    @Test
    public void queObtengaMapaDeCantidadDeCriaturasPorAfinidad() {
        MaestroElemental maestro = new MaestroElemental("Toph", 15, Afinidad.TIERRA);
        maestro.agregarCriatura(new CriaturaDomesticada("Golem", 70, Afinidad.TIERRA));
        maestro.agregarCriatura(new CriaturaSalvaje("Beast", 90, Afinidad.FUEGO));
        maestro.agregarCriatura(new CriaturaAncestral("Leviathan", 120, Afinidad.AGUA));

        Map<Afinidad, Integer> conteo = ConsejoMagico.obtenerConteoCriaturasPorAfinidad(List.of(maestro));

        assertEquals((Integer) 1, conteo.get(Afinidad.TIERRA));
        assertEquals((Integer) 1, conteo.get(Afinidad.FUEGO));
        assertEquals((Integer) 1, conteo.get(Afinidad.AGUA));
    }
	

}