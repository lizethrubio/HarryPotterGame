package ar.com.ada.online.second.HarryPotter.SuperClass;

public class Personaje {

    private String name;
    private String ubicacion;
    private Integer vida;
    private Integer energiaMagica;
    private String Hechizo;
    private Integer tipoPersonaje; //1. Mago 2.Elfo

    public Personaje(){};

    public Personaje(String name, String ubicacion, Integer vida, Integer energiaMagica, String hechizo) {
        this.name = name;
        this.ubicacion = ubicacion;
        this.vida = vida;
        this.energiaMagica = energiaMagica;
        Hechizo = hechizo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
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

    public String getHechizo() {
        return Hechizo;
    }

    public void setHechizo(String hechizo) {
        Hechizo = hechizo;
    }

    public void atacar() {

    }

    public void samar() {

    }

    public void recibirAtaque() {

    }

    public boolean estaVivo() {

        return true;
    }

    public void agregarHechizo() {
    }


    public String estadoDelPersonaje() {



        return null;
    }
}
