
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ricky
 */
public class Zeno_Sama extends javax.swing.JFrame {

    /**
     * Creates new form Zeno_Sama
     */
    public Zeno_Sama() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar_seres = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt_nombre_raza = new javax.swing.JTextField();
        jt_numero_ki = new javax.swing.JTextField();
        jt_numero_años = new javax.swing.JTextField();
        jt_nombre_planeta = new javax.swing.JTextField();
        Agregar_servivo = new javax.swing.JButton();
        modificar_seres = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombre_raza1 = new javax.swing.JTextField();
        numero_ki1 = new javax.swing.JTextField();
        numero_años1 = new javax.swing.JTextField();
        nombre_planeta1 = new javax.swing.JTextField();
        modificar_servivo = new javax.swing.JButton();
        cb_modificar_seres = new javax.swing.JComboBox<>();
        Crear_Universo = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jt_crear_universo = new javax.swing.JTextField();
        crear_universo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        eliminar_seres = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        eliminar_servivo = new javax.swing.JButton();
        cb_eliminar_seres = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jmi_agregar = new javax.swing.JMenuItem();
        jmi_modificar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jmi_guardar = new javax.swing.JMenuItem();
        jmi_abrir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jPanel1.setBackground(new java.awt.Color(121, 41, 109));
        jPanel1.setForeground(new java.awt.Color(72, 20, 61));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Seres Vivos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombre de Raza");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Numero de Ki");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Numero Máximo de Años");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Nombre del Planeta");

        Agregar_servivo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Agregar_servivo.setText("Agregar");
        Agregar_servivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Agregar_servivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_nombre_raza)
                    .addComponent(jt_numero_ki)
                    .addComponent(jt_numero_años)
                    .addComponent(jt_nombre_planeta, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Agregar_servivo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(209, 209, 209))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_nombre_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jt_numero_ki, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jt_numero_años, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_nombre_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(Agregar_servivo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout agregar_seresLayout = new javax.swing.GroupLayout(agregar_seres.getContentPane());
        agregar_seres.getContentPane().setLayout(agregar_seresLayout);
        agregar_seresLayout.setHorizontalGroup(
            agregar_seresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        agregar_seresLayout.setVerticalGroup(
            agregar_seresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(121, 41, 109));
        jPanel2.setForeground(new java.awt.Color(72, 20, 61));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setText("Seres Vivos");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Nombre de Raza");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Numero de Ki");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Numero Máximo de Años");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Nombre del Planeta");

        modificar_servivo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modificar_servivo.setText("Modificar");
        modificar_servivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_servivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre_raza1)
                    .addComponent(numero_ki1)
                    .addComponent(numero_años1)
                    .addComponent(nombre_planeta1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificar_servivo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cb_modificar_seres, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_modificar_seres, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_raza1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_ki1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_años1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_planeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(61, 61, 61)
                .addComponent(modificar_servivo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout modificar_seresLayout = new javax.swing.GroupLayout(modificar_seres.getContentPane());
        modificar_seres.getContentPane().setLayout(modificar_seresLayout);
        modificar_seresLayout.setHorizontalGroup(
            modificar_seresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        modificar_seresLayout.setVerticalGroup(
            modificar_seresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));
        jPanel3.add(jt_crear_universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 220, 30));

        crear_universo.setText("Crear");
        crear_universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crear_universoMouseClicked(evt);
            }
        });
        jPanel3.add(crear_universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 110, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\ricky\\OneDrive\\Imágenes\\universo.jpg")); // NOI18N
        jLabel13.setText("safaf");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

        javax.swing.GroupLayout Crear_UniversoLayout = new javax.swing.GroupLayout(Crear_Universo.getContentPane());
        Crear_Universo.getContentPane().setLayout(Crear_UniversoLayout);
        Crear_UniversoLayout.setHorizontalGroup(
            Crear_UniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Crear_UniversoLayout.setVerticalGroup(
            Crear_UniversoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(121, 41, 109));
        jPanel4.setForeground(new java.awt.Color(72, 20, 61));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel14.setText("Seres Vivos");

        eliminar_servivo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminar_servivo.setText("Eliminar");
        eliminar_servivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_servivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(eliminar_servivo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_eliminar_seres, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(209, 209, 209))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(96, 96, 96)
                .addComponent(cb_eliminar_seres, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(eliminar_servivo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout eliminar_seresLayout = new javax.swing.GroupLayout(eliminar_seres.getContentPane());
        eliminar_seres.getContentPane().setLayout(eliminar_seresLayout);
        eliminar_seresLayout.setHorizontalGroup(
            eliminar_seresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        eliminar_seresLayout.setVerticalGroup(
            eliminar_seresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminar_seresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ricky\\OneDrive\\Imágenes\\960x540_outer-space-stars-galaxies-planets-background-images (1).jpg")); // NOI18N

        jMenu1.setText("Administrador");

        jMenuItem6.setText("Crear Universo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jmi_agregar.setText("Agregar Seres Vivos");
        jmi_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_agregar);

        jmi_modificar.setText("Modificar Seres Vivos");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_modificar);

        jmi_eliminar.setText("Eliminar Registros de Seres Vivos");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_eliminar);

        jmi_guardar.setText("Guardar los Datos");
        jmi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_guardarActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_guardar);

        jmi_abrir.setText("Abrir un Archvivo");
        jmi_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_abrirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_abrir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info Adicional");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarActionPerformed
        agregar_seres.pack();
        agregar_seres.setModal(true);
        agregar_seres.setLocationRelativeTo(this);
        agregar_seres.setVisible(true);
    }//GEN-LAST:event_jmi_agregarActionPerformed

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        modificar_seres.pack();
        modificar_seres.setModal(true);
        modificar_seres.setLocationRelativeTo(this);
        modificar_seres.setVisible(true);
    }//GEN-LAST:event_jmi_modificarActionPerformed

    private void Agregar_servivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Agregar_servivoMouseClicked
        String nombre_raza;
        int numero_ki;
        int numero_max_años;
        String nombre_planeta;

        try {
            nombre_raza = jt_nombre_raza.getText();
            numero_ki = Integer.parseInt(jt_numero_ki.getText());
            numero_max_años = Integer.parseInt(jt_numero_años.getText());
            nombre_planeta = jt_nombre_planeta.getText();

            seres_vivos s = new seres_vivos(nombre_raza, numero_ki, numero_max_años, nombre_planeta);
            u.getSv().add(s);

            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_modificar_seres.getModel();
            modelo.addElement(s);
            DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cb_eliminar_seres.getModel();
            modelo2.addElement(s);
            
            jt_nombre_raza.setText("");
            jt_numero_ki.setText("");
            jt_numero_años.setText("");
            jt_nombre_planeta.setText("");

            JOptionPane.showMessageDialog(this, "Ser Vivo Agregado Exitosamente");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un Error");
        }
    }//GEN-LAST:event_Agregar_servivoMouseClicked

    private void crear_universoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crear_universoMouseClicked
        String nombre = jt_crear_universo.getText();
        u = new Universo(nombre);
        jt_crear_universo.setText("");
        au.setU(u);
        cont++;
        if (cont <= 1) {
            crear_universo.setEnabled(false);
        }

        Crear_Universo.dispose();

        jmi_agregar.setEnabled(true);
        jmi_modificar.setEnabled(true);
        jmi_eliminar.setEnabled(true);
        jmi_guardar.setEnabled(true);
        jmi_abrir.setEnabled(true);
    }//GEN-LAST:event_crear_universoMouseClicked

    private void jmi_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_guardarActionPerformed
        JFileChooser file = new JFileChooser();
        int seleccion = file.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File f = file.getSelectedFile();
            au.setArchivo(f);
            try {
                au.escribirarchivo();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jmi_guardarActionPerformed

    private void modificar_servivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_servivoMouseClicked
        String nombre_raza;
        int numero_ki;
        int numero_max_años;
        String nombre_planeta;

        try {
            nombre_raza = nombre_raza1.getText();
            numero_ki = Integer.parseInt(numero_ki1.getText());
            numero_max_años = Integer.parseInt(numero_años1.getText());
            nombre_planeta = nombre_planeta1.getText();

            DefaultComboBoxModel mode = (DefaultComboBoxModel) cb_modificar_seres.getModel();
            ((seres_vivos) mode.getSelectedItem()).setNombre_raza(nombre_raza);
            ((seres_vivos) mode.getSelectedItem()).setNumero_ki(numero_ki);
            ((seres_vivos) mode.getSelectedItem()).setNumero_max_años(numero_max_años);
            ((seres_vivos) mode.getSelectedItem()).setNombre_planeta(nombre_planeta);
            cb_modificar_seres.setModel(mode);

            nombre_raza1.setText("");
            numero_ki1.setText("");
            numero_años1.setText("");
            nombre_planeta1.setText("");

            JOptionPane.showMessageDialog(this, "Modificación Exitosa");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un Error");
        }
    }//GEN-LAST:event_modificar_servivoMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Crear_Universo.pack();
        Crear_Universo.setModal(true);
        Crear_Universo.setLocationRelativeTo(this);
        Crear_Universo.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void eliminar_servivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_servivoMouseClicked
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_eliminar_seres.getModel();
        int i = cb_eliminar_seres.getSelectedIndex();
        model.removeElementAt(i);
        u.getSv().remove(i);
    }//GEN-LAST:event_eliminar_servivoMouseClicked

    private void jmi_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_abrirActionPerformed
        JFileChooser jfc = new JFileChooser();
        int seleccion = jfc.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File f = jfc.getSelectedFile();
            au.setArchivo(f);
            au.cargararchivo();
            u = au.getU();
            for (seres_vivos o : u.getSv()) {
                System.out.println(o.getNombre_raza());
                DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_modificar_seres.getModel();
                modelo.addElement(o);
            }
        }
    }//GEN-LAST:event_jmi_abrirActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        eliminar_seres.pack();
        eliminar_seres.setModal(true);
        eliminar_seres.setLocationRelativeTo(this);
        eliminar_seres.setVisible(true);
    }//GEN-LAST:event_jmi_eliminarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Zeno_Sama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zeno_Sama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zeno_Sama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zeno_Sama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zeno_Sama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_servivo;
    private javax.swing.JDialog Crear_Universo;
    private javax.swing.JDialog agregar_seres;
    private javax.swing.JComboBox<String> cb_eliminar_seres;
    private javax.swing.JComboBox<String> cb_modificar_seres;
    private javax.swing.JButton crear_universo;
    private javax.swing.JDialog eliminar_seres;
    private javax.swing.JButton eliminar_servivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem jmi_abrir;
    private javax.swing.JMenuItem jmi_agregar;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_guardar;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JTextField jt_crear_universo;
    private javax.swing.JTextField jt_nombre_planeta;
    private javax.swing.JTextField jt_nombre_raza;
    private javax.swing.JTextField jt_numero_años;
    private javax.swing.JTextField jt_numero_ki;
    private javax.swing.JDialog modificar_seres;
    private javax.swing.JButton modificar_servivo;
    private javax.swing.JTextField nombre_planeta1;
    private javax.swing.JTextField nombre_raza1;
    private javax.swing.JTextField numero_años1;
    private javax.swing.JTextField numero_ki1;
    // End of variables declaration//GEN-END:variables
ArrayList<seres_vivos> lista = new ArrayList();
    Universo u;
    Admin_Universo au = new Admin_Universo();
    int cont = 0;
}
