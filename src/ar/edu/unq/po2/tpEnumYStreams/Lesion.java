package ar.edu.unq.po2.tpEnumYStreams;

public enum Lesion {
    
	ROJO("Muy grave", 4), GRIS("Grave", 3) , AMARILLO("Moderado", 2), MIEL("Leve", 1);
	
	String descripcion;
	int gradoLesion;
	
	
	Lesion (String descripcion, int grado) {
		this.descripcion = descripcion;
	    this.gradoLesion = grado;
	}
	
	
	public String getDescripcion() {
		return descripcion;
	}


	public int getGradoLesion() {
		return gradoLesion;
	}
    
	public Lesion siguiente() {
		switch (this) {
		case ROJO: {
			return GRIS;
		}
		case GRIS: {
			return AMARILLO;
		}
		case AMARILLO: {
			return MIEL;
		}
		case MIEL: {
			return ROJO;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this);
		}
	}
    
	

}
