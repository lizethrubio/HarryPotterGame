package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizos;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

public class HechizoRecuperacion extends Hechizos{

    Integer recuperacion; //ptos recuperacion del hechizo
    Integer recuperacionTotal; //recuperacion del hechizo + extras
    Boolean magoBlanco; //true Blanco (+10ptos) false Oscuro
    Boolean elfoLibre; //true (+5ptos) false(0ptos)


    public void calcularRecuparacion(Personaje personaje) {
        int mago = 0;
        int elfo = 0;
        if ((magoBlanco)&& (personaje.getVida()<=35)){
            mago =10; // check
        }
        if (elfoLibre) elfo= 5; //check
        recuperacionTotal = recuperacion + mago + elfo;
        recuperarPersonaje(personaje);
    }


    public void recuperarPersonaje(Personaje personaje) {
        int inicial = personaje.getEnergiaMagica();
        personaje.setEnergiaMagica( inicial + recuperacionTotal);
    }

    public Integer getRecuperacion() {
        return recuperacion;
    }

    public void setRecuperacion(Integer recuperacion) {
        this.recuperacion = recuperacion;
    }

    public Integer getRecuperacionTotal() {
        return recuperacionTotal;
    }

    public void setRecuperacionTotal(Integer recuperacionTotal) {
        this.recuperacionTotal = recuperacionTotal;
    }

    public Boolean getElfoLibre() {
        return elfoLibre;
    }

    public void setElfoLibre(Boolean elfoLibre) {
        this.elfoLibre = elfoLibre;
    }

    public Boolean getMagoBlanco() {
        return magoBlanco;
    }

    public void setMagoBlanco(Boolean magoBlanco) {
        this.magoBlanco = magoBlanco;
    }
}
