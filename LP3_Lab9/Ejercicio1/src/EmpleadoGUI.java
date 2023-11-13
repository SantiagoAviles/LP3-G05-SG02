import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class EmpleadoGUI extends JFrame {
    private JTextField txtNumero, txtNombre, txtSueldo;
    private JButton btnAgregar;
    private JTextArea txtReporte;
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private String path = "empleados.txt";

    public EmpleadoGUI() {
        super("Empleado GUI");

        setLayout(new FlowLayout());

        txtNumero = new JTextField(10);
        add(new JLabel("Número:"));
        add(txtNumero);

        txtNombre = new JTextField(10);
        add(new JLabel("Nombre:"));
        add(txtNombre);

        txtSueldo = new JTextField(10);
        add(new JLabel("Sueldo:"));
        add(txtSueldo);

        btnAgregar = new JButton("Agregar empleado");
        add(btnAgregar);

        txtReporte = new JTextArea(5, 30);
        add(new JScrollPane(txtReporte));

        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero = Integer.parseInt(txtNumero.getText());
                String nombre = txtNombre.getText();
                double sueldo = Double.parseDouble(txtSueldo.getText());

                Empleado empleado = new Empleado(numero, nombre, sueldo);
                agregarEmpleado(empleado);
                reporteEmpleados();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 200);
        setVisible(true);

        reporteEmpleados();
    }

    public void agregarEmpleado(Empleado empleado) {
        try (FileWriter fw = new FileWriter(path, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(empleado.toString());
            empleados.add(empleado);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public void reporteEmpleados() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int numero = Integer.parseInt(parts[0]);
                String nombre = parts[1];
                double sueldo = Double.parseDouble(parts[2]);
                empleados.add(new Empleado(numero, nombre, sueldo));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        txtReporte.setText("");
        for (Empleado empleado : empleados) {
            txtReporte.append(empleado.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        new EmpleadoGUI();
    }
}