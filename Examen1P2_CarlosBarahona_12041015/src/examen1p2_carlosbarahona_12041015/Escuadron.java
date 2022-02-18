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
public class Escuadron {

    private String nombre;
    private String lugarBase;
    private Persona lider;
    private boolean HoV;
    private ArrayList<Persona> miembros;

    public Escuadron(String nombre, String lugarBase, Persona lider, boolean HoV, ArrayList<Persona> miembros) {
        this.nombre = nombre;
        this.lugarBase = lugarBase;
        this.lider = lider;
        this.HoV = HoV;
        this.miembros = miembros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarBase() {
        return lugarBase;
    }

    public void setLugarBase(String lugarBase) {
        this.lugarBase = lugarBase;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public boolean isHoV() {
        return HoV;
    }

    public void setHoV(boolean HoV) {
        this.HoV = HoV;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + ", lugarBase=" + lugarBase + ", lider=" + lider + ", HoV=" + HoV + ", miembros=" + miembros + '}';
    }

}
