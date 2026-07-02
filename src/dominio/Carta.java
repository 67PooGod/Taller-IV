package dominio;

import logica.CartaVisitor;

public abstract class Carta {
	private String nombre;
	private int rareza;
	private String tipo;
	
	
	
	public Carta(String nombre, int rareza, String tipo) {
		super();
		this.nombre = nombre;
		this.rareza = rareza;
		this.tipo = tipo;
	}



	



	public String getTipo() {
		return tipo;
	}



	@Override
	public String toString() {
		return "Carta [nombre=" + nombre + ", rareza=" + rareza + ", tipo=" + tipo + "]";
	}



	public String getNombre() {
		return nombre;
	}



	public int getRareza() {
		return rareza;
	}
	
	public abstract float calcularPoder();

			
	public abstract void aceptar(CartaVisitor visitor);



	
	

}
