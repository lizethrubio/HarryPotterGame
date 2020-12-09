package ar.com.ada.online.second.HarryPotter;

import ar.com.ada.online.second.HarryPotter.SubClass.Elfo;
import ar.com.ada.online.second.HarryPotter.SubClass.Mago;
import ar.com.ada.online.second.HarryPotter.SuperClass.Hechizo;
import ar.com.ada.online.second.HarryPotter.SuperClass.Personaje;
import ar.com.ada.online.second.HarryPotter.SubClass.HechizoAtaque;
import ar.com.ada.online.second.HarryPotter.SubClass.HechizoDefensa;
import ar.com.ada.online.second.HarryPotter.SubClass.HechizoRecuperacion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Partida {

    Partida() {
    }

    public Personaje player1;
    public Personaje player2;

    public void startTheGame(Scanner keyboard) {
        System.out.println("    Welcome to The Harry Potter Game!!! \n\n");
        Partida partida = new Partida();
        selectCharacters(keyboard);
        System.out.println("\n\n\n     Let's start the Harry Potter Game!! \n\n\n ");
        System.out.println("\n ****     Players, Are you ready??? \n\n\n ");
        thePlaysBegin(keyboard);

    }

    // metodo de seleccion de los personaje
    public void selectCharacters(Scanner keyboard) {
        System.out.println("   Hello Player 1   \n\n ");
        player1 = selectCharacter(player1, keyboard);
        player1.setLocation(selectLocation(keyboard));
        player1.setHechizo(selectSpells(keyboard));
        player1.setDark();
        if (player1.isDarkOrFree()) {
            if (player1 instanceof Mago)
                System.out.println("You are Dark Wizard!!");
            else
                System.out.println("You are free Elf!!");
        }
        player1.setEnergiaMagica(100);
        player1.setVida(100);
        System.out.println("You are ready player!! \n\n\n");


        System.out.println("    Hello Player  2  \n \n ");
        player2 = selectCharacter(player2, keyboard);
        player2.setLocation(selectLocation(keyboard));
        player2.setHechizo(selectSpells(keyboard));
        player2.setDark();
        if (player2.isDarkOrFree()) {
            if (player2 instanceof Mago)
                System.out.println("You are a Dark Wizard!!");
            else
                System.out.println("You are free Elf!!");
        }
        player2.setEnergiaMagica(100);
        player2.setVida(100);
        System.out.println("You are ready player!! \n\n\n");
    }

    // tiene que tener la logica oara la seleccuin del tipo de personaje (elfo - mago)
    // swich 1 => selecteEfo() 2 => selectWizard()
    // retorna eso;
    private Personaje selectCharacter(Personaje player, Scanner keyboard) {

        System.out.println("What character do you want to be? Select: \n\t 1. Wizard \n\t 2. Elf");
        int opt = keyboard.nextInt();
        if (opt == 1) {
            player = new Mago();
            player = selectWizard((Mago) player, keyboard);
            ((Mago) player).setVarita(selectWand(keyboard));
        } else if (opt == 2) {
            player = new Elfo();
            player = selectElf((Elfo) player, keyboard);
        }

        return player;
    }

    // crear una instancia de Elf, mostrar los peronajes disposponibles y segun la seleccion, settear los valores a esa instancia
    // retornar esa instancia.
    private Elfo selectElf(Elfo player, Scanner keyboard) {

        System.out.println("Choose the Elf you want: \n\t 1. Dobby \n\t 2. Hockey  \n\t 3. Winky \n\t 4. Kreacher");
        int opt = keyboard.nextInt();
        switch (opt) {
            case 1:
                player.setName("Dobby \n\t");
                System.out.println("Tu personaje es: " + player.getName());
                break;
            case 2:
                player.setName("Hockey \n\t");
                System.out.println("Tu personaje es: " + player.getName());
                break;
            case 3:
                player.setName("Winky \n\t");
                System.out.println("Tu personaje es: " + player.getName());
                break;
            default:
                player.setName("Kreacher \n\t");
                System.out.println("Tu personaje es: " + player.getName());
                break;
        }
        return player;
    }

    //
    private Personaje selectWizard(Personaje player, Scanner keyboard) {
        System.out.println("Choose the Wizard you want: \n\t 1. Harry Potter \n\t 2. Hermaioni \n\t 3. Voldemort \n\t 4. Ron");
        int opt = keyboard.nextInt();
        switch (opt) {
            case 1:
                player.setName("HarryPotter");
                System.out.println("You are : " + player.getName() + "\n\n");
                break;
            case 2:
                player.setName("Hermaioni");
                System.out.println("You are : " + player.getName() + "\n\n");
                break;
            case 3:
                player.setName("Voldemort");
                System.out.println("You are : " + player.getName() + "\n\n");
                break;
            case 4:
                player.setName("Ron");
                System.out.println("You are :" + player.getName() + "\n\n");
                break;
        }

        return player;
    }

    private Integer isDark(Personaje player) {
        int dark = 0;
        for (Hechizo hechizo : player.hechizo) {
            if (hechizo.getType() == 1) dark++;
        }
        if (dark >= 3) return 1;
        else return 0;
    }


    public Varita selectWand(Scanner keyboard) {
        System.out.println("\t\tThese are the Wands availables: ");
        System.out.println("1. Vid Wand: " + "fabricada antes de 1991, tiene 27.3 cm de largo." +
                " \t Puntos de dano: 10");
        System.out.println("2. Sauco Wand: " + "fabricada siglo XVIIII, mide 34.5 cm de largo." +
                " \t Puntos de dano: 12");
        System.out.println("3. Espino Wand: " + " se conoce desde 1991, mide 25 cm de largo." +
                " \t Puntos de dano: 8");
        System.out.println("4. Tejo Wand: " + "fabricada 1938, mide 34.25 cm de largo." +
                " \t Puntos de dano: 9");
        System.out.println("\n\n --- Please, wait a moment, your wand is being choseen  --- ");

        Random random = new Random();
        int varitaNum = random.nextInt(4);
        switch (varitaNum) {
            case 1:
                Varita vid = new Varita("Varita de Vid", 10, false);
                System.out.println("\n\n\n     Your Wand is: Vid    \n\n\n ");
                return vid;
            case 2:
                Varita sauco = new Varita("Varita de Sauco", 12, false);
                System.out.println("\n\n\n     Your Wand is: Sauco    \n\n\n ");
                return sauco;
            case 3:
                Varita espino = new Varita("Varita de Espino", 8, false);
                System.out.println("\n\n\n     Your Wand is: Espino  \n\n\n ");
                return espino;
            default:
                Varita tejo = new Varita("Varita de Tejo", 9, false);
                System.out.println("\n\n\n    Your Wand is: Tejo   \n\n\n ");
                return tejo;
        }


    }


    public Integer selectLocation(Scanner keyboard) {
        System.out.println("\t Introduzca su ubicacion inicial: " +
                "\t \n 1. A " +
                "\t \n 2. B " +
                "\t \n 3. C ");
        Integer location = 0;
        location = keyboard.nextInt();

        switch (location) {
            case 1:
                System.out.println("\t\n Your initial location is: A");
                return location;
            case 2:
                System.out.println("\t\n Your initial location is: B");
                return location;
            case 3:
                System.out.println("\t\n Your initial location is: C");
                return location;
            default:
                System.out.println("No valid location. \nThe location A will be assigned\n\n");
                location = 1;
                return location;
        }

    }


    public ArrayList selectSpells(Scanner keyboard) {

        ArrayList<Hechizo> spellList = new ArrayList<Hechizo>();
        int continuar = 1;
        int spells = 0;
        int spell = 0;
        while (continuar == 1 & spells < 6) {
            System.out.println("\n\t What kid of Spell do you want to choose: \n\t 1. Attack \n\t 2. Recovery  \n\t 3. Defense");
            int spelltype = keyboard.nextInt();
            switch (spelltype) {
                case 1:
                    spell = attackSpell(keyboard);
                    addHechizo(spell, spellList);
                    spells++;
                    break;
                case 2:
                    spell = recoverySpell(keyboard);
                    addHechizo(spell, spellList);
                    spells++;
                    break;
                default:
                    spell = defenseSpell(keyboard);
                    addHechizo(spell, spellList);
                    spells++;
                    break;
            }
            if (spells < 6) {
                System.out.println("Do you want to add other spell? \n\t 1. Yes \n\t 2. No ");
                continuar = keyboard.nextInt();
            } else {
                continuar = 2;
            }
        }
        return spellList;
    }


    public int attackSpell(Scanner keyboard) {
        System.out.println("\t\tThese are the possible Attack Spells:" +
                "\t\t\n\n ---ATAQUE---");
        System.out.println("1. Avada Kedavra, ptos Energia Magica Requeridos: 90, ptos Dano: 100");
        System.out.println("2. Imperius, ptos Energia Magica Requeridos: 80, ptos Dano: 90");
        System.out.println("3. Cruciatus, ptos Energia Magica Requeridos: 70, ptos Dano: 80");
        System.out.println("4. Expecto Patronum, ptos Energia Magica Requeridos: 15, ptos Dano: 25");
        System.out.println("5. Expelliarmus, ptos Energia Magica Requeridos: 10, ptos Dano: 20");
        System.out.println("6. Windgardium Leviosa, ptos Energia Magica Requeridos: 5, ptos Dano: 15");
        System.out.println("Select the number of the spell you want to add:  ");
        int numeroHechizo = keyboard.nextInt();
        return numeroHechizo;
    }

    public int recoverySpell(Scanner keyboard) {
        System.out.println("\t\tThese are the possible Recovery Spells:");
        System.out.println("\t\n\n ---RECUPERACION---");
        System.out.println("7. Anapneo, ptos Energia Magica Requeridos: 8, ptos Energia recuperados: 15");
        System.out.println("8. Episkey, ptos Energia Magica Requeridos: 7, ptos Energia recuperados:: 12");
        System.out.println("9. Ferula, ptos Energia Magica Requeridos: 5, ptos Energia recuperados: 10");
        System.out.println("10. Reparifors, ptos Energia Magica Requeridos: 4, ptos Energia recuperados: 8");
        System.out.println("11. Tergeo, ptos Energia Magica Requeridos: 3, ptos Energia recuperados: 6");
        System.out.println("12. Vulnera Sanentur, ptos Energia Magica Requeridos: 2, ptos Energia recuperados: 5");
        System.out.println("Select the number of the spell you want to add: ");
        int numeroHechizo = keyboard.nextInt();
        return numeroHechizo;
    }

    public int defenseSpell(Scanner keyboard) {
        System.out.println("\t\tThese are the possible Defense Spells:");
        System.out.println("\t\n\n ---DEFENSA---");
        System.out.println("13. AguitaCaliente, ptos Energia Magica Requeridos: 10, ptos Energia recuperados: 20");
        System.out.println("14. TeDeLimon, ptos Energia Magica Requeridos: 8, ptos Energia recuperados:: 15");
        System.out.println("15. Guiso de Gallina, ptos Energia Magica Requeridos: 7, ptos Energia recuperados: 12");
        System.out.println("16. Siesta en el Sofa, ptos Energia Magica Requeridos: 5, ptos Energia recuperados: 10");
        System.out.println("17. Mate, ptos Energia Magica Requeridos: 4, ptos Energia recuperados: 8");
        System.out.println("18. Tarde de Spa, ptos Energia Magica Requeridos: 3, ptos Energia recuperados: 6");

        System.out.println("Select the number of the spell you want to add: ");
        int numeroHechizo = keyboard.nextInt();
        return numeroHechizo;
    }


    public static void addHechizo(Integer seleccion, ArrayList spellsList) {

        Hechizo hechizo;
        switch (seleccion) {
            case 1:
                hechizo = new HechizoAtaque("Avada Kedavra", 1, 90, 100);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 2:
                hechizo = new HechizoAtaque("Imperius", 1, 80, 90);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 3:
                hechizo = new HechizoAtaque("Cruciatus", 1, 70, 80);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 4:
                hechizo = new HechizoAtaque("Expecto Patronum", 1, 15, 25);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 5:
                hechizo = new HechizoAtaque("Expelliarmus", 1, 10, 20);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 6:
                hechizo = new HechizoAtaque("Windgardium Leviosa", 1, 5, 15);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 7:
                hechizo = new HechizoRecuperacion("Anapneo", 3, 8, 15);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 8:
                hechizo = new HechizoRecuperacion("Episkey", 3, 7, 12);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 9:
                hechizo = new HechizoRecuperacion("Ferula", 3, 5, 10);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 10:
                hechizo = new HechizoRecuperacion("Reparifors", 3, 4, 8);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 11:
                hechizo = new HechizoRecuperacion("Tergeo", 3, 3, 6);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 12:
                hechizo = new HechizoRecuperacion("Vulnera Sanentur", 3, 2, 5);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 13:
                hechizo = new HechizoDefensa("AguitaCaliente", 2, 10, 20);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 14:
                hechizo = new HechizoDefensa("TeDeLimon", 2, 8, 15);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 15:
                hechizo = new HechizoDefensa("Guiso de Gallina", 2, 7, 12);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 16:
                hechizo = new HechizoDefensa("Siesta en el Sofa", 2, 5, 10);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 17:
                hechizo = new HechizoDefensa("Mate", 2, 4, 8);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
            case 18:
                hechizo = new HechizoDefensa("Tarde de Spa", 2, 3, 6);
                spellsList.add(hechizo);
                System.out.println(hechizo.getName());
                break;
        }
    }

    public void thePlaysBegin(Scanner keyboard){
        while (player1.estaVivo() && player2.estaVivo()){
            System.out.println("Player 1. Its your turn");
            System.out.println("Introduce the number of spell you want to use: ");
            for (int i=0; i<6; i++) {
                System.out.println((i+1) + ". "+ player1.hechizo.get(i).getName());
            }
            int num = keyboard.nextInt();
            Hechizo  hech = player1.hechizo.get(num -1);
            switch (hech.getClass().getSimpleName()){
                case "HechizoAtaque":
                    if (player1.getEnergiaMagica()>  hech.getPtosEnergiaMagica()){
                    System.out.println("What location do you want to attack?: \t\n1.A \t\n 2.B \t\n 3.C");
                    int loc = keyboard.nextInt();
                    if (player2.getLocation() == loc){
                       player2 = ((HechizoAtaque) hech).danarPersonaje(player1, player2);
                    }}
                    else {
                        System.out.println("You do not have enough magic energy for the spell");
                        player1.setEnergiaMagica(player1.getEnergiaMagica()+10);
                    }
                case "HechizoDefensa":
                    if (player1.getEnergiaMagica()>  hech.getPtosEnergiaMagica()) {
                        player1 = ((HechizoDefensa) hech).sanarPersonaje(player1);
                    }else {
                        System.out.println("You do not have enough magic energy for the spell");
                        player1.setEnergiaMagica(player1.getEnergiaMagica()+10);
                    }
                case "HechizoRecuperacion":
                    if (player1.getEnergiaMagica()>  hech.getPtosEnergiaMagica()) {
                        player1 = ((HechizoRecuperacion) hech).recuperarPersonaje(player1);
                    }else{
                        System.out.println("You do not have enough magic energy for the spell");
                        player1.setEnergiaMagica(player1.getEnergiaMagica()+10);
                    }
            }


            System.out.println("Player 2. Its your turn");
            System.out.println("Introduce the number of spell you want to use: ");
            for (int i=0; i<6; i++) {
                System.out.println((i+1) + ". "+ player2.hechizo.get(i).getName());
            }
            int num2 = keyboard.nextInt();
            Hechizo  hech2 = player2.hechizo.get(num -1);
            switch (hech2.getClass().getSimpleName()){
                case "HechizoAtaque":
                    if (player2.getEnergiaMagica()>  hech2.getPtosEnergiaMagica()){
                        System.out.println("What location do you want to attack?: \t\n 1.A \t\n 2.B \t\n 3.C");
                        int loc = keyboard.nextInt();
                        if (player1.getLocation() == loc){
                            player1 = ((HechizoAtaque) hech2).danarPersonaje(player2, player1);
                        }}
                    else {
                        System.out.println("You do not have enough magic energy for the spell");
                        player2.setEnergiaMagica(player2.getEnergiaMagica()+10);
                    }
                case "HechizoDefensa":
                    if (player2.getEnergiaMagica()>  hech2.getPtosEnergiaMagica()) {
                        player2 = ((HechizoDefensa) hech2).sanarPersonaje(player2);
                    }else {
                        System.out.println("You do not have enough magic energy for the spell");
                        player2.setEnergiaMagica(player2.getEnergiaMagica()+10);
                    }
                case "HechizoRecuperacion":
                    if (player2.getEnergiaMagica()>  hech2.getPtosEnergiaMagica()) {
                        player2 = ((HechizoRecuperacion) hech2).recuperarPersonaje(player2);
                    }else{
                        System.out.println("You do not have enough magic energy for the spell");
                        player2.setEnergiaMagica(player2.getEnergiaMagica()+10);
                    }
            }
            }

        if (player1.estaVivo()==false){
            System.out.println("\n\n Player 2 YOU ARE THE CHAMPION!!!!" +
                    "\n\n Congratulation!");

        }else if(player2.estaVivo()==false){
            System.out.println("\n\n Player 1. YOU ARE THE CHAMPION!!!!" +
                    "\n\n Congratulation!);");
        }



    }

    public void selectTheSpellToUse(Personaje player){
        System.out.println("Introduce the number of spell you want to use: ");
        for (Hechizo hechizo : player.hechizo) {
            System.out.println( hechizo.getName());
        }
    }


    public void setPlayer1(Personaje player1) {
        this.player1 = player1;
    }

    public void setPlayer2(Personaje player2) {
        this.player2 = player2;
    }

}



