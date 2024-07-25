
public class calculator extends javax.swing.JFrame {


    public calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    int sum=0;
    int x,y;
    boolean flag=false;
    String display=" ";
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        textfeld = new javax.swing.JTextField();
        btm1 = new javax.swing.JButton();
        btm2 = new javax.swing.JButton();
        btm3 = new javax.swing.JButton();
        btm4 = new javax.swing.JButton();
        btm5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btm6 = new javax.swing.JButton();
        btm7 = new javax.swing.JButton();
        btm9 = new javax.swing.JButton();
        btm8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        btm0 = new javax.swing.JButton();
        NAYEEM = new javax.swing.JToggleButton();

        jButton2.setText("jButton2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btm1.setText("1");
        btm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm1ActionPerformed(evt);
            }
        });

        btm2.setText("2");
        btm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm2ActionPerformed(evt);
            }
        });

        btm3.setText("3");
        btm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm3ActionPerformed(evt);
            }
        });

        btm4.setText("4");
        btm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm4ActionPerformed(evt);
            }
        });

        btm5.setText("5");
        btm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm5ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton7");

        btm6.setText("6");
        btm6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm6ActionPerformed(evt);
            }
        });

        btm7.setText("7");
        btm7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm7ActionPerformed(evt);
            }
        });

        btm9.setText("9");
        btm9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm9ActionPerformed(evt);
            }
        });

        btm8.setText("8");
        btm8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm8ActionPerformed(evt);
            }
        });

        jButton13.setText("+");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("00");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText(".");

        jButton16.setText("=");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        btm0.setText("0");
        btm0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm0ActionPerformed(evt);
            }
        });

        NAYEEM.setText("NAYEEM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btm0)
                                    .addComponent(btm7))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btm2)
                                        .addComponent(btm8)
                                        .addComponent(btm5))))
                            .addComponent(btm1)
                            .addComponent(btm4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btm6)
                                            .addComponent(btm3))
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton7))
                                    .addComponent(jButton15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton13)
                                    .addComponent(jButton16)))
                            .addComponent(btm9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(NAYEEM)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btm1)
                            .addComponent(btm2)
                            .addComponent(btm3)
                            .addComponent(jButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btm4)
                            .addComponent(btm5)
                            .addComponent(btm6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btm7)
                            .addComponent(btm8)
                            .addComponent(btm9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16)
                    .addComponent(jButton14)
                    .addComponent(btm0)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(NAYEEM)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm1ActionPerformed
    if(flag!=true){
    x=1;
    flag=true;
    } 
    else{
    y=1;
    }
    display=display+"1";
    textfeld.setText(display);// TODO add your handling code here:
    }//GEN-LAST:event_btm1ActionPerformed

    private void btm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm2ActionPerformed
   if(flag!=true)   {
       x=2;
   flag=true;
   }  
   else{
       
       y=2;
   }
   display=display+"2";
textfeld.setText(display);// TODO add your handling code here:
    }//GEN-LAST:event_btm2ActionPerformed

    private void btm0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm0ActionPerformed
    if(flag!=true){
        x=0;
    flag=true;
    }
    else{
        y=0;
    }
    display=display+"0";
    textfeld.setText(display);   
         // TODO add your handling code here:
    }//GEN-LAST:event_btm0ActionPerformed

    private void btm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm3ActionPerformed
    if(flag!=true){
        x=3;
    flag=true;
    }
    else{
        y=3;
    }
    display=display+"3";
    textfeld.setText(display);// TODO add your handling code here:
    }//GEN-LAST:event_btm3ActionPerformed

    private void btm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm4ActionPerformed
    if(flag!=true){
        x=4;
    flag=true;
    }
    else{
        y=4;
    }
    display=display+"4";
    textfeld.setText(display);       // TODO add your handling code here:
    }//GEN-LAST:event_btm4ActionPerformed

    private void btm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm5ActionPerformed
    if(flag!=true){
        x=5;
    flag=true;
    }
    else{
        y=5;
    }
    display=display+"5";
    textfeld.setText(display);        // TODO add your handling code here:
    }//GEN-LAST:event_btm5ActionPerformed

    private void btm6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm6ActionPerformed
    if(flag!=true){
        x=6;
    flag=true;
    }
    else{
        y=6;
    }
    display=display+"6";
    textfeld.setText(display);        // TODO add your handling code here:
    }//GEN-LAST:event_btm6ActionPerformed

    private void btm7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm7ActionPerformed
    if(flag!=true){
        x=7;
    flag=true;
    }
    else{
        y=7;
    }
    display=display+"7";
    textfeld.setText(display);        // TODO add your handling code here:
    }//GEN-LAST:event_btm7ActionPerformed

    private void btm8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm8ActionPerformed
    if(flag!=true){
        x=8;
    flag=true;
    }
    else{
        y=8;
    }
    display=display+"8";
    textfeld.setText(display);        // TODO add your handling code here:
    }//GEN-LAST:event_btm8ActionPerformed

    private void btm9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm9ActionPerformed
    if(flag!=true){
        x=9;
    flag=true;
    }
    else{
        y=9;
    }
    display=display+"9";
    textfeld.setText(display);        // TODO add your handling code here:
    }//GEN-LAST:event_btm9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
    if(flag!=true){
        x=00;
    flag=true;
    }
    else{
        y=00;
    }
    display=display+"00";
    textfeld.setText(display);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    display=display+"+";
    textfeld.setText(display);// TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    sum=x+y;
    String s=String.valueOf(sum);
    textfeld.setText(s);// TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton NAYEEM;
    private javax.swing.JButton btm0;
    private javax.swing.JButton btm1;
    private javax.swing.JButton btm2;
    private javax.swing.JButton btm3;
    private javax.swing.JButton btm4;
    private javax.swing.JButton btm5;
    private javax.swing.JButton btm6;
    private javax.swing.JButton btm7;
    private javax.swing.JButton btm8;
    private javax.swing.JButton btm9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JTextField textfeld;
    // End of variables declaration//GEN-END:variables
}
