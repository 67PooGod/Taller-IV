package logica;

import dominio.*;

public class CartaFactory {
	public static Carta getCarta(String nombre, int rareza, String tipo, String extra1, String extra2)
	{
		if ("pokemon".equalsIgnoreCase(tipo)) return new Pokemon(nombre, rareza, tipo, Integer.parseInt(extra1),Integer.parseInt(extra2)) ;
		else if ("item".equalsIgnoreCase(tipo)) return new Item(nombre, rareza, tipo, Integer.parseInt(extra1));
		else if ("supporter".equalsIgnoreCase(tipo)) return new Supporter(nombre, rareza, tipo,Integer.parseInt(extra1));
		else if ("energy".equalsIgnoreCase(tipo)) return new Energy(nombre, rareza, tipo, extra1);
		return null;
	}

}
