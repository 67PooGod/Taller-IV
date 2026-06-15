package dominio;



import javax.swing.*;
import java.awt.*;

public class PanelAdministracion extends JPanel {

    private JComboBox<String> cbAccion;
    private JComboBox<String> cbTipo;
    private JButton btnEjecutar;

    public PanelAdministracion() {
        setLayout(new BorderLayout());

        // --- Componentes superiores ---
        JPanel panelTop = new JPanel();
        cbAccion = new JComboBox<>(new String[]{"Agregar", "Modificar", "Eliminar"});
        panelTop.add(new JLabel("Acción:"));
        panelTop.add(cbAccion);
        add(panelTop, BorderLayout.NORTH);

        // --- Componentes centrales (Formulario) ---
        JPanel panelCentro = new JPanel(new GridLayout(4, 2));
        cbTipo = new JComboBox<>(new String[]{"Pokemon", "Item", "Supporter", "Energy"});
        panelCentro.add(new JLabel("Tipo:"));
        panelCentro.add(cbTipo);
        // TODO: Agregar aquí los JTextFields para Nombre, Rareza, Atributos Extra...
        add(panelCentro, BorderLayout.CENTER);

        // --- Componentes inferiores ---
        JPanel panelBottom = new JPanel();
        btnEjecutar = new JButton("Ejecutar Acción");
        panelBottom.add(btnEjecutar);
        add(panelBottom, BorderLayout.SOUTH);

        // --- Eventos ---
        configurarEventos();
    }

    private void configurarEventos() {
        cbTipo.addActionListener(e -> {
            String tipoSeleccionado = (String) cbTipo.getSelectedItem();
            System.out.println("Tipo cambiado a: " + tipoSeleccionado);
            // TODO: Ocultar o mostrar campos extra dependiendo del tipo
        });

        btnEjecutar.addActionListener(e -> {
            String accion = (String) cbAccion.getSelectedItem();
            System.out.println("Botón presionado. Acción a ejecutar: " + accion);
            
            // TODO: Capturar los textos de los JTextFields
            // TODO: Llamar a Sistema.getInstance().agregarCarta(...) / modificar / eliminar
        });
    }
}
