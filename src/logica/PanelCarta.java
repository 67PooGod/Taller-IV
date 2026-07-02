package logica;

import dominio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class PanelCarta extends JPanel {

    private Carta cartaRepresentada;

    public PanelCarta(Carta carta) {
        this.cartaRepresentada = carta;
        
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(140, 200));

     
     
        String rutaImagen = "tallerIV/ImagenData/" + carta.getNombre() + ".png"; 
        File archivoImagen = new File(rutaImagen);
        ImageIcon iconoOriginal;

        
        if (archivoImagen.exists()) {
            iconoOriginal = new ImageIcon(rutaImagen);
        } else {
        
            iconoOriginal = new ImageIcon("tallerIV/ImagenData/default.png"); 
        }

       
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
        JLabel lblImagen = new JLabel(new ImageIcon(imagenEscalada), SwingConstants.CENTER);
        
        add(lblImagen, BorderLayout.CENTER);
       
      

        JLabel lblNombre = new JLabel(carta.getNombre(), SwingConstants.CENTER);
        add(lblNombre, BorderLayout.SOUTH);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VentanaAmpliacion dialog = new VentanaAmpliacion(cartaRepresentada);
                dialog.setVisible(true);
            }
        });
    }
}