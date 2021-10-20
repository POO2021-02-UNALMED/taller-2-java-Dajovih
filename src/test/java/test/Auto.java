package test
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
	int cantidadAsientos() {
		int resultado;
		for (int i=0; i<asientos.length;i++) {
			resultado++;
		}
		return resultado;
	}
	
	String verficarIntegridad() {
		
	}
	
	
	
}
