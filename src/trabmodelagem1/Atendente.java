/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

import java.util.Arrays;

/**
 *
 * @author Leonardo Gregório
 */
public class Atendente extends Funcionario{

    public Atendente(String nome, String cpf) {
        super(nome, cpf);
    }

    public static void cadastrarPaciente(String nome, String cpf, int nivelDeUrgencia,String planoDeSaude)
    {
        Paciente novo = new Paciente(nome,cpf,nivelDeUrgencia,planoDeSaude);
        Main.listaPacientes.add(novo);
        for(int i=0; i < Main.listaPacientes.size(); i++)
            System.out.println(Arrays.toString(Main.listaPacientes.toArray()));
    }
    public static void cadastrarVisitante(String nome, String cpf, String paciente)
    {
        Visitante novo = new Visitante(nome,cpf,paciente);
    }
    public static void consultarQuarto()
    {
        
    }
    public static void reservarQuarto()
    {
        
    }
    public static void consultarAgendaMedico()
    {
        
    }
    public static void consultarAgendaQuarto()
    {
        
    }



}
