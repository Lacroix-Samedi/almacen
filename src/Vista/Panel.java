
package Vista;

import javax.swing.JOptionPane;


public class Panel extends javax.swing.JFrame {
    
    public Panel() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Panel");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAlmacen = new javax.swing.JMenu();
        mnuCliente = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenuItem();
        mnuProducto = new javax.swing.JMenu();
        mnuLista = new javax.swing.JMenuItem();
        mnuPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
        );

        mnuAlmacen.setText("Almacen");

        mnuCliente.setText("Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        mnuAlmacen.add(mnuCliente);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        mnuAlmacen.add(jmSalir);

        jMenuBar1.add(mnuAlmacen);

        mnuProducto.setText("Productos");
        mnuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProductoActionPerformed(evt);
            }
        });

        mnuLista.setText("Lista Productos");
        mnuLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListaActionPerformed(evt);
            }
        });
        mnuProducto.add(mnuLista);

        mnuPrecio.setText("Precio");
        mnuPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrecioActionPerformed(evt);
            }
        });
        mnuProducto.add(mnuPrecio);

        jMenuBar1.add(mnuProducto);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
         int n = JOptionPane.showConfirmDialog(
            null,
            "¿Desea cerrar la aplicacion?",
            "Salir",
            JOptionPane.YES_NO_OPTION);
        
        if(n == JOptionPane.NO_OPTION){
            
        }
        else{
            JOptionPane.showMessageDialog(null, "ADIOS");
            System.exit(0);
        
         }
         
    }//GEN-LAST:event_jmSalirActionPerformed

    private void mnuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProductoActionPerformed
          
    }//GEN-LAST:event_mnuProductoActionPerformed

    private void mnuPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrecioActionPerformed
     
    Precio p = new Precio();
    p.setVisible(true);
    
                
    }//GEN-LAST:event_mnuPrecioActionPerformed

    private void mnuListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListaActionPerformed
   
    Productos pr = new Productos();
    pr.setVisible(true);
    
    
    }//GEN-LAST:event_mnuListaActionPerformed

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed
    
    Usuarios u = new Usuarios();
    u.setVisible(true);
    
    
    }//GEN-LAST:event_mnuClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JMenu mnuAlmacen;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuLista;
    private javax.swing.JMenuItem mnuPrecio;
    private javax.swing.JMenu mnuProducto;
    // End of variables declaration//GEN-END:variables
}
