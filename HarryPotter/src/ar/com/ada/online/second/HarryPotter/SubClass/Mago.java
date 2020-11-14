package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;
import ar.com.ada.online.second.HarryPotter.Varita;

public class Mago extends Personaje {

    private String tipoDeMago;
    private Varita varita;

    //    public Mago(String name, String ubicacion, Integer vida, Integer energiaMagica, String hechizo, String tipoDeMago, String varita) {
//        super(name, ubicacion, vida, energiaMagica, hechizo);
//        this.tipoDeMago = tipoDeMago;
//        this.varita = varita;
//    }

    public Mago(String name, Integer ubicacion, Integer vida, Integer energiaMagica, String hechizo, String tipoDeMago, Varita varita) {
        super(name, ubicacion, vida, energiaMagica, hechizo);
        this.tipoDeMago = tipoDeMago;
        this.varita = varita;
    }

    public Mago() {
        super();
    }

    public String getTipoDeMago() {
        return tipoDeMago;
    }

    public void setTipoDeMago(String tipoDeMago) {
        this.tipoDeMago = tipoDeMago;
    }

    public String getVarita() {
        return varita.getName();
    }

    public void setVarita(Varita varita) {
        this.varita = varita;
    }
}
