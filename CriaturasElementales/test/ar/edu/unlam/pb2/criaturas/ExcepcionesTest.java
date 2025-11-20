package ar.edu.unlam.pb2.criaturas;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExcepcionesTest {
	
	   @Test(expected = EnergiaExcedidaException.class)
	    public void queCriaturaSalvajeLanceExcepcionAlSuperarEnergia() {
	        CriaturaSalvaje salvaje = new CriaturaSalvaje("Bestia", 190, Afinidad.AIRE);
	        salvaje.entrenar(); 
	    }

	    
	}

	

