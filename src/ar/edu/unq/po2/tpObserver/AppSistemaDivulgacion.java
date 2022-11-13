package ar.edu.unq.po2.tpObserver;

public class AppSistemaDivulgacion {
    
	public static void main(String[] args) {
		
		SistemaDivulgacion sd = new SistemaDivulgacion();
		Investigador i1 = new Investigador(sd, "Juan");
        ArticuloCientifico a = new ArticuloCientifico("Biologia molecular");
        
        
        sd.cargarArticulo(a);		
	}
	
}
