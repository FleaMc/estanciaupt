/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Vista.VAdmAdministrarAlumnos;
import Vista.VAdmAdministrarHorarios;

/**
 *
 * @author Geovanni
 */
public class Notificaciones extends javax.swing.JFrame {

    /**
     * Creates new form Administrar_horario
     */
    public Notificaciones(final String nom) {
        initComponents();
        this.setLocationRelativeTo(null);
        lb_nomusuarios.setText(nom);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_nomusuarios = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bt_administarHorarios = new javax.swing.JButton();
        bt_rondines = new javax.swing.JButton();
        bt_reportes = new javax.swing.JButton();
        bt_inventario = new javax.swing.JButton();
        bt_administarUsuarios = new javax.swing.JButton();
        bt_notificaciones = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cb_tipo = new javax.swing.JComboBox<>();
        lb_salon = new javax.swing.JLabel();
        lb_asunto = new javax.swing.JLabel();
        bt_registrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_mensajes = new javax.swing.JTextArea();
        lb_mensaje = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_asunto = new javax.swing.JTextArea();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(107, 8, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administrador.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        lb_nomusuarios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_nomusuarios.setForeground(new java.awt.Color(255, 255, 255));
        lb_nomusuarios.setText("Administrador");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("usuario:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lb_nomusuarios)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_nomusuarios)
                        .addGap(42, 42, 42))))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isc350X140.png"))); // NOI18N

