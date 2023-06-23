package py.edu.ucsa.clases.excepciones;

public class ArgumentoIlegalException extends Exception {

	private static final long serialVersionUID = -5809597402882257689L;

	public ArgumentoIlegalException() {
		super("OCURRIO UNA EXCEPCION AL INVOCAR AL METODO, VERIFICAR LOS ARGUMENTOS ");
	}

	public ArgumentoIlegalException(String msg) {
		super(msg);
	}

	public ArgumentoIlegalException(Integer id) {
		super(new MensajeErrorDAO().getMensajeById(10));
	}

}
