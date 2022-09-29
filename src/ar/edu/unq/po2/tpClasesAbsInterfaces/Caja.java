package ar.edu.unq.po2.tpClasesAbsInterfaces;

public class Caja implements Agencia{
    private float montoAPagar = 0;
    
    public void registrar(Producto p) {
    	montoAPagar += p.getPrice();
    	p.decreaseStock();
    }
    public float informarMonto() {
    	return montoAPagar;
    }
    public void registrarPago(Factura f) {
    	montoAPagar = f.getMontoAPagar();
		System.out.println("Pago de " + montoAPagar + " realizado con exito");
	}
}
