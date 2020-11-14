package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

public class Elfo extends Personaje {

    private String tipoDeElfo;

    public Elfo() {
        super();
    }

    public Elfo(String name, String ubicacion, Integer vida, Integer energiaMagica, String hechizo, String tipoDeElfo) {
        super(name, ubicacion, vida, energiaMagica, hechizo);
        this.tipoDeElfo = tipoDeElfo;
    }

    public String getTipoDeElfo() {
        return tipoDeElfo;
    }

    public void setTipoDeElfo(String tipoDeElfo) {
        this.tipoDeElfo = tipoDeElfo;
    }
}
