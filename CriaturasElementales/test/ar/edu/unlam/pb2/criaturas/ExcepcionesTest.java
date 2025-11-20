package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExcepcionesTest {
	
	   @Test(expected = EnergiaExcedidaException.class)
	    public void queCriaturaSalvajeLanceExcepcionAlSuperarEnergia() {
	        CriaturaSalvaje salvaje = new CriaturaSalvaje("Bestia", 190, Afinidad.AIRE);
	        salvaje.entrenar(); 
	    }
	   
	   @Test(expected = FaltaDeMaestriaException.class)
	    public void queMaestroLanceFaltaDeMaestriaException() throws FaltaDeMaestriaException {
	        MaestroElemental maestro = new MaestroElemental("Aang", 5, Afinidad.AGUA); 
	        CriaturaDomesticada criatura = new CriaturaDomesticada("Nami", 100, Afinidad.AGUA);

	        maestro.agregarCriatura(criatura);
	        maestro.entrenar("Nami"); 
	    }
	    
	}

	

