/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

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
    }
    public static void cadastrarVisitante(String nome, String cpf, Paciente paciente)
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
