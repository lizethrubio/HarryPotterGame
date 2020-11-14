package ar.com.ada.online.second.HarryPotter;

import ar.com.ada.online.second.HarryPotter.SubClass.Mago;
import ar.com.ada.online.second.HarryPotter.SubClass.Elfo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizos;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Hechizos> hechizosListP1 = new ArrayList<Hechizos>();
        ArrayList<Hechizos> hechizosListP2 = new ArrayList<Hechizos>();
        System.out.println(" Bienvenidos al Juego Harry Potter ");
        seleccionPersonaje(keyboard, hechizosListP1, hechizosListP2);
        System.out.println("Fin de juego");

    }

    public static void seleccionPersonaje(Scanner keyboard, ArrayList hechizosListP1, ArrayList hechizosListP2){
        System.out.println("Hola Jugador 1. \n Que tipo de personaje desea: \n\t 1. Mago \n\t 2. Elfo");
        int opt = keyboard.nextInt();
        if (opt == 1) {
            Mago jugador1 = new Mago();
            crearMago(jugador1, keyboard);
            jugador1.setUbicacion(seleccionarUbicacion(keyboard));
            seleccionarHechizos(hechizosListP1, keyboard);
        }if (opt == 2) {
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
        }if (opt1 == 2) {
            Elfo jugador2 = new Elfo();
            crearElfo(jugador2, keyboard);
            seleccionarUbicacion(keyboard);
            jugador2.setUbicacion(seleccionarUbicacion(keyboard));
            seleccionarHechizos(hechizosListP2, keyboard);
        } else {
            System.out.println("Tipo de personaje no vailido");
        }
    }



    public static void crearMago(Mago jugador, Scanner keyboard){
        System.out.println("Elige tu mago deseado: \n\t 1. Harry Potter \n\t 2. Hermaioni \n\t 3. Voldemort \n\t 4. Ron");
        int opt = keyboard.nextInt();
        switch (opt){
            case 1:
                jugador.setName("HarryPotter");
                break;
            case 2:
                jugador.setName("Hermaioni");
                break;
            case 3:
                jugador.setName("Voldemort");
                break;
            case 4:
                jugador.setName("Ron");
                break;
        }
        seleccionarVarita(jugador, keyboard);

    }

    public static void crearElfo(Personaje jugador, Scanner keyboard){
        System.out.println("Elige tu elfo deseado: \n\t 1. Dobby \n\t 2. Hockey  \n\t 3. Winky \n\t 4. Kreacher");
        int opt = keyboard.nextInt();
        switch (opt){
            case 1:
                jugador.setName("Dobby");
            case 2:
                jugador.setName("Kreacher");
            case 3:
                jugador.setName("Hokey");
            case 4:
                jugador.setName("Winky");
        }

    }


    public static void seleccionarVarita(Mago jugador, Scanner keyboard){

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
        int varitaNum = random.nextInt(4);

        switch (varitaNum){
            case 1: Varita vid = new Varita ("Varita de Vid", 10, false);
                jugador.setVarita(vid);
                System.out.println(jugador.getVarita());
                break;
            case 2: Varita sauco = new Varita ("Varita de Sauco", 12, false);
                jugador.setVarita(sauco);
                System.out.println(jugador.getVarita());
                break;
            case 3: Varita espino = new Varita ("Varita de Espino", 8, false);
                jugador.setVarita(espino);
                System.out.println(jugador.getVarita());
                break;
            case 4: Varita tejo = new Varita ("Varita de Tejo", 9, false);
                jugador.setVarita(tejo);
                System.out.println(jugador.getVarita());
                break;
        }
    }

    public static int seleccionarUbicacion(Scanner keyboard){
        System.out.println("Introduzca su ubicacion inicial: "+
                "\t \n 1. A "+
                "\t \n 2. B "+
                "\t \n 3. C ");

        int ubicacion = keyboard.nextInt();
        if (ubicacion== 1 || ubicacion== 2 || ubicacion== 3 ){
            return ubicacion;
        }else System.out.println("ubicacion invalida");
        return ubicacion;
    }



    public static void seleccionarHechizos(ArrayList hechizosListP, Scanner keyboard){
        System.out.println("Estos son los hechizos posibles:" +

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
//

        System.out.println("Introduce los seis hechizos que deseas: ");
        System.out.print("Primer: ");
        int hechizoUno = keyboard.nextInt();
        agregarHechizo(hechizoUno, hechizosListP );

        System.out.print("\t Segundo: ");
        int hechizoDos = keyboard.nextInt();
        agregarHechizo(hechizoDos, hechizosListP );

        System.out.print("\t Tercero: ");
        int hechizoTres = keyboard.nextInt();
        agregarHechizo(hechizoTres, hechizosListP );

        System.out.print("\t Cuarto: ");
        int hechizoCuatro = keyboard.nextInt();
        agregarHechizo(hechizoCuatro, hechizosListP );

        System.out.print("\t Quinto: ");
        int hechizoCinco = keyboard.nextInt();
        agregarHechizo(hechizoCinco, hechizosListP );

        System.out.print("\t Sexto: ");
        int hechizoSeis = keyboard.nextInt();
        agregarHechizo(hechizoSeis, hechizosListP );
    }


   public static void agregarHechizo(Integer seleccion, ArrayList hechizosListP){
       switch (seleccion){
           case 1:
               Hechizos hechizo1 = new Hechizos("Avada Kedavra",  1, 90);
               hechizo1.setPtosDanos(100);
               hechizosListP.add(hechizo1);
               break;
           case 2:
               Hechizos hechizo2 = new Hechizos("Imperius",  1, 80);
               hechizo2.ptosDanos=90;
               hechizosListP.add(hechizo2);
               break;
           case 3:
               Hechizos hechizo3 = new Hechizos("Cruciatus",  1, 70);
               hechizo3.ptosDanos=80;
               hechizosListP.add(hechizo3);
               break;
           case 4:
               Hechizos hechizo4 = new Hechizos("Expecto Patronum",  1, 15);
               hechizo4.ptosDanos=25;
               hechizosListP.add(hechizo4);
               break;
           case 5:
               Hechizos hechizo5 = new Hechizos("Expelliarmus",  1, 10);
               hechizo5.ptosDanos=20;
               hechizosListP.add(hechizo5);
               break;
           case 6:
               Hechizos hechizo6 = new Hechizos("Windgardium Leviosa",  1, 5);
               hechizo6.ptosDanos=15;
               hechizosListP.add(hechizo6);
               break;
           case 7:
               Hechizos hechizo7 = new Hechizos("Anapneo",  3, 8);
               hechizo7.ptosEnergiaMagicaRecuperados =15;
               hechizosListP.add(hechizo7);
               break;
           case 8:
               Hechizos hechizo8 = new Hechizos("Episkey",  3, 7);
               hechizo8.ptosEnergiaMagicaRecuperados =12;
               hechizosListP.add(hechizo8);
               break;
           case 9:
               Hechizos hechizo9 = new Hechizos("Ferula",  3, 5);
               hechizo9.ptosEnergiaMagicaRecuperados =10;
               hechizosListP.add(hechizo9);
               break;
           case 10:
               Hechizos hechizo10 = new Hechizos("Reparifors",  3, 4);
               hechizo10.ptosEnergiaMagicaRecuperados =8;
               hechizosListP.add(hechizo10);
               break;
           case 11:
               Hechizos hechizo11 = new Hechizos("Tergeo",  3, 3);
               hechizo11.ptosEnergiaMagicaRecuperados =6;
               hechizosListP.add(hechizo11);
               break;
           case 12:
               Hechizos hechizo12 = new Hechizos("Vulnera Sanentur",  3, 2);
               hechizo12.ptosEnergiaMagicaRecuperados =5;
               hechizosListP.add(hechizo12);
               break;
           case 13:
               Hechizos hechizo13 = new Hechizos("AguitaCaliente",  2, 10 );
               hechizo13.ptosVida =20;
               hechizosListP.add(hechizo13);
               break;
           case 14:
               Hechizos hechizo14 = new Hechizos("TeDeLimon",  2, 8);
               hechizo14.ptosVida =15;
               hechizosListP.add(hechizo14);
               break;
           case 15:
               Hechizos hechizo15 = new Hechizos("Guiso de Gallina",  2, 7);
               hechizo15.ptosVida =12;
               hechizosListP.add(hechizo15);
               break;
           case 16:
               Hechizos hechizo16 = new Hechizos("Siesta en el Sofa",  2, 5);
               hechizo16.ptosVida =10;
               hechizosListP.add(hechizo16);
               break;
           case 17:
               Hechizos hechizo17 = new Hechizos("Mate",  2, 4);
               hechizo17.ptosVida =8;
               hechizosListP.add(hechizo17);
               break;
           case 18:
               Hechizos hechizo18 = new Hechizos("Tarde de Spa",  2, 3);
               hechizo18.ptosVida =6;
               hechizosListP.add(hechizo18);
               break;
       }

   }




//
//    public static void definirHechizos(){
//        ArrayList<Hechizos> hechizosList = new ArrayList<Hechizos>();
//
//        //public Hechizos(String name, Integer type, Integer ptosEnergiaMagica)
//        //1.Ataque 2.Defensa 3.Recuperacion
//
//        //ataque
//        Hechizos hechizo1 = new Hechizos("Avada Kedavra",  1, 90);
//        hechizo1.setPtosDanos(100);
//        hechizosList.add(hechizo1);
//        Hechizos hechizo2 = new Hechizos("Imperius",  1, 80);
//        hechizo2.ptosDanos=90;
//        hechizosList.add(hechizo2);
//        Hechizos hechizo3 = new Hechizos("Cruciatus",  1, 70);
//        hechizo3.ptosDanos=80;
//        hechizosList.add(hechizo3);
//        Hechizos hechizo4 = new Hechizos("Expecto Patronum",  1, 15);
//        hechizo4.ptosDanos=25;
//        hechizosList.add(hechizo4);
//        Hechizos hechizo5 = new Hechizos("Expelliarmus",  1, 10);
//        hechizo5.ptosDanos=20;
//        hechizosList.add(hechizo5);
//        Hechizos hechizo6 = new Hechizos("Windgardium Leviosa",  1, 5);
//        hechizo6.ptosDanos=15;
//        hechizosList.add(hechizo6);
//
//        //Recuperacion
//        Hechizos hechizo7 = new Hechizos("Anapneo",  3, 8);
//        hechizo7.ptosEnergiaMagicaRecuperados =15;
//        hechizosList.add(hechizo7);
//        Hechizos hechizo8 = new Hechizos("Episkey",  3, 7);
//        hechizo8.ptosEnergiaMagicaRecuperados =12;
//        hechizosList.add(hechizo8);
//        Hechizos hechizo9 = new Hechizos("Ferula",  3, 5);
//        hechizo9.ptosEnergiaMagicaRecuperados =10;
//        hechizosList.add(hechizo9);
//        Hechizos hechizo10 = new Hechizos("Reparifors",  3, 4);
//        hechizo10.ptosEnergiaMagicaRecuperados =8;
//        hechizosList.add(hechizo10);
//        Hechizos hechizo11 = new Hechizos("Tergeo",  3, 3);
//        hechizo11.ptosEnergiaMagicaRecuperados =6;
//        hechizosList.add(hechizo11);
//        Hechizos hechizo12 = new Hechizos("Vulnera Sanentur",  3, 2);
//        hechizo12.ptosEnergiaMagicaRecuperados =5;
//        hechizosList.add(hechizo12);
//
//        //Defensa
//        Hechizos hechizo13 = new Hechizos("AguitaCaliente",  2, 10 );
//        hechizo13.ptosVida =20;
//        hechizosList.add(hechizo13);
//        Hechizos hechizo14 = new Hechizos("TeDeLimon",  2, 8);
//        hechizo14.ptosVida =15;
//        hechizosList.add(hechizo14);
//        Hechizos hechizo15 = new Hechizos("Guiso de Gallina",  2, 7);
//        hechizo15.ptosVida =12;
//        hechizosList.add(hechizo15);
//        Hechizos hechizo16 = new Hechizos("Siesta en el Sofa",  2, 5);
//        hechizo16.ptosVida =10;
//        hechizosList.add(hechizo16);
//        Hechizos hechizo17 = new Hechizos("Mate",  2, 4);
//        hechizo17.ptosVida =8;
//        hechizosList.add(hechizo17);
//        Hechizos hechizo18 = new Hechizos("Tarde de Spa",  2, 3);
//        hechizo18.ptosVida =6;
//        hechizosList.add(hechizo18);
//
////        System.out.println(hechizo18.getName());
//////        for (Hechizos hechizos : hechizosList) {
//////            System.out.println( "\n name: " + hechizos.getName());
//////        }
//

    }

