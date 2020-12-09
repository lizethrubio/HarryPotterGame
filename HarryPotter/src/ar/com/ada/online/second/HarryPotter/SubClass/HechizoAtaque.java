package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

public class HechizoAtaque extends Hechizo {
    int dano; //Dano del Hechizo
    int danoTotal; //Dano + extras
    Integer ubicacionAtaque; //A, B o C
    Boolean magoBlanco; //true Blanco (xx ptos) false Oscuro (+10 ptos)
    Boolean elfoLibre; //true (+5 ptos) false(xx ptos)
    int danoVarita; //ptos de dano varita

        public HechizoAtaque (String name, Integer type,  Integer ptosEnergiaMagica,Integer dano) {
            super(name, type, ptosEnergiaMagica);
            this.dano = dano;
        }


    public Integer calcularDano(Personaje personaje) {
        danoTotal = dano;

        if (personaje instanceof Mago){
            danoTotal =danoTotal + ((Mago) personaje).getVarita().getPtosDano();
            if (personaje.isDarkOrFree()){
                danoTotal= danoTotal +10;
            }
        } else if (personaje.isDarkOrFree()){
            danoTotal = danoTotal+5;
        }

        return danoTotal;
    }

    public Personaje danarPersonaje(Personaje personaje, Personaje personajeAtacar){
            danoTotal = calcularDano(personaje);
        int inicial = personajeAtacar.getVida();
        personajeAtacar.setVida( inicial - danoTotal);

        return personajeAtacar;
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

    public Integer getUbicacionAtaque() {
        return ubicacionAtaque;
    }

    public void setUbicacionAtaque(Integer ubicacionAtaque) {
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
