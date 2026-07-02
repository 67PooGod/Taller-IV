//Lucas gonzalez 22.336.895-6
package logica;

import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		Sistema.getInstance();
		Sistema.getInstance().leerArchivo();
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
		
	}

}
