package dominio;

import dominio.Carta; // Importa tu clase Carta
import javax.swing.*;
import java.awt.*;

public class VentanaAmpliacion extends JDialog {

    public VentanaAmpliacion(Carta carta) {
        setTitle("Detalles de Carta: " + carta.getNombre());
        setSize(400, 500);
        setModal(true); // Bloquea la ventana principal hasta que se cierre esta
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // --- Imagen grande (Izquierda/Centro) ---
        // TODO: Cargar imagen en alta resolución
        JLabel lblImagenGrande = new JLabel("Imagen Grande", SwingConstants.CENTER);
        add(lblImagenGrande, BorderLayout.CENTER);

        // --- Panel de Estadísticas (Abajo o Derecha) ---
        JPanel panelStats = new JPanel(new GridLayout(5, 1));
        
        panelStats.add(new JLabel("Nombre: " + carta.getNombre()));
        panelStats.add(new JLabel("Tipo: " + carta.getTipo()));
        panelStats.add(new JLabel("Rareza: " + carta.getRareza()));
        
        // TODO: Agregar instanceof para mostrar atributos específicos (daño, bonificación, etc.)
        
        // TODO: Mostrar el poder calculado
        panelStats.add(new JLabel("Poder: " + carta.calcularPoder()));

        add(panelStats, BorderLayout.SOUTH);
    }
}