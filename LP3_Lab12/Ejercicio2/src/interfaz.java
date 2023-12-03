import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class interfaz extends javax.swing.JFrame {
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private int indice = 1;

    public interfaz() {
        initComponents();
    }
    
    public void conectar(){
        try {
            String url = "jdbc:mysql://localhost:3306/grupo05";
            String usuario = "root";
            String password = "admin";
            conn = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void guardarRegistro(String id, String nombre, String apellido, String email, String telefono) {
        try {
            conectar();
            String query = "INSERT INTO agenda (id, nombre, apellido, email, telefono) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, id);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellido);
            pstmt.setString(4, email);
            pstmt.setString(5, telefono);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarRegistro(int indice) {
        ResultSet rs = null;
    try {
        Statement stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM Agenda WHERE id = " + indice);
    } catch (SQLException ex) {
        System.out.println("Error al obtener registro: " + ex.getMessage());
    }
    try {
        if (rs.next()) {
            campoID.setText(String.valueOf(rs.getInt("id")));
            campoNombre.setText(rs.getString("nombre"));
            campoApellido.setText(rs.getString("apellido"));
            campoEmail.setText(rs.getString("email"));
            campoTelefono.setText(rs.getString("telefono"));
            campoNumeroRegistro.setText(String.valueOf(indice));
        }
    } catch (SQLException ex) {
        System.out.println("Error al mostrar registro: " + ex.getMessage());
    }
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoBuscarApellido = new javax.swing.JTextField();
        BotonEncontrar = new javax.swing.JButton();
        botonMostrarTodo = new javax.swing.JButton();
        botonNuevoRegistro = new javax.swing.JButton();
        botonAnterior = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        campoNumeroRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Email:");

        jLabel5.setText("Teléfono:");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel6.setText("Encontrar registro por apellido");

        jLabel7.setText("Apellido:");

        BotonEncontrar.setText("Encontrar");
        BotonEncontrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    conectar();
                    String apellidoBuscar = campoBuscarApellido.getText();
                    String sql = "SELECT * FROM Agenda WHERE apellido = ?";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, apellidoBuscar);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "ID: " + rs.getString("id") + "\nNombre: " 
                        + rs.getString("nombre") + "\nApellido: " + rs.getString("apellido") + "\nEmail: " 
                        + rs.getString("email") + "\nTeléfono: " + rs.getString("telefono"));
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron registros con el apellido: " + apellidoBuscar);
                    }
        
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al buscar el apellido: " + e.getMessage());
                }
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonEncontrar)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEncontrar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        botonMostrarTodo.setText("Mostrar todos los registros");
        botonMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    conectar();
                    String sql = "SELECT * FROM Agenda";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    ResultSet rs = pstmt.executeQuery();
                    if (rs.next()) {
                        do {
                            JOptionPane.showMessageDialog(null, "ID: " + rs.getString("id") + "\nNombre: "
                             + rs.getString("nombre") + "\nApellido: " + rs.getString("apellido") + "\nEmail: " 
                             + rs.getString("email") + "\nTeléfono: " + rs.getString("telefono"));
                        } while (rs.next());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontraron registros en la tabla");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al mostrar los registros: " + e.getMessage());
                }
            }
        });

        botonNuevoRegistro.setText("Ingresar nuevo registro");
        botonNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectar();
                String id = campoID.getText();
                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String email = campoEmail.getText();
                String telefono = campoTelefono.getText();
                
                guardarRegistro(id, nombre, apellido, email, telefono);
                
                campoID.setText("");
                campoNombre.setText("");
                campoApellido.setText("");
                campoEmail.setText("");
                campoTelefono.setText("");
            }
        });

        botonAnterior.setText("Anterior");
        botonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectar();
                indice--;
                    if (indice >= 1) {
                        mostrarRegistro(indice);
                    } else {
                        indice = 1;
                }
            }
        });

        
        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectar();
                indice++;
                mostrarRegistro(indice);
            }
        });

        campoNumeroRegistro.setText("Cambiar de registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoID)
                            .addComponent(campoNombre)
                            .addComponent(campoApellido)
                            .addComponent(campoEmail)
                            .addComponent(campoTelefono)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumeroRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSiguiente)))
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonMostrarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonNuevoRegistro))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumeroRegistro)
                    .addComponent(botonSiguiente)
                    .addComponent(botonAnterior))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMostrarTodo)
                    .addComponent(botonNuevoRegistro))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }                      

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }
            
    private javax.swing.JButton BotonEncontrar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JButton botonAnterior;
    private javax.swing.JButton botonMostrarTodo;
    private javax.swing.JButton botonNuevoRegistro;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoBuscarApellido;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel campoNumeroRegistro;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;      
}

