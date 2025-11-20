package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaestroElementalTest {

    @Test
    public void queSePuedaAgregarCriaturaAlMaestro() {
        MaestroElemental maestro = new MaestroElemental("Zuko", 12, Afinidad.FUEGO);
        Criatura criatura = new CriaturaDomesticada("Draco", 80, Afinidad.FUEGO);
        maestro.agregarCriatura(criatura);
        assertNotNull(maestro.getCriatura("Draco"));
    }

    @Test
    public void queMaestroPuedaEntrenarCriaturaSiTieneSuficienteMaestria() throws FaltaDeMaestriaException {
        MaestroElemental maestro = new MaestroElemental("Iroh", 15, Afinidad.FUEGO);
        Criatura criatura = new CriaturaDomesticada("Fenix", 100, Afinidad.FUEGO);
        maestro.agregarCriatura(criatura);
        maestro.entrenar("Fenix");
        assertEquals(Integer.valueOf(120), maestro.getCriatura("Fenix").getEnergia());
    }

    @Test(expected = FaltaDeMaestriaException.class)
    public void queLanceFaltaDeMaestriaExceptionSiNoTieneNivelSuficiente() throws FaltaDeMaestriaException {
        MaestroElemental maestro = new MaestroElemental("Novato", 5, Afinidad.AGUA);
        Criatura criatura = new CriaturaDomesticada("Nami", 90, Afinidad.AGUA);
        maestro.agregarCriatura(criatura);
        maestro.entrenar("Nami");
    }

    @Test
    public void queMaestroPuedaPacificarCriatura() {
        MaestroElemental maestro = new MaestroElemental("Katara", 20, Afinidad.AGUA);
        Criatura criatura = new CriaturaAncestral("Poseidon", 150, Afinidad.AGUA);
        criatura.setInestable(true);
        maestro.agregarCriatura(criatura);
        maestro.pacificar("Poseidon");
        assertFalse(maestro.getCriatura("Poseidon").esInestable());
    }

    @Test
    public void queGettersFuncionenCorrectamente() {
        MaestroElemental maestro = new MaestroElemental("Toph", 18, Afinidad.TIERRA);
        assertEquals("Toph", maestro.getNombre());
        assertEquals(Integer.valueOf(18), maestro.getNivelDeMaestria());
        assertEquals(Afinidad.TIERRA, maestro.getAfinidad());
    }
}