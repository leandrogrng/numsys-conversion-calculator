import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
public class NumberSystemConverter extends javax.swing.JFrame {

    /**
     * Creates new form NumberSystemConverter
     */
    public NumberSystemConverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fromCmbBox = new javax.swing.JComboBox<>();
        toCmbBox = new javax.swing.JComboBox<>();
        intNumField = new javax.swing.JTextField();
        convertBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        convertedLbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number System Converter");
        setSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fromCmbBox.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        fromCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decimal", "Binary", "Octal", "Hexadecimal" }));
        fromCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromCmbBoxActionPerformed(evt);
            }
        });
        getContentPane().add(fromCmbBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 194, -1, 39));

        toCmbBox.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        toCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary", "Octal", "Hexadecimal", "Decimal" }));
        toCmbBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCmbBoxActionPerformed(evt);
            }
        });
        getContentPane().add(toCmbBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 194, -1, 39));

        intNumField.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        getContentPane().add(intNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 263, 189, 39));

        convertBtn.setBackground(new java.awt.Color(243, 82, 14));
        convertBtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        convertBtn.setForeground(new java.awt.Color(255, 255, 255));
        convertBtn.setText("CONVERT");
        convertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBtnActionPerformed(evt);
            }
        });
        getContentPane().add(convertBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 153, 46));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel1.setText("From");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 174, -1, -1));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel2.setText("To");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 174, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NUMBER SYSTEM CONVERSION.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 698, 156));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel4.setText("Enter a number");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 245, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("All Rights Reserved 2023");

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("GARING | 3201");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 470, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 483, 698, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(239, 46));

        convertedLbl.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(convertedLbl)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(convertedLbl)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 392, -1, -1));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 12)); // NOI18N
        jLabel5.setText("Converted Value");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 372, -1, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 425, 223, -1));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 341, 266, -1));
        getContentPane().add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 366, -1, -1));
        getContentPane().add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 456, -1, 42));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    private void convertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertBtnActionPerformed
   
        try {
            int frmTxtField; // value from the text field
            int cmbBoxIndex1 = fromCmbBox.getSelectedIndex();
            int cmbBoxIndex2 = toCmbBox.getSelectedIndex();
            int toDecimal;       
            String converted; 
            
            switch(cmbBoxIndex1) {
            // Converting Decimal to:
                case 0:
                    frmTxtField = Integer.parseInt(intNumField.getText());
                    // Binary
                    if(cmbBoxIndex2 == 0) {
                       converted = Integer.toBinaryString(frmTxtField);
                       convertedLbl.setText(converted); 
                    } else if (cmbBoxIndex2 == 1) {
                        converted = Integer.toOctalString(frmTxtField);
                        convertedLbl.setText(converted);
                    } else if (cmbBoxIndex2 == 2) {
                        converted = Integer.toHexString(frmTxtField);
                        convertedLbl.setText(converted);
                    } else {
                        convertedLbl.setText(String.valueOf(frmTxtField));
                    }
                // Converting Binary to:
                    break;
                case 1:
                    // Binary
                    frmTxtField = Integer.parseInt(intNumField.getText(), 2);
                    
                    if(cmbBoxIndex2 == 0) {                        
                        convertedLbl.setText(intNumField.getText());   
                    } else if (cmbBoxIndex2 == 1) { // Octal
                        converted = Integer.toOctalString(frmTxtField);
                        convertedLbl.setText(converted);
                    } else if (cmbBoxIndex2 == 2) { // Hexadecimal
                        converted = Integer.toHexString(frmTxtField);   
                        convertedLbl.setText(converted); 
                    } else { // Decimal
                        convertedLbl.setText(String.valueOf(frmTxtField));          
                    }
                    break;
                // Converting Octal to:
                case 2:
                    // Binary
                    frmTxtField = Integer.parseInt(intNumField.getText(), 8);
                    if (cmbBoxIndex2 == 0) {
                        converted = String.valueOf(Integer.toBinaryString(frmTxtField));
                        convertedLbl.setText(converted);
                    // Octal
                    } else if (cmbBoxIndex2 == 1) {
                       convertedLbl.setText(intNumField.getText());
                    // Hexadecimal
                    } else if (cmbBoxIndex2 == 2) {
                        converted = String.valueOf(Integer.toHexString(frmTxtField));
                        convertedLbl.setText(converted);
                    // Decimal
                    } else {
                        toDecimal = Integer.parseInt(String.valueOf(frmTxtField));
                        convertedLbl.setText(String.valueOf(toDecimal));                   
                    }
                    break;
                // Converting Hexadecimal to:
                case 3:
                    frmTxtField = Integer.parseInt(intNumField.getText(),16);
                    
                    // Binary
                    if(cmbBoxIndex2 == 0) {
                        converted = String.valueOf(Integer.toBinaryString(frmTxtField));
                        convertedLbl.setText(converted);                        
                    // Octal
                    } else if (cmbBoxIndex2 == 1) {
                        converted = String.valueOf(Integer.toOctalString(frmTxtField));
                        convertedLbl.setText(converted);
                    // Hexadecimal
                    } else if (cmbBoxIndex2 == 2) {
                        convertedLbl.setText(intNumField.getText());
                    // Decimal
                    } else {
                        convertedLbl.setText(String.valueOf(frmTxtField));
                    }
                    break;                               
            }           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input.");
            intNumField.setText("");
            convertedLbl.setText("");
        }    
    }//GEN-LAST:event_convertBtnActionPerformed

    private void fromCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromCmbBoxActionPerformed
        intNumField.setText("");       
        convertedLbl.setText("");
    }//GEN-LAST:event_fromCmbBoxActionPerformed

    private void toCmbBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCmbBoxActionPerformed
        intNumField.setText("");
        convertedLbl.setText("");
    }//GEN-LAST:event_toCmbBoxActionPerformed

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
            FlatLightLaf.setup();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberSystemConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertBtn;
    private javax.swing.JLabel convertedLbl;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JComboBox<String> fromCmbBox;
    private javax.swing.JTextField intNumField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> toCmbBox;
    // End of variables declaration//GEN-END:variables
}
