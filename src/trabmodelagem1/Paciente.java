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
public class Paciente extends Pessoa{
    private int nivelDeUrgencia;
    private String planoDeSaude;

    public Paciente(String nome, String cpf, int nivelDeUrgencia,String planoDeSaude)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.nivelDeUrgencia = nivelDeUrgencia;
        this.planoDeSaude = planoDeSaude;
    }
    
    public int getNivelDeUrgencia() {
        return nivelDeUrgencia;
    }

    public void setStatus(String status) {
        this.nivelDeUrgencia = nivelDeUrgencia;
    }

    public String getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }
    
    public String toString()
    {
        return this.nome;
    }
}
