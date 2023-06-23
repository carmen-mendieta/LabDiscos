package py.edu.ucsa.lab12.discos.clases;

public class BD extends DiscoDigital {
	
	private String material;

	public BD(boolean ambosLados, boolean cerrado, double cantGrabada, double capacidad, String material) {
		super(ambosLados, cerrado, cantGrabada, capacidad);
		this.material = material;
	}

	@Override
	public void grabar() {
		System.out.println("***** GRABANDO BD *****");
		this.setCantGrabada(this.getCapacidad()*0.98);
		this.setCerrado(true);
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("MATERIAL: " + this.material);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}


}
