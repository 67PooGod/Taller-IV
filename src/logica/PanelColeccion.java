package logica;


import javax.swing.*;
import java.awt.*;

public class PanelColeccion extends JPanel {

    private JPanel panelGrilla;
    private JButton btnOrdRareza, btnOrdNombre, btnOrdPoder;

    public PanelColeccion() {
        setLayout(new BorderLayout());

     
        JPanel panelBotones = new JPanel();
        btnOrdRareza = new JButton("Ordenar por Rareza");
        btnOrdNombre = new JButton("Ordenar por Nombre");
        btnOrdPoder = new JButton("Ordenar por Poder");

        panelBotones.add(btnOrdRareza);
        panelBotones.add(btnOrdNombre);
        panelBotones.add(btnOrdPoder);
        add(panelBotones, BorderLayout.NORTH);

       
        panelGrilla = new JPanel(new GridLayout(0, 4, 10, 10)); 
        JScrollPane scroll = new JScrollPane(panelGrilla);
        add(scroll, BorderLayout.CENTER);

      
        configurarEventos();
    }

    private void configurarEventos() {
        btnOrdRareza.addActionListener(e -> {
            
            Sistema.getInstance().ordenarCartasPorRareza();
            actualizarVista();
        });

        btnOrdNombre.addActionListener(e -> {
            
            Sistema.getInstance().ordenarCartasPorNombre();
           actualizarVista();
        });

        btnOrdPoder.addActionListener(e -> {
           
            Sistema.getInstance().ordenarCartasPorPoder();
            actualizarVista();
        });
    }

    public void actualizarVista() {
        panelGrilla.removeAll();
        System.out.println("mostrando cartas");
        
        // recorrer el ArrayList de cartas del Sistema
        // por cada carta, instanciar un new PanelCarta(carta) y agregarlo a panelGrilla

        panelGrilla.revalidate();
        panelGrilla.repaint();
    }
}
