/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author kvin2
 */
public class RepositorioMySql {

    private ArrayList<Persona> personas;

    public RepositorioMySql() {
        personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public int obtenerCantidadPersonas() {
        return this.personas.size();
    }

    public boolean adicionarPersona(Persona p) {
        boolean estado = this.personas.add(p);
        return estado;
    }

    public Persona buscarPersonas(String usuario) {
        for (Persona persona : personas) {
            if (persona.getUsuario().equals(usuario)) {
                return persona;
            }
        }
        return null;

    }

}
