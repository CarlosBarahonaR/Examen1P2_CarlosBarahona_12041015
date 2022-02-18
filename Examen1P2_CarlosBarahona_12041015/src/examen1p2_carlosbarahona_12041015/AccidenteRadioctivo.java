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
public class AccidenteRadioctivo extends Persona {

    private int edadAlMomento;
    private String tipoAccidente;

    public AccidenteRadioctivo(int edadAlMomento, String tipoAccidente, String nombre, String poder, String debilidad, String HoV, int fuerza, int habilidadMental, int habilidadFisica, boolean tieneEscuadron) {
        super(nombre, poder, debilidad, HoV, fuerza, habilidadMental, habilidadFisica, tieneEscuadron);
        this.edadAlMomento = edadAlMomento;
        this.tipoAccidente = tipoAccidente;
    }

    public int getEdadAlMomento() {
        return edadAlMomento;
    }

    public void setEdadAlMomento(int edadAlMomento) {
        this.edadAlMomento = edadAlMomento;
    }

    public String getTipoAccidente() {
        return tipoAccidente;
    }

    public void setTipoAccidente(String tipoAccidente) {
        this.tipoAccidente = tipoAccidente;
    }

    @Override
    public void ultimaOportunidad(Persona p1, Persona p2) {

    }

    @Override
    public String toString() {
        return "AccidenteRadioctivo{" + "edadAlMomento=" + edadAlMomento + ", tipoAccidente=" + tipoAccidente + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", HoV=" + HoV + ", fuerza=" + fuerza + ", habilidadMental=" + habilidadMental + ", habilidadFisica=" + habilidadFisica + ", tieneEscuadron=" + tieneEscuadron + '}';
    }

}
