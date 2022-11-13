package ar.edu.unq.po2.tpComposite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelasTestCase {

	ParcelaMixta pm;
	ParcelaSoja ps;
	ParcelaTrigo pt;
	ParcelaMixta pm2;
	
	@BeforeEach
	void setUp() throws Exception {
	    pm = new ParcelaMixta();
	    pm2 = new ParcelaMixta();
	    ps = new ParcelaSoja();
	    pt = new ParcelaTrigo();
		pm2.añadir(ps);
		pm2.añadir(ps);
		pm2.añadir(pt);
		pm2.añadir(pt);
	    pm.añadir(ps);
		pm.añadir(ps);
		pm.añadir(pt);
		pm.añadir(pm2);
	    
	}

	@Test
	void anadirTest() {
		pm.añadir(ps);
		
		assertEquals(pm.cantidadSubregiones(), 4);
	}
    
	@Test
	void calcularGananciaAnualTest() {
		int gananciaEsperada = pm2.calcularGananciaAnual() + ps.calcularGananciaAnual() * 2 + pt.calcularGananciaAnual();
		assertEquals(pm.calcularGananciaAnual(), gananciaEsperada);
	}
}
