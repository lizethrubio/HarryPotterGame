package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizos;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

public class HechizoDefensa extends Hechizos {

    int sanacion; //max 20
    int sanacionTotal; //
    Boolean magoBlanco; //true Blanco (xx ptos) false Oscuro (xx ptos)
    Boolean elfoLibre; //true (+5ptos) false(+10 ptos)

    public void calcularSanacion(Personaje personaje){
        int mago = 0;
        int elfo = 0;
        if (magoBlanco) mago = 0; //Check
        if (elfoLibre) elfo = 5; else elfo =10; //Check
        sanacionTotal  = sanacion + mago +elfo;
        sanarPersonaje(personaje);
    }

    public void sanarPersonaje(Personaje personaje){
       int vidaInicial = personaje.getVida();
       personaje.setVida(vidaInicial+sanacionTotal);
    }
}
