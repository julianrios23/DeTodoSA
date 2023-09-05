package vistas;
import clases.*;

import javax.swing.JOptionPane;


public class GestionProductos extends javax.swing.JInternalFrame {

    public GestionProductos() {
        initComponents();
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnLimpiar.setEnabled(false);

    }

    private void limpiar() {
        jTextDesc.setText("");
        jTextPre.setText("");
        comboCat.setSelectedIndex(-1);
        jTextStock.setText("");
        jTextCod.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGestion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCod = new javax.swing.JTextField();
        jButtonBusca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextDesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextPre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextStock = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        jButtonSalir = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        comboCat = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Gestión");
        setPreferredSize(new java.awt.Dimension(513, 488));

        jPanelGestion.setBackground(new java.awt.Color(255, 229, 172));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Código");

        jTextCod.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextCod.setToolTipText("Ingrese Codigo a Buscar");

        jButtonBusca.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\DeTodoSA\\src\\main\\java\\julian\\development\\detodosa\\sources\\lupa.png")); // NOI18N
        jButtonBusca.setToolTipText("Buscar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Descripción");

        jTextDesc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextDesc.setToolTipText("Descripción");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Precio");

        jTextPre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextPre.setToolTipText("Precio");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Rubro");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Stock");

        jTextStock.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextStock.setToolTipText("Stock");

        btnLimpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\DeTodoSA\\src\\main\\java\\julian\\development\\detodosa\\sources\\limpio.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\DeTodoSA\\src\\main\\java\\julian\\development\\detodosa\\sources\\disquete.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\DeTodoSA\\src\\main\\java\\julian\\development\\detodosa\\sources\\eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\DeTodoSA\\src\\main\\java\\julian\\development\\detodosa\\sources\\cerrar-sesion.png")); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setToolTipText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        comboCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMESTIBLE", "LIMPIEZA", "PERFUMERIA", "BEBIDAS" }));
        comboCat.setSelectedIndex(-1);
        comboCat.setToolTipText("Categorias");

        javax.swing.GroupLayout jPanelGestionLayout = new javax.swing.GroupLayout(jPanelGestion);
        jPanelGestion.setLayout(jPanelGestionLayout);
        jPanelGestionLayout.setHorizontalGroup(
            jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestionLayout.createSequentialGroup()
                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGestionLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1)
                        .addGap(0, 149, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGestionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(43, 43, 43)
                        .addComponent(jButtonSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelGestionLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelGestionLayout.createSequentialGroup()
                                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelGestionLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextDesc)
                                            .addGroup(jPanelGestionLayout.createSequentialGroup()
                                                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelGestionLayout.createSequentialGroup()
                                                        .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButtonBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextPre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanelGestionLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(comboCat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator1))))
                .addGap(17, 17, 17))
        );
        jPanelGestionLayout.setVerticalGroup(
            jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBusca)
                    .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelGestionLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanelGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        setVisible(false);
        new Menu().setVisible(true);

    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed

        String codigo = jTextCod.getText();
        boolean bol = false;
        try {
            if (!codigo.isEmpty()) {

                for (Producto prod : Menu.listaProductos) {

                    if (prod.getCodigo() == Integer.parseInt(codigo)) {
                        bol = true;

                        jTextDesc.setText(prod.getDescripcion());
                        jTextPre.setText(prod.getPrecio() + "");
                        jTextStock.setText(prod.getStock() + "");
                        btnEliminar.setEnabled(true);
                       
                        btnLimpiar.setEnabled(true);
                        comboCat.setSelectedItem(prod.getCategoria().toString());
                        break;
                    }
                }
                if (!bol) {
                    JOptionPane.showMessageDialog(GestionProductos.this, "Producto No Encontrado", "A T E N C I O N ! !", WIDTH);
                    limpiar();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(GestionProductos.this, "Se ingresó un valor incorrecto", "A T E N C I O N ! !", WIDTH);
        }
    }//GEN-LAST:event_jButtonBuscaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int codigoAEliminar = Integer.parseInt(jTextCod.getText());

        for (Producto prod : Menu.listaProductos) {
            if (prod.getCodigo() == (codigoAEliminar)) {
                Menu.listaProductos.remove(prod);
                JOptionPane.showMessageDialog(GestionProductos.this, "Producto eliminado !!!", "A T E N C I O N !!!", WIDTH);
                limpiar();
                break;
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if (jTextCod.getText().isEmpty() || jTextDesc.getText().isEmpty() || jTextPre.getText().isEmpty() || jTextStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(GestionProductos.this, "Campos Incompletos!", "A T E N C I O N !!!", WIDTH);
        } else if (comboCat.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(GestionProductos.this, "Seleccione Categoria", "A T E N C I O N !!!", WIDTH);
        } else {
            
            try {
                int codigo = Integer.parseInt(jTextCod.getText());
                String descripcion = jTextDesc.getText();
                double precio = Double.parseDouble(jTextPre.getText());
                String rubro = (String) comboCat.getSelectedItem();
                int stock = Integer.parseInt(jTextStock.getText());
                
                Producto prod = new Producto(codigo, descripcion, precio, stock, Categoria.valueOf(rubro));
                if (Menu.listaProductos.contains(prod)) {
                    JOptionPane.showMessageDialog(GestionProductos.this, "El producto ya existe !!", "A T E N C I O N !!!", WIDTH);
                } else {
                    
                    Menu.listaProductos.add(prod);
                    JOptionPane.showMessageDialog(GestionProductos.this, "Producto agregado con éxito!!", "A T E N C I O N !!!", WIDTH);
                    limpiar();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(GestionProductos.this, "Se ingreso un dato incorrecto", "A T E N C I O N !!!", WIDTH);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JComboBox<String> comboCat;
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JToggleButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelGestion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextCod;
    private javax.swing.JTextField jTextDesc;
    private javax.swing.JTextField jTextPre;
    private javax.swing.JTextField jTextStock;
    // End of variables declaration//GEN-END:variables

}
