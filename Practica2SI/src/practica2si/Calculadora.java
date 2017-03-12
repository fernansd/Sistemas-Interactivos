/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica2si;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author i42sadef
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        resultados.requestFocus();
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
        etiquetaResultados = new javax.swing.JLabel();
        resultados = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        Numeros = new javax.swing.JPanel();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        etiquetaResultados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaResultados.setText("Resultados");

        resultados.setEditable(false);
        resultados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resultados.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultados.setToolTipText("Área de resultados");
        resultados.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etiquetaResultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaResultados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Numeros.setLayout(new java.awt.GridLayout(4, 4, 10, 10));

        num1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num1.setText("1");
        num1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                num1MousePressed(evt);
            }
        });
        Numeros.add(num1);

        num2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num2.setText("2");
        num2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num2MouseClicked(evt);
            }
        });
        Numeros.add(num2);

        num3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num3.setText("3");
        num3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num3MouseClicked(evt);
            }
        });
        Numeros.add(num3);

        btnDivision.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnDivision.setText("/");
        Numeros.add(btnDivision);

        num4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num4.setText("4");
        num4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num4MouseClicked(evt);
            }
        });
        Numeros.add(num4);

        num5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num5.setText("5");
        num5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num5MouseClicked(evt);
            }
        });
        Numeros.add(num5);

        num6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num6.setText("6");
        num6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num6MouseClicked(evt);
            }
        });
        Numeros.add(num6);

        btnProducto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnProducto.setText("*");
        Numeros.add(btnProducto);

        num7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num7.setText("7");
        num7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num7MouseClicked(evt);
            }
        });
        Numeros.add(num7);

        num8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num8.setText("8");
        num8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num8MouseClicked(evt);
            }
        });
        Numeros.add(num8);

        num9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num9.setText("9");
        num9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num9MouseClicked(evt);
            }
        });
        Numeros.add(num9);

        btnSuma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSuma.setText("+");
        Numeros.add(btnSuma);

        btnPunto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPuntoMouseClicked(evt);
            }
        });
        Numeros.add(btnPunto);

        num0.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        num0.setText("0");
        num0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                num0MouseClicked(evt);
            }
        });
        Numeros.add(num0);

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setText("=");
        Numeros.add(jButton3);

        btnResta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnResta.setText("-");
        Numeros.add(btnResta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Numeros, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Numeros, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num1MouseClicked

    private void num2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num2MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num2MouseClicked

    private void num3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num3MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num3MouseClicked

    private void num4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num4MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num4MouseClicked

    private void num5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num5MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num5MouseClicked

    private void num6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num6MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num6MouseClicked

    private void num7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num7MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num7MouseClicked

    private void num8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num8MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num8MouseClicked

    private void num9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num9MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num9MouseClicked

    private void num0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num0MouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num0MouseClicked

    private void btnPuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuntoMouseClicked
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_btnPuntoMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        resultados.setText(""); // Borra el contenido del campo resultados
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void num1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_num1MousePressed
        JButton btn = (JButton)evt.getSource();
        appendToTextfield(btn, resultados);
    }//GEN-LAST:event_num1MousePressed

    private void appendToTextfield(JButton btn, JTextField textField) {
        textField.setText(textField.getText() + btn.getText());
    }
    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Numeros;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel etiquetaResultados;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JTextField resultados;
    // End of variables declaration//GEN-END:variables
}
