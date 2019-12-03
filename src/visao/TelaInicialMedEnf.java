/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import trabmodelagem1.Atendente;
import trabmodelagem1.Main;
import trabmodelagem1.Paciente;

/**
 *
 * @author Leonardo Gregório
 */
public class TelaInicialMedEnf extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialAtendente
     */
    public TelaInicialMedEnf() {
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

        jPanel2 = new javax.swing.JPanel();
        jButtonVisualizar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jComboBoxUsuarios = new javax.swing.JComboBox<>();
        jLabelselecione = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jButtonVisualizar.setText("Visualizar dados do Paciente");
        jButtonVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonVisualizar);
        jButtonVisualizar.setBounds(120, 180, 330, 90);

        jButtonEditar.setText("Editar histórico do Paciente");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonEditar);
        jButtonEditar.setBounds(120, 300, 330, 90);

        String[] n = new String[Main.listaPacientes.size()];
        for(int i = 0; i< Main.listaPacientes.size();i++)
        n[i] = Main.listaPacientes.get(i).toString();

        for(String str: n)
        {
            jComboBoxUsuarios.addItem(str);
        }
        jPanel2.add(jComboBoxUsuarios);
        jComboBoxUsuarios.setBounds(120, 110, 330, 26);

        jLabelselecione.setText("Selecione o paciente:");
        jPanel2.add(jLabelselecione);
        jLabelselecione.setBounds(120, 90, 170, 16);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 70, 560, 470);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setText("TELA PRINCIPAL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 30, 410, 40);

        jLabel5.setText("MÉDICO / ENFERMEIRO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 20, 130, 16);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit.png"))); // NOI18N
        jButtonSair.setText("jButton6");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(600, 10, 50, 40);

        jLabel6.setText("Sair");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(610, 50, 34, 16);

        jButton7.setText("SAIR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(510, 10, 70, 70);
        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(616, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarActionPerformed
       Paciente paciente = Atendente.pesquisarPacienteNome(jComboBoxUsuarios.getSelectedItem().toString());
       TelaVisualizarDados tela = new TelaVisualizarDados(paciente);
       tela.setVisible(true);
    }//GEN-LAST:event_jButtonVisualizarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
       Paciente paciente = Atendente.pesquisarPacienteNome(jComboBoxUsuarios.getSelectedItem().toString());
       TelaEditarHistorico tela = new TelaEditarHistorico(paciente);
       tela.setVisible(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialMedEnf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialMedEnf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialMedEnf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialMedEnf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialMedEnf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVisualizar;
    private javax.swing.JComboBox<String> jComboBoxUsuarios;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelselecione;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
