package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

public class Mago extends Personaje {

    private String tipoDeMago;
    private String varita;

    public Mago(String name, String ubicacion, Integer vida, Integer energiaMagica, String hechizo, String tipoDeMago, String varita) {
        super(name, ubicacion, vida, energiaMagica, hechizo);
        this.tipoDeMago = tipoDeMago;
        this.varita = varita;
    }

    public String getTipoDeMago() {
        return tipoDeMago;
    }

    public void setTipoDeMago(String tipoDeMago) {
        this.tipoDeMago = tipoDeMago;
    }

    public String getVarita() {
        return varita;
    }

    public void setVarita(String varita) {
        this.varita = varita;
    }
}
