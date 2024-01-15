/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogodavelha;

import java.util.Arrays;
import com.mycompany.jogodavelha.Player;

/**
 *
 * @author Gilson
 */
public class JogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form JogoDaVelha
     */
    public JogoDaVelha() {
        initComponents();
        painelEscolhaSimbolo.setVisible(false);
    }

    /**
     * 1 - Menu de início
            * 1.1 - Escolha do símbolo e o nome do jogador
            * 1.2 - Jogo de dois jogadores (vou tentar implementar de so um player primeiro)
     * 2 - Jogo acontecendo
            * 2.1 - Geração do tabuleiro
            * 2.2 - Sistema de jogadas de cada jogador e alternância de jogadas
            * 2.3 - Detecção de vitórias e fim do jogo
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        painelEscolhaSimbolo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeLbl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        playButton = new javax.swing.JButton();
        oButton = new javax.swing.JRadioButton();
        xButton = new javax.swing.JRadioButton();
        painelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelEscolhaSimbolo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("       Jogo da velha");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelEscolhaSimbolo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 330, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("- Digite seu nome:");
        painelEscolhaSimbolo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, 39));

        nomeLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeLbl.setForeground(new java.awt.Color(0, 102, 255));
        painelEscolhaSimbolo.add(nomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 172, 39));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("- Escolha seu símbolo:");
        painelEscolhaSimbolo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 39));

        playButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        playButton.setText("Jogar!");
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        painelEscolhaSimbolo.add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 180, 60));

        oButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        oButton.setText("O");
        oButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oButtonActionPerformed(evt);
            }
        });
        painelEscolhaSimbolo.add(oButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        xButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xButton.setText("X");
        xButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xButtonActionPerformed(evt);
            }
        });
        painelEscolhaSimbolo.add(xButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        getContentPane().add(painelEscolhaSimbolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 440));

        painelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("       Jogo da velha");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 330, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gilson\\Desktop\\GitHub\\projetos-em-java\\JogoDaVelha\\src\\main\\java\\images\\img-jogo-da-velha.png")); // NOI18N
        painelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        startButton.setText("Clique para jogar");
        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        painelMenu.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, 50));

        getContentPane().add(painelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 444));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        painelMenu.setVisible(false); // Oculta o menu
        painelEscolhaSimbolo.setVisible(true); // exibe o painel de escolha
        // do simbolo do jogador
    }//GEN-LAST:event_startButtonActionPerformed

    private void oButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oButtonActionPerformed
        // TODO add your handling code here:
        
        // Descobrindo o estado de seleção do outro botão e do botao apertado
        String estadoBotaox = Arrays.toString(xButton.getSelectedObjects());
        String estadoBotaoo = Arrays.toString(oButton.getSelectedObjects());
        
        if ("[X]".equals(estadoBotaox) && "[O]".equals(estadoBotaoo))
        {
            xButton.setSelected(false);
        }
    }//GEN-LAST:event_oButtonActionPerformed

    private void xButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xButtonActionPerformed
        // TODO add your handling code here:
        // Descobrindo o estado de seleção do outro botão e do botao apertado
        String estadoBotaox = Arrays.toString(xButton.getSelectedObjects());
        String estadoBotaoo = Arrays.toString(oButton.getSelectedObjects());
        
        if ("[X]".equals(estadoBotaox) && "[O]".equals(estadoBotaoo))
        {
            oButton.setSelected(false);
        }        
    }//GEN-LAST:event_xButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
        // pegar o nome do jogador e o simbolo dele
        String nome;
        int tam = nomeLbl.getText().length();
        if (tam == 0)
        {
            nome = "jogador";
        }
        else
        {
            nome = nomeLbl.getText();
        }
        
        char simbolojog = 'O'; // por padrao, se nenhum simbolo for escolhido, o jogador usa o simbolo 'o'
        String estadoBotaox = Arrays.toString(xButton.getSelectedObjects());
        String estadoBotaoo = Arrays.toString(oButton.getSelectedObjects());
        
        if ("[X]".equals(estadoBotaox) &&  !("[O]".equals(estadoBotaoo)))
        {
            simbolojog = 'X';
        }
        else if(!("[X]".equals(estadoBotaox)) && "[O]".equals(estadoBotaoo))
        {
            simbolojog = 'O';
        }
        
        // declaraçao da classe do jogador
        Player jogador = new Player();
        jogador.nome = nome;
        jogador.simbolo = simbolojog;
        
        // classe do computador
        Player comp = new Player();
        comp.nome = "Computador";
        if (jogador.simbolo == 'X')
        {
            comp.simbolo = 'O';
        }
        else
        {
            comp.simbolo =  'X';
        }
        
        System.out.println(jogador.nome + jogador.simbolo);     
        System.out.println(comp.nome + comp.simbolo);
    }//GEN-LAST:event_playButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeLbl;
    private javax.swing.JRadioButton oButton;
    private javax.swing.JPanel painelEscolhaSimbolo;
    private javax.swing.JPanel painelMenu;
    private javax.swing.JButton playButton;
    private javax.swing.JToggleButton startButton;
    private javax.swing.JRadioButton xButton;
    // End of variables declaration//GEN-END:variables
}
