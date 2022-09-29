package ar.edu.unq.po2.tpClasesAbsInterfaces;

public class Caja {
	
    private float montoAPagar = 0;
    
    public void registrar(Cobrable c) {
    	montoAPagar += c.montoAPagar();
    	c.cobrar();
    }
    
    public float informarMonto() {
    	System.out.println("TOTAL " + this.montoAPagar);
    	return montoAPagar;
    }
    
}
