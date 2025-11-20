package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;
import org.junit.Test;

public class TransformacionesTest {

    @Test
    public void queLlamaInternaSume10DeEnergiaAlEntrenar() {
        Criatura base = new CriaturaDomesticada("Fuego", 50, Afinidad.FUEGO);
        Criatura decorada = new LlamaInterna(base);
        decorada.entrenar();
        assertEquals(Integer.valueOf(60), base.getEnergia());
    }

    @Test
    public void queBendicionDelRioSume5DeEnergiaAlEntrenar() {
        Criatura base = new CriaturaDomesticada("Agua", 30, Afinidad.AGUA);
        Criatura decorada = new BendicionDelRio(base);
        decorada.entrenar();
        assertEquals(Integer.valueOf(35), base.getEnergia());
    }

    @Test
    public void queAscensoDelVientoSume15DeEnergiaAlEntrenar() {
        Criatura base = new CriaturaDomesticada("Viento", 20, Afinidad.AIRE);
        Criatura decorada = new AscensoDelViento(base);
        decorada.entrenar();
        assertEquals(Integer.valueOf(35), base.getEnergia());
    }

    @Test
    public void queVinculoTerrestreSume7DeEnergiaAlEntrenar() {
        Criatura base = new CriaturaDomesticada("Tierra", 40, Afinidad.TIERRA);
        Criatura decorada = new VinculoTerrestre(base);
        decorada.entrenar();
        assertEquals(Integer.valueOf(47), base.getEnergia());
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