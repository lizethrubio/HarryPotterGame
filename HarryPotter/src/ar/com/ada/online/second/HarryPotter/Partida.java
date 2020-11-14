package ar.com.ada.online.second.HarryPotter;

import ar.com.ada.online.second.HarryPotter.SubClass.Mago;
import ar.com.ada.online.second.HarryPotter.SubClass.Elfo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizos;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;
import java.util.Random;

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {

    Scanner keyboard = new Scanner(System.in);
    public void seleccionPersonaje (){
        System.out.println("Hola Jugador 1. \n Que tipo de personaje desea: \n\t 1. Mago \n\t 2. Elfo");
        int opt = keyboard.nextInt();
        switch (opt){
            case 1:
                Personaje jugador1 = new Mago();
                crearMago();
               break;
            case 2:
                Personaje jugador1 = new Elfo();
                crearElfo();
                break;
        }
        //seleccionar ubicacion
        //seleccionar hechizos
    }

    public void crearMago(){
        System.out.println("Elige tu mago deseado: \n\t 1. Harry Potter \n\t 2. Hermaioni \n\t 3. Voldemort \n\t 4. Ron");
        int opt = keyboard.nextInt();
        switch (opt){
            case 1:
                Personaje jugador1
                jugador1.setName("HarryPotter");
            case 2:
                jugador1.setName("Hermaioni");
            case 3:
                jugador1.setName("Voldemort");
            case 4:
                jugador1.setName("Ron");
        }

        seleccionarVarita();


    }

    public void crearElfo(){
        System.out.println("Elige tu elfo deseado: \n\t 1. Dobby \n\t 2. Hockey  \n\t 3. Winky \n\t 4. Kreacher");
        int opt = keyboard.nextInt();
        switch (opt){
            case 1:
                jugador1.setName("Dobby");
            case 2:
                jugador1.setName("Kreacher");
            case 3:
                jugador1.setName("Hokey");
            case 4:
                jugador1.setName("Winky");
        }

    }


    public void seleccionarVarita(){

        System.out.println( "Las varitas disponibles son: ");

        System.out.println( "1. Varita de Vid: " + "fabricada antes de 1991, tiene 27.3 cm de largo." +
                        " \t Puntos de dano: 10");

        System.out.println( "2. Varita de Sauco: " + "fabricada siglo XVIIII, mide 34.5 cm de largo." +
                " \t Puntos de dano: 12");

        System.out.println( "3. Varita de Espino: " + " se conoce desde 1991, mide 25 cm de largo." +
                " \t Puntos de dano: 8");

        System.out.println( "4. Varita de Tejo: " + "fabricada 1938, mide 34.25 cm de largo." +
                " \t Puntos de dano: 9");

        System.out.println( "--- Espere un momento, se esta seleccionando su varita--- ");
            Random random = new Random();
            int varita = random.nextInt(4);

            switch (varita){
                case 1: Varita Vid = new Varita ("Varita de Vid", 10, false);
                jugador1.

                case 2: Varita Sauco = new Varita ("Varita de Sauco", 12, false);

                case 3: Varita Espino = new Varita ("Varita de Espino", 8, false);

                case 4: Varita Tejo = new Varita ("Varita de Tejo", 9, false);
            }


    }



}
