package ar.edu.unq.po2.tpClasesAbsInterfaces;

public abstract class Producto {

	//private String nombre;
    protected float price;
    protected int stock;
    
	public Producto(float price, int stock) {
		super();
		this.price = price;
		this.stock = stock;
	}

	public float getPrice() {
		return price;
	}
    
	public int getStock( ) {
		return stock;
	}
	
	public void decreaseStock() {
    	this.stock --;
    }
}

