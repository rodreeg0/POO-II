package projetocalculadora;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.SwingConstants;

public final class Calculadora extends javax.swing.JFrame {
    double num1 = 0;
    double num2 = 0;
    String operador = "";
    boolean flagValue = false;
    boolean flagOperator = false;
    String str1 = "";
    String str2 = "";
    String aux2 = "";
    
    List<String> list = new ArrayList<>();
    ProjetoCalculadora calc = new ProjetoCalculadora();

    @Override
    public void setResizable(boolean resizable) {
        super.setResizable(resizable);
        super.setLocationRelativeTo(null);
    }
    
    public Calculadora() {
        initComponents();
        calc.createjson( new Date());
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonVirgula = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonMultiplica = new javax.swing.JButton();
        jButtonSubtrai = new javax.swing.JButton();
        jButtonSoma = new javax.swing.JButton();
        jButtonApaga = new javax.swing.JButton();
        jButtonReseta = new javax.swing.JButton();
        jButtonResetAll = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        hist2 = new javax.swing.JLabel();
        hist1 = new javax.swing.JLabel();
        historico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(204, 204, 255));
        setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(70, 0));

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonVirgula.setText(".");
        jButtonVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVirgulaActionPerformed(evt);
            }
        });

        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });

        jButtonMultiplica.setText("*");
        jButtonMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicaActionPerformed(evt);
            }
        });

        jButtonSubtrai.setText("-");
        jButtonSubtrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtraiActionPerformed(evt);
            }
        });

        jButtonSoma.setText("+");
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomaActionPerformed(evt);
            }
        });

        jButtonApaga.setText("<-");
        jButtonApaga.setPreferredSize(new java.awt.Dimension(45, 45));
        jButtonApaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagaActionPerformed(evt);
            }
        });

        jButtonReseta.setText("CE");
        jButtonReseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetaActionPerformed(evt);
            }
        });

        jButtonResetAll.setText("C");
        jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAllActionPerformed(evt);
            }
        });

        display.setText("Display");

        hist2.setBackground(new java.awt.Color(255, 255, 255));
        hist2.setLabelFor(historico);
        hist2.setHorizontalAlignment(SwingConstants.CENTER);

        hist1.setBackground(new java.awt.Color(255, 255, 255));
        hist1.setLabelFor(historico);
        hist1.setHorizontalAlignment(SwingConstants.CENTER);

        historico.setBackground(new java.awt.Color(204, 204, 255));
        historico.setFont(new java.awt.Font("Monotype Corsiva", 3, 40)); // NOI18N
        historico.setForeground(new java.awt.Color(51, 51, 51));
        historico.setText("Histórico");
        historico.setToolTipText("");
        historico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        historico.setIconTextGap(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(historico, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hist1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hist2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonApaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonResetAll, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonSubtrai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonReseta))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jButtonVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(hist1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(historico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hist2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResetAll, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtrai, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReseta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!flagValue){
            str1 += 1;
            display.setText(str1);
        } else {
            str2 += 1;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!flagValue) {
            str1 += 2;
            display.setText(str1);
        } else {
            str2 += 2;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!flagValue) {
            str1 += 3;
            display.setText(str1);
        } else {
            str2 += 3;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!flagValue) {
            str1 += 4;
            display.setText(str1);
        } else {
            str2 += 4;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!flagValue) {
            str1 += 5;
            display.setText(str1);
        } else {
            str2 += 5;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!flagValue) {
            str1 += 6;
            display.setText(str1);
        } else {
            str2 += 6;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!flagValue) {
            str1 += 7;
            display.setText(str1);
        } else {
            str2 += 7;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!flagValue) {
            str1 += 9;
            display.setText(str1);
        } else {
            str2 += 9;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if (!flagValue) {
            str1 += 0;
            display.setText(str1);
        } else {
            str2 += 0;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!flagValue) {
            str1 += 8;
            display.setText(str1);
        } else {
            str2 += 8;
            display.setText(str2);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVirgulaActionPerformed
        if (!flagValue) {
            str1 += ".";
            display.setText(str1);
        } else {
            str2 += ".";
            display.setText(str2);
        }
    }//GEN-LAST:event_jButtonVirgulaActionPerformed

    private void jButtonSubtraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtraiActionPerformed
        if (flagValue){
            if(!str2.isEmpty())
                resultOperation();
        }else
            flagValue = !flagValue;
        operador = "-";
        display.setText("");       
    }//GEN-LAST:event_jButtonSubtraiActionPerformed

    private void jButtonSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomaActionPerformed
         if (flagValue){
            if(!str2.isEmpty())
                resultOperation();
         }else
            flagValue = !flagValue;
        operador = "+";
        display.setText("");
    }//GEN-LAST:event_jButtonSomaActionPerformed

    private void jButtonMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicaActionPerformed
        if (flagValue){ 
            if(!str2.isEmpty())
                resultOperation();
        }else
            flagValue = !flagValue;
        operador = "*";
        display.setText("");
    }//GEN-LAST:event_jButtonMultiplicaActionPerformed
   
    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
        if (flagValue){  
            if(!str2.isEmpty())
                resultOperation();
        }else
            flagValue = !flagValue;
        operador = "/";
        display.setText("");
    }//GEN-LAST:event_jButtonDivideActionPerformed

    private void jButtonResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAllActionPerformed
        str1 = "";
        str2 = "";
        aux2 = "";
        num1 = 0;
        num2 = 0;
        operador = "";
        flagValue = false;
        display.setText("Display");
        hist1.setText("");
        hist2.setText("");
    }//GEN-LAST:event_jButtonResetAllActionPerformed

    private void jButtonResetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetaActionPerformed
        if (!flagValue){
            str1 = "";
            num1 = 0;
        } else {
            str2 = "";
            num2 = 0;
        }
        display.setText("Display");
    }//GEN-LAST:event_jButtonResetaActionPerformed

    private void jButtonApagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagaActionPerformed
        if (!flagValue) {
            if (!str1.isEmpty()){
                str1 = str1.substring(0, str1.length() - 1);
                if(str1.isEmpty())
                    display.setText("Display");
                else
                    display.setText(str1);
            }   
        } else {
            if (!str2.isEmpty()){
                str2 = str2.substring(0, str2.length() - 1);
                if(str2.isEmpty())
                    display.setText("Display");
                else
                    display.setText(str2);
            }
        }
    }//GEN-LAST:event_jButtonApagaActionPerformed
    
    private void resultOperation(){
        StringBuilder sb = new StringBuilder();
        num1 = Double.parseDouble(str1);
        num2 = Double.parseDouble(str2);
        sb.append(str1).append(" ").append(operador).append(" ").append(str2).append(" = ");   
        num1 = calc.operacao(operador, num1, num2);   
        str1 = String.valueOf(num1);  
        sb.append(str1);
        str2 = "";
        addTextInTextField(sb.toString());
        calc.addToJSON(list);
    }
    
    public void addTextInTextField(String text){
        list.add(text);
        if(list.size()<=1)
            hist1.setText(text);
        else
            hist2.setText(hist1.getText());
            hist1.setText(text);
    }
    
    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        StringBuilder sb = new StringBuilder();
        flagValue = true;
        if (!str1.isEmpty()) {
            sb.append(str1).append(" ");
            num1 = Double.parseDouble(str1);
            if (!str2.isEmpty()) {
                sb.append(operador).append(" ").append(str2);
                num2 = Double.parseDouble(str2);
                aux2 = str2;
                num1 = calc.operacao(operador, num1, num2);
                str1 = String.valueOf(num1);
                sb.append(" = ").append(str1);
                str2 = "";
                num2 = 0;
                addTextInTextField(sb.toString());
                calc.addToJSON(list);
                display.setText(String.valueOf(num1));
                flagValue = false;
           } else if (!flagValue){
                num2 = Double.parseDouble(aux2);
                num1 = calc.operacao(operador, num1, num2);
                str1 = String.valueOf(num1);
                str2 = "";
                num2 = 0;
                display.setText(str1);
           }else
                jButtonResetAllActionPerformed(evt);
        }
        
    }//GEN-LAST:event_jButtonIgualActionPerformed

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
    private javax.swing.JTextField display;
    private javax.swing.JLabel hist1;
    private javax.swing.JLabel hist2;
    private javax.swing.JLabel historico;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonApaga;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplica;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JButton jButtonReseta;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSubtrai;
    private javax.swing.JButton jButtonVirgula;
    // End of variables declaration//GEN-END:variables
}
