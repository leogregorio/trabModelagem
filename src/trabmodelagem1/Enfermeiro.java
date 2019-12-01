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

    Enfermeiro(String nome, String cpf, String coren) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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
