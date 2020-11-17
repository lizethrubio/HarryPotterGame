package ar.com.ada.online.second.HarryPotter;

import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo;
import ar.com.ada.online.second.HarryPotter.SubClass.Mago;
import ar.com.ada.online.second.HarryPotter.SubClass.Elfo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class Partida{

    Partida(){}
    public void inicioJuego(Scanner keyboard) {
        ArrayList<Hechizo> hechizosListP1 = new ArrayList<Hechizo>();
        ArrayList<Hechizo> hechizosListP2 = new ArrayList<Hechizo>();
        System.out.println(" Bienvenidos al Juego Harry Potter ");
        SetPartida partida = new SetPartida();
        partida.seleccionPersonaje(keyboard, hechizosListP1, hechizosListP2);

    }

}


