/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_carlosbarahona_12041015;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Universo {

    private String nombre;
    private ArrayList<Escuadron> squads;

    public Universo(String nombre, ArrayList<Escuadron> squads) {
        this.nombre = nombre;
        this.squads = squads;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<Escuadron> squads) {
        this.squads = squads;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", squads=" + squads + '}';
    }
    
    

}
