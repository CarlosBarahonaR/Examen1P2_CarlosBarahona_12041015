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
public class Alien extends Persona {

    private String planeta;

    public Alien(String planeta, String nombre, String poder, String debilidad, String HoV, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, HoV, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public void ultimaOportunidad(Persona p1, Persona p2) {
        super.ultimaOportunidad(p1, p2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Alien{" + "planeta=" + planeta + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", HoV=" + HoV + ", fuerza=" + fuerza + ", habilidadMental=" + habilidadMental + ", habilidadFisica=" + habilidadFisica + ", tieneEscuadron=" + tieneEscuadron + '}';
    }

}
