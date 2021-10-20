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
		for (int i=0; i<asientos.length;i++) {
			resultado=resultado+1;
		}
		return resultado;
	}
	
	String verficarIntegridad() {
		
	}
	
	
	
}
