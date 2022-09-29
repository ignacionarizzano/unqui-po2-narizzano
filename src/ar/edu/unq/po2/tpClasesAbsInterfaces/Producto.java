package ar.edu.unq.po2.tpClasesAbsInterfaces;

public abstract class Producto implements Cobrable {

	//private String nombre;
    protected float precio;
    protected int   stock;
    
	public Producto(float precio, int stock) {
		super();
		this.precio = precio;
		this.stock = stock;
	}

	public float getPrecio() {
		return precio;
	}
    
	public int getStock( ) {
		return stock;
	}
	
	public void decrementarStock() {
    	this.stock --;
    }
	
	public float montoAPagar() {
		return this.getPrecio();
	}
	
	public void cobrar() {
		this.stock --;
	}
}

