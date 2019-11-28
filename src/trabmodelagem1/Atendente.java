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

    private void cadastrarPaciente(String nome, String cpf, int nivelDeUrgencia,String planoDeSaude)
    {
        Paciente novo = new Paciente(nome,cpf,nivelDeUrgencia,planoDeSaude);
    }
    private void cadastrarVisitante(String nome, String cpf, Paciente paciente)
    {
        Visitante novo = new Visitante(nome,cpf,paciente);
    }
    private void consultarQuarto()
    {
        
    }
    private void reservarQuarto()
    {
        
    }
    private void consultarAgendaMedico()
    {
        
    }
    private void consultarAgendaQuarto()
    {
        
    }
            
}
