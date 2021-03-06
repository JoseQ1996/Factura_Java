/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.controladores.ControladorFacturaCabecera;
import ec.edu.ups.controladores.ControladorFacturaDetalle;
import ec.edu.ups.controladores.ControladorProducto;
import ec.edu.ups.vista.cliente.VentanaActualizarCliente;
import ec.edu.ups.vista.cliente.VentanaBuscarCliente;
import ec.edu.ups.vista.cliente.VentanaCrearCliente;
import ec.edu.ups.vista.cliente.VentanaEliminarCliente;
import ec.edu.ups.vista.cliente.VentanaListarClientes;
import ec.edu.ups.vista.factura.VentanaAgregarFactura;
import ec.edu.ups.vista.producto.VentanaActualizarProducto;
import ec.edu.ups.vista.producto.VentanaBuscarProducto;
import ec.edu.ups.vista.producto.VentanaCrearProducto;
import ec.edu.ups.vista.producto.VentanaEliminarProducto;
import ec.edu.ups.vista.producto.VentanaListarProductos;
import ec.edu.ups.vista.factura.VentanaBuscarFactura;
import ec.edu.ups.vista.factura.VentanaEliminarFactura;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author José Quinde
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    //Declaracion de Variables
    private VentanaCrearCliente crearCliente;
    private VentanaActualizarCliente actualizarCliente;
    private VentanaEliminarCliente eliminarCliente;
    private VentanaBuscarCliente buscarCliente;
    private VentanaAgregarFactura agregarFactura;
    private VentanaActualizarProducto actualizarProducto;
    private VentanaCrearProducto crearProducto;
    private VentanaBuscarProducto buscarProducto;
    private VentanaEliminarProducto eliminarProducto;
    private VentanaEliminarFactura eliminarFactura;
    private VentanaListarClientes listarClientes;
    private VentanaListarProductos listarProductos;
    private VentanaBuscarFactura buscarFactura;
    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    private ControladorFacturaCabecera controladorFacturaCabecera;
    private ControladorFacturaDetalle controladorFacturaDetalle;
    private Locale localizacion;
    private ResourceBundle mensajes;
    
    /**
     * Creates new form VentanaPrincipal
     */
    /**
     * Constructor Inicializa componentes
     */
    public VentanaPrincipal() {
        initComponents();
        controladorCliente = new ControladorCliente();
        controladorProducto= new ControladorProducto();
        controladorFacturaCabecera=new ControladorFacturaCabecera();
        controladorFacturaDetalle=new ControladorFacturaDetalle();
        System.out.println("Localizacion por defecto: "+Locale.getDefault().getLanguage());
        //localizacion= new Locale("en","US");
        //Locale.setDefault(localizacion);
        //System.out.println("Localizacion Forzada: "+Locale.getDefault().getLanguage());
        //mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        //System.out.println(mensajes.getString("menu.item.crear"));
        //cambiarIdioma();
    }
    /**
     * Metodo que cambia el idioma de toda la ventana Principal
     * 
     */
    public void cambiarIdioma(){
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idiomas.mensajes",Locale.getDefault());
        //Cambia los menus
        clienteMenu.setText(mensajes.getString("menu.cliente"));
        productoMenu.setText(mensajes.getString("menu.producto"));
        facturaMenu.setText(mensajes.getString("menu.factura"));
        idiomasMenu.setText(mensajes.getString("menu.idiomas"));
        //Cambia los textos de Crear
        itmCrearCliente.setText(mensajes.getString("menu.item.crear"));
        itmCrearProducto.setText(mensajes.getString("menu.item.crear"));
        itmCrearFactura.setText(mensajes.getString("menu.item.crear"));
        //Cambia los Buscar
        itmBuscarCliente.setText(mensajes.getString("menu.item.buscar"));
        itmBuscarProducto.setText(mensajes.getString("menu.item.buscar"));
        itmBuscarFactura.setText(mensajes.getString("menu.item.buscar"));
        //Cambia los Actualizar
        itmActualizarCliente.setText(mensajes.getString("menu.item.actualizar"));
        itmActualizarProducto.setText(mensajes.getString("menu.item.actualizar"));
        //Cambia los Eliminar
        itmEliminarCliente.setText(mensajes.getString("menu.item.eliminar"));
        itmEliminarProducto.setText(mensajes.getString("menu.item.eliminar"));
        itmEliminarFactura.setText(mensajes.getString("menu.item.eliminar"));
        //Cambio los Listar
        itmListarCliente.setText(mensajes.getString("menu.item.listar"));
        itmListarProducto.setText(mensajes.getString("menu.item.listar"));
        //Cambio los idiomas
        itmEspañol.setText(mensajes.getString("menu.item.español"));
        itmInlges.setText(mensajes.getString("menu.item.ingles"));
        
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        clienteMenu = new javax.swing.JMenu();
        itmCrearCliente = new javax.swing.JMenuItem();
        itmBuscarCliente = new javax.swing.JMenuItem();
        itmActualizarCliente = new javax.swing.JMenuItem();
        itmEliminarCliente = new javax.swing.JMenuItem();
        itmListarCliente = new javax.swing.JMenuItem();
        productoMenu = new javax.swing.JMenu();
        itmCrearProducto = new javax.swing.JMenuItem();
        itmBuscarProducto = new javax.swing.JMenuItem();
        itmActualizarProducto = new javax.swing.JMenuItem();
        itmEliminarProducto = new javax.swing.JMenuItem();
        itmListarProducto = new javax.swing.JMenuItem();
        facturaMenu = new javax.swing.JMenu();
        itmCrearFactura = new javax.swing.JMenuItem();
        itmBuscarFactura = new javax.swing.JMenuItem();
        itmEliminarFactura = new javax.swing.JMenuItem();
        idiomasMenu = new javax.swing.JMenu();
        itmEspañol = new javax.swing.JMenuItem();
        itmInlges = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturización");

        clienteMenu.setMnemonic('f');
        clienteMenu.setText("Cliente");

        itmCrearCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itmCrearCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/001-add.png"))); // NOI18N
        itmCrearCliente.setMnemonic('o');
        itmCrearCliente.setText("Crear");
        itmCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCrearClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmCrearCliente);

        itmBuscarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        itmBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/006-archive.png"))); // NOI18N
        itmBuscarCliente.setMnemonic('s');
        itmBuscarCliente.setText("Buscar");
        itmBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmBuscarCliente);

        itmActualizarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itmActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/057-notes.png"))); // NOI18N
        itmActualizarCliente.setMnemonic('a');
        itmActualizarCliente.setText("Actualizar");
        itmActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmActualizarClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmActualizarCliente);

        itmEliminarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        itmEliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/031-delete.png"))); // NOI18N
        itmEliminarCliente.setMnemonic('x');
        itmEliminarCliente.setText("Eliminar");
        itmEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEliminarClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmEliminarCliente);

        itmListarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        itmListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/023-checklist.png"))); // NOI18N
        itmListarCliente.setText("Listar");
        itmListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarClienteActionPerformed(evt);
            }
        });
        clienteMenu.add(itmListarCliente);

        menuBar.add(clienteMenu);

        productoMenu.setText("Producto");

        itmCrearProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        itmCrearProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/001-add.png"))); // NOI18N
        itmCrearProducto.setText("Crear");
        itmCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCrearProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmCrearProducto);

        itmBuscarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        itmBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/006-archive.png"))); // NOI18N
        itmBuscarProducto.setText("Buscar");
        itmBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmBuscarProducto);

        itmActualizarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itmActualizarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/057-notes.png"))); // NOI18N
        itmActualizarProducto.setText("Actualizar");
        itmActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmActualizarProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmActualizarProducto);

        itmEliminarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        itmEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/031-delete.png"))); // NOI18N
        itmEliminarProducto.setText("Eliminar");
        itmEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEliminarProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmEliminarProducto);

        itmListarProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        itmListarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/023-checklist.png"))); // NOI18N
        itmListarProducto.setText("Listar");
        itmListarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarProductoActionPerformed(evt);
            }
        });
        productoMenu.add(itmListarProducto);

        menuBar.add(productoMenu);

        facturaMenu.setText("Factura");

        itmCrearFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itmCrearFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/041-insert.png"))); // NOI18N
        itmCrearFactura.setText("Crear");
        itmCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCrearFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmCrearFactura);

        itmBuscarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itmBuscarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/058-number.png"))); // NOI18N
        itmBuscarFactura.setText("Buscar");
        itmBuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmBuscarFactura);

        itmEliminarFactura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        itmEliminarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/025-clear.png"))); // NOI18N
        itmEliminarFactura.setText("Eliminar");
        itmEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEliminarFacturaActionPerformed(evt);
            }
        });
        facturaMenu.add(itmEliminarFactura);

        menuBar.add(facturaMenu);

        idiomasMenu.setText("Idiomas");

        itmEspañol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        itmEspañol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/084-spell check.png"))); // NOI18N
        itmEspañol.setText("Español");
        itmEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEspañolActionPerformed(evt);
            }
        });
        idiomasMenu.add(itmEspañol);

        itmInlges.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        itmInlges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/084-spell check.png"))); // NOI18N
        itmInlges.setText("Ingles");
        itmInlges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmInlgesActionPerformed(evt);
            }
        });
        idiomasMenu.add(itmInlges);

        menuBar.add(idiomasMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEliminarClienteActionPerformed
        if(eliminarCliente == null || !eliminarCliente.isVisible()){
        eliminarCliente = new VentanaEliminarCliente(controladorCliente);
        eliminarCliente.setVisible(true);
        desktopPane.add(eliminarCliente);
        VentanaEliminarCliente.cambiarIdioma(localizacion);
           
        }
    }//GEN-LAST:event_itmEliminarClienteActionPerformed

    private void itmCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCrearClienteActionPerformed
        //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(crearCliente == null || !crearCliente.isVisible()){
            crearCliente = new VentanaCrearCliente(controladorCliente);
            crearCliente.setVisible(true);
            desktopPane.add(crearCliente);
            VentanaCrearCliente.cambiarIdioma(localizacion);
        }
        
    }//GEN-LAST:event_itmCrearClienteActionPerformed

    private void itmBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarClienteActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(buscarCliente == null || !buscarCliente.isVisible()){
        buscarCliente = new VentanaBuscarCliente(controladorCliente);
        buscarCliente.setVisible(true);
        desktopPane.add(buscarCliente);
        VentanaBuscarCliente.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmBuscarClienteActionPerformed

    private void itmActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmActualizarClienteActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(actualizarCliente == null || !actualizarCliente.isVisible()){
        actualizarCliente = new VentanaActualizarCliente(controladorCliente);
        actualizarCliente.setVisible(true);
        desktopPane.add(actualizarCliente);
        VentanaActualizarCliente.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmActualizarClienteActionPerformed

    private void itmCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCrearProductoActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(crearProducto == null || !crearProducto.isVisible()){
        crearProducto = new VentanaCrearProducto(controladorProducto);
        crearProducto.setVisible(true);
        desktopPane.add(crearProducto);
        VentanaCrearProducto.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmCrearProductoActionPerformed

    private void itmListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarClienteActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(listarClientes == null || !listarClientes.isVisible()){
        VentanaListarClientes listarCliente = new VentanaListarClientes(controladorCliente);
        listarCliente.setVisible(true);
        desktopPane.add(listarCliente);
        VentanaListarClientes.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmListarClienteActionPerformed

    private void itmBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarProductoActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(buscarProducto == null || !buscarProducto.isVisible()){
        buscarProducto = new VentanaBuscarProducto(controladorProducto);
        buscarProducto.setVisible(true);
        desktopPane.add(buscarProducto);
        VentanaBuscarProducto.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmBuscarProductoActionPerformed

    private void itmActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmActualizarProductoActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(actualizarProducto == null || !actualizarProducto.isVisible()){
        actualizarProducto = new VentanaActualizarProducto(controladorProducto);
        actualizarProducto.setVisible(true);
        desktopPane.add(actualizarProducto);
        VentanaActualizarProducto.cambiarIdioma(localizacion);
        }
        
    }//GEN-LAST:event_itmActualizarProductoActionPerformed

    private void itmEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEliminarProductoActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(eliminarProducto == null || !eliminarProducto.isVisible()){
        eliminarProducto = new VentanaEliminarProducto(controladorProducto);
        eliminarProducto.setVisible(true);
        desktopPane.add(eliminarProducto);
        VentanaEliminarProducto.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmEliminarProductoActionPerformed

    private void itmListarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarProductoActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(listarProductos == null || !listarProductos.isVisible()){
        listarProductos = new VentanaListarProductos(controladorProducto);
        listarProductos.setVisible(true);
        desktopPane.add(listarProductos);
        VentanaListarProductos.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmListarProductoActionPerformed

    private void itmInlgesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmInlgesActionPerformed
        // Cambia el idioma en ingles del programa
        localizacion=new Locale ("en","US");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itmInlgesActionPerformed

    private void itmEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEspañolActionPerformed
        // Cambia el idioma en español del programa
        localizacion=new Locale ("es","EC");
        Locale.setDefault(localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_itmEspañolActionPerformed

    private void itmCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCrearFacturaActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(agregarFactura == null || !agregarFactura.isVisible()){
        agregarFactura=new VentanaAgregarFactura(controladorFacturaCabecera,controladorCliente,controladorProducto,controladorFacturaDetalle);
        agregarFactura.setVisible(true);
        desktopPane.add(agregarFactura);
        VentanaAgregarFactura.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmCrearFacturaActionPerformed

    private void itmBuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarFacturaActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(buscarFactura == null || !buscarFactura.isVisible()){
        buscarFactura=new VentanaBuscarFactura(controladorFacturaCabecera,controladorCliente,controladorFacturaDetalle,controladorProducto);
        buscarFactura.setVisible(true);
        desktopPane.add(buscarFactura);
        VentanaBuscarFactura.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmBuscarFacturaActionPerformed

    private void itmEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEliminarFacturaActionPerformed
         //Verifica que solo este abierta una ventana, si no lo esta esta se abre
        if(eliminarFactura == null || !eliminarFactura.isVisible()){
        eliminarFactura=new VentanaEliminarFactura(controladorFacturaCabecera);
        eliminarFactura.setVisible(true);
        desktopPane.add(eliminarFactura);
        VentanaEliminarFactura.cambiarIdioma(localizacion);
        }
    }//GEN-LAST:event_itmEliminarFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu clienteMenu;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu facturaMenu;
    private javax.swing.JMenu idiomasMenu;
    private javax.swing.JMenuItem itmActualizarCliente;
    private javax.swing.JMenuItem itmActualizarProducto;
    private javax.swing.JMenuItem itmBuscarCliente;
    private javax.swing.JMenuItem itmBuscarFactura;
    private javax.swing.JMenuItem itmBuscarProducto;
    private javax.swing.JMenuItem itmCrearCliente;
    private javax.swing.JMenuItem itmCrearFactura;
    private javax.swing.JMenuItem itmCrearProducto;
    private javax.swing.JMenuItem itmEliminarCliente;
    private javax.swing.JMenuItem itmEliminarFactura;
    private javax.swing.JMenuItem itmEliminarProducto;
    private javax.swing.JMenuItem itmEspañol;
    private javax.swing.JMenuItem itmInlges;
    private javax.swing.JMenuItem itmListarCliente;
    private javax.swing.JMenuItem itmListarProducto;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu productoMenu;
    // End of variables declaration//GEN-END:variables

}
