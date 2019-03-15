package atm1;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class History extends javax.swing.JFrame {

    public History() {
        initComponents();
        historyscreen.setText(Double.toString(account.getBalance()));
        numhistory.setText("Current");
        History.setCounter(History.getCapacityOfhistoey() - 1);
        History.setNum(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historyWindow = new javax.swing.JPanel();
        historyscreen = new javax.swing.JTextField();
        prehistorybtn = new javax.swing.JButton();
        nexthistorybtn = new javax.swing.JButton();
        numhistory = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 100));
        setMaximizedBounds(new java.awt.Rectangle(300, 300, 300, 300));

        historyWindow.setBackground(new java.awt.Color(153, 153, 0));

        historyscreen.setEditable(false);
        historyscreen.setBackground(new java.awt.Color(102, 102, 0));
        historyscreen.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        historyscreen.setForeground(new java.awt.Color(255, 255, 255));

        prehistorybtn.setBackground(new java.awt.Color(102, 102, 0));
        prehistorybtn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        prehistorybtn.setText("PRE");
        prehistorybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prehistorybtnActionPerformed(evt);
            }
        });

        nexthistorybtn.setBackground(new java.awt.Color(102, 102, 0));
        nexthistorybtn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        nexthistorybtn.setText("NEXT");
        nexthistorybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexthistorybtnActionPerformed(evt);
            }
        });

        numhistory.setEditable(false);
        numhistory.setBackground(new java.awt.Color(102, 102, 0));
        numhistory.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        numhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numhistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historyWindowLayout = new javax.swing.GroupLayout(historyWindow);
        historyWindow.setLayout(historyWindowLayout);
        historyWindowLayout.setHorizontalGroup(
            historyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyWindowLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(historyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(historyscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(historyWindowLayout.createSequentialGroup()
                        .addComponent(prehistorybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numhistory, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nexthistorybtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        historyWindowLayout.setVerticalGroup(
            historyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyWindowLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(historyscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(historyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nexthistorybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prehistorybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numhistory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(historyWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(historyWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String[][] history = new String[5][2];
    private static int counter, num = 0, capacityOfhistoey = 5;

    public static int getCapacityOfhistoey() {
        return capacityOfhistoey;
    }

    public static void setCapacityOfhistoey(int capacityOfhistoey) {
        History.capacityOfhistoey = capacityOfhistoey;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        History.num = num;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        History.counter = counter;
    }

    public static String[][] getHistory() {
        return history;
    }

    public static void setHistory(String[][] history) {
        History.history = history;
    }

    public static void initialHistory() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                History.history[i][j] = "0";
            }
        }
    }

    private void showNum(String step) {
        int step1 = 0;
        if (History.getCounter() > (History.getCapacityOfhistoey() - 1)) {
            numhistory.setText("Current");
        } else {
            if (step.equals("next")) {
                step1 = -1;
            } else if (step.equals("pre")) {
                step1 = 1;
            }

            History.setNum(History.getNum() + step1);

            numhistory.setText("      " + String.valueOf(History.getNum()) + " ");

        }
    }

    private void showHistory() {
        if ((History.getCounter() >= 0) && (History.getCounter() <= (History.getCapacityOfhistoey() - 1))) {
            historyscreen.setText(history[History.getCounter()][0] + "  " + history[History.getCounter()][1]);
        } else if (History.getCounter() < 0) {
            closing();
            new orders().setVisible(true);
        } else if (History.getCounter() > (History.getCapacityOfhistoey() - 1)) {
            historyscreen.setText(Double.toString(account.getBalance()));
        }
    }

    static void history(String type, String screen) {
        int i = withdrawal_deposit.getI();
        for (int j = 0; j < ((History.getCapacityOfhistoey() - 1) - withdrawal_deposit.getI()); j++) {

            History.history[i][0] = history[i + 1][0];
            History.history[i][1] = history[i + 1][1];
            i++;
        }

        History.history[(History.getCapacityOfhistoey() - 1)][0] = type;
        History.history[(History.getCapacityOfhistoey() - 1)][1] = screen;
        while (withdrawal_deposit.getI() != 0) {
            withdrawal_deposit.setI(withdrawal_deposit.getI() - 1);
        }

    }

    private void closing() {

        WindowEvent closing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closing);

    }


    private void numhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numhistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numhistoryActionPerformed

    private void nexthistorybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexthistorybtnActionPerformed
        History.setCounter(History.getCounter() + 1);
        showHistory();
        showNum("next");
    }//GEN-LAST:event_nexthistorybtnActionPerformed

    private void prehistorybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prehistorybtnActionPerformed
        showHistory();
        showNum("pre");
        History.setCounter(History.getCounter() - 1);
    }//GEN-LAST:event_prehistorybtnActionPerformed

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
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(History.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new History().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel historyWindow;
    private javax.swing.JTextField historyscreen;
    private javax.swing.JButton nexthistorybtn;
    private javax.swing.JTextField numhistory;
    private javax.swing.JButton prehistorybtn;
    // End of variables declaration//GEN-END:variables
}
