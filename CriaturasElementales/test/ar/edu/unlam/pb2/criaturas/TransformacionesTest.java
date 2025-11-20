package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;
import org.junit.Test;

public class TransformacionesTest {

	@Test
	public void queLlamaInternaSume30SiAfinidadEsFuego() {

		Criatura base = new CriaturaDomesticada("Fiera", 50, Afinidad.FUEGO);
		Criatura decorada = new LlamaInterna(base);

		decorada.entrenar();

		assertEquals(Integer.valueOf(80), base.getEnergia());
	}

	@Test
	public void queLlamaInternaVuelvaInestableSiNoEsFuego() {

		Criatura base = new CriaturaDomesticada("NoFuego", 100, Afinidad.AGUA);
		Criatura decorada = new LlamaInterna(base);

		decorada.entrenar();

		assertTrue(base.esInestable());
	}

	@Test
	public void queBendicionDelRioDupliqueLaEnergia() {

		Criatura base = new CriaturaDomesticada("Agua", 30, Afinidad.AGUA);
		Criatura decorada = new BendicionDelRio(base);

		decorada.entrenar();

		assertEquals(Integer.valueOf(60), base.getEnergia());
	}

	@Test
	public void queBendicionDelRioNoSupereElTopeDe180() {

		Criatura base = new CriaturaDomesticada("Acuatica", 100, Afinidad.AGUA);
		Criatura decorada = new BendicionDelRio(base);

		decorada.entrenar();

		assertEquals(Integer.valueOf(180), base.getEnergia());
	}

	@Test
	public void queVinculoTerrestreNoPermitaEnergiaMenorA50() {

		Criatura base = new CriaturaDomesticada("Tierra", 10, Afinidad.TIERRA);
		Criatura decorada = new VinculoTerrestre(base);

		decorada.entrenar();

		assertEquals(Integer.valueOf(50), base.getEnergia());
	}

	@Test
	public void queVinculoTerrestrePermitaEnergiaMayorA50() {

		Criatura base = new CriaturaDomesticada("Tierra", 40, Afinidad.TIERRA);
		Criatura decorada = new VinculoTerrestre(base);

		decorada.entrenar();

		assertEquals(Integer.valueOf(60), base.getEnergia());
	}

	@Test
	public void queAscensoDelVientoCambieTemporalmenteAfinidadAAire() {

		Criatura base = new CriaturaDomesticada("Voladora", 20, Afinidad.FUEGO);
		Criatura decorada = new AscensoDelViento(base);

		decorada.entrenar();

		assertEquals(Integer.valueOf(40), base.getEnergia());
		assertEquals(Afinidad.FUEGO, base.getAfinidad());
	}

	@Test
	public void queTransformacionMantengaEstabilidadDeLaCriaturaOriginal() {
		Criatura base = new CriaturaSalvaje("Salvaje", 100, Afinidad.FUEGO);
		base.setInestable(true);
		Criatura decorada = new LlamaInterna(base);

		decorada.pacificar();

		assertFalse(base.esInestable());
	}
}