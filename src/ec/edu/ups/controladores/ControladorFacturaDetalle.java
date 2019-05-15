/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.controladores;

import ec.edu.ups.modelo.FacturaDetalle;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author José Quinde
 */
public class ControladorFacturaDetalle {
    //Declaracion de Variables
 private Set<FacturaDetalle> lista;
    private int codigo;
    /**
     * Constructor inicializa variables
     */
    public ControladorFacturaDetalle() {
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
    public void crear(FacturaDetalle objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
        codigo++;
    }
    /**
    * Metodo que lee un objeto por el codigo
    * @param codigo
    * @return 
    */
    public FacturaDetalle read(int codigo){
        for (FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo() == codigo){
                return facturaDetalle;
            }
        }        
        return null;
    }
    /**
     * Metodo Actualiza Objeto
     * @param objeto 
     */
    public void update(FacturaDetalle objeto){
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
        for (FacturaDetalle facturaDetalle : lista) {
            if(facturaDetalle.getCodigo() == codigo){
                lista.remove(facturaDetalle);
                break;
            }
        }  
    } 
    /**
     * Metodo que retorna la lista del objeto
     * @return 
     */
     public Set<FacturaDetalle> getLista(){
 
            return lista;
        
    }   
}
