package ar.edu.unq.po2.tpObserver;

public class Investigador extends Observer{

	private SistemaDivulgacion sd;
	private String nombre;
	
	public Investigador(SistemaDivulgacion sd, String nombre) {
		super();
		this.sd = sd;
		this.nombre = nombre;
		this.sd.agregar(this);
	}



	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		System.out.println("Hola " + nombre + "!");
		System.out.println("Ingreso un nuevo articulo de tu interes");
	}
    
}
