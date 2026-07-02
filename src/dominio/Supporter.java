package dominio;
import logica.*;
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
	@Override
    public void aceptar(CartaVisitor visitor) {
        visitor.visit(this);
    }
	public int getEfectosPorTurno() {
		return efectosPorTurno;
	}
	
}
