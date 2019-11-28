/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Leonardo Gregório
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        opcoesUser = new javax.swing.JComboBox<>();
        imagemFundo = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonAcessar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(220, 170, 240, 19);

        opcoesUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendente", "Administrador", "Enfermeiro", "Médico" }));
        opcoesUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcoesUserActionPerformed(evt);
            }
        });
        getContentPane().add(opcoesUser);
        opcoesUser.setBounds(220, 130, 160, 20);

        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadPacientes.png"))); // NOI18N
        imagemFundo.setText("jLabel2");
        getContentPane().add(imagemFundo);
        imagemFundo.setBounds(60, 100, 70, 80);

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(CampoUsuario);
        CampoUsuario.setBounds(220, 100, 240, 19);

        jLabelSenha.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(160, 170, 34, 15);

        jLabelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(160, 100, 60, 15);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(220, 230, 110, 25);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(360, 230, 100, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundotelaLogin.png"))); // NOI18N
        jLabel1.setText("jLabelFundo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 634, 346);

        setSize(new java.awt.Dimension(511, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        
        if(opcoesUser.getSelectedItem().toString().equals("Atendente"))
        {
            TelaInicialAtendente tela = new TelaInicialAtendente();
            tela.setVisible(true);
        }
        else if(opcoesUser.getSelectedItem().toString().equals("Administrador"))
        {
            TelaInicialAdmin tela = new TelaInicialAdmin();
            tela.setVisible(true);
        }
        else
            return;

        
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        ;
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void opcoesUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcoesUserActionPerformed
      
    }//GEN-LAST:event_opcoesUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin tela = new TelaLogin();
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JComboBox<String> opcoesUser;
    // End of variables declaration//GEN-END:variables
}
