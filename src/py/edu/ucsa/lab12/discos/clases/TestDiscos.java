package py.edu.ucsa.lab12.discos.clases;

import java.util.ArrayList;
import java.util.List;

import py.edu.ucsa.lab12.discos.interfaces.Borrable;
import py.edu.ucsa.lab12.discos.interfaces.Grabable;

public class TestDiscos {
	public static void main(String[] args) {
		CD cd1 = new CD(true, false, 0, 1400, "TDK");
		CD cd2 = new CD(false, false, 0, 800, "SONY");
		
		DVD dvd1 = new DVD(true, false, 0, 8600, "JAPON");
		DVD dvd2 = new DVD(false, false, 0, 4300, "USA");
		
		BD bd1 = new BD(true, false, 0, 50000, "MAGNETICO");
		BD bd2 = new BD(false, false, 0, 25000, "METALICO");
		
		PortaDiscos portaDiscos = new PortaDiscos();
		Grabador grab = new Grabador();
		
		List<Grabable> discosAGrabar = new ArrayList<>();
		discosAGrabar.add(bd2);
		discosAGrabar.add(bd1);
		discosAGrabar.add(dvd2);
		discosAGrabar.add(dvd1);
		discosAGrabar.add(cd2);
		discosAGrabar.add(cd1);
		
		grab.grabarDiscosYAgregar(discosAGrabar, portaDiscos);
		
		grab.mostrarInfoDiscosGrabables(portaDiscos);
		
		List<Borrable> discosABorrar = new ArrayList<>();
		discosABorrar.add(dvd2);
		discosABorrar.add(dvd1);
		discosABorrar.add(cd2);
		discosABorrar.add(cd1);
		//discosABorrar.add(bd2);
		
		grab.borrarDiscosYAgregar(discosABorrar, portaDiscos);
		grab.mostrarInfoDiscosBorrables(portaDiscos);
	}
}
