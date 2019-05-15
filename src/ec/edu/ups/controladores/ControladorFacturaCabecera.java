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
    //Declaracion de Variables
    private Set<FacturaCabecera> lista;
    private int codigo;
    /**
     * Constructor inicializa variables
     */
    public ControladorFacturaCabecera() {
        lista = new HashSet<>();
        codigo = 1;
    }    
    /**
     * Metodo que te obtiene el codigo
     * @return 
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo que crea un objeto
     * @param objeto 
     */      
    public void crear(FacturaCabecera objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
        codigo++;
    }
   /**
    * Metodo que lee un objeto por el codigo
    * @param codigo
    * @return 
    */
    public FacturaCabecera read(int codigo){
        for (FacturaCabecera facturaCabecera : lista) {
            if(facturaCabecera.getCodigo() == codigo){
                return facturaCabecera;
            }
        }        
        return null;
    }
    /**
     * Metodo Actualiza Objeto
     * @param objeto 
     */
    public void update(FacturaCabecera objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    /**
     * Metodo que elimina un objeto por el codigo
     * @param codigo 
     */
    public void delete(int codigo){
        for (FacturaCabecera facCab : lista) {
            if(facCab.getCodigo() == codigo){
                lista.remove(facCab);
                break;
            }
        }  
    } 
    /**
     * Metodo que retorna la lista del objeto
     * @return 
     */
    public Set<FacturaCabecera> getLista(){
 
            return lista;
        
    }
}
