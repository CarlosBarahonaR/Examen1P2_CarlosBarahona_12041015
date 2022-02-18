/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_carlosbarahona_12041015;

/**
 *
 * @author Admin
 */
public class Persona {

    public String nombre;
    public String poder;
    public String debilidad;
    public String HoV;
    public int fuerza;
    public int habilidadMental;
    public int habilidadFisica;
    public boolean tieneEscuadron;

    public Persona(String nombre, String poder, String debilidad, String HoV, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.HoV = HoV;
        this.fuerza = fuerza;
        this.habilidadMental = habilidadMental;
        this.habilidadFisica = habilidadFisica;
        this.tieneEscuadron = tieneEscuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHoV() {
        return HoV;
    }

    public void setHoV(String HoV) {
        this.HoV = HoV;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getHabilidadMental() {
        return habilidadMental;
    }

    public void setHabilidadMental(int habilidadMental) {
        this.habilidadMental = habilidadMental;
    }

    public int getHabilidadFisica() {
        return habilidadFisica;
    }

    public void setHabilidadFisica(int habilidadFisica) {
        this.habilidadFisica = habilidadFisica;
    }

    public boolean isTieneEscuadron() {
        return tieneEscuadron;
    }

    public void setTieneEscuadron(boolean tieneEscuadron) {
        this.tieneEscuadron = tieneEscuadron;
    }

    public void ultimaOportunidad(Persona p1, Persona p2) {

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", HoV=" + HoV + ", fuerza=" + fuerza + ", habilidadMental=" + habilidadMental + ", habilidadFisica=" + habilidadFisica + ", tieneEscuadron=" + tieneEscuadron + '}';
    }

}
