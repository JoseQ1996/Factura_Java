/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author José Quinde
 */
public class ControladorProducto {
    //Declaracion de Variables
private Set<Producto> lista;
    private int codigo;
    /**
     * Constructor inicializa variables
     */
    public ControladorProducto() {
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
    public void crear(Producto objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
        codigo++;
    }
    /**
    * Metodo que lee un objeto por el codigo
    * @param codigo
    * @return 
    */
    public Producto read(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigo() == codigo){
                return producto;
            }
        }        
        return null;
    }
    /**
     * Metodo Actualiza Objeto
     * @param objeto 
     */
    public void update(Producto objeto){
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
        for (Producto producto : lista) {
            if(producto.getCodigo() == codigo){
                lista.remove(producto);
                break;
            }
        }  
    } 
    /**
     * Metodo que retorna la lista del objeto
     * @return 
     */
     public Set<Producto> getLista(){
 
            return lista;
        
    }
    
    
}

