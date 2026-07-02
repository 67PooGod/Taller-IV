package logica;



import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    private PanelAdministracion panelAdmin;
    private PanelColeccion panelColeccion;

    public VentanaPrincipal() {
        setTitle("pokemon");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane pestañas = new JTabbedPane();
        
        panelAdmin = new PanelAdministracion();
        panelColeccion = new PanelColeccion();
        
        pestañas.addTab("Administración", panelAdmin);
        pestañas.addTab("Ver Colección", panelColeccion);

       
        pestañas.addChangeListener(e -> {
            if (pestañas.getSelectedIndex() == 1) {
                
                panelColeccion.actualizarVista();
            }
        });

        add(pestañas);
    }
}