package ar.edu.unq.po2.tpObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SistemaDivulgacion extends Observable {

	private List<Investigador> investigadores;
	private List<ArticuloCientifico> articulos;
	
	
	
	public SistemaDivulgacion() {
		super();
		this.investigadores = new ArrayList<Investigador>();
		this.articulos = new ArrayList<ArticuloCientifico>();
	}


	@Override
	public void notificar() {
		// TODO Auto-generated method stub
//		investigadores.forEach(i -> i.actualizar());
	    for (Investigador investigador : investigadores) {
			investigador.actualizar();
		}
	}


	public void agregar(Investigador investigador) {
		// TODO Auto-generated method stub
		investigadores.add(investigador);
	}
    
	public void cargarArticulo(ArticuloCientifico a) {
		// TODO Auto-generated method stub
		System.out.println("El estado cambia cuando se agrega un articulo");
		System.out.println("Cantidad de articulos: " + this.cantidadDeArticulos());
		articulos.add(a);
		System.out.println("Se agrega un articulo");
		System.out.println("Cantidad de articulos: " + this.cantidadDeArticulos());		
		this.notificar();
	}
	
	public int cantidadDeArticulos() {
		return articulos.size();
	}
	
}
