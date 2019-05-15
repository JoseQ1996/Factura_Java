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
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.FacturaCabecera;
import ec.edu.ups.modelo.FacturaDetalle;
import ec.edu.ups.vista.VentanaPrincipal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author José Quinde
 */
public class VentanaAgregarFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarFactura
     */
    //Declaracion de Variables
    private ControladorFacturaCabecera controladorFacturaCabecera;
    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    private Locale localizacion;
    private static ResourceBundle mensajes;
    public static DefaultTableModel modeloTabla;
    private VentanaAgregarDetalle agregarDetalle;
    Cliente cliente1;
    public static int codigoFac=0;
    double subTotal;
    double iva;
    double total;
    /**
     * Constructor que inicializa los componentes
     * @param controladorFacturaCabecera
     * @param controladorCliente
     * @param controladorProducto
     * @param controladorFacturaDetalle 
     */
    public VentanaAgregarFactura(ControladorFacturaCabecera controladorFacturaCabecera,ControladorCliente controladorCliente,ControladorProducto controladorProducto,ControladorFacturaDetalle controladorFacturaDetalle) {
        initComponents();
        this.controladorCliente=controladorCliente;
        this.controladorFacturaCabecera=controladorFacturaCabecera;
        this.controladorProducto=controladorProducto;
        this.controladorFacturaDetalle=controladorFacturaDetalle;
        txtCodigo.setText(String.valueOf(this.controladorFacturaCabecera.getCodigo()));
        codigoFac=controladorFacturaCabecera.getCodigo();
         modeloTabla = new DefaultTableModel();
         //Da los nombres de las columnas de la tabla
        Object[] columnas = {"Codigo", "Nombre", "Precio Unitario", "Cantidad", "Sub Total"};
        modeloTabla.setColumnIdentifiers(columnas);
        tblDetalle.setModel(modeloTabla);
        
    }
    /**
     * Metodo que cambia el idioma de todo El jInternalFrame
     * @param localizacion 
     */
    public static void cambiarIdioma(Locale localizacion){
         mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        labelCod.setText(mensajes.getString("cliente.codigo"));
        labelCed.setText(mensajes.getString("cliente.cedula"));
        labelNom.setText(mensajes.getString("cliente.nombre"));
        labelDir.setText(mensajes.getString("cliente.direccion"));
        labelTele.setText(mensajes.getString("cliente.telefono"));
        btnBuscar.setText(mensajes.getString("boton.buscar"));
        btnCancelar.setText(mensajes.getString("boton.cancelar"));
        btnAgreProducto.setText(mensajes.getString("boton.agreProduc"));
        btnElimProducto.setText(mensajes.getString("boton.elimProduc"));
        btnCalcular.setText(mensajes.getString("boton.calcular"));
        btnCrear.setText(mensajes.getString("boton.agregar"));
        labelFec.setText(mensajes.getString("factura.fecha"));
        labelFac.setText(mensajes.getString("factura.nombre"));
        Object[] columnas = {mensajes.getString("cliente.codigo"),mensajes.getString("cliente.nombre"), mensajes.getString("producto.precioUnitario"), mensajes.getString("detalle.cantidad"), "Sub Total"};
        modeloTabla.setColumnIdentifiers(columnas);
    }
    /**
     * Metodo que calcula el Subtotal de la Factura
     */
  public void calcularSubtotal() {
        subTotal = 0.00;
        TableModel tableModel = tblDetalle.getModel();
        int filas = tableModel.getRowCount();
        for (int i = 0; i < filas; i++) {
            subTotal += (double) tableModel.getValueAt(i, 4);
        }
        txtSubTotal.setText(String.valueOf(subTotal));
    }
    /**
     * Metodo que calcula el Iva de la Factura
     */
    public void calcularIva() {
        iva = 0.12 * subTotal;
        txtIva.setText(String.valueOf(iva));
    }
    /**
     * Metodo que calcula el Total de la Factura
     */
    public void calcularTotal() {
        calcularSubtotal();
        calcularIva();
        txtTotal.setText(String.valueOf((subTotal) + (iva)));
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
        labelCed = new javax.swing.JLabel();
        labelNom = new javax.swing.JLabel();
        labelDir = new javax.swing.JLabel();
        labelTele = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        labelCod = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        labelFec = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        labelSub = new javax.swing.JLabel();
        labelIva = new javax.swing.JLabel();
        labelTot = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnAgreProducto = new javax.swing.JButton();
        btnElimProducto = new javax.swing.JButton();
        labelFac = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Crear Factura");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura"));

        labelCed.setText("Cedula");

        labelNom.setText("Nombre");

        labelDir.setText("Dirección");

        labelTele.setText("Teléfono");

        txtNombre.setEnabled(false);

        txtDireccion.setEnabled(false);

        txtTelefono.setEnabled(false);

        labelCod.setText("Código");

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        labelFec.setText("Fecha");

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Precio Unitario", "Cantidad", "SubTotal"
            }
        ));
        jScrollPane1.setViewportView(tblDetalle);

        btnCrear.setText("Agregar");
        btnCrear.setEnabled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        labelSub.setText("Subtotal");

        labelIva.setText("IVA");

        labelTot.setText("Total");

        txtSubTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSubTotal.setForeground(new java.awt.Color(0, 0, 204));

        txtIva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtIva.setForeground(new java.awt.Color(0, 0, 204));
        txtIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIvaActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 0, 0));

        btnAgreProducto.setText("Agregar Producto");
        btnAgreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreProductoActionPerformed(evt);
            }
        });

        btnElimProducto.setText("EliminarProducto");
        btnElimProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimProductoActionPerformed(evt);
            }
        });

        labelFac.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelFac.setText("FACTURA");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(labelIva))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelSub)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(8, 8, 8)
                                                        .addComponent(labelTot)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                                    .addComponent(txtIva)
                                                    .addComponent(txtTotal))))))))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNom)
                            .addComponent(labelDir)
                            .addComponent(labelTele))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDireccion))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelFec)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnElimProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgreProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCed)
                                .addGap(18, 18, 18)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCod)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(labelFac, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCod)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFac))
                        .addGap(18, 18, 18)
                        .addComponent(labelCed)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNom)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFec)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDir)
                    .addComponent(btnAgreProducto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTele)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElimProducto))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSub)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIva)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTot)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCrear)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Cierra la ventana
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Busca al cliente por la cedula
        String cedula=txtCedula.getText();
        Cliente clienteBuscado=controladorCliente.readCedula(cedula);
        txtNombre.setText(clienteBuscado.getNombre());
        txtDireccion.setText(clienteBuscado.getDireccion());
        txtTelefono.setText(clienteBuscado.getTelefono());
        cliente1=clienteBuscado;
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnAgreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreProductoActionPerformed
        // LLama a otra ventana para poder agregar Detalle de Factura
        if(agregarDetalle == null || !agregarDetalle.isVisible()){
        agregarDetalle=new VentanaAgregarDetalle(controladorFacturaDetalle,controladorProducto);       
        VentanaPrincipal.desktopPane.add(agregarDetalle);  
        agregarDetalle.setVisible(true);
        VentanaAgregarDetalle.cambiarIdioma(localizacion);
        }
          
    }//GEN-LAST:event_btnAgreProductoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // Calcula el Total final y habilita el boton para crear factura
        calcularSubtotal();
        calcularIva();
        calcularTotal();
        btnCrear.setEnabled(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIvaActionPerformed

    private void btnElimProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimProductoActionPerformed
        // Elimina un Detalle de la Factura
         int filaSeleccionada = tblDetalle.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int codigoDetalle = Integer.parseInt(tblDetalle.getValueAt(filaSeleccionada, 0).toString());
            modeloTabla.removeRow(filaSeleccionada);
            controladorFacturaDetalle.delete(codigoDetalle);
            calcularSubtotal();
            calcularIva();
            calcularTotal();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error Seleccione Compra");
        }
    }//GEN-LAST:event_btnElimProductoActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // Crea la Factura
        FacturaCabecera factura = new FacturaCabecera();
        factura.setCliente(cliente1);
        factura.setIva(Double.parseDouble(txtIva.getText()));
        factura.setSubtotal(Double.parseDouble(txtSubTotal.getText()));
        factura.setTotal(Double.parseDouble(txtTotal.getText()));
        String fecha1 = txtFecha.getText(); // Entrada recogida como sea (scanner)
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY"); // Creamos un formato de fecha
        Date fecha=null;
        try {
            fecha = format.parse(fecha1);
        } catch (ParseException ex) {
            Logger.getLogger(VentanaAgregarFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        factura.setFecha(fecha);
        controladorFacturaCabecera.crear(factura);
        
        //JOptionPane.showMessageDialog(rootPane, "Factura Guardada Corectamente");
        JOptionPane.showMessageDialog(this, "Factura Creada","Crear Factura",JOptionPane.OK_OPTION);
        //Setear codigo
        //vaciar Txts
        txtCodigo.setText(String.valueOf(this.controladorFacturaCabecera.getCodigo()));
        txtCedula.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtFecha.setText("");
        txtTelefono.setText("");
        txtTotal.setText("");
        txtIva.setText("");
        txtSubTotal.setText("");
        DefaultTableModel tb = (DefaultTableModel) tblDetalle.getModel();
        int a = tblDetalle.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
        tb.removeRow(tb.getRowCount()-1);
        //controladorFacturaDetalle.delete(i);// o con “modelo.removeRow(0);” o con
        // “modelo.setNumRows(0);” también funciona
      }
      btnCrear.setEnabled(false);
    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAgreProducto;
    public static javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnCalcular;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnCrear;
    public static javax.swing.JButton btnElimProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelCed;
    public static javax.swing.JLabel labelCod;
    public static javax.swing.JLabel labelDir;
    public static javax.swing.JLabel labelFac;
    public static javax.swing.JLabel labelFec;
    public static javax.swing.JLabel labelIva;
    public static javax.swing.JLabel labelNom;
    public static javax.swing.JLabel labelSub;
    public static javax.swing.JLabel labelTele;
    public static javax.swing.JLabel labelTot;
    public static javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
