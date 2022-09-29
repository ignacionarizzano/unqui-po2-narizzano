package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

//import ar.edu.unq.po2.tp3.Persona;

public class EquipoDeTrabajo {
    
	private String teamName;
	private List<Persona> members = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombreEquipo) {
		super();
		setTeamName(nombreEquipo);
	}
	
	//getters y setters
	public String getTeamName() {
		return teamName;
	}
	private void setTeamName(String nombreEquipo) {
		this.teamName = nombreEquipo;
	}
	public List<Persona> getMembers() {
		return members;
	}
	
	//metodo para añadir un integrante
	public void addMember(Persona p) {
		getMembers().add(p);
	}
	
    public int getAverageAge() {
    	int suma = 0; 
        for (Persona persona : members) {
			suma += persona.getEdad();
		}
    	return suma / members.size();
    }

}



