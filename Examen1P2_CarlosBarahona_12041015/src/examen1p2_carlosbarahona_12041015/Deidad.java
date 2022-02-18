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
public class Deidad extends Persona {

    private boolean tieneCreyentes;
    private String religionMitologia;

    public Deidad(boolean tieneCreyentes, String religionMitologia, String nombre, String poder, String debilidad, String HoV, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, HoV, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
        this.tieneCreyentes = tieneCreyentes;
        this.religionMitologia = religionMitologia;
    }

    public boolean isTieneCreyentes() {
        return tieneCreyentes;
    }

    public void setTieneCreyentes(boolean tieneCreyentes) {
        this.tieneCreyentes = tieneCreyentes;
    }

    public String getReligionMitologia() {
        return religionMitologia;
    }

    public void setReligionMitologia(String religionMitologia) {
        this.religionMitologia = religionMitologia;
    }

    @Override
    public void ultimaOportunidad(Persona p1, Persona p2) {
        super.ultimaOportunidad(p1, p2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Deidad{" + "tieneCreyentes=" + tieneCreyentes + ", religionMitologia=" + religionMitologia + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", HoV=" + HoV + ", fuerza=" + fuerza + ", habilidadMental=" + habilidadMental + ", habilidadFisica=" + habilidadFisica + ", tieneEscuadron=" + tieneEscuadron + '}';
    }

}
