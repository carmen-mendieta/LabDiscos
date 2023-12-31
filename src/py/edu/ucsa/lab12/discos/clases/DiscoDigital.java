package py.edu.ucsa.lab12.discos.clases;

import py.edu.ucsa.lab12.discos.interfaces.Grabable;

public abstract class DiscoDigital implements Grabable{
	private boolean ambosLados;
	private boolean cerrado;
	private double cantGrabada;
	private double capacidad;

	public DiscoDigital(boolean ambosLados, boolean cerrado, double cantGrabada, double capacidad) {
		super();
		this.ambosLados = ambosLados;
		this.cerrado = cerrado;
		this.cantGrabada = cantGrabada;
		this.capacidad = capacidad;
	}

	@Override
	public void mostrarInfo() {
		System.out.println("...MOSTRANDO INFO DE ... " + this.getClass().getSimpleName());
		System.out.println("¿ESTÁ CERRADO?: "  + (this.cerrado ? "SI" : "NO"));
		System.out.println("CANT. GRABADA: " + this.cantGrabada);
		System.out.println("CAPACIDAD: " + this.capacidad);
		System.out.println("¿GRABA AMBOS LADOS?: "  + (this.ambosLados ? "SI" : "NO"));
	}
	
	public boolean isAmbosLados() {
		return ambosLados;
	}
	public void setAmbosLados(boolean ambosLados) {
		this.ambosLados = ambosLados;
	}
	public boolean isCerrado() {
		return cerrado;
	}
	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}
	public double getCantGrabada() {
		return cantGrabada;
	}
	public void setCantGrabada(double cantGrabada) {
		this.cantGrabada = cantGrabada;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
}
