/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.modelo;
import java.util.Objects;

/**
 *
 * @author José Quinde
 */
public class Cliente {
    //Declaracion de Variables
    private int codigo;
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;
    /**
     * Constructor Vacio
     */
    public Cliente() {
    }
    /**
     * Constructor ingresa todos los atributos
     * @param codigo
     * @param cedula
     * @param nombre
     * @param direccion
     * @param telefono 
     */
    public Cliente(int codigo, String cedula, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
       this.direccion = direccion;

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Imprime el toString
     * @return 
     */
    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    /**
     * Metodo verifica la cedula
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + Objects.hashCode(this.cedula);
        return hash;
    }
    /**
     * Metodo compara un objeto si tiene la misma cedula
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }        
    
}
