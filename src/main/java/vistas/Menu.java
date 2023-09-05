package vistas;

import clases.Categoria;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import clases.Producto;

public class Menu extends javax.swing.JFrame {

    public static TreeSet<Producto> listaProductos = new TreeSet<>();

    public Menu() {
        initComponents();
        cargarProductos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemProd = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuRubro = new javax.swing.JMenuItem();
        jMenuNombre = new javax.swing.JMenuItem();
        jMenuPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Gestión Stock");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setBackground(new java.awt.Color(153, 147, 13));
        escritorio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("by Julian Rios - 2023");

        btnSalir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\DeTodoSA\\src\\main\\java\\julian\\development\\detodosa\\sources\\cerrar-sesion.png")); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\DeTodoSA\\src\\main\\java\\julian\\development\\detodosa\\sources\\supermercado99.png")); // NOI18N

        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(41, 41, 41))
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnSalir)
                .addGap(8, 8, 8)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 580));

        jMenu3.setText("Administración");

        jMenuItemProd.setText("Productos");
        jMenuItemProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemProd);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Consultas");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuRubro.setText("Por Categoria");
        jMenuRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRubroActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuRubro);

        jMenuNombre.setText("Por Nombre");
        jMenuNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNombreActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuNombre);

        jMenuPrecio.setText("Por Precio");
        jMenuPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPrecioActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuPrecio);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        getAccessibleContext().setAccessibleName("Sistema Gestión Stock ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed


    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        BusquedaPorNombre busNom = new BusquedaPorNombre();
        busNom.setVisible(true);
        escritorio.add(busNom);
        escritorio.moveToFront(busNom);
    }//GEN-LAST:event_jMenuNombreActionPerformed

    private void jMenuRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRubroActionPerformed
        escritorio.removeAll();
        escritorio.repaint();

        BusquedaPorCategoria busRub = new BusquedaPorCategoria();
        busRub.setVisible(true);
        escritorio.add(busRub);
        escritorio.moveToFront(busRub);
    }//GEN-LAST:event_jMenuRubroActionPerformed

    private void jMenuPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPrecioActionPerformed

        escritorio.removeAll();
        escritorio.repaint();

        BusquedaPorPrecio busPre = new BusquedaPorPrecio();
        busPre.setVisible(true);
        escritorio.add(busPre);
        escritorio.moveToFront(busPre);

    }//GEN-LAST:event_jMenuPrecioActionPerformed

    private void jMenuItemProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdActionPerformed

        escritorio.removeAll();
        escritorio.repaint();

        GestionProductos gestion = new GestionProductos();
        gestion.setVisible(true);
        escritorio.add(gestion);
        escritorio.moveToFront(gestion);
    }//GEN-LAST:event_jMenuItemProdActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        int option = JOptionPane.showConfirmDialog(Menu.this, "¿Desea salir del sistema?", "A T E N C I O N ! !", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    private void cargarProductos() {

        listaProductos.add(new Producto(100, "Aceite Patito x 900 ml", 980.75, 15, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(101, "Te La Morenita x 25 unidades", 470.88, 9, Categoria.COMESTIBLE));
        listaProductos.add(new Producto(102, "Pan de Mesa Bimbo x 500 gr", 600.54, 7, Categoria.COMESTIBLE));

        listaProductos.add(new Producto(200, "Jabon Polvo Ala Matic x 800 gr", 880.75, 8, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(201, "Desodorante Ambiente Poett", 670.88, 2, Categoria.LIMPIEZA));
        listaProductos.add(new Producto(202, "Trapo Piso Paño Grueso", 380.54, 9, Categoria.LIMPIEZA));

        listaProductos.add(new Producto(300, "Perfume Coquetas x 175 ml", 1020.75, 5, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(301, "Jabon Tocador Rexona Pack x 3", 935.88, 14, Categoria.PERFUMERIA));
        listaProductos.add(new Producto(302, "Shampoo Sedal Ceramidas x 375 ml", 715.54, 26, Categoria.PERFUMERIA));

        listaProductos.add(new Producto(400, "Coca Cola x 1.5 Lt", 752.35, 11, Categoria.BEBIDAS));
        listaProductos.add(new Producto(401, "Sprite x 375 Ml", 210.55, 16, Categoria.BEBIDAS));
        listaProductos.add(new Producto(402, "Quilmes Lata x 473 Ml", 810.30, 36, Categoria.BEBIDAS));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemProd;
    private javax.swing.JMenuItem jMenuNombre;
    private javax.swing.JMenuItem jMenuPrecio;
    private javax.swing.JMenuItem jMenuRubro;
    // End of variables declaration//GEN-END:variables
}
