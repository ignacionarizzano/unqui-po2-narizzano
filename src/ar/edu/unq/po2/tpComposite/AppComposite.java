package ar.edu.unq.po2.tpComposite;

public class AppComposite {
    public static void main(String[] args) {
    	ParcelaMixta pm = new ParcelaMixta();
    	ParcelaSoja ps = new ParcelaSoja();
    	ParcelaTrigo pt = new ParcelaTrigo();
    	ParcelaMixta pm2 = new ParcelaMixta();
    	pm2.añadir(ps);
		pm2.añadir(ps);
		pm2.añadir(pt);
		pm2.añadir(pt);
	    pm.añadir(ps);
		pm.añadir(ps);
		pm.añadir(pt);
		pm.añadir(pm2);
    	
		
		System.out.println("Ganancia esperada: " + (pm2.calcularGananciaAnual() + ps.calcularGananciaAnual() *2 + pt.calcularGananciaAnual()));
		System.out.println();
		System.out.println("Ganancia obtenida " + "USD " + pm.calcularGananciaAnual());
    }
}
