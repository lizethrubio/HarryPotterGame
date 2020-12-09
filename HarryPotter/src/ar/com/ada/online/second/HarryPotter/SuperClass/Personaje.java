package ar.com.ada.online.second.HarryPotter.SuperClass;

import ar.com.ada.online.second.HarryPotter.SubClass.HechizoAtaque;

import java.util.ArrayList;

public class Personaje {

    private String name;
    private Integer Location; //1. A - 2. B - 3. C
    private Integer vida;
    private Integer energiaMagica;
    public ArrayList<Hechizo> hechizo; // esto es una lista, no un string (camelCase recuerda)
    private Integer tipoPersonaje; //1. Mago 2.Elfo
    private Boolean dark; //1. Dark Wizard or Free Elf 0. No.

    public Personaje(){};

    public Personaje(String name, Integer Location, Integer vida, Integer energiaMagica, ArrayList hechizo) {
        this.name = name;
        this.Location = Location;
        this.vida = vida;
        this.energiaMagica = energiaMagica;
        hechizo = hechizo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLocation() {
        return Location;
    }

    public void setLocation(int ubicacion) {
        this.Location = ubicacion;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(Integer energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public ArrayList getHechizo() {
        return hechizo;
    }

    public void setHechizo(ArrayList hechizo) {
        this.hechizo = hechizo;
    }

    public void setDark() {
        this.dark = isDarkOrFree();
    }

    public Boolean getDark() {
        return dark;
    }

    public void atacar() {

    }

    public void samar() {

    }

    public void recibirAtaque() {

    }

    public boolean estaVivo() {
        if (vida<=0){
            return false;
        }else return true;
    }

    public void agregarHechizo() {
    }


    public String estadoDelPersonaje() {



        return null;
    }

    public Boolean isDarkOrFree() {
        Integer count = 0;
        for (Hechizo hechizo: hechizo) {
            if (hechizo instanceof HechizoAtaque) count++;
        }

        return count > 3;
    }
}