        bt_administarHorarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_administarHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario60X60.png"))); // NOI18N
        bt_administarHorarios.setText("Administar horarios");
        bt_administarHorarios.setContentAreaFilled(false);
        bt_administarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_administarHorariosActionPerformed(evt);
            }
        });

        bt_rondines.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_rondines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ronda60X60.png"))); // NOI18N
        bt_rondines.setText("Rondines              ");
        bt_rondines.setContentAreaFilled(false);
        bt_rondines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rondinesActionPerformed(evt);
            }
        });

        bt_reportes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte2_60X60.png"))); // NOI18N
        bt_reportes.setText("Reportes                ");
        bt_reportes.setContentAreaFilled(false);
        bt_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reportesActionPerformed(evt);
            }
        });

        bt_inventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario60X60.png"))); // NOI18N
        bt_inventario.setText("Inventario           ");
        bt_inventario.setContentAreaFilled(false);
        bt_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inventarioActionPerformed(evt);
            }
        });

        bt_administarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_administarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grupo-de-usuarios60X60.png"))); // NOI18N
        bt_administarUsuarios.setText("Administar usuarios");
        bt_administarUsuarios.setContentAreaFilled(false);
        bt_administarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_administarUsuariosActionPerformed(evt);
            }
        });

        bt_notificaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correo60X60.png"))); // NOI18N
        bt_notificaciones.setText("Notificaciones         ");
        bt_notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_notificacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_administarHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_administarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_rondines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_notificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_administarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_administarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_rondines, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(244, 244, 244));

        cb_tipo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente", "Todos" }));
        cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoActionPerformed(evt);
            }
        });

        lb_salon.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lb_salon.setText("Usuario dirigido:");

        lb_asunto.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lb_asunto.setText("Asunto:");

        bt_registrar.setBackground(new java.awt.Color(107, 8, 48));
        bt_registrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_registrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrar.setText("publicar");
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });

        ta_mensajes.setColumns(20);
        ta_mensajes.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        ta_mensajes.setLineWrap(true);
        ta_mensajes.setRows(5);
        ta_mensajes.setWrapStyleWord(true);
        ta_mensajes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ta_mensajesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(ta_mensajes);

        lb_mensaje.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lb_mensaje.setText("Mensaje:");

        ta_asunto.setColumns(20);
        ta_asunto.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        ta_asunto.setLineWrap(true);
        ta_asunto.setRows(5);
        ta_asunto.setWrapStyleWord(true);
        ta_asunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ta_asuntoKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(ta_asunto);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correo-electronico.png"))); // NOI18N
        jToggleButton1.setText("Administración de notificaciones");
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_registrar)
                .addGap(405, 405, 405))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1))
                    .addComponent(lb_mensaje)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addComponent(lb_asunto)
                    .addComponent(lb_salon)
                    .addComponent(jScrollPane2))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_salon)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1))
                .addGap(44, 44, 44)
                .addComponent(lb_asunto)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lb_mensaje)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(bt_registrar)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(1, 26, 93));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Notificaciones ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_administarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_administarUsuariosActionPerformed
        VAdmAdministrarAlumnos abrir = new VAdmAdministrarAlumnos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_administarUsuariosActionPerformed

    private void bt_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reportesActionPerformed
        Reportes ventana = new Reportes(lb_nomusuarios.getText());
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_reportesActionPerformed

    private void bt_administarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_administarHorariosActionPerformed
       VAdmAdministrarHorarios abrir = new VAdmAdministrarHorarios();
                    
                    abrir.setVisible(true);
                    this.setVisible(false); 
    }//GEN-LAST:event_bt_administarHorariosActionPerformed

    private void bt_rondinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rondinesActionPerformed
        Rondines ventana = new Rondines(lb_nomusuarios.getText());
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_rondinesActionPerformed

    private void bt_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inventarioActionPerformed
        Inventario ventana = new Inventario(lb_nomusuarios.getText());
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_inventarioActionPerformed

    private void bt_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_notificacionesActionPerformed
        Notificaciones ventana = new Notificaciones(lb_nomusuarios.getText());
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_notificacionesActionPerformed

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        String Administrador = lb_nomusuarios.getText();
        String Asunto = ta_asunto.getText();
        String Cuerpo = ta_mensajes.getText();
        String tipo = (String) cb_tipo.getSelectedItem();
        String estado = "Activo";
        try {
            if (ta_mensajes.getText().isEmpty() || ta_asunto.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Campo vacios", "Campo vacios", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/img/documento.png"));
            } else {
                Connection connection = Base_datos.getConnection();
                PreparedStatement ps = connection.prepareStatement("INSERT INTO Mensajes (Administrador, Asunto, Cuerpo, TipoDeUsuarioAlQueSeDirige, Estado )VALUES(?,?,?,?,?)");
                ps.setString(1, Administrador);
                ps.setString(2, Asunto);
                ps.setString(3, Cuerpo);
                ps.setString(4, tipo);
                ps.setString(5, estado);
                ps.executeUpdate();
                ta_asunto.setText("");
                ta_mensajes.setText("");
                JOptionPane.showMessageDialog(null, "Notificacion publicada con exito", "Estado de mensaje", JOptionPane.PLAIN_MESSAGE, new ImageIcon("src/img/megafono.png"));
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cerrar();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ta_mensajesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta_mensajesKeyTyped
        if (ta_mensajes.getText().length() >= 200) {
            evt.consume();
        }
    }//GEN-LAST:event_ta_mensajesKeyTyped

    private void ta_asuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta_asuntoKeyTyped
        if (ta_asunto.getText().length() >= 50) {
            evt.consume();
        }
    }//GEN-LAST:event_ta_asuntoKeyTyped

    private void cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipoActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Administracion_de_mensajes ventana = new Administracion_de_mensajes(lb_nomusuarios.getText());
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    public void cerrar() {
        Object[] opciones = {"Aceptar", "Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane, "Desea cerrar sesión", "Mensaje de Confirmacion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
        if (eleccion == JOptionPane.YES_OPTION) {
            login ventana = new login();
            ventana.setVisible(true);
            this.setVisible(false);
        } else {
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_administarHorarios;
    private javax.swing.JButton bt_administarUsuarios;
    private javax.swing.JButton bt_inventario;
    private javax.swing.JButton bt_notificaciones;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton bt_reportes;
    private javax.swing.JButton bt_rondines;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lb_asunto;
    private javax.swing.JLabel lb_mensaje;
    private javax.swing.JLabel lb_nomusuarios;
    private javax.swing.JLabel lb_salon;
    private javax.swing.JTextArea ta_asunto;
    private javax.swing.JTextArea ta_mensajes;
    // End of variables declaration//GEN-END:variables
}
