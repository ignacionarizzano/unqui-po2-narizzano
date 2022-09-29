package ar.edu.unq.po2.tpClasesAbsInterfaces;

public class FacturaServicio extends Factura {
    
	private float costoPorUnidad;
	private float unidadesConsumidas;
	
	public FacturaServicio(float costoPorUnidad, float unidadConsumida) {
		super();
		// TODO Auto-generated constructor stub
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadConsumida;
		
	}
    
	public void cobrar() {
		this.registrarPago(this);
	}
	
	public float montoAPagar() {
		return this.costoPorUnidad * this.unidadesConsumidas;
	}
	
	public void registrarPago(Factura c) {
	    System.out.println("Pago de " + this.montoAPagar() + " realizado con exito");
	}
	
}
