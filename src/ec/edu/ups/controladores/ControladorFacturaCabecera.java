/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.controladores;

import ec.edu.ups.modelo.FacturaCabecera;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author José Quinde
 */
public class ControladorFacturaCabecera {
    
    private Set<FacturaCabecera> lista;
    private int codigo;

    public ControladorFacturaCabecera() {
        lista = new HashSet<>();
        codigo = 1;
    }    

    public int getCodigo() {
        return codigo;
    }
        
    public void crear(FacturaCabecera objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
        codigo++;
    }
   
    
    public FacturaCabecera read(int codigo){
        for (FacturaCabecera facturaCabecera : lista) {
            if(facturaCabecera.getCodigo() == codigo){
                return facturaCabecera;
            }
        }        
        return null;
    }
    
    public void update(FacturaCabecera objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (FacturaCabecera facCab : lista) {
            if(facCab.getCodigo() == codigo){
                lista.remove(facCab);
                break;
            }
        }  
    } 
    public Set<FacturaCabecera> getLista(){
 
            return lista;
        
    }
}
