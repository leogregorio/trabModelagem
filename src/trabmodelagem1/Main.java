/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

import java.util.ArrayList;
import visao.TelaLogin;
import trabmodelagem1.Atendente;

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
    public static ArrayList<Quarto> listaQuartos;
    
    
    private Main()
    {
        this.listaPacientes = new ArrayList();
        this.listaEnfermeiros = new ArrayList();
        this.listaMedicos = new ArrayList();
        this.listaVisitantes = new ArrayList();
        this.listaAtendentes = new ArrayList();
        this.listaQuartos = new ArrayList();
    }

    public static Main getInstance()
    {
        return hospital;
    }


    
   
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin tela = new TelaLogin();
                tela.setVisible(true);
            }
        });
        
        Atendente.cadastrarPaciente("Vulia Jaladares", "42069", 1, "Caixa"); 
        Main.listaPacientes.get(0).setHistorico("Sem histórico disponível");
        Atendente.cadastrarPaciente("Greo Legorio", "666", 4, "GEAP");
        Main.listaPacientes.get(1).setHistorico("2018:\n\tSuspeita de Dengue(28/07/18)\n\tColeta de Sangue para Hemograma Completo (10/10/18)");
        Atendente.cadastrarPaciente("Rafa Ela", "9090", 1, "SUS");
        Main.listaPacientes.get(2).setHistorico("Qualquer coisa");
        
        //criar quartos
        Atendente.reservarQuarto(101, "0");
        Atendente.reservarQuarto(102, "0");
        Atendente.reservarQuarto(103, "0");
        Atendente.reservarQuarto(104, "0");
        Atendente.reservarQuarto(201, "0");
        Atendente.reservarQuarto(202, "0");
        Atendente.reservarQuarto(203, "0");
        Atendente.reservarQuarto(204, "0");
        Atendente.reservarQuarto(301, "0");
        Atendente.reservarQuarto(302, "0");
        Atendente.reservarQuarto(303, "0");
        Atendente.reservarQuarto(304, "0");
        
        
        
    }
    
}
