package dominio;

public class Supporter extends Carta{
	

	

	private int efectosPorTurno;

	@Override
	public float calcularPoder() {
		
		return efectosPorTurno * 50f;
	}
	public Supporter(String nombre, int rareza, String tipo, int efectosPorTurno) {
		super(nombre, rareza, tipo);
		// TODO Auto-generated constructor stub
	}
	
}
