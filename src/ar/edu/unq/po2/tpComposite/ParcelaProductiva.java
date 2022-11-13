package ar.edu.unq.po2.tpComposite;

public abstract class ParcelaProductiva {
    public abstract int calcularGananciaAnual();
    public abstract void añadir(ParcelaProductiva pp);
    public abstract void eliminar(ParcelaProductiva pp);
    public abstract int cantidadSubregiones();
}
