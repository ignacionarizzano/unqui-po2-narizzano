package ar.edu.unq.po2.tpEnumYStreams;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SecretariaDeDeportesMunicipal {
    private List<ActividadSemanal> actividadesSemanales = new ArrayList<ActividadSemanal>();

	public List<ActividadSemanal> getActividadesSemanales() {
		return actividadesSemanales;
	}

	public void agregarActividad(ActividadSemanal a) {
		actividadesSemanales.add(a);
	}
    
    public List<ActividadSemanal> actividadesDe(Deporte d) {
    	return actividadesSemanales.stream().filter(a -> a.getDeporte() == d).toList();
    }
    public List<ActividadSemanal> actividadesDeComplejidad(int c) {
    	return actividadesSemanales.stream().filter(a -> a.getDeporte().getComplejidad() == c).toList();
    }
    public Duration horasTotales() {
    	List<Duration> ld = actividadesSemanales.stream().map(a -> a.getDuracion()).toList();
    	return ld.stream().reduce(Duration.ZERO, (acumulado, nuevo) -> acumulado.plus(nuevo));
    }
	
}
