/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aviones;

import java.util.Date;

/**
 *
 * @author Valeria Castañeda
 */
public class Persona {
    
    private int identificacion;
    private String nombre;
    private String apellido;
    private Date fechaNac;
/**
 * 
 * @param identificacion
 * @param nombre
 * @param apellido
 * @param fechaNac 
 */
    public Persona(int identificacion, String nombre, String apellido, Date fechaNac) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }
/**
 * 
 * @return 
 */
    public int getIdentificacion() {
        return identificacion;
    }
/**
 * 
 * @param identificacion 
 */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
/**
 * 
 * @return 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * 
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return 
 */
    public String getApellido() {
        return apellido;
    }
/**
 * 
 * @param apellido 
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * 
 * @return 
 */
    public Date getFechaNac() {
        return fechaNac;
    }
/**
 * 
 * @param fechaNac 
 */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
}
