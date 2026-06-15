package dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
	
	private ArrayList<Carta> cartas = new ArrayList<>(); 
	
	private static Sistema sis;

	private Sistema() {

	}
	
	public static Sistema getInstance() {
		if (sis == null) {
			sis = new Sistema();
		}
		return sis;
	}
	
	public void leerArchivo () throws FileNotFoundException {
		Scanner lector = new Scanner(new File("Sobres.txt"));
		while (lector.hasNextLine()) {
			String linea = lector.nextLine();
			String[] partes = linea.split(";");
			String nombre = partes[0];
			int rareza = Integer.parseInt(partes[1]);
			String tipo = partes[2];
			String extra1 = partes[3];
			if (tipo.equalsIgnoreCase("pokemon")) {
				String extra2 = partes[4];
				Carta c = CartaFactory.getCarta(nombre, rareza, tipo, extra1, extra2);
				cartas.add(c);
			} else {
				Carta c = CartaFactory.getCarta(nombre, rareza, tipo, extra1, null);
				cartas.add(c);
			}
			
		}
		
	}
	public void ordenarCartasPorRareza() {
        int n = cartas.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            	
                if (cartas.get(j).getRareza() < cartas.get(j + 1).getRareza()) {
                    Carta temp = cartas.get(j);
                    cartas.set(j, cartas.get(j + 1));
                    cartas.set(j + 1, temp);
                }
            }
        }
	}
	public void ordenarCartasPorPoder() {
        int n = cartas.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            	
                if (cartas.get(j).calcularPoder() < cartas.get(j + 1).calcularPoder()) {
                    Carta temp = cartas.get(j);
                    cartas.set(j, cartas.get(j + 1));
                    cartas.set(j + 1, temp);
                }
            }
        }
	}
	public void ordenarCartasPorNombre() {
	    int n = cartas.size();
	    for (int i = 0; i < n - 1; i++) {
	    	
	        for (int j = 0; j < n - i - 1; j++) {
	            
	            if (cartas.get(j).getNombre().compareToIgnoreCase(cartas.get(j + 1).getNombre()) > 0) {
	                Carta temp = cartas.get(j);
	                cartas.set(j, cartas.get(j + 1));
	                cartas.set(j + 1, temp);
	            }
	        }
	    }
	}
	
	public void mostrarCartas() {
		for (Carta c : cartas) {
		 System.out.println(c.toString());
		}
	}
	public void mostrarCartasPoder() {
		for (Carta c : cartas) {
		 System.out.println(c.toString());
		 System.out.println("poder= "+ c.calcularPoder());
		}
	}

	

}
