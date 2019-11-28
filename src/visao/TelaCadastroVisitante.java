/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;
import trabmodelagem1.Atendente;

/**
 *
 * @author Miih Rantre
 */
public class TelaCadastroVisitante extends javax.swing.JFrame{

    /**
     * Creates new form TelaCadastroVisitante
     */
    String nome;
    String cpf;
    String paciente;
    public TelaCadastroVisitante() {
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

        CampoCPFV = new javax.swing.JPasswordField();
        CampoNomeV = new javax.swing.JTextField();
        TCPFV = new javax.swing.JLabel();
        TNomeV = new javax.swing.JLabel();
        BotaoSalvar = new javax.swing.JButton();
        Formulario = new javax.swing.JLabel();
        CampoPacV = new javax.swing.JTextField();
        TPacienteV = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        CampoCPFV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoCPFVKeyReleased(evt);
            }
        });
        getContentPane().add(CampoCPFV);
        CampoCPFV.setBounds(110, 170, 240, 19);

        CampoNomeV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeVActionPerformed(evt);
            }
        });
        CampoNomeV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoNomeVKeyReleased(evt);
            }
        });
        getContentPane().add(CampoNomeV);
        CampoNomeV.setBounds(110, 90, 240, 19);

        TCPFV.setText("CPF:");
        getContentPane().add(TCPFV);
        TCPFV.setBounds(70, 170, 22, 15);

        TNomeV.setText("Nome Completo:");
        getContentPane().add(TNomeV);
        TNomeV.setBounds(20, 90, 90, 15);

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSalvarMouseClicked(evt);
            }
        });
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });
        BotaoSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BotaoSalvarKeyReleased(evt);
            }
        });
        getContentPane().add(BotaoSalvar);
        BotaoSalvar.setBounds(220, 230, 110, 25);

        Formulario.setText("Formulário de Visitantes");
        getContentPane().add(Formulario);
        Formulario.setBounds(40, 20, 130, 15);

        CampoPacV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPacVActionPerformed(evt);
            }
        });
        CampoPacV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPacVKeyReleased(evt);
            }
        });
        getContentPane().add(CampoPacV);
        CampoPacV.setBounds(110, 130, 240, 19);

        TPacienteV.setText("Paciente:");
        getContentPane().add(TPacienteV);
        TPacienteV.setBounds(50, 130, 60, 15);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-10, -10, 470, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNomeVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeVActionPerformed
   
    
// TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeVActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void CampoPacVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPacVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPacVActionPerformed

    private void BotaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSalvarMouseClicked
        // TODO add your handling code here:
     
        Atendente.cadastrarVisitante(nome, cpf, paciente);
        
       
        
    }//GEN-LAST:event_BotaoSalvarMouseClicked

    private void CampoNomeVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNomeVKeyReleased

nome = CampoNomeV.getText();      // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeVKeyReleased

    private void CampoCPFVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoCPFVKeyReleased
    cpf = CampoCPFV.getText();
    // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFVKeyReleased

    private void CampoPacVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPacVKeyReleased
paciente = CampoPacV.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPacVKeyReleased

    private void BotaoSalvarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoSalvarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalvarKeyReleased

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
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVisitante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JPasswordField CampoCPFV;
    private javax.swing.JTextField CampoNomeV;
    private javax.swing.JTextField CampoPacV;
    private javax.swing.JLabel Formulario;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel TCPFV;
    private javax.swing.JLabel TNomeV;
    private javax.swing.JLabel TPacienteV;
    // End of variables declaration//GEN-END:variables
}
