/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gamee;

import java.awt.Color;
import static java.lang.System.exit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author mathe
 */
public class Principal extends javax.swing.JFrame {
    //verifica quantas jogadas foram realizadas
    int qtd;
    //verifica quem está na vez
    int jogador;
    //marca a posição de cada jogador que jogou, e se alguem venceu
    int matriz[][] = new int [3][3];
    //mapeai os botoes do jogo
    JButton b[]= new JButton [9];
   
    //armazena o nome do jogador que ganhou
    String Ganhador;
    String jogador1 = null;
    String jogador2 = null;
    
 
    
    public Principal() {
        initComponents();
        qtd = 1;
        jogador = 1;
        b[0] = bt_1;
        b[1] = bt_2;
        b[2] = bt_3;
        b[3] = bt_4;
        b[4] = bt_5;
        b[5] = bt_6;
        b[6] = bt_7;
        b[7] = bt_8;
        b[8] = bt_9;
                
        
    }
    
    public String retornaNomeJogador(String OrdemJogador){
        return JOptionPane.showInputDialog("Digite o nome do " + OrdemJogador +" jogador");
    }
    
    public Boolean validaStringVazia(String nome){
        return nome != null && !nome.isEmpty();
    }//isEmpty = retorna VERDADE Se e SOMENTE SE a quantidade de caracteres é igual a Zero
     // vazio é diferente de nulo 
    public void verNome(){
        if(jogador1 == null){
            boolean valida = false;
            while(!valida){// Enquanto a condição for FALSA repita
                jogador1 = retornaNomeJogador("Primeiro");
                valida = validaStringVazia(jogador1);
            }
        }
        if(jogador2 == null){
            boolean valida = false;
            while(!valida){ // Enquanto a condição for FALSA repita
                jogador2 = retornaNomeJogador("Segundo");
                valida = validaStringVazia(jogador2);
            }
        }
    }
    public void jogada(JButton b, int x, int y){
    b.setEnabled(false);
    
    if(jogador == 1) {
        matriz[x][y] = 1;
        b.setText("X");
        jogador = 2;
        Ganhador = jogador1;
        CheckJogada(1);
    } else{
        
        matriz[x][y] = 2;
        b.setText("O");
        jogador = 1;
        Ganhador =jogador2;
        CheckJogada(2);
    }
    qtd++;
}  
    public void  CheckJogada(int x){
        if(vitoria(x) == true){
            JOptionPane.showInputDialog(null,"jogador: " + Ganhador + " " + " venceu!");
            fimJogo();
        }
        if(empate(x) == true){
            JOptionPane.showInputDialog("Parabéns aos dois, houve um empate");
            fimJogo();
        }
        
    }
    
