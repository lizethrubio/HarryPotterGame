package ar.com.ada.online.second.HarryPotter;

import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

import java.util.Scanner;

public class Partida {
    Personaje jugador1 = new Personaje;
    Personaje jugador2 = new Personaje;
    //seleccion de personaje

    Scanner keyboard = new Scanner(System.in);
    public void seleccionPersonaje (){
        System.out.println('Que tipo de personaje desea: \n\t 1. Mago \n\t 2. Elfo');
        int opt = keyboard.nextInt();
        switch (opt){
            case 1:
                crearMago();
            case 2:
                crearElfo();
        }
        //seleccionar ubicacion
        //seleccionar hechizos
    }

    public void crearMago(){
        System.out.println("Elige tu mago deseado: \n\t 1. Harry Potter \n\t 2. Hermaioni \n\t 3. Voldemort \n\t 4. Ron");
        int opt = keyboard.nextInt();
        switch (opt){
            case 1:
                jugador1.setName("HarryPotter");
            case 2:
                jugador1.setName("Hermaioni");
            case 3:
                jugador1.setName("Voldemort");
            case 4:
                jugador1.setName("Ron");
        }

    }

    public void crearElfo(){
        System.out.println("Elige tu elfo deseado: \n\t 1. Dobby \n\t 2. Hockey  \n\t 3. Winky \n\t 4. Kreacher");
        int opt = keyboard.nextInt();
        switch (opt){
            case 1:
                jugador1.setName("Dobby");
            case 2:
                jugador1.setName("");
            case 3:
                jugador1.setName("");
            case 4:
                jugador1.setName("");
        }

    }



}
