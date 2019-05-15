/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.modelo;

/**
 *
 * @author José Quinde
 */
public class Producto {
    //Declaracion de Variables
    private int codigo;
    private String nombre;
    private double precio;
    /**
     * Constructor Vacio
     */
    public Producto() {
    }
    /**
     * Constructor ingresa todos los atributos
     * @param codigo
     * @param nombre
     * @param precio 
     */
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Imprime el toString
     * @return 
     */
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
 
    
}
