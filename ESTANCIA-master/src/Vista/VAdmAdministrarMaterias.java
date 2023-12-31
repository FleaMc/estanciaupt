/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Clase.Administrador;
import Clase.Materia;
import Modelo.BaseDeDatos;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geovanni
 */
public class VAdmAdministrarMaterias extends javax.swing.JFrame {
    private Materia materia;
    private int numFilaSeleccionada;
    
    private BaseDeDatos bd = new BaseDeDatos();
    
    private Color color;
    
    /**
     * Creates new form AdministrarMaterias
     */
    public VAdmAdministrarMaterias() {
        initComponents();
        
        tb_materias.getColumnModel().getColumn(0).setPreferredWidth(400);
        
        bd.abrirConexion();
        llenarTablaDeMaterias(bd.consultarMaterias());
        bd.cerrarConexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_materias = new javax.swing.JTable();
        pn_color = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        lb_nombreDeMateria = new javax.swing.JLabel();
        tf_nombreDeMateria = new javax.swing.JTextField();
        lb_color = new javax.swing.JLabel();
        bt_modificar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_registrar = new javax.swing.JButton();
        bt_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_materias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Red", "Green", "Blue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_materiasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_materias);

        pn_color.setBackground(new java.awt.Color(255, 204, 102));
        pn_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_colorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_colorLayout = new javax.swing.GroupLayout(pn_color);
        pn_color.setLayout(pn_colorLayout);
        pn_colorLayout.setHorizontalGroup(
            pn_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );
        pn_colorLayout.setVerticalGroup(
            pn_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lb_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_titulo.setText("Administración de materias");

        lb_nombreDeMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_nombreDeMateria.setText("Nombre de la materia:");

        tf_nombreDeMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lb_color.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_color.setText("Color:");

        bt_modificar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_modificar.setText("Modificar");
        bt_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarMouseClicked(evt);
            }
        });

        bt_eliminar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarMouseClicked(evt);
            }
        });

        bt_registrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_registrar.setText("Registrar");
        bt_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarMouseClicked(evt);
            }
        });

        bt_regresar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_regresar.setText("Regresar");
        bt_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_regresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_titulo)
                    .addComponent(lb_nombreDeMateria)
                    .addComponent(lb_color)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pn_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_registrar)
                        .addGap(4, 4, 4)
                        .addComponent(bt_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_regresar))
                    .addComponent(tf_nombreDeMateria)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_nombreDeMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nombreDeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lb_color)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pn_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarMouseClicked
        if (nombreEstaVacio()) return;
        
        Materia materiaNueva = new Materia(tf_nombreDeMateria.getText(), pn_color.getBackground());
        
        Administrador.registrarMateria(materiaNueva);
        
        bd.abrirConexion();
        llenarTablaDeMaterias(bd.consultarMaterias());
        bd.cerrarConexion();
    }//GEN-LAST:event_bt_registrarMouseClicked

    private void bt_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarMouseClicked
        if (nombreEstaVacio()) return;
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea cambiar el color para la materia " + materia.getNombre() + "?", "Confirmar cambios", JOptionPane.OK_CANCEL_OPTION);

        if (confirmacion == 0) {
            materia.setColor(pn_color.getBackground());

            Administrador.modificarMateria(materia);

            bd.abrirConexion();
            llenarTablaDeMaterias(bd.consultarMaterias());
            bd.cerrarConexion();
        }
    }//GEN-LAST:event_bt_modificarMouseClicked

    private void bt_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarMouseClicked
        if (nombreEstaVacio()) return;
        
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la materia " + materia.getNombre() + "?", "Confirmar Baja", JOptionPane.OK_CANCEL_OPTION);

        if (confirmacion == 0) {
            Administrador.eliminarMateria(materia);

            bd.abrirConexion();
            llenarTablaDeMaterias(bd.consultarMaterias());
            bd.cerrarConexion();
        }
    }//GEN-LAST:event_bt_eliminarMouseClicked

    private void pn_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_colorMouseClicked
        JColorChooser jcc = new JColorChooser();
        jcc.setVisible(true);
        color = jcc.showDialog(null, "Selecciona el color de la materia", Color.WHITE);
        if (color == null) color = Color.WHITE;
        
        pn_color.setBackground(color);
    }//GEN-LAST:event_pn_colorMouseClicked

    private void tb_materiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_materiasMouseClicked
        numFilaSeleccionada = tb_materias.rowAtPoint(evt.getPoint());
        
        materia = new Materia(tb_materias.getValueAt(numFilaSeleccionada, 0)+"", new Color(Integer.parseInt(tb_materias.getValueAt(numFilaSeleccionada, 1)+""),Integer.parseInt(tb_materias.getValueAt(numFilaSeleccionada, 1)+""),Integer.parseInt(tb_materias.getValueAt(numFilaSeleccionada, 3)+"")));

        tf_nombreDeMateria.setText(materia.getNombre());
        pn_color.setBackground(materia.getColor());
    }//GEN-LAST:event_tb_materiasMouseClicked

    private void bt_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_regresarMouseClicked
        VAdmAdministrarHorarios interfaz = new VAdmAdministrarHorarios();
        interfaz.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_regresarMouseClicked

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
            java.util.logging.Logger.getLogger(VAdmAdministrarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdmAdministrarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdmAdministrarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdmAdministrarMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdmAdministrarMaterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton bt_regresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_color;
    private javax.swing.JLabel lb_nombreDeMateria;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel pn_color;
    private javax.swing.JTable tb_materias;
    private javax.swing.JTextField tf_nombreDeMateria;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaDeMaterias(ResultSet rs) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tb_materias.getModel();
            dtm.setRowCount(0);
            
            if (rs != null) {
                while (rs.next()) {
                    String[] fila = {rs.getString("Nombre"), rs.getString("ColorRed"), rs.getString("ColorGreen"), rs.getString("ColorBlue")};
                    dtm.addRow(fila);
                }
            }
            tb_materias.setModel(dtm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: No se pudó realizar la consulta");
        }
    }
    
    private boolean nombreEstaVacio() {
        if (tf_nombreDeMateria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de la materia esta vacío");
            return true;
        } else {
            return false;
        }
    }
}
