import javax.swing.*;
import java.awt.*;

public class CompraBuses extends JFrame {
    public CompraBuses() {
        JFrame frame = new JFrame("Compra de pasajes - Jonathan Vargas y Santiago Avilés");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JLabel etiquetaNombre = new JLabel("Nombre:");
        JTextField campoNombre = new JTextField();

        JLabel etiquetaDNI = new JLabel("DNI:");
        JTextField campoDNI = new JTextField();

        JLabel etiquetaFecha = new JLabel("Fecha de viaje:");
        JTextField campoFecha = new JTextField();

        JCheckBox audifono = new JCheckBox("Audifonos?");
        JCheckBox mantita = new JCheckBox("Manta?");
        JCheckBox revista = new JCheckBox("Revistas?");

        JRadioButton boton1erPiso = new JRadioButton("1er piso?");
        JRadioButton boton2doPiso = new JRadioButton("2do piso?");
        ButtonGroup grupoBoton = new ButtonGroup();
        grupoBoton.add(boton1erPiso);
        grupoBoton.add(boton2doPiso);

        String[] ciudadOrigen = { "Lima", "Cuzco", "Arequipa" };
        String[] ciudadDestino = { "Trujillo", "Chiclayo", "Tumbes" };
        JComboBox<String> origenes = new JComboBox<>(ciudadOrigen);
        JComboBox<String> destinos = new JComboBox<>(ciudadDestino);

        String[] servicio = { "Económico", "Estándar", "VIP" };
        JList<String> listaServicios = new JList<>(servicio);

        JButton blanqueo = new JButton("Restablecer");
        JButton enviar = new JButton("Enviar");

        JPanel panel = new JPanel(new GridLayout(8, 2));
        panel.add(etiquetaNombre);
        panel.add(campoNombre);
        panel.add(etiquetaDNI);
        panel.add(campoDNI);
        panel.add(etiquetaFecha);
        panel.add(campoFecha);
        panel.add(audifono);
        panel.add(mantita);
        panel.add(revista);
        panel.add(boton1erPiso);
        panel.add(boton2doPiso);
        panel.add(origenes);
        panel.add(destinos);
        panel.add(listaServicios);
        panel.add(blanqueo);
        panel.add(enviar);

        enviar.addActionListener(e -> {
            String nombre = campoNombre.getText();
            String DNI = campoDNI.getText();
            String fechaViaje = campoFecha.getText();
            String audifonos = audifono.isSelected() ? "Si" : "No";
            String mantas = mantita.isSelected() ? "Si" : "No";
            String revistas = revista.isSelected() ? "Si" : "No";
            String piso = boton1erPiso.isSelected() ? "1er piso" : "2do piso";
            String origen = (String) origenes.getSelectedItem();
            String destino = (String) destinos.getSelectedItem();
            String servicios = listaServicios.getSelectedValue();

            JOptionPane.showMessageDialog(null, "Nombre: " + nombre +
             "\nDNI: " + DNI + "\nFecha de viaje: " + fechaViaje + "\nAudifonos? " 
            + audifonos + "\nManta? " + mantas + "\nRevistas? " + revistas + "\nPiso: " 
            + piso + "\nOrigen: " + origen + "\nDestino: " + destino + "\nServicio: " + servicios);
        });

        blanqueo.addActionListener(e -> {
            campoNombre.setText("");
            campoDNI.setText("");
            campoFecha.setText("");
            audifono.setSelected(false);
            mantita.setSelected(false);
            revista.setSelected(false);
            boton1erPiso.setSelected(false);
            origenes.setSelectedIndex(0);
            destinos.setSelectedIndex(0);
            listaServicios.setSelectedIndex(0);
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

