package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;
import org.junit.Test;

public class InteraccionesTest {

	private final Interaccion gestor = new GestorDeInteracciones();

	@Test
	public void queCriaturasConAfinidadIgualGanenEnergia() {
		Criatura criaturaUno = new CriaturaDomesticada("A", 50, Afinidad.AGUA);
		Criatura criaturaDos = new CriaturaDomesticada("B", 60, Afinidad.AGUA);
		gestor.aplicar(criaturaUno, criaturaDos);

		assertEquals(Integer.valueOf(60), criaturaUno.getEnergia());
		assertEquals(Integer.valueOf(70), criaturaDos.getEnergia());
	}

	@Test
	public void queCriaturasConAfinidadOpuestaSeVuelvanInestables() {
		Criatura criaturaUno = new CriaturaDomesticada("A", 50, Afinidad.AGUA);
		Criatura criaturaDos = new CriaturaDomesticada("B", 60, Afinidad.FUEGO);
		gestor.aplicar(criaturaUno, criaturaDos);

		assertTrue(criaturaUno.esInestable());
		assertTrue(criaturaDos.esInestable());
	}

	@Test
	public void queCriaturaAncestralGaneYLaOtraPierdaEnergia() {
		Criatura criaturaUno = new CriaturaAncestral("Ancestro", 120, Afinidad.TIERRA);
		Criatura criaturaDos = new CriaturaDomesticada("NoAncestral", 40, Afinidad.TIERRA);
		gestor.aplicar(criaturaUno, criaturaDos);

		assertEquals(Integer.valueOf(140), criaturaUno.getEnergia());
		assertEquals(Integer.valueOf(25), criaturaDos.getEnergia());
	}

	@Test
	public void queSiLaSegundaEsAncestralGaneYLaOtraPierdaEnergia() {
		Criatura criaturaUno = new CriaturaDomesticada("NoAncestral", 30, Afinidad.FUEGO);
		Criatura criaturaDos = new CriaturaAncestral("Ancestro", 150, Afinidad.FUEGO);
		gestor.aplicar(criaturaUno, criaturaDos);

		assertEquals(Integer.valueOf(15), criaturaUno.getEnergia());
		assertEquals(Integer.valueOf(170), criaturaDos.getEnergia());
	}
}