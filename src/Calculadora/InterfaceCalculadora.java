package Calculadora;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseEvent;

/**
 *
 * @author JoãoPauloGois
 * 
 * Correções dos erros:

- Caixas de textos do visor bloqueadas e unificadas;
- Botão +/- funcionando;
- Ocultar casa decimal se número for inteiro;
- Caso o visor tenha "0", ao apertar o botão zero nada é acrescentado ao visor;
- Ao apertar um botão 0..9 e logo após o botão igual, o visor secundário exibe o número digitado + "=" e o visor principal continua exibindo o número digitado;
- Botão CE funcionando;
- Botão backspace após apagar um número, quando um novo número é digitado, não retorna mais no visor os números apagados anteriormente mais o último número digitado.
 * 
 */
public class InterfaceCalculadora extends javax.swing.JFrame {

    String num1 = "", num2 = "", operacao = "";
    double result = 0.0, valorDecimal = 0.0;
    int valorInteiro = 0;
    boolean pontoDecimal = false;

    public InterfaceCalculadora() {
        setResizable(false);
        setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        visorPrincipal = new javax.swing.JTextField();
        btnDivisao = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCorrigir = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMudarSinal = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        visorSecundario = new javax.swing.JTextField();
        btnVirgula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        visorPrincipal.setEditable(false);
        visorPrincipal.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        visorPrincipal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visorPrincipal.setText("0");
        visorPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        visorPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        visorPrincipal.setFocusable(false);
        visorPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorPrincipalActionPerformed(evt);
            }
        });

        btnDivisao.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnDivisao.setText("÷");
        btnDivisao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDivisaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDivisaoMouseExited(evt);
            }
        });
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancelar.setText("CE");
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLimpar.setText("C");
        btnLimpar.setBorderPainted(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnCorrigir.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnCorrigir.setText("←");
        btnCorrigir.setBorderPainted(false);
        btnCorrigir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCorrigir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigirActionPerformed(evt);
            }
        });

        btnMultiplicacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMultiplicacao.setText("X");
        btnMultiplicacao.setBorderPainted(false);
        btnMultiplicacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMultiplicacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMultiplicacaoMouseExited(evt);
            }
        });
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnNum7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum7.setText("7");
        btnNum7.setBorderPainted(false);
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum8.setText("8");
        btnNum8.setBorderPainted(false);
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum9.setText("9");
        btnNum9.setBorderPainted(false);
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnSubtracao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSubtracao.setText("—");
        btnSubtracao.setBorderPainted(false);
        btnSubtracao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubtracaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubtracaoMouseExited(evt);
            }
        });
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnNum4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum4.setText("4");
        btnNum4.setBorderPainted(false);
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum5.setText("5");
        btnNum5.setBorderPainted(false);
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum6.setText("6");
        btnNum6.setBorderPainted(false);
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnSoma.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        btnSoma.setText("+");
        btnSoma.setBorderPainted(false);
        btnSoma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSomaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSomaMouseExited(evt);
            }
        });
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnNum1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum1.setText("1");
        btnNum1.setBorderPainted(false);
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum2.setText("2");
        btnNum2.setBorderPainted(false);
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum3.setText("3");
        btnNum3.setBorderPainted(false);
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorderPainted(false);
        btnIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIgualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIgualMouseExited(evt);
            }
        });
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMudarSinal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMudarSinal.setText("+/-");
        btnMudarSinal.setBorderPainted(false);
        btnMudarSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudarSinalActionPerformed(evt);
            }
        });

        btnNum0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNum0.setText("0");
        btnNum0.setToolTipText("");
        btnNum0.setBorderPainted(false);
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        visorSecundario.setEditable(false);
        visorSecundario.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        visorSecundario.setForeground(new java.awt.Color(153, 153, 153));
        visorSecundario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visorSecundario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        visorSecundario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        visorSecundario.setFocusable(false);
        visorSecundario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visorSecundarioActionPerformed(evt);
            }
        });

        btnVirgula.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVirgula.setText(".");
        btnVirgula.setBorderPainted(false);
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visorSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnCorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMudarSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(visorSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(visorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCorrigir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMudarSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void InicioVisor() {
        if (operacao.equals("")) {
            num1 += "0";
            visorPrincipal.setText(num1);
        } else {
            num2 += "0";
            visorPrincipal.setText(num2);
        }
    }

    private void EntradaNum(String n) {
        if (operacao.equals("")) {
            num1 += n;
            visorPrincipal.setText(num1);
        } else {
            num2 += n;
            visorPrincipal.setText(num2);
        }
    }


    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        num1 = visorPrincipal.getText();
        operacao = "+";
        visorSecundario.setText(num1 + " " + operacao);
        visorPrincipal.setText(num1);
        pontoDecimal = false;
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        EntradaNum("7");
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        EntradaNum("8");
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        EntradaNum("9");
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        EntradaNum("4");
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        EntradaNum("5");
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        EntradaNum("6");
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        EntradaNum("1");
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        EntradaNum("2");
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        EntradaNum("3");
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed

        if (visorPrincipal.getText().equals("0") && result == 0.0) {
            visorPrincipal.setText("0");
        } else {
            EntradaNum("0");
        }
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        num1 = visorPrincipal.getText();
        operacao = "-";
        visorSecundario.setText(num1 + " " + operacao);
        visorPrincipal.setText(num1);
        pontoDecimal = false;
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        num1 = visorPrincipal.getText();
        operacao = "x";
        visorSecundario.setText(num1 + " " + operacao);
        visorPrincipal.setText(num1);
        pontoDecimal = false;
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        num1 = visorPrincipal.getText();
        operacao = "÷";
        visorSecundario.setText(num1 + " " + operacao);
        visorPrincipal.setText(num1);
        pontoDecimal = false;
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (!visorSecundario.getText().equals("")) {
            num2 = "";
            visorPrincipal.setText("0");
        } else {
            num1 = "";
            visorPrincipal.setText("0");
        }
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        num1 = "";
        num2 = "";
        operacao = "";
        visorPrincipal.setText("0");
        visorSecundario.setText("");
        pontoDecimal = false;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnMudarSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudarSinalActionPerformed
        double num = Double.parseDouble(String.valueOf(visorPrincipal.getText()));
        num = num * (-1);
        visorPrincipal.setText(String.valueOf(num));

        valorDecimal = num;
        valorInteiro = (int) valorDecimal;

        if (valorDecimal == valorInteiro) {
            visorPrincipal.setText(String.format("%d", valorInteiro));
        } else {
            visorPrincipal.setText(String.valueOf(num));
        }

    }//GEN-LAST:event_btnMudarSinalActionPerformed

    private void btnCorrigirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigirActionPerformed

        StringBuilder delV1 = new StringBuilder(num1);
        StringBuilder delV2 = new StringBuilder(num2);
        
        
        if (visorSecundario.getText().equals("")) {
            num1 = visorPrincipal.getText();
            num1 = String.valueOf(delV1.deleteCharAt(num1.length() - 1));
            visorPrincipal.setText(num1);

        } else {
            num2 = visorPrincipal.getText();
            num2 = String.valueOf(delV2.deleteCharAt(num2.length() - 1));
            visorPrincipal.setText(num2);
        }

        if (visorPrincipal.getText().equals("")) {
            visorPrincipal.setText("0");
        }
    }//GEN-LAST:event_btnCorrigirActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
        if ((operacao.equals("")) && (pontoDecimal == false)) {
            num1 += ".";
            visorPrincipal.setText(num1);
        } else if ((!operacao.equals("")) && (pontoDecimal == false)) {
            num2 += ".";
            visorPrincipal.setText(num2);
        }
        pontoDecimal = true;
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed

        if (!num1.equals("") && num2.equals("")) {
            visorSecundario.setText(num1 + " = ");
            result = Double.parseDouble(num1);
            visorPrincipal.setText(String.valueOf(result));
        }

        switch (operacao) {
            case "+":
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                visorSecundario.setText(String.valueOf(num1) + " + "
                        + String.valueOf(num2) + " = ");
                break;
            case "-":
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                visorSecundario.setText(String.valueOf(num1) + " - "
                        + String.valueOf(num2) + " = ");
                break;
            case "x":
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                visorSecundario.setText(String.valueOf(num1) + " x "
                        + String.valueOf(num2) + " = ");
                break;
            case "÷":
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                visorSecundario.setText(String.valueOf(num1) + " ÷ "
                        + String.valueOf(num2) + " = ");
                break;
        }

        valorDecimal = result;
        valorInteiro = (int) valorDecimal;

        if (valorDecimal == valorInteiro) {
            visorPrincipal.setText(String.format("%d", valorInteiro));
        } else {
            visorPrincipal.setText(String.format("%.2f", result).replaceAll(",", "."));
        }

        operacao = "";
        num1 = "";
        num2 = "";

    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnDivisaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisaoMouseEntered
        btnDivisao.setBackground(new Color(101, 101, 101));
        btnDivisao.setForeground(Color.white);
    }//GEN-LAST:event_btnDivisaoMouseEntered

    private void btnDivisaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisaoMouseExited
        btnDivisao.setBackground(null);
        btnDivisao.setForeground(null);
    }//GEN-LAST:event_btnDivisaoMouseExited

    private void btnMultiplicacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicacaoMouseEntered
        btnMultiplicacao.setBackground(new Color(101, 101, 101));
        btnMultiplicacao.setForeground(Color.white);
    }//GEN-LAST:event_btnMultiplicacaoMouseEntered

    private void btnMultiplicacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicacaoMouseExited
        btnMultiplicacao.setBackground(null);
        btnMultiplicacao.setForeground(null);
    }//GEN-LAST:event_btnMultiplicacaoMouseExited

    private void btnSubtracaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubtracaoMouseEntered
        btnSubtracao.setBackground(new Color(101, 101, 101));
        btnSubtracao.setForeground(Color.white);
    }//GEN-LAST:event_btnSubtracaoMouseEntered

    private void btnSubtracaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubtracaoMouseExited
        btnSubtracao.setBackground(null);
        btnSubtracao.setForeground(null);
    }//GEN-LAST:event_btnSubtracaoMouseExited

    private void btnSomaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSomaMouseEntered
        btnSoma.setBackground(new Color(101, 101, 101));
        btnSoma.setForeground(Color.white);
    }//GEN-LAST:event_btnSomaMouseEntered

    private void btnSomaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSomaMouseExited
        btnSoma.setBackground(null);
        btnSoma.setForeground(null);
    }//GEN-LAST:event_btnSomaMouseExited

    private void btnIgualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseEntered
        btnIgual.setBackground(new Color(14, 104, 208));
        btnIgual.setForeground(Color.white);
    }//GEN-LAST:event_btnIgualMouseEntered

    private void btnIgualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseExited
        btnIgual.setBackground(null);
        btnIgual.setForeground(null);
    }//GEN-LAST:event_btnIgualMouseExited

    private void visorPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorPrincipalActionPerformed
        InicioVisor();
    }//GEN-LAST:event_visorPrincipalActionPerformed

    private void visorSecundarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visorSecundarioActionPerformed

    }//GEN-LAST:event_visorSecundarioActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCorrigir;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMudarSinal;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JTextField visorPrincipal;
    private javax.swing.JTextField visorSecundario;
    // End of variables declaration//GEN-END:variables
}
