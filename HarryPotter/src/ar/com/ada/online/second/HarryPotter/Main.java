package ar.com.ada.online.second.HarryPotter;

import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        definirHechizos();

    }


    public static void definirHechizos(){
        ArrayList<Hechizos> hechizosList = new ArrayList<Hechizos>();

        //public Hechizos(String name, Integer type, Integer ptosEnergiaMagica)
        //1.Ataque 2.Defensa 3.Recuperacion

        //ataque
        Hechizos hechizo1 = new Hechizos("Avada Kedavra",  1, 90);
        hechizo1.setPtosDanos(100);
        hechizosList.add(hechizo1);
        Hechizos hechizo2 = new Hechizos("Imperius",  1, 80);
        hechizo2.ptosDanos=90;
        hechizosList.add(hechizo2);
        Hechizos hechizo3 = new Hechizos("Cruciatus",  1, 70);
        hechizo3.ptosDanos=80;
        hechizosList.add(hechizo3);
        Hechizos hechizo4 = new Hechizos("Expecto Patronum",  1, 15);
        hechizo4.ptosDanos=25;
        hechizosList.add(hechizo4);
        Hechizos hechizo5 = new Hechizos("Expelliarmus",  1, 10);
        hechizo5.ptosDanos=20;
        hechizosList.add(hechizo5);
        Hechizos hechizo6 = new Hechizos("Windgardium Leviosa",  1, 5);
        hechizo6.ptosDanos=15;
        hechizosList.add(hechizo6);

        //Recuperacion
        Hechizos hechizo7 = new Hechizos("Anapneo",  3, 8);
        hechizo7.ptosEnergiaMagicaRecuperados =15;
        hechizosList.add(hechizo7);
        Hechizos hechizo8 = new Hechizos("Episkey",  3, 7);
        hechizo8.ptosEnergiaMagicaRecuperados =12;
        hechizosList.add(hechizo8);
        Hechizos hechizo9 = new Hechizos("Ferula",  3, 5);
        hechizo9.ptosEnergiaMagicaRecuperados =10;
        hechizosList.add(hechizo9);
        Hechizos hechizo10 = new Hechizos("Reparifors",  3, 4);
        hechizo10.ptosEnergiaMagicaRecuperados =8;
        hechizosList.add(hechizo10);
        Hechizos hechizo11 = new Hechizos("Tergeo",  3, 3);
        hechizo11.ptosEnergiaMagicaRecuperados =6;
        hechizosList.add(hechizo11);
        Hechizos hechizo12 = new Hechizos("Vulnera Sanentur",  3, 2);
        hechizo12.ptosEnergiaMagicaRecuperados =5;
        hechizosList.add(hechizo12);

        //Defensa
        Hechizos hechizo13 = new Hechizos("AguitaCaliente",  2, 10 );
        hechizo13.ptosVida =20;
        hechizosList.add(hechizo13);
        Hechizos hechizo14 = new Hechizos("TeDeLimon",  2, 8);
        hechizo14.ptosVida =15;
        hechizosList.add(hechizo14);
        Hechizos hechizo15 = new Hechizos("Guiso de Gallina",  2, 7);
        hechizo15.ptosVida =12;
        hechizosList.add(hechizo15);
        Hechizos hechizo16 = new Hechizos("Siesta en el Sofa",  2, 5);
        hechizo16.ptosVida =10;
        hechizosList.add(hechizo16);
        Hechizos hechizo17 = new Hechizos("Mate",  2, 4);
        hechizo17.ptosVida =8;
        hechizosList.add(hechizo17);
        Hechizos hechizo18 = new Hechizos("Tarde de Spa",  2, 3);
        hechizo18.ptosVida =6;
        hechizosList.add(hechizo18);

        System.out.println(hechizo18.getName());
//        for (Hechizos hechizos : hechizosList) {
//            System.out.println( "\n name: " + hechizos.getName());
//        }


    }
}
