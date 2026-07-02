package dominio;
import logica.*;
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
	@Override
    public void aceptar(CartaVisitor visitor) {
        visitor.visit(this);
    }
	public String getElemento() {
		return elemento;
	}
	

}
