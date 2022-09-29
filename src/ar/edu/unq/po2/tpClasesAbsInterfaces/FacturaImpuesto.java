package ar.edu.unq.po2.tpClasesAbsInterfaces;

public class FacturaImpuesto extends Factura {

	private float tasa;
	
	public FacturaImpuesto(float tasa) {
		super();
		// TODO Auto-generated constructor stub
		this.tasa = tasa;
	}
    
	public void cobrar() {
		this.registrarPago(this);
	}
	
	public float montoAPagar() {
		return tasa;
	}
	
	public void registrarPago(Factura c) {
	    System.out.println("Pago de " + this.montoAPagar() + " realizado con exito");
	}
}
