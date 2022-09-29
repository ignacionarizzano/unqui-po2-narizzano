package ar.edu.unq.po2.tpClasesAbsInterfaces;

public class ProductoDeCooperativa extends Producto {
	
	
	public ProductoDeCooperativa(float precio, int stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
		this.precio = precio - (precio * 10) / 100;
	}
    
}
