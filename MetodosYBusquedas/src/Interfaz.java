
public class Interfaz extends javax.swing.JFrame {
    MyB mb = new MyB();

    long InicioTemp, FinTemp;
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        mb.crearVector();
        txt_Vector.setText(mb.mostrarVector());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_BSecuencial = new javax.swing.JButton();
        btn_BBinaria = new javax.swing.JButton();
        txt_Dato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_OBurbuja = new javax.swing.JButton();
        btn_OSS = new javax.swing.JButton();
        btn_OQS = new javax.swing.JButton();
        btn_ORadix = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Vector = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Tiempo = new javax.swing.JTextArea();
        btn_Reorden = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodos de Busqueda"));

        btn_BSecuencial.setText("Secuencial");
        btn_BSecuencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BSecuencialActionPerformed(evt);
            }
        });

        btn_BBinaria.setText("Binaria");
        btn_BBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BBinariaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Dato a buscar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_BSecuencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_BBinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Dato, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_BSecuencial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_BBinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodos de Ordenamiento"));

        btn_OBurbuja.setText("Burbuja");
        btn_OBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OBurbujaActionPerformed(evt);
            }
        });

        btn_OSS.setText("ShellSort");
        btn_OSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OSSActionPerformed(evt);
            }
        });

        btn_OQS.setText("Quicksort");
        btn_OQS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OQSActionPerformed(evt);
            }
        });

        btn_ORadix.setText("Radix");
        btn_ORadix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ORadixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_OBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_OSS, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ORadix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_OQS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_OBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_OQS, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ORadix, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_OSS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_Vector.setColumns(20);
        txt_Vector.setRows(5);
        jScrollPane2.setViewportView(txt_Vector);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tiempos de Ejecución (ns)"));

        txt_Tiempo.setColumns(20);
        txt_Tiempo.setRows(5);
        txt_Tiempo.setFocusable(false);
        txt_Tiempo.setRequestFocusEnabled(false);
        txt_Tiempo.setSelectionColor(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(txt_Tiempo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_Reorden.setText("ReOrdenar");
        btn_Reorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReordenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(btn_Reorden, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Reorden, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OBurbujaActionPerformed
        InicioTemp=System.nanoTime();
        mb.ordenBurbuja();
        FinTemp=System.nanoTime();
        
        txt_Tiempo.setText(txt_Tiempo.getText() + "*******Ordenamiento Burbuja*******\n"+(FinTemp-InicioTemp)+" Nanosegundos\n");
        txt_Vector.setText(mb.mostrarVector());
    }//GEN-LAST:event_btn_OBurbujaActionPerformed

    private void btn_OQSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OQSActionPerformed
        InicioTemp=System.nanoTime();
        mb.quick();
        FinTemp=System.nanoTime();
        
        txt_Tiempo.setText(txt_Tiempo.getText() + "*******Ordenamiento QuickSort*******\n"+(FinTemp-InicioTemp)+" Nanosegundosn\n");
        txt_Vector.setText(mb.mostrarVector());
        
    }//GEN-LAST:event_btn_OQSActionPerformed

    private void btn_ReordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReordenActionPerformed
        InicioTemp=FinTemp=0;
        mb.ReOrden();
        txt_Vector.setText(mb.mostrarVector());
    }//GEN-LAST:event_btn_ReordenActionPerformed

    private void btn_OSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OSSActionPerformed
        InicioTemp=FinTemp=0;
        
        InicioTemp=System.nanoTime();
        mb.shellSort();
        FinTemp=System.nanoTime();
        
        txt_Tiempo.setText(txt_Tiempo.getText() + "*******Ordenamiento ShellSort*******\n"+(FinTemp-InicioTemp)+" Nanosegundos\n");
        txt_Vector.setText(mb.mostrarVector());
    }//GEN-LAST:event_btn_OSSActionPerformed

    private void btn_ORadixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ORadixActionPerformed
        InicioTemp=FinTemp=0;
        
        InicioTemp=System.nanoTime();
        mb.Radix();
        FinTemp=System.nanoTime();
        
        txt_Tiempo.setText(txt_Tiempo.getText() + "*******Ordenamiento Radix*******\n"+(FinTemp-InicioTemp)+" Nanosegundos\n");
        txt_Vector.setText(mb.mostrarVector());
    }//GEN-LAST:event_btn_ORadixActionPerformed

    private void btn_BSecuencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BSecuencialActionPerformed
        InicioTemp=FinTemp=0;
        long dato = Long.parseLong(txt_Dato.getText());
        String res;
        InicioTemp=System.nanoTime();
        res=(mb.busquedaSec(dato)+1)+"";
        FinTemp=System.nanoTime();
        txt_Tiempo.setText(txt_Tiempo.getText() + "*******Busqueda Secuencial*******\nValor encontrado en la posición: "+res+"\n"+(FinTemp-InicioTemp)+" Nanosegundos\n");
        
    }//GEN-LAST:event_btn_BSecuencialActionPerformed

    private void btn_BBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BBinariaActionPerformed
        InicioTemp=FinTemp=0;
        long dato = Long.parseLong(txt_Dato.getText());
        String res;
        
        InicioTemp=System.nanoTime();
        res=((mb.busquedaBinaria(dato)+1) + "");
        FinTemp=System.nanoTime();
        txt_Tiempo.setText(txt_Tiempo.getText() + "*******Busqueda Binaria*******\nValor encontrado en la posición: "+res+"\n"+(FinTemp-InicioTemp)+" Nanosegundos\n");
    }//GEN-LAST:event_btn_BBinariaActionPerformed
    
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BBinaria;
    private javax.swing.JButton btn_BSecuencial;
    private javax.swing.JButton btn_OBurbuja;
    private javax.swing.JButton btn_OQS;
    private javax.swing.JButton btn_ORadix;
    private javax.swing.JButton btn_OSS;
    private javax.swing.JButton btn_Reorden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_Dato;
    private javax.swing.JTextArea txt_Tiempo;
    private javax.swing.JTextArea txt_Vector;
    // End of variables declaration//GEN-END:variables
}
