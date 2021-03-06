/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista.factura;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFacturaCabecera;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.vista.VentanaPrincipal;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author José Quinde
 */
public class VentanaBuscarFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaBuscarFactura
     */
    //Declaracion de Variables
    private ControladorFacturaCabecera controladorFacturaCabecera;
    private ControladorCliente controladorCliente;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    private ControladorProducto controladorProducto;
    private VentanaFacturaEncontrada facturaEncontrada;
    private Locale localizacion;
    private static ResourceBundle mensajes;
    public static int codigoFactura;
    /**
     * Constructor que inicializa los componentes
     * @param controladorFacturaCabecera
     * @param controladorCliente
     * @param controladorFacturaDetalle
     * @param controladorProducto 
     */
    public VentanaBuscarFactura(ControladorFacturaCabecera controladorFacturaCabecera,ControladorCliente controladorCliente,ControladorFacturaDetalle controladorFacturaDetalle,ControladorProducto controladorProducto) {
        initComponents();
        this.controladorFacturaCabecera=controladorFacturaCabecera;
        this.controladorCliente=controladorCliente;
        this.controladorFacturaDetalle=controladorFacturaDetalle;
        this.controladorProducto=controladorProducto;
    }
    /**
     * Metodo que cambia el idioma de todo El jInternalFrame
     * @param localizacion 
     */
     public static void cambiarIdioma(Locale localizacion){
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        lblNumeroFactura.setText(mensajes.getString("factura.codigo"));
        btnBuscar.setText(mensajes.getString("boton.buscar"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumeroFactura = new javax.swing.JTextField();
        lblNumeroFactura = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Buscar Factura");

        txtNumeroFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNumeroFactura.setForeground(new java.awt.Color(0, 0, 204));
        txtNumeroFactura.setDisabledTextColor(new java.awt.Color(0, 0, 204));

        lblNumeroFactura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumeroFactura.setText("Codigo de Factura:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumeroFactura)
                        .addGap(31, 31, 31)
                        .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroFactura)
                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                //Busca la Factura y llama a otra Ventana para visualizarla
                codigoFactura = Integer.parseInt(txtNumeroFactura.getText());
                if(facturaEncontrada == null || !facturaEncontrada.isVisible()){
                facturaEncontrada = new VentanaFacturaEncontrada(controladorFacturaCabecera,controladorCliente,controladorFacturaDetalle,controladorProducto);
                VentanaPrincipal.desktopPane.add(facturaEncontrada);
                setVisible(false);
                facturaEncontrada.setVisible(true);
                VentanaFacturaEncontrada.cambiarIdioma(localizacion);
                }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Cierra la ventana
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JLabel lblNumeroFactura;
    public static javax.swing.JTextField txtNumeroFactura;
    // End of variables declaration//GEN-END:variables
}
