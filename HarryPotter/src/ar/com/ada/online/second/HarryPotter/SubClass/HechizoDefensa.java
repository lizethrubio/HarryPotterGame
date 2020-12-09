package ar.com.ada.online.second.HarryPotter.SubClass;

import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

public class HechizoDefensa extends Hechizo {

    int sanacion; //max 20
    int sanacionTotal; //


    public HechizoDefensa (String name, Integer type,  Integer ptosEnergiaMagica,Integer sanacion) {
        super(name, type, ptosEnergiaMagica);
        this.sanacion = sanacion;
    }
    public int calcularSanacion(Personaje personaje){
        sanacionTotal =sanacion;
        if (personaje instanceof Elfo ){
            if (personaje.isDarkOrFree()) {
                sanacionTotal= sanacionTotal+ 5;
            }else   {
                sanacionTotal = sanacionTotal +10;}
        }else if (personaje instanceof Mago && personaje.isDarkOrFree()){
            sanacionTotal = sanacionTotal -10;
        }
        return sanacionTotal;
    }

    public Personaje sanarPersonaje(Personaje personaje){
        sanacionTotal = calcularSanacion(personaje);
       int vidaInicial = personaje.getVida();
       if ((vidaInicial+ sanacionTotal) < 100){
           personaje.setVida(vidaInicial+sanacionTotal);
        }else personaje.setVida(100);


    return personaje;
    }
}
