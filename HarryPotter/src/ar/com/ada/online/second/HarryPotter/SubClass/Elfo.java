package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

import java.util.ArrayList;

public class Elfo extends Personaje {

    public Elfo() {
        super();
    }

    public Elfo(String name, Integer ubicacion, Integer vida, Integer energiaMagica, ArrayList hechizo) {
        super(name, ubicacion, vida, energiaMagica, hechizo);
    }

}