    public boolean vitoria(int x) {
        
        for(int i =0; i<matriz.length; i++){
            if(matriz [i][0] == x && matriz[i][1] == x && matriz[i][2]== x){
                return true;
            }else if(matriz[0][i] == x && matriz[1][i] == x && matriz[2][i] == x){
                return true;
            }
        }
        if(matriz[0][0] == x && matriz[1][1] == x && matriz[2][2]== x){
            return true;
        } 
        if(matriz[0][2] == x && matriz[1][1]==x && matriz[2][0] == x){
           return true;
        }
        return false;
    }
    public boolean empate(int x){
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j] != 0){
                    cont++;
                    if(cont == 9 && vitoria(x)) == false{
                        //JOptionPane.showInputDialog("Parabéns aos dois, houve um empate");
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void fimJogo(){
        for(int i = 0; i<9; i++){
            //finaliza o jogo caso tenha um vencedor ou empate, verifica as posições
            b[i].setEnabled(false);
        }
    }
    
    public void Limpar(){
        for(int i = 0; i<9; i++){
            //Faz o botao voltar na posição original
            b[i].setEnabled(true);
            //o botao volta a ser vazio
            b[i].setText("");
        }
            
        for(int x = 0; x<3; x++){
            for(int y = 0; y<3; y++){
                matriz[x][y] = 0;
            }
        }
        jogador = 1;
        jogador1 = null;
        jogador2 = null;
        Ganhador = "";
    }
    
    public void nomes(){
        //jogador1 = JOptionPane.showInputDialog("Digite o nome do primeiro jogador");
        //jogador2 = JOptionPane.showInputDialog("Digite o nome do segundo jogador");
        verNome();
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        bt_2 = new javax.swing.JButton();
        bt_3 = new javax.swing.JButton();
        bt_1 = new javax.swing.JButton();
        bt_6 = new javax.swing.JButton();
        bt_5 = new javax.swing.JButton();
        bt_4 = new javax.swing.JButton();
        bt_9 = new javax.swing.JButton();
        bt_8 = new javax.swing.JButton();
        bt_7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jMenu3.setText("Opção");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setText("Novo Jogo");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Sair");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setText("Sair");
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

        jFrame1.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jButton4)
                .addGap(48, 48, 48)
                .addComponent(jButton5)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jButton6)
                    .addContainerGap(302, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(418, 300));
        getContentPane().setLayout(null);

        bt_2.setBackground(new java.awt.Color(51, 255, 255));
        bt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_2);
        bt_2.setBounds(137, 43, 81, 57);

        bt_3.setBackground(new java.awt.Color(51, 255, 255));
        bt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_3);
        bt_3.setBounds(273, 43, 81, 57);

        bt_1.setBackground(new java.awt.Color(51, 255, 255));
        bt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_1);
        bt_1.setBounds(16, 42, 82, 57);

        bt_6.setBackground(new java.awt.Color(51, 255, 255));
        bt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_6);
        bt_6.setBounds(273, 124, 81, 57);

        bt_5.setBackground(new java.awt.Color(51, 255, 255));
        bt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_5);
        bt_5.setBounds(137, 124, 81, 57);

        bt_4.setBackground(new java.awt.Color(51, 255, 255));
        bt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_4);
        bt_4.setBounds(17, 124, 80, 57);

        bt_9.setBackground(new java.awt.Color(51, 255, 255));
        bt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_9ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_9);
        bt_9.setBounds(273, 214, 81, 57);

        bt_8.setBackground(new java.awt.Color(51, 255, 255));
        bt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_8ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_8);
        bt_8.setBounds(137, 214, 81, 57);

        bt_7.setBackground(new java.awt.Color(51, 255, 255));
        bt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_7);
        bt_7.setBounds(17, 214, 80, 57);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uwp1574015.gif"))); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(418, 300));
        jLabel2.setPreferredSize(new java.awt.Dimension(418, 300));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -30, 420, 340);

        jMenu1.setText("Opção");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Novo Jogo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Limpar();
        nomes();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_2ActionPerformed
        jogada(bt_2, 0, 1);
    }//GEN-LAST:event_bt_2ActionPerformed

    private void bt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_3ActionPerformed
        jogada(bt_3, 0, 2);
    }//GEN-LAST:event_bt_3ActionPerformed

    private void bt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_1ActionPerformed
        jogada(bt_1, 0, 0);
    }//GEN-LAST:event_bt_1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void bt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_6ActionPerformed
        jogada(bt_6, 1, 2);
    }//GEN-LAST:event_bt_6ActionPerformed

    private void bt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_5ActionPerformed
        jogada(bt_5, 1, 1);
    }//GEN-LAST:event_bt_5ActionPerformed

    private void bt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_4ActionPerformed
        jogada(bt_4, 1, 0);
    }//GEN-LAST:event_bt_4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void bt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_9ActionPerformed
        jogada(bt_9, 2, 2);
    }//GEN-LAST:event_bt_9ActionPerformed

    private void bt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_8ActionPerformed
        jogada(bt_8, 2, 1);
    }//GEN-LAST:event_bt_8ActionPerformed

    private void bt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_7ActionPerformed
        jogada(bt_7, 2, 0);
    }//GEN-LAST:event_bt_7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_1;
    private javax.swing.JButton bt_2;
    private javax.swing.JButton bt_3;
    private javax.swing.JButton bt_4;
    private javax.swing.JButton bt_5;
    private javax.swing.JButton bt_6;
    private javax.swing.JButton bt_7;
    private javax.swing.JButton bt_8;
    private javax.swing.JButton bt_9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}

