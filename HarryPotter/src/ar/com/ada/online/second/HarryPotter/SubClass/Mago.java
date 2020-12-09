package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;
import ar.com.ada.online.second.HarryPotter.Varita;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Mago extends Personaje {


    private Varita varita;

    //    public Mago(String name, String ubicacion, Integer vida, Integer energiaMagica, String hechizo, String tipoDeMago, String varita) {
//        super(name, ubicacion, vida, energiaMagica, hechizo);
//        this.tipoDeMago = tipoDeMago;
//        this.varita = varita;
//    }

    public Mago(String name, Integer ubicacion, Integer vida, Integer energiaMagica, ArrayList hechizo, Integer tipoDeMago, Varita varita) {
        super(name, ubicacion, vida, energiaMagica, hechizo);
        this.varita = varita;
    }

    public Mago() {
        super();
    }


    public ArrayList<ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo> hechizosMago = new ArrayList<ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo>();


    public void setHechizosList(ArrayList<ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo> hechizosListP2) {
        this.hechizosMago = hechizosListP2;
    }

    public void esOscuroONo() {


    }


    public String varitaName() {
        return varita.getName();
    }
    public Varita getVarita() {
        return varita;
    }

    public void setVarita(Varita varita) {
        this.varita = varita;
    }
}
