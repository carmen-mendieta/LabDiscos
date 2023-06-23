package py.edu.ucsa.lab12.discos.clases;

import py.edu.ucsa.lab12.discos.interfaces.Borrable;

public class CD extends DiscoDigital implements Borrable {
	
	private String marca;

	public CD(boolean ambosLados, boolean cerrado, double cantGrabada, double capacidad, String marca) {
		super(ambosLados, cerrado, cantGrabada, capacidad);
		this.marca = marca;
	}

	@Override
	public void grabar() {
		System.out.println("***** GRABANDO CD *****");
		this.setCantGrabada(this.getCapacidad());
	}

	@Override
	public void borrar() {
		System.out.println("***** BORRANDO CD *****");
		this.setCantGrabada(0);
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("MARCA: " + this.marca);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


}
