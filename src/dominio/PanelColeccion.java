package dominio;


import javax.swing.*;
import java.awt.*;

public class PanelColeccion extends JPanel {

    private JPanel panelGrilla;
    private JButton btnOrdRareza, btnOrdNombre, btnOrdPoder;

    public PanelColeccion() {
        setLayout(new BorderLayout());

        // --- Botones de ordenamiento ---
        JPanel panelBotones = new JPanel();
        btnOrdRareza = new JButton("Ordenar por Rareza");
        btnOrdNombre = new JButton("Ordenar por Nombre");
        btnOrdPoder = new JButton("Ordenar por Poder");

        panelBotones.add(btnOrdRareza);
        panelBotones.add(btnOrdNombre);
        panelBotones.add(btnOrdPoder);
        add(panelBotones, BorderLayout.NORTH);

        // --- Grilla de cartas ---
        panelGrilla = new JPanel(new GridLayout(0, 4, 10, 10)); 
        JScrollPane scroll = new JScrollPane(panelGrilla);
        add(scroll, BorderLayout.CENTER);

        // --- Eventos ---
        configurarEventos();
    }

    private void configurarEventos() {
        btnOrdRareza.addActionListener(e -> {
            System.out.println("Botón: Ordenar por Rareza");
            // TODO: Sistema.getInstance().ordenarCartasPorRareza();
            // TODO: actualizarVista();
        });

        btnOrdNombre.addActionListener(e -> {
            System.out.println("Botón: Ordenar por Nombre");
            // TODO: Sistema.getInstance().ordenarCartasPorNombre();
            // TODO: actualizarVista();
        });

        btnOrdPoder.addActionListener(e -> {
            System.out.println("Botón: Ordenar por Poder");
            // TODO: Sistema.getInstance().ordenarCartasPorPoder();
            // TODO: actualizarVista();
        });
    }

    public void actualizarVista() {
        panelGrilla.removeAll();
        System.out.println("Dibujando cartas en la grilla...");
        
        // TODO: Recorrer el ArrayList de cartas del Sistema
        // TODO: Por cada carta, instanciar un new PanelCarta(carta) y agregarlo a panelGrilla

        panelGrilla.revalidate();
        panelGrilla.repaint();
    }
}
