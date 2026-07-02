package dominio;

import logica.CartaVisitor;

public class Pokemon extends Carta{
	
	
	private int damage;
	private int cantEnergias;
	@Override
	public float calcularPoder() {
		
		if (cantEnergias == 0) return 0f;
	    return ((float) damage / cantEnergias) * 100f;
	}
	public Pokemon(String nombre, int rareza, String tipo, int damage, int cantEnergias) {
		super(nombre, rareza, tipo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void aceptar(CartaVisitor visitor) {
        visitor.visit(this);
    }
	public int getDamage() {
		return damage;
	}
	public int getCantEnergias() {
		return cantEnergias;
	}
	

}
