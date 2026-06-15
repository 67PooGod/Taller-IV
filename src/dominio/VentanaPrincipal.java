package dominio;



import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    private PanelAdministracion panelAdmin;
    private PanelColeccion panelColeccion;

    public VentanaPrincipal() {
        setTitle("Pokémon TCG - Gestor de Colección");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane pestañas = new JTabbedPane();
        
        panelAdmin = new PanelAdministracion();
        panelColeccion = new PanelColeccion();
        
        pestañas.addTab("Administración", panelAdmin);
        pestañas.addTab("Ver Colección", panelColeccion);

        // Evento que detecta cuando cambias de pestaña
        pestañas.addChangeListener(e -> {
            if (pestañas.getSelectedIndex() == 1) {
                System.out.println("Cambiando a pestaña Colección. Actualizando vista...");
                // TODO: Llamar a panelColeccion.actualizarVista() cuando esté lista
            }
        });

        add(pestañas);
    }
}