/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author José Quinde
 */
public class ControladorCliente {
    //Declaracion de Variables
    private Set<Cliente> lista;
    private int codigo;
    /**
     * Constructor inicializa variables
     */
    public ControladorCliente() {
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
    public void crear(Cliente objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
        codigo++;
    }
    /**
    * Metodo que lee un objeto por el codigo
    * @param codigo
    * @return 
    */
    public Cliente read(int codigo){
        for (Cliente cliente : lista) {
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }        
        return null;
    }
    /**
     * Metodo que lee un objeto por la cedula
     * @param cedula
     * @return 
     */
    public Cliente readCedula(String cedula){
        for (Cliente cliente : lista) {
            if(cliente.getCedula().equals(cedula)){
                return cliente;
                
            }
        }   
        return null;
    }
    /**
     * Metodo Actualiza Objeto
     * @param objeto 
     */
    public void update(Cliente objeto){
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
        for (Cliente cliente : lista) {
            if(cliente.getCodigo() == codigo){
                lista.remove(cliente);
                break;
            }
        }  
    } 
    /**
     * Metodo que retorna la lista del objeto
     * @return 
     */
    public Set<Cliente> getLista(){
 
            return lista;
        
    }
    
    
}
