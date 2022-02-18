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
public class Mutante extends Persona {

    private ArrayList<String> FactoresMutantes;

    public Mutante(ArrayList<String> FactoresMutantes, String nombre, String poder, String debilidad, String HoV, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, HoV, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
        this.FactoresMutantes = FactoresMutantes;
    }

    public ArrayList<String> getFactoresMutantes() {
        return FactoresMutantes;
    }

    public void setFactoresMutantes(ArrayList<String> FactoresMutantes) {
        this.FactoresMutantes = FactoresMutantes;
    }

    @Override
    public void ultimaOportunidad(Persona p1, Persona p2) {

    }

    @Override
    public String toString() {
        return "Mutante{" + "FactoresMutantes=" + FactoresMutantes + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", HoV=" + HoV + ", fuerza=" + fuerza + ", habilidadMental=" + habilidadMental + ", habilidadFisica=" + habilidadFisica + ", tieneEscuadron=" + tieneEscuadron + '}';
    }

}
