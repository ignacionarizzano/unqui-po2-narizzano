package ar.edu.unq.po2.tpClasesAbsInterfaces;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {

	private Caja cajaMercado;
	private ProductoDeCooperativa taza;
	private ProductoDeEmpresa fideos;
	private FacturaServicio gas;
	
	@BeforeEach
	void setUp() throws Exception {
		cajaMercado = new Caja();
		taza = new ProductoDeCooperativa(300, 5);
		fideos = new ProductoDeEmpresa(250, 100);
	    gas = new FacturaServicio(150, 5);
	}

	@Test
	void testRegistrarProductoCoop() {
		
		System.out.println(taza.getStock());

		cajaMercado.registrar(taza);
	    
		System.out.println(taza.getPrice());
		System.out.println(taza.getStock());
		assertTrue(cajaMercado.informarMonto() == taza.getPrice());
		assertTrue(taza.getStock() == 4);
	}
    
	@Test
	void testRegistrarProductoEmp( ) {
		
	    cajaMercado.registrar(fideos);
		
	    assertTrue(cajaMercado.informarMonto() == fideos.getPrice());
	    assertTrue(fideos.getStock() == 99);
	}
	
	@Test
	void testPagarServicio() {
		
		cajaMercado.registrarPago(gas);
		
		assertTrue(cajaMercado.informarMonto() == gas.getMontoAPagar());
	}
	
	
}
