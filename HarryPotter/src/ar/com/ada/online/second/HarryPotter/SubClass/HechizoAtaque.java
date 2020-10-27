package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizos;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

public class HechizoAtaque extends Hechizos {
    int dano; //Dano del Hechizo
    int danoTotal; //Dano + extras
    String ubicacionAtaque; //A, B o C
    Boolean magoBlanco; //true Blanco (xx ptos) false Oscuro (+10 ptos)
    Boolean elfoLibre; //true (+5 ptos) false(xx ptos)
    int danoVarita; //ptos de dano varita


    public void calcularDano(Personaje personajeAtacar) {
        int mago = 0;
        int elfo = 0;
        if (magoBlanco==false) mago= 10; //check
        if (elfoLibre) elfo= 5; //check

        if (personajeAtacar.getUbicacion()==ubicacionAtaque){
            danoTotal = dano + mago + elfo + danoVarita;
            danarPersonaje(personajeAtacar);
        }else{
            danoTotal = 0;
            danarPersonaje(personajeAtacar);
        }
    }

    public void danarPersonaje(Personaje personaje){
        int inicial = personaje.getVida();
        personaje.setVida( inicial + danoTotal);
    }

    public int getDanoVarita() {
        return danoVarita;
    }

    public void setDanoVarita(int danoVarita) {
        this.danoVarita = danoVarita;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setDanoTotal(int danoTotal) {
        this.danoTotal = danoTotal;
    }

    public int getDanoTotal() {
        return danoTotal;
    }

    public String getUbicacionAtaque() {
        return ubicacionAtaque;
    }

    public void setUbicacionAtaque(String ubicacionAtaque) {
        this.ubicacionAtaque = ubicacionAtaque;
    }

    public Boolean getMagoBlanco() {
        return magoBlanco;
    }

    public void setMagoBlanco(Boolean magoBlanco) {
        this.magoBlanco = magoBlanco;
    }

    public Boolean getElfoLibre() {
        return elfoLibre;
    }

    public void setElfoLibre(Boolean elfoLibre) {
        this.elfoLibre = elfoLibre;
    }
}
