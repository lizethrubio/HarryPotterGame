package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

public class HechizoRecuperacion extends Hechizo{

    Integer recuperacion; //ptos recuperacion del hechizo
    Integer recuperacionTotal; //recuperacion del hechizo + extras
    Boolean magoBlanco; //true Blanco (+10ptos) false Oscuro
    Boolean elfoLibre; //true (+5ptos) false(0ptos)


    public HechizoRecuperacion (String name, Integer type,  Integer ptosEnergiaMagica,Integer recuperacion) {
        super(name, type, ptosEnergiaMagica);
        this.recuperacion = recuperacion;
    }

    public Integer calcularRecuparacion(Personaje personaje) {
        recuperacionTotal = recuperacion;
        if (personaje instanceof Mago ){
            if (personaje.isDarkOrFree()==false & personaje.getVida()<35){
            recuperacionTotal= recuperacionTotal +10;
        }
        }else if (personaje.isDarkOrFree()){
            recuperacionTotal = recuperacionTotal + 5;
        }

        return recuperacionTotal;

    }


    public Personaje recuperarPersonaje(Personaje personaje) {
        recuperacionTotal = calcularRecuparacion(personaje);
        int inicial = personaje.getEnergiaMagica();
        if (inicial + recuperacionTotal < 100) {
            personaje.setEnergiaMagica(inicial + recuperacionTotal);
        } else{
            personaje.setEnergiaMagica(100);
        }
        return personaje;
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
