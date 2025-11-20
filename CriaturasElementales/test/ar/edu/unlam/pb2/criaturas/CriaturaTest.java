package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;
import org.junit.Test;

public class CriaturaTest {

    @Test
    public void queSePuedaEntrenarUnaCriaturaSalvajeSinExcederEnergia() {
        CriaturaSalvaje criatura = new CriaturaSalvaje("Fiera", 150, Afinidad.FUEGO);
        criatura.entrenar();
        assertEquals(Integer.valueOf(180), criatura.getEnergia());
    }

    @Test(expected = EnergiaExcedidaException.class)
    public void queNoSePuedaEntrenarUnaCriaturaSalvajeSiExcedeEnergia() {
        CriaturaSalvaje criatura = new CriaturaSalvaje("Fiera", 180, Afinidad.FUEGO);
        criatura.entrenar();
    }

    @Test
    public void queCriaturaSalvajeSePacifiqueYBajeEnergia() {
        CriaturaSalvaje criatura = new CriaturaSalvaje("Fiera", 100, Afinidad.FUEGO);
        criatura.setInestable(true);
        criatura.pacificar();
        assertFalse(criatura.esInestable());
        assertEquals(Integer.valueOf(80), criatura.getEnergia());
    }

    @Test
    public void queSePuedaEntrenarUnaCriaturaDomesticada() {
        CriaturaDomesticada criatura = new CriaturaDomesticada("Domestika", 100, Afinidad.AGUA);
        criatura.entrenar();
        assertEquals(Integer.valueOf(120), criatura.getEnergia());
    }

    @Test
    public void queCriaturaDomesticadaSePacifique() {
        CriaturaDomesticada criatura = new CriaturaDomesticada("Domestika", 100, Afinidad.AGUA);
        criatura.setInestable(true);
        criatura.pacificar();
        assertFalse(criatura.esInestable());
    }

    @Test
    public void queSePuedaEntrenarUnaCriaturaAncestral() {
        CriaturaAncestral criatura = new CriaturaAncestral("Sabio", 50, Afinidad.TIERRA);
        criatura.entrenar();
        assertEquals(Integer.valueOf(100), criatura.getEnergia());
    }

    @Test
    public void queCriaturaAncestralSePacifiqueYSumeEnergia() {
        CriaturaAncestral criatura = new CriaturaAncestral("Sabio", 100, Afinidad.TIERRA);
        criatura.setInestable(true);
        criatura.pacificar();
        assertFalse(criatura.esInestable());
        assertEquals(Integer.valueOf(110), criatura.getEnergia());
    }
}