package dominio;

public class Energy extends Carta{
	

	

	private String elemento;

	@Override
	public float calcularPoder() {
		return 1f;
	}
	public Energy(String nombre, int rareza, String tipo, String elemento) {
		super(nombre, rareza, tipo);
		// TODO Auto-generated constructor stub
	}
	

}
