//Lucas gonzalez 22.336.895-6
package dominio;

import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		Sistema.getInstance();
		Sistema.getInstance().leerArchivo();
		System.out.println("por rareza");
		Sistema.getInstance().ordenarCartasPorRareza();
		Sistema.getInstance().mostrarCartas();
		System.out.println("por nombre");
		Sistema.getInstance().ordenarCartasPorNombre();
		Sistema.getInstance().mostrarCartas();
		System.out.println("por poder");
		Sistema.getInstance().ordenarCartasPorPoder();
		Sistema.getInstance().mostrarCartasPoder();
		
		
	}

}
