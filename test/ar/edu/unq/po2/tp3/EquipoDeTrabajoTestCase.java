package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

    private EquipoDeTrabajo equipo;
	private Persona juan;
	private Persona maria;
	private Persona carlos;
	private Persona cristina;
	private Persona alberto;
    
	@BeforeEach
	void setUp() throws Exception {
	    equipo = new EquipoDeTrabajo("Dream Team");
	    juan = new Persona("Juan", "Perez", 25);
	    maria = new Persona("Maria", "Rodriguez", 35);
	    carlos = new Persona("Carlos", "Gonzalez", 74);
	    cristina = new Persona("Cristina", "Fernandez", 67);
	    alberto = new Persona("Alberto", "Gomez", 55);
	}

	@Test
	void testAddMember() {
		equipo.addMember(juan);
		
		assertTrue(equipo.getMembers().size() == 1);
	}
    
	@Test
	void testAverageAge() {
		equipo.addMember(juan);
		equipo.addMember(maria);
		equipo.addMember(carlos);
		equipo.addMember(cristina);
		equipo.addMember(alberto);
		
		System.out.println(equipo.getAverageAge());
		assertTrue(equipo.getAverageAge() == 51);
	}
	
	
}
