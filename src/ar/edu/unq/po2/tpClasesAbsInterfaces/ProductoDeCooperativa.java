package ar.edu.unq.po2.tpClasesAbsInterfaces;

public class ProductoDeCooperativa extends Producto {

	
	public ProductoDeCooperativa(float price, int stock) {
		super(price, stock);
		// TODO Auto-generated constructor stub
		this.price = price - (price * 10) / 100;
	}
    
	
}
