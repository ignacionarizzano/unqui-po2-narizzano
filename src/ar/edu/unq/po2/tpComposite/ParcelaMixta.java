package ar.edu.unq.po2.tpComposite;

import java.util.ArrayList;
import java.util.List;

public class ParcelaMixta extends ParcelaProductiva{
    
	private List<ParcelaProductiva> subregiones = new ArrayList<ParcelaProductiva>();
	
	@Override
	public int calcularGananciaAnual() {
		// TODO Auto-generated method stub
//		return subregiones.stream().map(r -> r.calcularGananciaAnual()).reduce(0, (acumulado, nuevo) -> acumulado + nuevo);
		return subregiones.stream().mapToInt(s->s.calcularGananciaAnual()).sum();
	}

	@Override
	public void añadir(ParcelaProductiva pp) {
		// TODO Auto-generated method stub
		if (subregiones.size() < 4) {
			subregiones.add(pp);
		}
	}

	@Override
	public void eliminar(ParcelaProductiva pp) {
		// TODO Auto-generated method stub
		subregiones.remove(pp);
	}

	@Override
	public int cantidadSubregiones() {
		// TODO Auto-generated method stub
		return subregiones.size();
	}
}
