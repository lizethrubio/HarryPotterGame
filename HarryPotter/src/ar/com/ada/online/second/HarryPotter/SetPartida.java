package ar.com.ada.online.second.HarryPotter;

import ar.com.ada.online.second.HarryPotter.SubClass.Elfo;
import ar.com.ada.online.second.HarryPotter.SubClass.Mago;
import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SetPartida {


    public void seleccionPersonaje(Scanner keyboard, ArrayList hechizosListP1, ArrayList hechizosListP2) {

        System.out.println("Hola Jugador 1. \n Que tipo de personaje desea: \n\t 1. Mago \n\t 2. Elfo");
        int opt = keyboard.nextInt();
        if (opt == 1) {
            Mago jugador1 = new Mago();
            crearMago(jugador1, keyboard);
            jugador1.setUbicacion(seleccionarUbicacion(keyboard));
            seleccionarHechizos(hechizosListP1, keyboard);
        } else if (opt == 2) {
            Elfo jugador1 = new Elfo();
            crearElfo(jugador1, keyboard);
            seleccionarUbicacion(keyboard);
            jugador1.setUbicacion(seleccionarUbicacion(keyboard));
            seleccionarHechizos(hechizosListP1, keyboard);
        } else {
            System.out.println("Tipo de personaje no vailido");
        }


        System.out.println("Hola Jugador 2. \n Que tipo de personaje desea: \n\t 1. Mago \n\t 2. Elfo");
        int opt1 = keyboard.nextInt();
        if (opt1 == 1) {
            Mago jugador2 = new Mago();
            crearMago(jugador2, keyboard);
            jugador2.setUbicacion(seleccionarUbicacion(keyboard));
            seleccionarHechizos(hechizosListP2, keyboard);
        }
        if (opt1 == 2) {
            Elfo jugador2 = new Elfo();
            crearElfo(jugador2, keyboard);
            jugador2.setUbicacion(seleccionarUbicacion(keyboard));
            seleccionarHechizos(hechizosListP2, keyboard);
        } else {
            System.out.println("Tipo de personaje no vailido");
        }

    }


    public void crearMago(Mago jugador, Scanner keyboard) {
        System.out.println("Elige tu mago deseado: \n\t 1. Harry Potter \n\t 2. Hermaioni \n\t 3. Voldemort \n\t 4. Ron");
        int opt = keyboard.nextInt();
        switch (opt) {
            case 1:
                jugador.setName("HarryPotter");
                System.out.println("Tu personaje es: " + jugador.getName());
                break;
            case 2:
                jugador.setName("Hermaioni");
                System.out.println("Tu personaje es: " + jugador.getName());
                break;
            case 3:
                jugador.setName("Voldemort");
                System.out.println("Tu personaje es: " + jugador.getName());
                break;
            case 4:
                jugador.setName("Ron");
                System.out.println("Tu personaje es: " + jugador.getName());
                break;
        }
        seleccionarVarita(jugador, keyboard);
    }


    public void crearElfo(Personaje jugador, Scanner keyboard) {
        System.out.println("Elige tu elfo deseado: \n\t 1. Dobby \n\t 2. Hockey  \n\t 3. Winky \n\t 4. Kreacher");
        int opt = keyboard.nextInt();
        switch (opt) {
            case 1:
                jugador.setName("Dobby");
                System.out.println("Tu personaje es: " + jugador.getName());
                break;
            case 2:
                jugador.setName("Kreacher");
                System.out.println("Tu personaje es: " + jugador.getName());
                break;
            case 3:
                jugador.setName("Hokey");
                System.out.println("Tu personaje es: " + jugador.getName());
                break;
            default:
                jugador.setName("Winky");
                System.out.println("Tu personaje es: " + jugador.getName());
                break;
        }
    }


    public void seleccionarVarita(Mago jugador, Scanner keyboard) {
        System.out.println("Las varitas disponibles son: ");
        System.out.println("1. Varita de Vid: " + "fabricada antes de 1991, tiene 27.3 cm de largo." +
                " \t Puntos de dano: 10");
        System.out.println("2. Varita de Sauco: " + "fabricada siglo XVIIII, mide 34.5 cm de largo." +
                " \t Puntos de dano: 12");
        System.out.println("3. Varita de Espino: " + " se conoce desde 1991, mide 25 cm de largo." +
                " \t Puntos de dano: 8");
        System.out.println("4. Varita de Tejo: " + "fabricada 1938, mide 34.25 cm de largo." +
                " \t Puntos de dano: 9");
        System.out.println("--- Espere un momento, se esta seleccionando su varita--- ");
        Random random = new Random();
        int varitaNum = random.nextInt(4);
        switch (varitaNum) {
            case 1:
                Varita vid = new Varita("Varita de Vid", 10, false);
                jugador.setVarita(vid);
                System.out.println(jugador.getVarita());
                break;
            case 2:
                Varita sauco = new Varita("Varita de Sauco", 12, false);
                jugador.setVarita(sauco);
                System.out.println(jugador.getVarita());
                break;
            case 3:
                Varita espino = new Varita("Varita de Espino", 8, false);
                jugador.setVarita(espino);
                System.out.println(jugador.getVarita());
                break;
            default:
                Varita tejo = new Varita("Varita de Tejo", 9, false);
                jugador.setVarita(tejo);
                System.out.println(jugador.getVarita());
                break;
        }

    }


    public int seleccionarUbicacion(Scanner keyboard) {
        System.out.println("Introduzca su ubicacion inicial: " +
                "\t \n 1. A " +
                "\t \n 2. B " +
                "\t \n 3. C ");
        int ubicacion = keyboard.nextInt();
        if (ubicacion == 1 || ubicacion == 2 || ubicacion == 3) {
            return ubicacion;
        } else System.out.println("ubicacion invalida");
        return ubicacion;
    }


    public void seleccionarHechizos(ArrayList hechizosListP, Scanner keyboard) {
        System.out.println("\t\tEstos son los hechizos posibles:" +
                "\t\t\n\n ---ATAQUE---");
        System.out.println("1. Avada Kedavra, ptos Energia Magica Requeridos: 90, ptos Dano: 100");
        System.out.println("2. Imperius, ptos Energia Magica Requeridos: 80, ptos Dano: 90");
        System.out.println("3. Cruciatus, ptos Energia Magica Requeridos: 70, ptos Dano: 80");
        System.out.println("4. Expecto Patronum, ptos Energia Magica Requeridos: 15, ptos Dano: 25");
        System.out.println("5. Expelliarmus, ptos Energia Magica Requeridos: 10, ptos Dano: 20");
        System.out.println("6. Windgardium Leviosa, ptos Energia Magica Requeridos: 5, ptos Dano: 15");

        System.out.println("\t\n\n ---RECUPERACION---");
        System.out.println("7. Anapneo, ptos Energia Magica Requeridos: 8, ptos Energia recuperados: 15");
        System.out.println("8. Episkey, ptos Energia Magica Requeridos: 7, ptos Energia recuperados:: 12");
        System.out.println("9. Ferula, ptos Energia Magica Requeridos: 5, ptos Energia recuperados: 10");
        System.out.println("10. Reparifors, ptos Energia Magica Requeridos: 4, ptos Energia recuperados: 8");
        System.out.println("11. Tergeo, ptos Energia Magica Requeridos: 3, ptos Energia recuperados: 6");
        System.out.println("12. Vulnera Sanentur, ptos Energia Magica Requeridos: 2, ptos Energia recuperados: 5");


        System.out.println("\t\n\n ---DEFENSA---");
        System.out.println("13. AguitaCaliente, ptos Energia Magica Requeridos: 10, ptos Energia recuperados: 20");
        System.out.println("14. TeDeLimon, ptos Energia Magica Requeridos: 8, ptos Energia recuperados:: 15");
        System.out.println("15. Guiso de Gallina, ptos Energia Magica Requeridos: 7, ptos Energia recuperados: 12");
        System.out.println("16. Siesta en el Sofa, ptos Energia Magica Requeridos: 5, ptos Energia recuperados: 10");
        System.out.println("17. Mate, ptos Energia Magica Requeridos: 4, ptos Energia recuperados: 8");
        System.out.println("18. Tarde de Spa, ptos Energia Magica Requeridos: 3, ptos Energia recuperados: 6");


        System.out.println("\n\n\nEscoge seis hechizos e introduce sus numeros: ");
        System.out.print("\t Primer: ");
        int hechizoUno = keyboard.nextInt();
        agregarHechizo(hechizoUno, hechizosListP);
        System.out.print("\t Segundo: ");

        int hechizoDos = keyboard.nextInt();

        agregarHechizo(hechizoDos, hechizosListP);

        System.out.print("\t Tercero: ");

        int hechizoTres = keyboard.nextInt();

        agregarHechizo(hechizoTres, hechizosListP);

        System.out.print("\t Cuarto: ");

        int hechizoCuatro = keyboard.nextInt();

        agregarHechizo(hechizoCuatro, hechizosListP);

        System.out.print("\t Quinto: ");

        int hechizoCinco = keyboard.nextInt();

        agregarHechizo(hechizoCinco, hechizosListP);

        System.out.print("\t Sexto: ");

        int hechizoSeis = keyboard.nextInt();

        agregarHechizo(hechizoSeis, hechizosListP);

    }


    public static void agregarHechizo(Integer seleccion, ArrayList hechizosListP) {

        Hechizo hechizo;
        switch (seleccion) {

            case 1:
                hechizo = new Hechizo("Avada Kedavra", 1, 90);
                hechizo.setPtosDanos(100);
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 2:
                hechizo = new Hechizo("Imperius", 1, 80);
                hechizo.ptosDanos = 90;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                System.out.println(hechizo.getName());
                break;
            case 3:
                hechizo = new Hechizo("Cruciatus", 1, 70);
                hechizo.ptosDanos = 80;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 4:
                hechizo = new Hechizo("Expecto Patronum", 1, 15);
                hechizo.ptosDanos = 25;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 5:
                hechizo = new Hechizo("Expelliarmus", 1, 10);
                hechizo.ptosDanos = 20;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 6:
                hechizo = new Hechizo("Windgardium Leviosa", 1, 5);
                hechizo.ptosDanos = 15;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 7:
                hechizo = new Hechizo("Anapneo", 3, 8);
                hechizo.ptosEnergiaMagicaRecuperados = 15;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 8:
                hechizo = new Hechizo("Episkey", 3, 7);
                hechizo.ptosEnergiaMagicaRecuperados = 12;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 9:
                hechizo = new Hechizo("Ferula", 3, 5);
                hechizo.ptosEnergiaMagicaRecuperados = 10;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 10:
                hechizo = new Hechizo("Reparifors", 3, 4);
                hechizo.ptosEnergiaMagicaRecuperados = 8;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 11:
                hechizo = new Hechizo("Tergeo", 3, 3);
                hechizo.ptosEnergiaMagicaRecuperados = 6;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 12:
                hechizo = new Hechizo("Vulnera Sanentur", 3, 2);
                hechizo.ptosEnergiaMagicaRecuperados = 5;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 13:
                hechizo = new Hechizo("AguitaCaliente", 2, 10);
                hechizo.ptosVida = 20;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 14:
                hechizo = new Hechizo("TeDeLimon", 2, 8);
                hechizo.ptosVida = 15;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 15:
                hechizo = new Hechizo("Guiso de Gallina", 2, 7);
                hechizo.ptosVida = 12;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 16:
                hechizo = new Hechizo("Siesta en el Sofa", 2, 5);
                hechizo.ptosVida = 10;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 17:
                hechizo = new Hechizo("Mate", 2, 4);
                hechizo.ptosVida = 8;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 18:
                hechizo = new Hechizo("Tarde de Spa", 2, 3);
                hechizo.ptosVida = 6;
                hechizosListP.add(hechizo);
                System.out.println(hechizo.getName());
                break;
        }


    }


}
