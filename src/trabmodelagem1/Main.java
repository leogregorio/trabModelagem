/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

import java.util.ArrayList;
import visao.TelaLogin;

/**
 *
 * @author Leonardo Gregório
 */
public class Main {
    private static Main hospital = new Main();
    
    public static ArrayList<Paciente> listaPacientes;
    public static ArrayList<Enfermeiro> listaEnfermeiros;
    public static ArrayList<Medico> listaMedicos;
    public static ArrayList<Atendente> listaAtendentes;
    public static ArrayList<Visitante> listaVisitantes;
    
    private Main()
    {
        this.listaPacientes = new ArrayList();
        this.listaEnfermeiros = new ArrayList();
        this.listaMedicos = new ArrayList();
        this.listaPacientes = new ArrayList();
        this.listaPacientes = new ArrayList();
    }

    public static Main getInstance()
    {
        return hospital;
    }

    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin tela = new TelaLogin();
                tela.setVisible(true);
            }
        });
    }
    
}
