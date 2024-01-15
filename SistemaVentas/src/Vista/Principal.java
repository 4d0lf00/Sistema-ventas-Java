
package Vista;

import Conexion.Conexion;
import Controlador.ProductoController;
import Modelo.Producto;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controlador.VentaController;
import java.io.IOException;

public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    public Principal() {        
        initComponents();
        llenarTabla();
        lblUsuario.setText(jtfUsuario.getText());
        llenarTablaVentas();
        
        
    }
    //-------------Si presiona el icono de la tienda hay un easter egg--------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfMenu = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jbtAñadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbVenta = new javax.swing.JTable();
        jbtInformes = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jlbSubTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbCantidadProductos = new javax.swing.JLabel();
        jbtFinalizar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jlbIva = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jlbTotal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jfStock = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfFiltroStock = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jlbTotalProductos = new javax.swing.JLabel();
        jlbUsuarioStock = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jfInformes = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jfVentas = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVentas = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfFechaEntre = new javax.swing.JTextField();
        jtfFechaHasta = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jlbUsuarioVentas = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlbTotalVentas = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jlbGanancias = new javax.swing.JLabel();
        jpLogin = new javax.swing.JPanel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtfClave = new javax.swing.JPasswordField();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        jfMenu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jfMenu.setTitle("Mayorista PGY");
        jfMenu.setMinimumSize(new java.awt.Dimension(700, 537));
        jfMenu.setPreferredSize(new java.awt.Dimension(700, 537));
        jfMenu.setSize(new java.awt.Dimension(700, 537));
        jfMenu.getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(58, 78, 122));
        jPanel1.setToolTipText("");
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 537));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 537));
        jPanel1.setLayout(null);

        lblUsuario.setForeground(new java.awt.Color(204, 204, 204));
        lblUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblUsuario);
        lblUsuario.setBounds(500, 10, 80, 30);

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(440, 10, 60, 30);

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Codigo:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 70, 52, 21);

        jtfCodigo.setBackground(new java.awt.Color(46, 59, 67));
        jtfCodigo.setForeground(new java.awt.Color(204, 204, 204));
        jtfCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jtfCodigo);
        jtfCodigo.setBounds(80, 60, 125, 42);

        jbtAñadir.setBackground(new java.awt.Color(46, 59, 67));
        jbtAñadir.setForeground(new java.awt.Color(204, 204, 204));
        jbtAñadir.setText("Añadir");
        jbtAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(jbtAñadir);
        jbtAñadir.setBounds(220, 70, 90, 29);

        jtbVenta.setBackground(new java.awt.Color(204, 204, 204));
        jtbVenta.setForeground(new java.awt.Color(0, 0, 0));
        jtbVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbVenta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 140, 452, 200);

        jbtInformes.setBackground(new java.awt.Color(46, 59, 67));
        jbtInformes.setForeground(new java.awt.Color(204, 204, 204));
        jbtInformes.setText("Informes");
        jbtInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtInformesActionPerformed(evt);
            }
        });
        jPanel1.add(jbtInformes);
        jbtInformes.setBounds(490, 70, 100, 29);

        jbtCancelar.setBackground(new java.awt.Color(46, 59, 67));
        jbtCancelar.setForeground(new java.awt.Color(204, 204, 204));
        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtCancelar);
        jbtCancelar.setBounds(110, 440, 140, 50);

        jlbSubTotal.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jlbSubTotal);
        jlbSubTotal.setBounds(380, 350, 100, 20);

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Total:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 410, 60, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Productos");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 350, 70, 17);

        jlbCantidadProductos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel1.add(jlbCantidadProductos);
        jlbCantidadProductos.setBounds(70, 370, 60, 60);

        jbtFinalizar.setBackground(new java.awt.Color(46, 59, 67));
        jbtFinalizar.setForeground(new java.awt.Color(204, 204, 204));
        jbtFinalizar.setText("Finalizar");
        jbtFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtFinalizar);
        jbtFinalizar.setBounds(320, 440, 140, 50);

        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Subtotal:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(320, 350, 60, 20);

        jlbIva.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jlbIva);
        jlbIva.setBounds(380, 380, 100, 20);

        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Iva:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(320, 380, 60, 20);

        jlbTotal.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jlbTotal);
        jlbTotal.setBounds(380, 410, 100, 20);

        jfMenu.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 537);

        jMenu1.setText("Sesion");
        jMenu1.setMinimumSize(new java.awt.Dimension(700, 700));

        jMenuItem1.setText("Cerrar sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jfMenu.setJMenuBar(jMenuBar1);

        jfStock.setTitle("Informe de stock");
        jfStock.setMinimumSize(new java.awt.Dimension(792, 574));
        jfStock.setSize(new java.awt.Dimension(700, 700));
        jfStock.getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(58, 78, 122));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel3.setLayout(null);

        jButton5.setBackground(new java.awt.Color(46, 59, 67));
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(510, 410, 170, 60);

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtProductos);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(40, 100, 656, 289);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Informe de stock");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(39, 7, 252, 29);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Mostar solo productos con stock inferior a:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 60, 280, 17);

        jtfFiltroStock.setBackground(new java.awt.Color(46, 59, 67));
        jtfFiltroStock.setForeground(new java.awt.Color(204, 204, 204));
        jtfFiltroStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jtfFiltroStock);
        jtfFiltroStock.setBounds(320, 50, 50, 30);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8_filter_25px.png"))); // NOI18N
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(380, 50, 40, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8_user_25px.png"))); // NOI18N
        jLabel14.setText("Usuario:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(530, 10, 90, 25);

        jlbTotalProductos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jlbTotalProductos.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jlbTotalProductos);
        jlbTotalProductos.setBounds(190, 420, 60, 50);

        jlbUsuarioStock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbUsuarioStock.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jlbUsuarioStock);
        jlbUsuarioStock.setBounds(620, 0, 90, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Total productos:");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(50, 426, 140, 40);

        jButton10.setBackground(new java.awt.Color(46, 59, 67));
        jButton10.setText("Imprimir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(290, 410, 170, 60);

        jfStock.getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 790, 570);

        jfInformes.setTitle("Informes");

        jPanel2.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel2.setLayout(null);

        jButton2.setText("Informe de ventas");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(210, 230, 150, 60);

        jButton3.setText("Informe de stock");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(210, 150, 150, 60);

        jButton4.setText("Volver al menu");
        jButton4.setBorder(new javax.swing.border.MatteBorder(null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(210, 310, 150, 60);

        javax.swing.GroupLayout jfInformesLayout = new javax.swing.GroupLayout(jfInformes.getContentPane());
        jfInformes.getContentPane().setLayout(jfInformesLayout);
        jfInformesLayout.setHorizontalGroup(
            jfInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jfInformesLayout.setVerticalGroup(
            jfInformesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        jfVentas.setTitle("Informe de ventas");

        jPanel4.setBackground(new java.awt.Color(58, 78, 122));
        jPanel4.setPreferredSize(new java.awt.Dimension(738, 494));
        jPanel4.setLayout(null);

        jtVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtVentas);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(40, 90, 660, 300);

        jButton6.setBackground(new java.awt.Color(46, 59, 67));
        jButton6.setText("Volver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(520, 410, 170, 60);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Informe de ventas");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(40, 0, 240, 40);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Hasta:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(250, 60, 48, 16);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Entre:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(40, 60, 38, 17);

        jtfFechaEntre.setBackground(new java.awt.Color(46, 59, 67));
        jPanel4.add(jtfFechaEntre);
        jtfFechaEntre.setBounds(90, 50, 140, 30);

        jtfFechaHasta.setBackground(new java.awt.Color(46, 59, 67));
        jPanel4.add(jtfFechaHasta);
        jtfFechaHasta.setBounds(300, 50, 140, 30);

        jButton9.setBackground(new java.awt.Color(46, 59, 67));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8_filter_25px.png"))); // NOI18N
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9);
        jButton9.setBounds(460, 50, 40, 31);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8_user_25px.png"))); // NOI18N
        jLabel13.setText("Usuario:");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(550, 10, 90, 25);

        jlbUsuarioVentas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbUsuarioVentas.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.add(jlbUsuarioVentas);
        jlbUsuarioVentas.setBounds(640, 10, 90, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/icons8_user_25px.png"))); // NOI18N
        jLabel15.setText("Usuario:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(550, 10, 90, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Total ventas:");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(40, 420, 100, 40);

        jlbTotalVentas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbTotalVentas.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.add(jlbTotalVentas);
        jlbTotalVentas.setBounds(150, 420, 90, 40);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Ganancia total:");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(40, 460, 120, 40);

        jlbGanancias.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlbGanancias.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.add(jlbGanancias);
        jlbGanancias.setBounds(180, 460, 200, 40);

        javax.swing.GroupLayout jfVentasLayout = new javax.swing.GroupLayout(jfVentas.getContentPane());
        jfVentas.getContentPane().setLayout(jfVentasLayout);
        jfVentasLayout.setHorizontalGroup(
            jfVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfVentasLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jfVentasLayout.setVerticalGroup(
            jfVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setResizable(false);

        jpLogin.setBackground(new java.awt.Color(11, 24, 40));
        jpLogin.setForeground(new java.awt.Color(39, 84, 105));
        jpLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfUsuario.setBackground(new java.awt.Color(46, 59, 67));
        jtfUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jtfUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfUsuario.setCaretColor(new java.awt.Color(0, 204, 102));
        jtfUsuario.setOpaque(true);
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jpLogin.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 142, 180, 36));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña:");
        jpLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 201, 80, 14));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        jpLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 153, 60, -1));

        jButton1.setBackground(new java.awt.Color(46, 59, 67));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpLogin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 255, 125, 40));

        jtfClave.setBackground(new java.awt.Color(46, 59, 67));
        jtfClave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfClave.setForeground(new java.awt.Color(204, 204, 204));
        jtfClave.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtfClave.setOpaque(true);
        jtfClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfClaveActionPerformed(evt);
            }
        });
        jpLogin.add(jtfClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 190, 180, 40));

        jButton7.setBackground(new java.awt.Color(46, 59, 67));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Salir");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jpLogin.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 301, 125, 38));

        jButton11.setForeground(new java.awt.Color(69, 73, 74));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/small_business_96px.png"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jpLogin.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, 84));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void abrirVentana(JFrame ventana) {
       //Esto es para abrir ventanas
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try(Connection con = Conexion.getConnection()){
             String query ="select usuario, clave from usuario where usuario=? and clave=?";
             try(PreparedStatement ps = con.prepareStatement(query)){
               ps.setString(1, jtfUsuario.getText());
               ps.setString(2, String.valueOf(jtfClave.getText()));
               try(ResultSet rs = ps.executeQuery()){
                   if(rs.next()){                       
                       abrirVentana(jfMenu);
                       this.dispose();
                       lblUsuario.setText(jtfUsuario.getText());
                       crearCarro();
                       llenarTVenta();
                   }else{
                       JOptionPane.showMessageDialog(this, "Error! clave o usuario incorrecto ");
                  }
               }
             }catch(Exception e){           
             }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error! clave o usuario incorrecto "+e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void llenarTabla(){
        DefaultTableModel dtm = new DefaultTableModel(
                new Object[][]{},
                new Object[]{"codigo", "nombre", "precio", "stock"}
        );
        jtProductos.setModel(dtm);  
        int contador = 0;
        ProductoController pc = new ProductoController();        
        for (Producto p: pc.listar()) {
                contador = contador + 1;
            dtm.addRow(new Object[]{
                p.getCodigo(),
                p.getNombre(),
                p.getPrecio(),
                p.getStock()
            });
        }jlbTotalProductos.setText(""+contador);
    }
    
    private void llenarTablaVentas(){
        DefaultTableModel dtm = new DefaultTableModel(
                new Object[][]{},
                new Object[]{"folio", "fecha_actual", "cantidad_productos","subtotal", "iva","total","vendedor"}
        );
        jtVentas.setModel(dtm);  
        int contador = 0;
        VentaController vc = new VentaController();                
        for (Venta v: vc.listarVenta()) {
            ++contador;
            dtm.addRow(new Object[]{                
                v.getFolio(),
                v.getFecha_y_hora(),
                v.getCantidad(),
                v.getSubtotal(),
                v.getIVA(),
                v.getTotal(),
                v.getVendedor()
            });
            
        }
        jlbTotalVentas.setText(""+contador);
    }
    
    private int Folio(){
        int num = 0;
        int folio = 0;
        for (Venta v : Venta.listarVenta()) {
            if(v.getFolio()>num){
            num = v.getFolio();
            }if(v.getFolio() <= num){
            folio =  v.getFolio();}}
            int folioF = folio;
            folioF = folioF + 1;
   return folioF; }
    
    private void crearVenta(){
    try(Connection con = Conexion.getConnection()){
        String query = "insert into venta values(?,?,?,?,?,?,?)";
        String fecha = String.valueOf(Date.valueOf(LocalDate.now())) ; 
        try(PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1, String.valueOf(Folio()));
            ps.setString(2, String.valueOf(fecha));
            ps.setString(3, jlbCantidadProductos.getText());
            ps.setString(4, jlbSubTotal.getText());
            ps.setString(5, jlbIva.getText());
            ps.setString(6, jlbTotal.getText());
            ps.setString(7, lblUsuario.getText());
            ps.execute();
        }
    }catch(Exception e){JOptionPane.showMessageDialog(jfMenu, "Error: "+e);}
    }
    
    private void ganancias(){
        double ganancia= 0;
        for (Venta v : Venta.listarVenta()) {
            ganancia = ganancia + v.getTotal();            
        }
        jlbGanancias.setText(""+ganancia);
    
    }
    
    private void llenarTVenta(){
    DefaultTableModel dtm = new DefaultTableModel(
                new Object[][]{},
                new Object []{"Codigo","Nombre", "Precio", }
        );
        jtbVenta.setModel(dtm);
        try(Connection con = Conexion.getConnection()){
            String query ="select * from carro";
            String codigoA = "0";
            int contador = 0;
            try(PreparedStatement ps = con.prepareStatement(query)){
                try(ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        if(rs.getString("codigo").equals(codigoA)){
                            }else{
                            codigoA = rs.getString("codigo");
                            contador++;
                            jlbCantidadProductos.setText(String.valueOf(contador));}
                        dtm.addRow(new Object[]{ 
                            rs.getString("codigo"),
                            rs.getString("nombre"),
                            rs.getString("precio")
                        });
                    }
                }
            }
        catch(Exception e){}
        }catch(Exception e){
       }  
    }
    public void vaciarCarro(){
    try(Connection con = Conexion.getConnection()){
            String query = "drop table carro";
            try(PreparedStatement ps = con.prepareStatement(query)){
            ps.execute();
            }
    }catch(Exception e){}
    }
    
    public void crearCarro(){
      try(Connection con = Conexion.getConnection()){
            String query = "create table carro(codigo varchar(30) not null, nombre varchar(30) not null, precio int not null);";  
            try(PreparedStatement ps = con.prepareStatement(query)){
            ps.execute();
            }
    }catch(Exception e){
        
    }}
    
    private void actualizaStock(){
        try(Connection con = Conexion.getConnection()){
            String query ="select * from carro";
            try(PreparedStatement ps = con.prepareStatement(query)){
                try(ResultSet rs = ps.executeQuery()){
                         while(rs.next()){
                             for (Producto p : Producto.listar()) {
                             int codigoCarro = Integer.parseInt(rs.getString("codigo"));
                             if(p.getCodigo()== codigoCarro){
                                 int nuevoStock = p.getStock() - 1;
                                 String query2 = "update producto set stock = ? where codigo = ?";
                                 try(PreparedStatement pst = con.prepareStatement(query2)){
                                     pst.setString(1, String.valueOf(nuevoStock));
                                     pst.setString(2, String.valueOf(codigoCarro));
                                     pst.execute();                                     
                                 }catch(Exception e){JOptionPane.showMessageDialog(jfMenu, "error: "+e);}
                             }
                    } 
                    } 
                }
            }
        }catch(Exception e){JOptionPane.showMessageDialog(jfMenu, ""+e);}
    }
    
    
    private void jtfClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfClaveActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

    
    
    
    private void jbtAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAñadirActionPerformed
       //agregar codigo a la compra
       try(Connection con = Conexion.getConnection()){
            ProductoController pc = new ProductoController();
        for (Producto p : pc.listar()) {
            if(p.getCodigo() == Integer.parseInt(jtfCodigo.getText())){
                String query ="insert into carro values(?,?,?)";
                    try(PreparedStatement ps = con.prepareStatement(query)){
                crearCarro();
                ps.setString(1, String.valueOf(p.getCodigo()));
                ps.setString(2, p.getNombre());
                ps.setString(3, String.valueOf(p.getPrecio()));
                ps.execute();
                llenarTVenta();
                sumar();
                jtfCodigo.setText("");
            } ;
        }
        }
       }catch(Exception e){}         
    }//GEN-LAST:event_jbtAñadirActionPerformed
    
    private void avisoStock(){
        try(Connection con = Conexion.getConnection()){
            String query = "select * from carro";  
            try(PreparedStatement ps = con.prepareStatement(query)){
                try(ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                    int codigoC = Integer.parseInt(rs.getString("codigo"));
                    for (Producto p : Producto.listar()) {
                        if(p.getCodigo() == codigoC){
                        if(p.getStock()<= 15){
                        JOptionPane.showMessageDialog(jfMenu, "Stock critico, solo quedan: "+p.getStock()+ " unidades de "+ p.getNombre());
            }else{
            }
            }}}}
        }
        }catch(Exception e){}
    }
    private void sumar(){
        try(Connection con = Conexion.getConnection()){
            String query ="select precio from carro";
            int subtotal = 0;
            double iva = 0;
            int total = 0;
            try(PreparedStatement ps = con.prepareStatement(query)){
                try(ResultSet rs = ps.executeQuery()){
                    while(rs.next()){
                        int suma = rs.getInt("precio");
                        subtotal = subtotal + suma;
                        iva = subtotal * 0.19;
                        int ivaF =  (int) iva;
                        total = subtotal + ivaF;
                        
                        jlbSubTotal.setText(""+subtotal);
                        jlbIva.setText(""+ivaF);
                        jlbTotal.setText(""+total);
                    }
                }
                    }
            }catch(Exception e){
            }
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jlbUsuarioStock.setText(jtfUsuario.getText());
        jfInformes.dispose();
        abrirVentana(jfStock);
        llenarTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ganancias();
        jlbUsuarioVentas.setText(jtfUsuario.getText());
        llenarTablaVentas();
        jfInformes.dispose();
        abrirVentana(jfVentas);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jfInformes.dispose();
        abrirVentana(jfMenu);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbtInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtInformesActionPerformed
        jfMenu.dispose();
        abrirVentana(jfInformes);
    }//GEN-LAST:event_jbtInformesActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jfStock.dispose();
        abrirVentana(jfInformes);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        jlbSubTotal.setText("0");
        jlbIva.setText("0");
        jlbTotal.setText("0");
        jlbCantidadProductos.setText("0");
        jtfCodigo.setText("");
        vaciarCarro();
        //crearCarro();
        llenarTVenta();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       jfVentas.dispose();
        abrirVentana(jfInformes);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jbtFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtFinalizarActionPerformed
        actualizaStock();
        crearVenta();
        avisoStock();
        jlbSubTotal.setText("0");
        jlbIva.setText("0");
        jlbTotal.setText("0");
        jlbCantidadProductos.setText("0");
        vaciarCarro(); 
        llenarTVenta();
        jtfCodigo.setText("");
        crearCarro();        
        JOptionPane.showMessageDialog(jfMenu, "Venta realizada exitosamente!");
        
        
    }//GEN-LAST:event_jbtFinalizarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jfMenu.dispose();
        abrirVentana(this);
        jtfUsuario.setText("");
        jtfClave.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        System.exit(1);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       //Filtro de informe de stock
        try(Connection con = Conexion.getConnection()){
           DefaultTableModel dtm = new DefaultTableModel(
                new Object[][]{},
                new Object[]{"codigo", "nombre", "precio", "stock"}
        );
        jtProductos.setModel(dtm);  
        ProductoController pc = new ProductoController(); 
        int contador = 0;
        for (Producto p: pc.listar()) {
            if(p.getStock()<=Integer.parseInt(jtfFiltroStock.getText())){
                contador = contador + 1;
            dtm.addRow(new Object[]{
                p.getCodigo(),
                p.getNombre(),
                p.getPrecio(),
                p.getStock()
            });
        }}jlbTotalProductos.setText(""+contador);
       }catch(Exception e){}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Filtro de informe de ventas
         DefaultTableModel dtm = new DefaultTableModel(
                new Object[][]{},
                new Object[]{"folio", "fecha_actual", "cantidad_productos", "total","iva","vendedor"}
        );
        jtVentas.setModel(dtm);  
        VentaController vc = new VentaController();        
        for (Venta v: vc.listarVenta()) {
            if(v.getFecha_y_hora().after(Date.valueOf(jtfFechaEntre.getText())) && v.getFecha_y_hora().before(Date.valueOf(jtfFechaHasta.getText()))){
            dtm.addRow(new Object[]{
                v.getFolio(),
                v.getFecha_y_hora(),
                v.getCantidad(),
                v.getTotal(),
                v.getIVA(),
                v.getVendedor()
            });
            }}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        JOptionPane.showMessageDialog(jfStock, "*Se imprime*");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try{
            Runtime.getRuntime().exec("cmd /c start chrome https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        }catch(IOException e){}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtAñadir;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtFinalizar;
    private javax.swing.JButton jbtInformes;
    private javax.swing.JFrame jfInformes;
    private javax.swing.JFrame jfMenu;
    private javax.swing.JFrame jfStock;
    private javax.swing.JFrame jfVentas;
    private javax.swing.JLabel jlbCantidadProductos;
    private javax.swing.JLabel jlbGanancias;
    private javax.swing.JLabel jlbIva;
    private javax.swing.JLabel jlbSubTotal;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JLabel jlbTotalProductos;
    private javax.swing.JLabel jlbTotalVentas;
    private javax.swing.JLabel jlbUsuarioStock;
    private javax.swing.JLabel jlbUsuarioVentas;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTable jtVentas;
    private javax.swing.JTable jtbVenta;
    private javax.swing.JPasswordField jtfClave;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfFechaEntre;
    private javax.swing.JTextField jtfFechaHasta;
    private javax.swing.JTextField jtfFiltroStock;
    private javax.swing.JTextField jtfUsuario;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
    
}
