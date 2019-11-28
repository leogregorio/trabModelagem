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
public class Data {
    public int dia;
    public int mes;
    public int ano;
    
    public boolean ehIgual(Data data)
    {
        if(this.dia == data.dia && this.mes == data.mes 
                && this.ano == data.ano)
            return true;
        else
            return false;
    }
    
    
    
}
