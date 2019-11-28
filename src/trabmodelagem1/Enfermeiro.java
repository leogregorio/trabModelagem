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
public class Enfermeiro {
    private String coren;
    
    private boolean acessarHistorico(Paciente paciente)
    {
        return false;        
    };

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
}
