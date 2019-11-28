/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabmodelagem1;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Gregório
 */
public class Quarto {
    private int numeroQuarto;
    private int maxVisitas;
    private Paciente paciente;
    private ArrayList visitas;
    
    
    public Quarto()
    {
        this.visitas = new ArrayList();
    }
    private boolean quartoCheio()
    {
        if(visitas.size() == maxVisitas)
            return true;
        else
            return false;
    }
}
