/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.sysbazar.vista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import pe.edu.upeu.sysbazar.BD.EmpleadoBD;
import pe.edu.upeu.sysbazar.config.Conexion;
import pe.edu.upeu.sysbazar.modelo.Empleado;

/**
 *
 * @author USER
 */
public class ReporteClienteForm extends javax.swing.JInternalFrame {
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    EmpleadoBD emp = new EmpleadoBD();
    ArrayList< Empleado > lista = new ArrayList();
    DefaultComboBoxModel<Object> combomodel = new DefaultComboBoxModel<>();
    
    /**
     * Creates new form ReporteClienteForm
     */
    public ReporteClienteForm() {
        initComponents();
    }
final void cargarCombo(){
lista = emp.listarEmpleado();
combomodel.addElement("Seleccionar Empleado");
cboListarEmpleado.setModel(combomodel);
for(int i=0; i<lista.size();i++){
combomodel.addElement(lista.get(i).getNombres());
    }
cboListarEmpleado.setModel(combomodel);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboListarEmpleado = new javax.swing.JComboBox();
        btnreporte = new javax.swing.JButton();

        jLabel1.setText("Empleado");

        btnreporte.setText("Reporte");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cboListarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboListarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        String empleado =null;
        JasperReport jasperReport = null;
        try {
            cx = Conexion.GetConexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCategoriaProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCategoriaProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        empleado = cboListarEmpleado.getSelectedItem().toString();
        Map parametro = new HashMap();
        parametro.put("nomb", empleado);
        try{
            jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/report3.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametro, cx);
            JasperViewer jasperViewer = new JasperViewer(jasperPrint,false);
            jasperViewer.setVisible(true);
            
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null, "JasperReport:"+ex);
        }
    }//GEN-LAST:event_btnreporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreporte;
    private javax.swing.JComboBox cboListarEmpleado;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}