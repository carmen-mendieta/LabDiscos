package py.edu.ucsa.lab12.discos.clases;

import java.util.List;

import py.edu.ucsa.lab12.discos.interfaces.Borrable;
import py.edu.ucsa.lab12.discos.interfaces.Grabable;
import py.edu.ucsa.lab12.discos.interfaces.Mostrable;

public class Grabador {
	public void grabarDiscosYAgregar(List<Grabable> discos, PortaDiscos pd) {
		if (discos != null && pd != null && !discos.isEmpty()) {
			System.out.println("Iniciando proceso de grabación de " + discos.size() + " discos");
			for (Grabable g : discos) {
				g.grabar();
				pd.getListaDiscosGrabados().add(g);
			}
			System.out.println("Finalizando proceso de grabación");
		}
	}
	
	public void borrarDiscosYAgregar(List<Borrable> discos, PortaDiscos pd) {
		if (discos != null && pd != null && !discos.isEmpty()) {
			System.out.println("Iniciando proceso de borrado de " + discos.size() + " discos");
			discos.forEach(disco -> {
				disco.borrar();
				pd.getListaDiscosBorrados().add(disco);
			});
			System.out.println("Finalizando proceso de borrado");
		}
	}
	
	public void mostrarInfoDiscosGrabables(PortaDiscos pd) {
		if (pd != null) {
			System.out.println("Mostrando info de discos grabables: ");
			pd.getListaDiscosGrabados().forEach(disco -> disco.mostrarInfo());
//			for (Mostrable m : pd.getListaDiscosGrabados()) {
//				m.mostrarInfo();
//			}
			System.out.println("************************************");
		}
	}
	
	public void mostrarInfoDiscosBorrables(PortaDiscos pd) {
		if (pd != null) {
			System.out.println("Mostrando info de discos borrables: ");
//			pd.getListaDiscosBorrados().forEach(disco -> disco.mostrarInfo());
			for (Borrable m : pd.getListaDiscosBorrados()) {
				m.mostrarInfo();
			}
			System.out.println("************************************");
		}
	}
}
