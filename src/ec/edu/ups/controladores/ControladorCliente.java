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
    private Set<Cliente> lista;
    private int codigo;

    public ControladorCliente() {
        lista = new HashSet<>();
        codigo = 1;
    }    

    public int getCodigo() {
        return codigo;
    }
        
    public void crear(Cliente objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);    
        codigo++;
    }
   
    
    public Cliente read(int codigo){
        for (Cliente televisor : lista) {
            if(televisor.getCodigo() == codigo){
                return televisor;
            }
        }        
        return null;
    }
    
    public void update(Cliente objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        for (Cliente televisor : lista) {
            if(televisor.getCodigo() == codigo){
                lista.remove(televisor);
                break;
            }
        }  
    } 
    
    
}
