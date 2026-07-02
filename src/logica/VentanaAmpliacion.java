package logica;

import dominio.*; 
import javax.swing.*;
import java.awt.*;

public class VentanaAmpliacion extends JDialog {

    public VentanaAmpliacion(Carta carta) {
        setTitle("Detalles de Carta: " + carta.getNombre());
        setSize(400, 500);
        setModal(true);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        
        JLabel lblImagenGrande = new JLabel("Imagen Grande", SwingConstants.CENTER);
        add(lblImagenGrande, BorderLayout.CENTER);

        
        JPanel panelStats = new JPanel(new GridLayout(5, 1));
        
        panelStats.add(new JLabel("Nombre: " + carta.getNombre()));
        panelStats.add(new JLabel("Tipo: " + carta.getTipo()));
        panelStats.add(new JLabel("Rareza: " + carta.getRareza()));
        
        calculosVisitor visitor = new calculosVisitor();
          
        carta.aceptar(visitor);
        
        panelStats.add(new JLabel("Atributos: " + visitor.getTextoDetalles()));
        panelStats.add(new JLabel("Poder: " + carta.calcularPoder()));

        add(panelStats, BorderLayout.SOUTH);
    }
}