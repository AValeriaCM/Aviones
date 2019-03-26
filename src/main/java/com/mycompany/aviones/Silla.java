/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aviones;

/**
 *
 * @author Valeria Castañeda
 */
public class Silla {
    
    private String tipo;
    private int id;
    private int estado;
    private Persona persona;
    /**
     * 
     * @param tipo
     * @param id
     * @param estado
     * @param persona 
     */
    public Silla(String tipo, int id, int estado, Persona persona) {
        this.tipo = tipo;
        this.estado = estado;
        this.persona = persona;
        this.id = id;
    }
    /**
     * 
     * @return String
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * 
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * 
     * @return int
     */
    public int getEstado() {
        return estado;
    }
    /**
     * 
     * @param estado 
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
/**
 * 
 * @return Persona
 */
    public Persona getPersona() {
        return persona;
    }
/**
 * 
 * @param persona 
 */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
/**
 * 
 * @return int
 */
    public int getId() {
        return id;
    }
/**
 * 
 * @param id 
 */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
