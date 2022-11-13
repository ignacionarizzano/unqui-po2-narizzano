package ar.edu.unq.po2.tpEnumYStreams;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDeDeportesTest {
    
	private static final LocalTime LocalTime = null;
	SecretariaDeDeportesMunicipal sd;
	
	
	@BeforeEach
	void setUp(){
		sd = new SecretariaDeDeportesMunicipal();
		sd.agregarActividad(new ActividadSemanal(DiaDeLaSemana.LUNES, LocalTime.of(10, 0) , Duration.ofHours(2), Deporte.FUTBOL));
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
