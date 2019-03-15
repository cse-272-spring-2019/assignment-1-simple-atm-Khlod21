package atm1;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author HEI
 */
public class types extends javax.swing.JFrame {

    public types() {
        initComponents();
    }

    private static String accounttype;

    public static String getAccounttype() {
        return accounttype;
    }

    public static void setAccounttype(String type) {
        types.accounttype = type;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeWindow = new javax.swing.JPanel();
        currentTypebtn = new javax.swing.JButton();
        creditTypebtn = new javax.swing.JButton();
        savingTypebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 300, 300, 300));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocation(new java.awt.Point(300, 100));
        setMaximizedBounds(new java.awt.Rectangle(300, 300, 300, 300));
        setMaximumSize(new java.awt.Dimension(300, 300));
        setSize(new java.awt.Dimension(300, 300));

        typeWindow.setBackground(new java.awt.Color(153, 153, 0));

        currentTypebtn.setBackground(new java.awt.Color(102, 102, 0));
        currentTypebtn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        currentTypebtn.setForeground(new java.awt.Color(255, 255, 255));
        currentTypebtn.setText("Current Account ");
        currentTypebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentTypebtnActionPerformed(evt);
            }
        });

        creditTypebtn.setBackground(new java.awt.Color(102, 102, 0));
        creditTypebtn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        creditTypebtn.setForeground(new java.awt.Color(255, 255, 255));
        creditTypebtn.setText("Credit Account ");
        creditTypebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditTypebtnActionPerformed(evt);
            }
        });

        savingTypebtn.setBackground(new java.awt.Color(102, 102, 0));
        savingTypebtn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        savingTypebtn.setForeground(new java.awt.Color(255, 255, 255));
        savingTypebtn.setText("Saving Account ");
        savingTypebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingTypebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout typeWindowLayout = new javax.swing.GroupLayout(typeWindow);
        typeWindow.setLayout(typeWindowLayout);
        typeWindowLayout.setHorizontalGroup(
            typeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typeWindowLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(typeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentTypebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditTypebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savingTypebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        typeWindowLayout.setVerticalGroup(
            typeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, typeWindowLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(currentTypebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(creditTypebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(savingTypebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(typeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(typeWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currentTypebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentTypebtnActionPerformed
        accounttype = "Current";
        closing();
        new orders().setVisible(true);


    }//GEN-LAST:event_currentTypebtnActionPerformed

    private void creditTypebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditTypebtnActionPerformed
        accounttype = "Credit";
        closing();
        new orders().setVisible(true);

    }//GEN-LAST:event_creditTypebtnActionPerformed

    private void savingTypebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingTypebtnActionPerformed
        accounttype = "Saving";
        closing();
        new orders().setVisible(true);

    }//GEN-LAST:event_savingTypebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    private void closing() {

        WindowEvent closing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closing);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new types().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creditTypebtn;
    private javax.swing.JButton currentTypebtn;
    private javax.swing.JButton savingTypebtn;
    private javax.swing.JPanel typeWindow;
    // End of variables declaration//GEN-END:variables
}
