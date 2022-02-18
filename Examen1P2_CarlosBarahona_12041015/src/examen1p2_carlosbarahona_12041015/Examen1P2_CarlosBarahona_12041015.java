/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_carlosbarahona_12041015;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Examen1P2_CarlosBarahona_12041015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Persona> personas = new ArrayList();
         ArrayList<Universo> universo = new ArrayList();
        ArrayList<Escuadron> escuadron = new ArrayList();

        int opcion = 12;
        while (opcion != 0) {
            System.out.println("Bienvenido al Zoologico de Beyonder, ¿que desea hacer hoy?\n"
                    + "0) Salir\n"
                    + "1) Persona\n"
                    + "2) Escuadron\n"
                    + "3) Universo\n"
                    + "4) Simulacion"
            );
            opcion = s.nextInt();
            switch (opcion) {
                case 1: {

                    int opcion2 = 12;
                    while (opcion2 != 0) {
                        System.out.println("Bienvenido al menu de personas, ¿que desea hacer hoy?\n"
                                + "0) Salir\n"
                                + "1) Persona normal\n"
                                + "2) Mutante \n"
                                + "3) Super Humano\n"
                                + "4) Por Accidente Radioactivo\n"
                                + "5) Deidad\n"
                                + "6) Alien"
                        );
                        opcion2 = s.nextInt();
                        switch (opcion2) {
                            case 1: {
                                int opcion3 = 12;
                                while (opcion3 != 0) {
                                    System.out.println("Bienvenido al menu de personas, ¿que desea hacer hoy?\n"
                                            + "0) Salir\n"
                                            + "1) Crear Persona normal\n"
                                            + "2) Editar Persona normal \n"
                                            + "3) Listar Personas normales\n"
                                            + "4) Eliminar Personas normales"
                                    );
                                    opcion3 = s.nextInt();
                                    switch (opcion3) {
                                        case 1: {

                                            System.out.println("Ingrese el nombre de la persona normal");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int x = 0; x < personas.size(); x++) {
                                                String nombre2 = "";
                                                if (personas.get(x) instanceof Persona) {
                                                    nombre = ((Persona) personas.get(x)).getNombre();
                                                }
                                                while (nombre.equals(nombre2)) {
                                                    System.out.println("Ingrese el nombre de la persona normal");
                                                    nombre = s.nextLine();
                                                }
                                            }

                                            System.out.println("Ingrese el poder de la persona normal");

                                            String poder = s.nextLine();

                                            System.out.println("Ingrese la debilidad de la persona normal");

                                            String debilidad = s.nextLine();

                                            System.out.println("Ingrese la fuerza de la persona normal");

                                            int fuerza = s.nextInt();
                                            System.out.println("Ingrese la habilidad mental de la persona normal");

                                            int habilidadMental = s.nextInt();
                                            System.out.println("Ingrese la habilidad fisica de la persona normal");
                                            int habilidadFisica = r.nextInt();

                                            int total = fuerza + habilidadMental + habilidadFisica;
                                            System.out.println("Ingrese si es villano o heroe la persona normal");

                                            String profesion = s.nextLine();
                                            profesion = profesion.toLowerCase();

                                            if (total < 100 || total > 150) {
                                                System.out.println("No tiene lo que se ocupa para ser un " + profesion);
                                            } else {
                                                personas.add(new Normal(nombre, poder, debilidad, profesion, fuerza, habilidadMental, habilidadFisica, false));
                                            }

                                            break;
                                        }
                                        case 2: {

                                        }
                                        case 3: {

                                            for (int o = 0; o < personas.size(); o++) {
                                                if (personas.get(o) instanceof Normal) {
                                                    System.out.println(personas.get(o));

                                                }
                                            }

                                        }
                                        case 4: {
                                            System.out.println("Ingrese el nombre del normal para eliminarlo");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int y = 0; y < personas.size(); y++) {
                                                String nombre2 = "";
                                                if (personas.get(y) instanceof Normal) {
                                                    nombre2 = ((Normal) personas.get(y)).getNombre();
                                                }
                                                if (nombre.equals(nombre2)) {
                                                    personas.remove(y);
                                                    y = personas.size();
                                                } else {
                                                    y = personas.size();
                                                    System.out.println("No se encontro el nombre del normal en la lista. Consulte con el soporte tecnico de la pagina.");
                                                }
                                            }

                                        }
                                    }
                                }

                                break;
                            }
                            case 2: {
                                int opcion3 = 12;
                                while (opcion3 != 0) {
                                    System.out.println("Bienvenido al menu de mutantes, ¿que desea hacer hoy?\n"
                                            + "0) Salir\n"
                                            + "1) Crear Mutante\n"
                                            + "2) Editar Mutante \n"
                                            + "3) Listar Mutante\n"
                                            + "4) Eliminar Mutante"
                                    );
                                    opcion3 = s.nextInt();
                                    switch (opcion3) {
                                        case 1: {

                                            System.out.println("Ingrese el nombre del super Mutante");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int x = 0; x < personas.size(); x++) {
                                                String nombre2 = "";
                                                if (personas.get(x) instanceof Persona) {
                                                    nombre = ((Persona) personas.get(x)).getNombre();
                                                }
                                                while (nombre.equals(nombre2)) {
                                                    System.out.println("Ingrese el nombre del Mutante");
                                                    nombre = s.nextLine();
                                                }
                                            }

                                            System.out.println("Ingrese el poder del Mutante");

                                            String poder = s.nextLine();

                                            System.out.println("Ingrese la debilidad del Mutante");

                                            String debilidad = s.nextLine();

                                            System.out.println("Ingrese la fuerza del Mutante");

                                            int fuerza = s.nextInt();
                                            System.out.println("Ingrese la habilidad mental del Mutante");

                                            int habilidadMental = s.nextInt();
                                            System.out.println("Ingrese la habilidad fisica del Mutante");
                                            int habilidadFisica = r.nextInt();

                                            int total = fuerza + habilidadMental + habilidadFisica;
                                            ArrayList<String> factores = new ArrayList();

                                            System.out.println("Ingrese un factor mutante");
                                            String factor = s.nextLine();
                                            System.out.println("¿Desea agregar otro factor?");
                                            String respuesta = s.next();
                                            respuesta = respuesta.toLowerCase();
                                            factores.add(factor);
                                            while (!"no".equals(respuesta)) {
                                                System.out.println("Ingrese un factor mutante");
                                                factor = s.nextLine();
                                                System.out.println("¿Desea agregar otro factor?");
                                                respuesta = s.next();
                                                respuesta = respuesta.toLowerCase();
                                                factores.add(factor);
                                            }
                                            System.out.println("Ingrese si es heroe o villano la persona");
                                            String profesion = s.nextLine();
                                            profesion = profesion.toLowerCase();

                                            if (total < 100 || total > 150) {
                                                System.out.println("No tiene lo que se ocupa para ser un " + profesion);
                                            } else {
                                                personas.add(new Mutante(factores, nombre, poder, debilidad, profesion, fuerza, habilidadMental, habilidadFisica, false));
                                            }

                                            break;
                                        }
                                        case 2: {

                                        }
                                        case 3: {

                                            for (int o = 0; o < personas.size(); o++) {
                                                if (personas.get(o) instanceof Mutante) {
                                                    System.out.println(personas.get(o));

                                                }
                                            }

                                        }
                                        case 4: {
                                            System.out.println("Ingrese el nombre del mutante para eliminarlo");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int y = 0; y < personas.size(); y++) {
                                                String nombre2 = "";
                                                if (personas.get(y) instanceof Mutante) {
                                                    nombre2 = ((Mutante) personas.get(y)).getNombre();
                                                }
                                                if (nombre.equals(nombre2)) {
                                                    personas.remove(y);
                                                    y = personas.size();
                                                } else {
                                                    y = personas.size();
                                                    System.out.println("No se encontro el nombre del mutante en la lista. Consulte con el soporte tecnico de la pagina.");
                                                }
                                            }

                                        }
                                    }
                                }

                                break;
                            }
                            case 3: {
                                int opcion3 = 12;
                                while (opcion3 != 0) {
                                    System.out.println("Bienvenido al menu des, ¿que desea hacer hoy?\n"
                                            + "0) Salir\n"
                                            + "1) Crear Super humano\n"
                                            + "2) Editar Super humano \n"
                                            + "3) ListarSuper humano\n"
                                            + "4) Eliminar Super humano"
                                    );
                                    opcion3 = s.nextInt();
                                    switch (opcion3) {
                                        case 1: {

                                            System.out.println("Ingrese el nombre del super humano");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int x = 0; x < personas.size(); x++) {
                                                String nombre2 = "";
                                                if (personas.get(x) instanceof Persona) {
                                                    nombre = ((Persona) personas.get(x)).getNombre();
                                                }
                                                while (nombre.equals(nombre2)) {
                                                    System.out.println("Ingrese el nombre del super humano");
                                                    nombre = s.nextLine();
                                                }
                                            }

                                            System.out.println("Ingrese el poder del super humano");

                                            String poder = s.nextLine();

                                            System.out.println("Ingrese la debilidad del super humano");

                                            String debilidad = s.nextLine();

                                            System.out.println("Ingrese la fuerza del super humano");

                                            int fuerza = s.nextInt();
                                            System.out.println("Ingrese la habilidad mental del super humano");

                                            int habilidadMental = s.nextInt();
                                            System.out.println("Ingrese la habilidad fisica del super humano");
                                            int habilidadFisica = r.nextInt();

                                            int total = fuerza + habilidadMental + habilidadFisica;

                                            System.out.println("Ingrese el super poder del super humano");

                                            String superpoder = s.nextLine();

                                            System.out.println("Ingrese si es heroe o villano el alien");

                                            String profesion = s.nextLine();
                                            profesion = profesion.toLowerCase();

                                            if (total < 100 || total > 150) {
                                                System.out.println("No tiene lo que se ocupa para ser un" + profesion);
                                            } else {
                                                personas.add(new SuperHumano(superpoder, nombre, poder, debilidad, profesion, fuerza, habilidadMental, habilidadFisica, false));
                                            }

                                            break;
                                        }
                                        case 2: {

                                        }
                                        case 3: {

                                            for (int o = 0; o < personas.size(); o++) {
                                                if (personas.get(o) instanceof SuperHumano) {
                                                    System.out.println(personas.get(o));

                                                }
                                            }

                                        }
                                        case 4: {
                                            System.out.println("Ingrese el nombre del super humano para eliminarlo");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int y = 0; y < personas.size(); y++) {
                                                String nombre2 = "";
                                                if (personas.get(y) instanceof SuperHumano) {
                                                    nombre2 = ((SuperHumano) personas.get(y)).getNombre();
                                                }
                                                if (nombre.equals(nombre2)) {
                                                    personas.remove(y);
                                                    y = personas.size();
                                                } else {
                                                    y = personas.size();
                                                    System.out.println("No se encontro el nombre del super humano en la lista. Consulte con el soporte tecnico de la pagina.");
                                                }
                                            }

                                        }
                                    }
                                }

                                break;
                            }
                            case 4: {
                                int opcion3 = 12;
                                while (opcion3 != 0) {
                                    System.out.println("Bienvenido al menu des, ¿que desea hacer hoy?\n"
                                            + "0) Salir\n"
                                            + "1) Crear por acccidente radioactivo\n"
                                            + "2) Editar por acccidente radioactivo \n"
                                            + "3) Listar por acccidente radioactivo\n"
                                            + "4) Eliminar por acccidente radioactivo"
                                    );
                                    opcion3 = s.nextInt();
                                    switch (opcion3) {
                                        case 1: {

                                            System.out.println("Ingrese el nombre del por acccidente radioactivo");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int x = 0; x < personas.size(); x++) {
                                                String nombre2 = "";
                                                if (personas.get(x) instanceof Persona) {
                                                    nombre = ((Persona) personas.get(x)).getNombre();
                                                }
                                                while (nombre.equals(nombre2)) {
                                                    System.out.println("Ingrese el nombre del por acccidente radioactivo");
                                                    nombre = s.nextLine();
                                                }
                                            }

                                            System.out.println("Ingrese el poder del por acccidente radioactivo");

                                            String poder = s.nextLine();

                                            System.out.println("Ingrese la debilidad del por acccidente radioactivo");

                                            String debilidad = s.nextLine();

                                            System.out.println("Ingrese la fuerza del por acccidente radioactivo");

                                            int fuerza = s.nextInt();
                                            System.out.println("Ingrese la habilidad mental del por acccidente radioactivo");

                                            int habilidadMental = s.nextInt();
                                            System.out.println("Ingrese la habilidad fisica del por acccidente radioactivo");
                                            int habilidadFisica = r.nextInt();

                                            int total = fuerza + habilidadMental + habilidadFisica;

                                            System.out.println("Ingrese la edad al momento del accidente del por acccidente radioactivo");

                                            int edad = s.nextInt();

                                            System.out.println("Ingrese el tipo de accidente que tuvo el por acccidente radioactivo");

                                            String tipoAccidente = s.nextLine();
                                            System.out.println("Ingrese si es heroe o villano la persona");
                                            String profesion = s.nextLine();
                                            profesion = profesion.toLowerCase();
                                            if (total < 100 || total > 150) {
                                                System.out.println("No tiene lo que se ocupa para ser un " + profesion);
                                            } else {
                                                personas.add(new AccidenteRadioctivo(edad, tipoAccidente, nombre, poder, debilidad, profesion, fuerza, habilidadMental, habilidadFisica, false));
                                            }

                                            break;
                                        }
                                        case 2: {

                                        }
                                        case 3: {

                                            for (int o = 0; o < personas.size(); o++) {
                                                if (personas.get(o) instanceof AccidenteRadioctivo) {
                                                    System.out.println(personas.get(o));

                                                }
                                            }

                                        }
                                        case 4: {
                                            System.out.println("Ingrese el nombre del por accidente radioactivo para eliminarlo");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int y = 0; y < personas.size(); y++) {
                                                String nombre2 = "";
                                                if (personas.get(y) instanceof AccidenteRadioctivo) {
                                                    nombre2 = ((Normal) personas.get(y)).getNombre();
                                                }
                                                if (nombre.equals(nombre2)) {
                                                    personas.remove(y);
                                                    y = personas.size();
                                                } else {
                                                    y = personas.size();
                                                    System.out.println("No se encontro el nombre del por accidente radioactivo en la lista. Consulte con el soporte tecnico de la pagina.");
                                                }
                                            }

                                        }
                                    }
                                }

                                break;
                            }
                            case 5: {
                                int opcion3 = 12;
                                while (opcion3 != 0) {
                                    System.out.println("Bienvenido al menu des, ¿que desea hacer hoy?\n"
                                            + "0) Salir\n"
                                            + "1) Crear deidad\n"
                                            + "2) Editar deidad \n"
                                            + "3) Listar deidad\n"
                                            + "4) Eliminar deidad"
                                    );
                                    opcion3 = s.nextInt();
                                    switch (opcion3) {
                                        case 1: {

                                            System.out.println("Ingrese el nombre del deidad");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int x = 0; x < personas.size(); x++) {
                                                String nombre2 = "";
                                                if (personas.get(x) instanceof Persona) {
                                                    nombre = ((Persona) personas.get(x)).getNombre();
                                                }
                                                while (nombre.equals(nombre2)) {
                                                    System.out.println("Ingrese el nombre del deidad");
                                                    nombre = s.nextLine();
                                                }
                                            }

                                            System.out.println("Ingrese el poder del deidad");

                                            String poder = s.nextLine();

                                            System.out.println("Ingrese la debilidad del deidad");

                                            String debilidad = s.nextLine();

                                            System.out.println("Ingrese la fuerza del deidad");

                                            int fuerza = s.nextInt();
                                            System.out.println("Ingrese la habilidad mental del deidad");

                                            int habilidadMental = s.nextInt();
                                            System.out.println("Ingrese la habilidad fisica del deidad");
                                            int habilidadFisica = r.nextInt();

                                            int total = fuerza + habilidadMental + habilidadFisica;

                                            System.out.println("Ingrese si tiene creyentes el deidad");

                                            String respuesta = s.next();
                                            respuesta = respuesta.toLowerCase();

                                            boolean creyentes = "si".equals(respuesta);

                                            System.out.println("Ingrese la religion o mitologia del deidad");

                                            String religionMitologia = s.nextLine();

                                            System.out.println("Ingrese si es heroe o villano la deidad");

                                            String profesion = s.nextLine();
                                            profesion = profesion.toLowerCase();

                                            if (total < 100 || total > 150) {
                                                System.out.println("No tiene lo que se ocupa para ser un " + profesion);
                                            } else {
                                                personas.add(new Deidad(creyentes, religionMitologia, nombre, poder, debilidad, profesion, fuerza, habilidadMental, habilidadFisica, false));
                                            }

                                            break;
                                        }
                                        case 2: {

                                        }
                                        case 3: {

                                            for (int o = 0; o < personas.size(); o++) {
                                                if (personas.get(o) instanceof Deidad) {
                                                    System.out.println(personas.get(o));

                                                }
                                            }

                                        }
                                        case 4: {
                                            System.out.println("Ingrese el nombre del deidad para eliminarlo");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int y = 0; y < personas.size(); y++) {
                                                String nombre2 = "";
                                                if (personas.get(y) instanceof Deidad) {
                                                    nombre2 = ((Deidad) personas.get(y)).getNombre();
                                                }
                                                if (nombre.equals(nombre2)) {
                                                    personas.remove(y);
                                                    y = personas.size();
                                                } else {
                                                    y = personas.size();
                                                    System.out.println("No se encontro el nombre del deidad en la lista. Consulte con el soporte tecnico de la pagina.");
                                                }
                                            }

                                        }
                                    }
                                }

                                break;
                            }
                            case 6: {
                                int opcion3 = 12;
                                while (opcion3 != 0) {
                                    System.out.println("Bienvenido al menu des, ¿que desea hacer hoy?\n"
                                            + "0) Salir\n"
                                            + "1) Crear alien\n"
                                            + "2) Editar alien \n"
                                            + "3) Listar alien\n"
                                            + "4) Eliminar alien"
                                    );
                                    opcion3 = s.nextInt();
                                    switch (opcion3) {
                                        case 1: {

                                            System.out.println("Ingrese el nombre del alien");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int x = 0; x < personas.size(); x++) {
                                                String nombre2 = "";
                                                if (personas.get(x) instanceof Persona) {
                                                    nombre = ((Persona) personas.get(x)).getNombre();
                                                }
                                                while (nombre.equals(nombre2)) {
                                                    System.out.println("Ingrese el nombre del alien");
                                                    nombre = s.nextLine();
                                                }
                                            }

                                            System.out.println("Ingrese el poder del alien");

                                            String poder = s.nextLine();

                                            System.out.println("Ingrese la debilidad del alien");

                                            String debilidad = s.nextLine();

                                            System.out.println("Ingrese la fuerza del alien");

                                            int fuerza = s.nextInt();
                                            System.out.println("Ingrese la habilidad mental del alien");

                                            int habilidadMental = s.nextInt();
                                            System.out.println("Ingrese la habilidad fisica del alien");
                                            int habilidadFisica = r.nextInt();

                                            int total = fuerza + habilidadMental + habilidadFisica;

                                            System.out.println("Ingrese el planeta del alien");

                                            String planeta = s.nextLine();

                                            System.out.println("Ingrese si es heroe o villano el alien");

                                            String profesion = s.nextLine();
                                            profesion = profesion.toLowerCase();

                                            if (total < 100 || total > 150) {
                                                System.out.println("No tiene lo que se ocupa para ser un " + profesion);
                                            } else {
                                                personas.add(new Alien(planeta, nombre, poder, debilidad, profesion, fuerza, habilidadMental, habilidadFisica, false));
                                            }

                                            break;
                                        }
                                        case 2: {

                                        }
                                        case 3: {

                                            for (int o = 0; o < personas.size(); o++) {
                                                if (personas.get(o) instanceof Alien) {
                                                    System.out.println(personas.get(o));

                                                }
                                            }

                                        }
                                        case 4: {
                                            System.out.println("Ingrese el nombre del alien para eliminarlo");
                                            s.nextLine();
                                            String nombre = s.nextLine();
                                            for (int y = 0; y < personas.size(); y++) {
                                                String nombre2 = "";
                                                if (personas.get(y) instanceof Alien) {
                                                    nombre2 = ((Alien) personas.get(y)).getNombre();
                                                }
                                                if (nombre.equals(nombre2)) {
                                                    personas.remove(y);
                                                    y = personas.size();
                                                } else {
                                                    y = personas.size();
                                                    System.out.println("No se encontro el nombre del alien en la lista. Consulte con el soporte tecnico de la pagina.");
                                                }
                                            }

                                        }
                                    }
                                }

                                break;
                            }
                        }
                    }
                    break;
                }

                case 2: {
                    int opcion3 = 12;
                    while (opcion3 != 0) {
                        System.out.println("Bienvenido al menu de escuadron, ¿que desea hacer hoy?\n"
                                + "0) Salir\n"
                                + "1) Crear escuadron\n"
                                + "2) Editar escuadron \n"
                                + "3) Listar escuadron\n"
                                + "4) Eliminar escuadron"
                        );
                        opcion3 = s.nextInt();
                        switch (opcion3) {
                            case 1: {

                                System.out.println("Ingrese el nombre del escuadron");
                                s.nextLine();
                                String nombre = s.nextLine();
                                for (int x = 0; x < escuadron.size(); x++) {
                                    String nombre2 = "";
                                    if (escuadron.get(x) instanceof Escuadron) {
                                        nombre = ((Escuadron) escuadron.get(x)).getNombre();
                                    }
                                    while (nombre.equals(nombre2)) {
                                        System.out.println("Ingrese el nombre del escuadron");
                                        nombre = s.nextLine();
                                    }
                                }

                                System.out.println("Ingrese el lugar de base del escuadron");

                                String lugar = s.nextLine();

                                System.out.println("Ingrese el nombre del lider del escuadron");

                                String nombreLider = s.nextLine();
                                Persona lider = null;

                                for (int x = 0; x < personas.size(); x++) {
                                    if (personas.get(x).getNombre().equals(nombreLider)) {
                                        lider = personas.get(x);
                                    }

                                }

                                System.out.println("Ingrese si es heroe o villano el escuadron");
                                String profesion = s.nextLine();
                                profesion = profesion.toLowerCase();
                                boolean profesionEscuadron = "heroe".equals(profesion);

                                ArrayList<Persona> miembros = new ArrayList();

                                escuadron.add(new Escuadron(nombre, lugar, lider, profesionEscuadron, miembros));

                                break;
                            }
                            case 2: {

                            }
                            case 3: {

                                for (int o = 0; o < universo.size(); o++) {
                                    if (escuadron.get(o) instanceof Escuadron) {
                                        System.out.println(escuadron.get(o));

                                    }
                                }

                            }
                            case 4: {
                                System.out.println("Ingrese el nombre del escuadron para eliminarlo");
                                s.nextLine();
                                String nombre = s.nextLine();
                                for (int y = 0; y < escuadron.size(); y++) {
                                    String nombre2 = "";
                                    if (escuadron.get(y) instanceof Escuadron) {
                                        nombre2 = ((Escuadron) escuadron.get(y)).getNombre();
                                    }
                                    if (nombre.equals(nombre2)) {
                                        
                                        escuadron.remove(y);
                                        y = escuadron.size();
                                    } else {
                                        y = escuadron.size();
                                        System.out.println("No se encontro el nombre del escuadron en la lista. Consulte con el soporte tecnico de la pagina.");
                                    }
                                }

                            }
                        }
                    }

                    break;
                }
                case 3: {
                    int opcion3 = 12;
                    while (opcion3 != 0) {
                        System.out.println("Bienvenido al menu de universos, ¿que desea hacer hoy?\n"
                                + "0) Salir\n"
                                + "1) Crear universo\n"
                                + "2) Editar universo \n"
                                + "3) Listar universos\n"
                                + "4) Eliminar universo"
                        );
                        opcion3 = s.nextInt();
                        switch (opcion3) {
                            case 1: {

                                System.out.println("Ingrese el nombre del universo");
                                s.nextLine();
                                String nombre = s.nextLine();
                                for (int x = 0; x < universo.size(); x++) {
                                    String nombre2 = "";
                                    if (universo.get(x) instanceof Universo) {
                                        nombre = ((Universo) universo.get(x)).getNombre();
                                    }
                                    while (nombre.equals(nombre2)) {
                                        System.out.println("Ingrese el nombre del universo");
                                        nombre = s.nextLine();
                                    }
                                }

                                ArrayList<Escuadron> squads = new ArrayList();

                             

                                universo.add(new Universo(nombre, squads));

                                break;
                            }
                            case 2: {

                            }
                            case 3: {

                                for (int o = 0; o < universo.size(); o++) {
                                    if (universo.get(o) instanceof Universo) {
                                        System.out.println(escuadron.get(o));

                                    }
                                }

                            }
                            case 4: {
                                System.out.println("Ingrese el nombre del universo para eliminarlo");
                                s.nextLine();
                                String nombre = s.nextLine();
                                for (int y = 0; y < escuadron.size(); y++) {
                                    String nombre2 = "";
                                    if (universo.get(y) instanceof Universo) {
                                        nombre2 = ((Universo) universo.get(y)).getNombre();
                                    }
                                    if (nombre.equals(nombre2)) {
                                        universo.remove(y);
                                        y = universo.size();
                                    } else {
                                        y = universo.size();
                                        System.out.println("No se encontro el nombre del universo en la lista. Consulte con el soporte tecnico de la pagina.");
                                    }
                                }

                            }
                        }
                    }

                    break;

                }

            }
        }

    }
}
