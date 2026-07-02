package dominio;
import logica.*;
public class Item extends Carta{
	

	

	private int bonificacion;

	@Override
	public float calcularPoder() {
		
		return bonificacion * 20f;
	}
	public Item(String nombre, int rareza, String tipo, int bonificacion ) {
		super(nombre, rareza, tipo);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void aceptar(CartaVisitor visitor) {
        visitor.visit(this);
    }
	public int getBonificacion() {
		return bonificacion;
	}	



}
