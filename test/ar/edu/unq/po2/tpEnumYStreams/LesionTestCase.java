package ar.edu.unq.po2.tpEnumYStreams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionTestCase {
    
	private Lesion grave;
	
	@BeforeEach
	void setUp() {
		grave = Lesion.ROJO;
	}

	@Test
	void testSiguienteG() {
		
		assertEquals(grave.siguiente(), Lesion.GRIS);
		System.out.println(grave.siguiente());
		System.out.println(grave.siguiente().ordinal());
	}
	@Test
	void testDescripcion() {
		
		assertEquals(grave.getDescripcion(), "Muy grave");
	}
	@Test
	void testGradoLesion() {
		
		assertEquals(grave.getGradoLesion(), 4);
	}

}
