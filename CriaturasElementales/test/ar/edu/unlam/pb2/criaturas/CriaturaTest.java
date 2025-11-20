package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;

import org.junit.Test;

public class CriaturaTest {

    @Test
    public void queSePuedaEntrenarUnaCriaturaSalvajeSinExcederEnergia() {
        CriaturaSalvaje criatura = new CriaturaSalvaje("Fiera", 150, Afinidad.FUEGO);
        criatura.entrenar();
        assertEquals(180, criatura.getEnergia());
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
        assertEquals(80, criatura.getEnergia());
    }

    
}
