package ar.edu.unq.po2.tpEnumYStreams;

import java.time.Duration;
import java.time.LocalTime;

public class ActividadSemanal {
    private DiaDeLaSemana diaDeLaSemana;
    private LocalTime horaDeInicio;
    private Duration duracion;
    private Deporte deporte;
    
    
    public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, LocalTime horaDeInicio, Duration duracion, Deporte deporte) {
		super();
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}


	public int costo() {
    	int subtotalPorComplejidad = deporte.getComplejidad() * 200;
    	if (diaDeLaSemana.ordinal() <= 2) {
    		return 500 + subtotalPorComplejidad;
    	} else {
    		return 1000 + subtotalPorComplejidad;
    	}
    }


	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}


	public Duration getDuracion() {
		return duracion;
	}


	public Deporte getDeporte() {
		return deporte;
	}
}

