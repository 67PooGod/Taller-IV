package dominio;


import dominio.Carta; // Importa tu clase Carta
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelCarta extends JPanel {

    private Carta cartaRepresentada;

    public PanelCarta(Carta carta) {
        this.cartaRepresentada = carta;
        
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(120, 180));

        // TODO: Cargar y escalar la imagen de la carta
        JLabel lblImagen = new JLabel("Imagen aquí", SwingConstants.CENTER); 
        add(lblImagen, BorderLayout.CENTER);

        // TODO: Poner el nombre de la carta en la parte inferior
        JLabel lblNombre = new JLabel(carta.getNombre(), SwingConstants.CENTER);
        add(lblNombre, BorderLayout.SOUTH);

        // --- Evento de Clic ---
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clic en la carta: " + cartaRepresentada.getNombre());
                // Instanciar y mostrar la ventana de ampliación
                VentanaAmpliacion dialog = new VentanaAmpliacion(cartaRepresentada);
                dialog.setVisible(true);
            }
        });
    }
}