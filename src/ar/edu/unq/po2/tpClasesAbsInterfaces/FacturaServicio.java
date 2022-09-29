package ar.edu.unq.po2.tpClasesAbsInterfaces;

public class FacturaServicio extends Factura {
    
	
	public FacturaServicio(float costoPorUnidad, float unidadConsumida) {
		super();
		// TODO Auto-generated constructor stub
		this.montoAPagar = costoPorUnidad * unidadConsumida;
	}
    	
}
