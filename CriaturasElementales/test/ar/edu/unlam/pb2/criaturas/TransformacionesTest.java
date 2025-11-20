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
    
    
    @Test
    public void queBendicionDelRioDupliqueEnergiaSinSuperar180() {
        Criatura base = new CriaturaDomesticada("Acuatica", 100, Afinidad.AGUA);
        Criatura decorada = new BendicionDelRio(base);
        decorada.entrenar();
        assertEquals(Integer.valueOf(180), base.getEnergia()); 
    }


    @Test
    public void queLlamaInternaSume30SiAfinidadEsFuego() {
        Criatura base = new CriaturaDomesticada("Fiera", 100, Afinidad.FUEGO);
        Criatura decorada = new LlamaInterna(base);
        decorada.entrenar();
        assertEquals(Integer.valueOf(130), base.getEnergia());
    }

    @Test
    public void queLlamaInternaVuelvaInestableSiNoEsFuego() {
        Criatura base = new CriaturaDomesticada("NoFuego", 100, Afinidad.AGUA);
        Criatura decorada = new LlamaInterna(base);
        decorada.entrenar();
        assertTrue(base.esInestable());
    }


    @Test
    public void queVinculoTerrestreNoPermitaEnergiaMenorA50() {
        Criatura base = new CriaturaDomesticada("Tierra", 40, Afinidad.TIERRA);
        Criatura decorada = new VinculoTerrestre(base);
        decorada.entrenar(); // Si no sube, fuerza mínimo 50
        assertTrue(base.getEnergia() >= 50);
    }


    @Test
    public void queAscensoDelVientoCambieTemporalmenteAfinidadAAire() {
        Criatura base = new CriaturaDomesticada("Voladora", 80, Afinidad.FUEGO);
        Criatura decorada = new AscensoDelViento(base);
        decorada.entrenar();
        assertEquals(Afinidad.FUEGO, base.getAfinidad()); // Se restaura
    }
    
    
    
    
}