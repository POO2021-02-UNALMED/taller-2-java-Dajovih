package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	int cantidadAsientos() {
		int resultado=0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i]!=null)
					resultado=resultado+1;
		}
		return resultado;
	}
	
	String verficarIntegridad() {
		String resultado="Auto original";
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i]!=null)
					if (motor.registro==registro && registro==asientos[i].registro)
						continue;
					else
						resultado="Las piezas no son originales";
						break;
		}
		return resultado;
		
	}
	
	
	
}
